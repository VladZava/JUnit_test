package com.vsemvs.Zavada_project.forms;

import com.vsemvs.Zavada_project.model.Good;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/*
  @author   Vlad Zavada
  @project   Zavada_project
  @class  GoodForm
  @version  1.0.0 
  @since 7/30/2021 - 18.39
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class GoodForm {
    private String name;
    private String description;
    private BigDecimal singleGoodPrice;
    private BigDecimal multipleGoodPrice;

    public GoodForm(Good good) {
        this.name = good.getName();
        this.description = good.getDescription();
        this.singleGoodPrice = good.getSingleGoodPrice();
        this.multipleGoodPrice = good.getMultipleGoodPrice();
    }
}
