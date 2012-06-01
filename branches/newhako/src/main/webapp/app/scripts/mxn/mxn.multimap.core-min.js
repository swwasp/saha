/*
MAPSTRACTION   vtimemap   http://www.mapstraction.com

Copyright (c) 2011 Tom Carden, Steve Coast, Mikel Maron, Andrew Turner, Henri Bergius, Rob Moran, Derek Fowler, Gary Gale
All rights reserved.

Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met:

 * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution.
 * Neither the name of the Mapstraction nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
*/
mxn.register("multimap",{Mapstraction:{init:function(a,b){var c=this;if(MultimapViewer){if(this.debug){window.print_debug=function(f){var e=document.getElementById("debug");if(e){e.innerHTML+="<p>MUlTIMAP: "+f+"</p>"}else{alert(f)}}}var d=new MultimapViewer(a);d.addEventHandler("click",function(h,i,g,f,e){if(g){c.clickHandler(g.lat,g.lon,c);c.click.fire({location:new mxn.LatLonPoint(g.lat,g.lon)})}});d.addEventHandler("changeZoom",function(h,i,g,f,e){c.moveendHandler(c);c.changeZoom.fire()});d.addEventHandler("endPan",function(h,i,g,f,e){c.moveendHandler(c);c.endPan.fire()});d.addEventHandler("openInfoBox",function(h,i,g,f,e){if(g.mapstraction_marker){g.mapstraction_marker.openInfoBubble.fire()}});d.addEventHandler("closeInfoBox",function(h,i,g,f,e){if(g.mapstraction_marker){marker.closeInfoBubble.fire()}});this.maps[b]=d;this.loaded[b]=true}else{alert(b+" map script not imported")}},applyOptions:function(){var a=this.maps[this.api];if(this.options.enableScrollWheelZoom){a.setOptions({"mousewheel:wheelup":"zoomin","mousewheel:wheeldown":"zoomout"})}if(this.options.enableDragging){a.setOption("drag","dragmap")}else{a.setOption("drag","")}},resizeTo:function(b,a){this.currentElement.style.width=b;this.currentElement.style.height=a;this.maps[this.api].resize()},addControls:function(args){var map=this.maps[this.api];var pan_zoom_widget="MM";if(args.zoom&&args.zoom=="small"){pan_zoom_widget=pan_zoom_widget+"Small"}if(args.pan){pan_zoom_widget=pan_zoom_widget+"Pan"}if(args.zoom){pan_zoom_widget=pan_zoom_widget+"Zoom"}pan_zoom_widget=pan_zoom_widget+"Widget";if(pan_zoom_widget!="MMWidget"){eval(" map.addWidget( new "+pan_zoom_widget+"() );")}if(args.map_type){map.addWidget(new MMMapTypeWidget())}if(args.overview){map.addWidget(new MMOverviewWidget())}},addSmallControls:function(){var a=this.maps[this.api];smallPanzoomWidget=new MMSmallPanZoomWidget();a.addWidget(smallPanzoomWidget);this.addControlsArgs.pan=true;this.addControlsArgs.zoom="small"},addLargeControls:function(){var a=this.maps[this.api];panzoomWidget=new MMPanZoomWidget();a.addWidget(panzoomWidget);this.addControlsArgs.pan=true;this.addControlsArgs.zoom="large"},addMapTypeControls:function(){var a=this.maps[this.api];a.addWidget(new MMMapTypeWidget())},setCenterAndZoom:function(a,b){var d=this.maps[this.api];var c=a.toProprietary(this.api);d.goToPosition(new MMLatLon(a.lat,a.lng),b)},addMarker:function(b,a){var d=this.maps[this.api];var c=b.toProprietary(this.api);d.addOverlay(c);return c},removeMarker:function(a){var b=this.maps[this.api];b.removeOverlay(a.proprietary_marker)},declutterMarkers:function(a){var b=this.maps[this.api];b.declutterGroup(a.groupName)},addPolyline:function(b,a){var d=this.maps[this.api];var c=b.toProprietary(this.api);d.addOverlay(c);return c},removePolyline:function(a){var b=this.maps[this.api];a.proprietary_polyline.remove()},getCenter:function(){var a;var c=this.maps[this.api];var b=c.getCurrentPosition();a=new mxn.LatLonPoint();a.fromProprietary(this.api,b);return a},setCenter:function(a,b){var d=this.maps[this.api];var c=a.toProprietary(this.api);if(b&&b.pan){d.panToPosition(c)}else{d.goToPosition(c)}},setZoom:function(a){var b=this.maps[this.api];b.setZoomFactor(a)},getZoom:function(){var b=this.maps[this.api];var a;a=b.getZoomFactor();return a},getZoomLevelForBoundingBox:function(f){var e=this.maps[this.api];var d=f.getNorthEast();var a=f.getSouthWest();var c;var b=e.getAutoScaleLocation([a.toProprietary(this.api),d.toProprietary(this.api)]);c=b.zoom_factor;return c},setMapType:function(c){var d=this.maps[this.api];var g=null;var e=null;var f=null;switch(c){case mxn.Mapstraction.ROAD:e=MM_WORLD_MAP;break;case mxn.Mapstraction.SATELLITE:e=MM_WORLD_AERIAL;break;case mxn.Mapstraction.HYBRID:e=MM_WORLD_HYBRID;break}var b=d.getAvailableMapTypes();for(var a=0;a<b.length;a++){if(e&&b[a]==e){f=e;break}if(b[a]==MM_WORLD_MAP){g=MM_WORLD_MAP}}f=f||g;if(f!==null){d.setMapType(f)}},getMapType:function(){var a=this.maps[this.api];type=a.getMapType();switch(type){case MM_WORLD_MAP:return mxn.Mapstraction.ROAD;case MM_WORLD_AERIAL:return mxn.Mapstraction.SATELLITE;case MM_WORLD_HYBRID:return mxn.Mapstraction.HYBRID;default:return null}},getBounds:function(){var b=this.maps[this.api];var a=b.getMapBounds();sw=a.getSouthWest();ne=a.getNorthEast();return new mxn.BoundingBox(sw.lat,sw.lon,ne.lat,ne.lon)},setBounds:function(c){var e=this.maps[this.api];var a=c.getSouthWest();var d=c.getNorthEast();var b=e.getAutoScaleLocation([a.toProprietary(this.api),d.toProprietary(this.api)]);e.goToPosition(b.coords,b.zoom_factor)},addImageOverlay:function(c,a,e,j,f,h,d,i){var b=this.maps[this.api];b.getContainer().appendChild(i.imgElm);this.setImageOpacity(c,e);this.setImagePosition(c);var g=this;b.addEventHandler("changeZoom",function(n,o,m,l,k){g.setImagePosition(c)});b.addEventHandler("drag",function(n,o,m,l,k){g.setImagePosition(c)});b.addEventHandler("endPan",function(n,o,m,l,k){g.setImagePosition(c)})},setImagePosition:function(e,b){var d=this.maps[this.api];var c;var a;c=d.geoPosToContainerPixels(new MMLatLon(b.latLng.top,b.latLng.left));a=d.geoPosToContainerPixels(new MMLatLon(b.latLng.bottom,b.latLng.right));b.pixels.top=c.y;b.pixels.left=c.x;b.pixels.bottom=a.y;b.pixels.right=a.x}},LatLonPoint:{toProprietary:function(){return new MMLatLon(this.lat,this.lon)},fromProprietary:function(a){this.lat=a.lat;this.lon=a.lon}},Marker:{toProprietary:function(){var a={};if(this.iconUrl){a.icon=new MMIcon(this.iconUrl);if(this.iconSize){a.icon.iconSize=new MMDimensions(this.iconSize[0],this.iconSize[1])}else{}if(this.iconAnchor){a.icon.iconAnchor=new MMPoint(this.iconAnchor[0],this.iconAnchor[1])}if(this.groupName){a.icon.groupName=this.groupName}}if(this.labelText){a.label=this.labelText}var c=new MMMarkerOverlay(this.location.toProprietary("multimap"),a);if(this.infoBubble){c.setInfoBoxContent(this.infoBubble)}if(this.infoDiv){}for(var b in this.attributes){if(this.attributes.hasOwnProperty(b)){c.setAttribute(b,this.attributes[b])}}return c},openBubble:function(){this.proprietary_marker.openInfoBox()},hide:function(){this.proprietary_marker.setVisibility(false)},show:function(){this.proprietary_marker.setVisibility(true)}},Polyline:{toProprietary:function(){var b;var d=[];for(var a=0,c=this.points.length;a<c;a++){d.push(this.points[a].toProprietary("multimap"))}b=new MMPolyLineOverlay(d,this.color,this.opacity,this.width,this.closed,this.fillColor);return b}}});