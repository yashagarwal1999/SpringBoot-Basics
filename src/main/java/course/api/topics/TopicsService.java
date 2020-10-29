package course.api.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {

	private List<Topics> list= new ArrayList<>( Arrays.asList(
			new Topics("Java","Maths","Interesting"),
			new Topics("Spring","English","Boring but necessary"),
			new Topics("C++","Science","Best")

			));
	
	public List<Topics> getAllTopics()
	{
		return list;
	}
	
	public Topics getTopic(String id)
	{
	
		return list.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	public void addTopic(Topics topic)
	{
		list.add(topic);
	}

	public void updateTopic(String id, Topics topic) {
		for(int i=0;i<list.size();i++)
		{
			Topics t=list.get(i);
			if(t.getId().equals(id)) {
				list.set(i, topic);
				break;
			}
		}
		
	}

	public void deleteTopic(String id) {
		
		list.removeIf(t->t.getId().equals(id));
		
	}
	
}
