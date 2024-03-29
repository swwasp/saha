package fi.seco.saha3.model;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public interface ISahaResource {

	public String getUri();
	public String getLabel();
	public List<UriLabel> getTypes();
	
	public List<ISahaProperty> getProperties();
	public List<ISahaProperty> getInverseProperties();
	public Iterator<ISahaProperty> getSortedInverseProperties();
	
	public Map<UriLabel,Set<ISahaProperty>> getPropertyMap();
	public Set<Map.Entry<UriLabel,Set<ISahaProperty>>> getPropertyMapEntrySet();
	
	public Set<ISahaProperty> getEditorProperties();
	public Map<UriLabel,Set<ISahaProperty>> getEditorPropertyMap();
	public Set<Entry<UriLabel,Set<ISahaProperty>>> getEditorPropertyMapEntrySet();
	
}
