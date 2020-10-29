package course.api.topics;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import course.api.topics.Topics;
@RestController
public class TopicController {
	
	@Autowired
	private TopicsService topicservice;
	
	@RequestMapping("/topics")
	public List<Topics>getTopics()
	{
	
		return topicservice.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topics getTopic(@PathVariable String id)
	{
		return topicservice.getTopic(id);
	}
	
	@RequestMapping(method = RequestMethod.POST,value="/topics")
	public void addTopicPost(@RequestBody Topics topic)
	{
		topicservice.addTopic(topic);
	}
	
	@RequestMapping(method = RequestMethod.PUT,value="/topics/{id}")
	public void updateTopicPut(@RequestBody Topics topic, @PathVariable String id )
	{
		topicservice.updateTopic(id,topic);
	}
	
	@RequestMapping(method = RequestMethod.DELETE,value ="/topics/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		topicservice.deleteTopic(id);
	}

}
