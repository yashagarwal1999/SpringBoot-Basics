package course.api.topics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicsService {

	private List<Topics> list= (List<Topics>) Arrays.asList(
			new Topics("Java","Maths","Interesting"),
			new Topics("Spring","English","Boring but necessary"),
			new Topics("C++","Science","Best")

			);
	
	public List<Topics> getAllTopics()
	{
		return list;
	}
	
	public Topics getTopic(String id)
	{
	
		return list.stream().filter(t -> t.getId().equals(id)).findFirst().get();
	}
	
}
