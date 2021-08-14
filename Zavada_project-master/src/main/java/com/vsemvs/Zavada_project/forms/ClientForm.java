package com.vsemvs.Zavada_project.forms;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
  @author   Vlad Zavada
  @project   Zavada_project
  @class  ClientForm
  @version  1.0.0 
  @since 7/30/2021 - 18.20
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientForm {
    private String name;
    private String description;
    private String address;
    private String phoneNumber;
    private String contactPerson;
}
