package com.example.demo;

import com.example.interfaces.Parser;
import org.springframework.stereotype.Component;

/**
 * Created by jun.guo on 6/16/17.
 */
@Component
public class LongParser implements Parser<Long> {
  @Override
  public int parse(Long dataObject) {
    return dataObject.intValue();
  }
}
