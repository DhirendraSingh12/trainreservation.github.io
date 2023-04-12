package com.th.service;

//import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.th.model.Train;
import com.th.repository.TrainRepository;

@Service
public class TrainService {

	private final TrainRepository trainRepository;

	@Autowired
	public TrainService(TrainRepository trainRepository) {

		this.trainRepository = trainRepository;

	}

	public Optional<Train> getTrainByNumber(int trainNumber) {
		return trainRepository.findById(trainNumber);
	}

	public List<Train> getAllTrains() {
		return trainRepository.findAll();
	}

	

}