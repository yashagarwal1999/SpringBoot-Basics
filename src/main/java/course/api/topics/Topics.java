package course.api.topics;

public class Topics {
	String name;
	String description;
	String id;
	public Topics(String id,String name,String desc) 
	{
		this.id=id;
		this.name=name;
		description=desc;
	}
	
	
	
	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}