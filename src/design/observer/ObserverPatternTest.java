package design.observer;

public class ObserverPatternTest {

	public static void main(String[] args) {
		//create subject
		MyTopic topic = new MyTopic();
		
		//create observers
		Observer observer1 = new MyTopicSubscriber("observer1", topic);
		Observer observer2 = new MyTopicSubscriber("observer2", topic);
		Observer observer3 = new MyTopicSubscriber("observer3", topic);
		
		//register observers to the subject
		topic.register(observer1);
		topic.register(observer2);
		topic.register(observer3);
		
		//check if any update is available
		observer1.update();
		
		//now send message to subject
		topic.postMessage("New Message");
	}

}