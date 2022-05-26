package com.example.demo.data.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class User {
	
	@Id  //userクラスのプライマリキーidに付けるアノテーション
	@GeneratedValue(strategy = GenerationType.IDENTITY) //idがMySQLのauto_incrementの場合、自動生成させる為にアノテーションを付ける
	private long id;
	private String name;
	private String email;
	
}
