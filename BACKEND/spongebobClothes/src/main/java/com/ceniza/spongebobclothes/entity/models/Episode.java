package com.ceniza.spongebobclothes.entity.models;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="spongebobepisodes")
public class Episode implements Serializable {
private static final long serialVersionUID = 1L;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
@Column(name="idspongebobepisodes")
long id;
@Column(name="episodename")
String name;
@Column(name="episodepreview")
String image;
@Column(name="liked")
String liked;



public Episode(int id , String name,String image,String liked) {
	super();
	this.id = id ;
	this.name = name;
	this.image = image;
	this.liked = liked;		
}



public long getId() {
	return id;
}



public void setId(long id) {
	this.id = id;
}



public String getName() {
	return name;
}



public void setName(String name) {
	this.name = name;
}



public String getImage() {
	return image;
}



public void setImage(String image) {
	this.image = image;
}



public String getLiked() {
	return liked;
}



public void setLiked(String liked) {
	this.liked = liked;
}



public Episode() {}
}
	