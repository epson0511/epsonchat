package pojo.web;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Mem {

	private int uid;

	private String acc;

	private String phone;

	private String pwd;

	private String name;

	private String nick;

	private int status;

	private int level;

	private int point;

	private Date ct_date;

	private Date last_time;

	private byte[] image;

	private String sp;

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getAcc() {
		return acc;
	}

	public void setAcc(String acc) {
		this.acc = acc;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public Date getCt_date() {
		return ct_date;
	}

	public void setCt_date(Date ct_date) {
		this.ct_date = ct_date;
	}

	public Date getLast_time() {
		return last_time;
	}

	public void setLast_time(Date last_time) {
		this.last_time = last_time;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}

	public String getSp() {
		return sp;
	}

	public void setSp(String sp) {
		this.sp = sp;
	}

}
