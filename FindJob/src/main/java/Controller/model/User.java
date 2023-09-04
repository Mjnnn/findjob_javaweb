package Controller.model;

public class User {
	private String username;
	private String fullname;

	public User(String username, String fullname) {
		super();
		this.username = username;
		this.fullname = fullname;
	}

	public User() {
		super();
		this.username = username;
		this.fullname = fullname;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
}
