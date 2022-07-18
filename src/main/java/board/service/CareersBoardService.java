package board.service;

import board.mapper.CareersBoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class CareersBoardService {

    @Autowired
    CareersBoardMapper careersBoardMapper;

    public ArrayList<HashMap<String, Object>> findAll() {
        return careersBoardMapper.findAll();
    }
}