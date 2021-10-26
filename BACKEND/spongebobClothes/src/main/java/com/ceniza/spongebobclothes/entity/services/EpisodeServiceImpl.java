package com.ceniza.spongebobclothes.entity.services;
import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ceniza.spongebobclothes.entity.dao.IEpisodeDao;
import com.ceniza.spongebobclothes.entity.models.Clothe;
import com.ceniza.spongebobclothes.entity.models.Episode;

@Service
public class EpisodeServiceImpl  implements IEpisodeService{
	@Autowired
	IEpisodeDao episodedao;

	@Override
	public List<Episode> getAll() {
		return (List<Episode>) episodedao.findAll();
	}

	@Override
	public Optional<Episode> getOne(long idItem) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Episode item) {
		episodedao.save(item);
		
	}

	@Override
	public void delete(long idItem) {
		episodedao.deleteById(idItem);
		
	}

	@Override
	public void update(Episode item, long id) {
		episodedao.findById(id).ifPresent((x)->{
			item.setId(id);
			episodedao.save(item);
		});
		
	}



}