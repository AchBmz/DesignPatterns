package design.observer;

public class MyTopicSubscriber implements Observer {
	
	private String name;
	private Subject topic;
	
	public MyTopicSubscriber(String name, Subject topic){
		this.name = name;
		this.topic = topic;
	}
	@Override
	public void update() {
		String msg = (String) topic.getUpdate(this);
		if(msg == null){
			System.out.println(name+": No new message");
		}else
		System.out.println(name+": Consuming message: "+msg);
	}

}
