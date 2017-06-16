package com.example.demo;

import com.example.interfaces.Controller;
import com.example.interfaces.Parser;
import org.springframework.stereotype.Service;

/**
 * Created by jun.guo on 6/16/17.
 */
@Service
public class ControllerImpl<T> implements Controller<T> {
  private Parser<T> parser;

  public ControllerImpl(Parser<T> parser) {
    this.parser = parser;
  }

  public int process(T entity) {
    return parser.parse(entity);
  }
}
