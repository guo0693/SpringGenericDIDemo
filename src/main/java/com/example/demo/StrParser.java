package com.example.demo;

import com.example.interfaces.Parser;
import org.springframework.stereotype.Component;

/**
 * Created by jun.guo on 6/16/17.
 */
@Component
public class StrParser implements Parser<String> {
  @Override
  public int parse(String dataObject) {
    return Integer.parseInt(dataObject);
  }
}
