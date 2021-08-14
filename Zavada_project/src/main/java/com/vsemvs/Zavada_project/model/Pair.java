package com.vsemvs.Zavada_project.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/*
  @author   Vlad Zavada
  @project   Zavada_project
  @class  Pair
  @version  1.0.0
  @since 7/30/2021
*/

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Pair<T, K> {
    private T key;
    private K value;
}
