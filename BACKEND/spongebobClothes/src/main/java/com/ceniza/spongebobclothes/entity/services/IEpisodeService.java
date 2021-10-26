package com.ceniza.spongebobclothes.entity.services;

import java.util.List;
import java.util.Optional;

import com.ceniza.spongebobclothes.entity.models.Episode;

public interface IEpisodeService {
	List<Episode> getAll();
	Optional<Episode> getOne(long idItem);
	void add(Episode item);
	void delete(long idItem);
	void update(Episode item, long id);
}
