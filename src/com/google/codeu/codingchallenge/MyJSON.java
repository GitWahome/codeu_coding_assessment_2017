// Copyright 2017 Google Inc.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//    http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.codeu.codingchallenge;

import java.util.Collection;

final class MyJSON implements JSON {

  @Override
  public JSON getObject(String name) {
    // TODO: implement this
    Collection object=null;
    if (object.contains(name)== true){
       System.out.println("Present");

    }else{
        System.out.println("Empty");
    }
     return null;        
  }

  @Override
  public JSON setObject(String name, JSON value) {
    // TODO: implement this
   MyJSON object=this;
   object.setObject(name, value);
   return this;
  }

  @Override
  public String getString(String name) {
    // TODO: implement this
    Collection object=null;
    if (object.contains(name)== true){
      return getString(name);
    }else{
      return null;
    }
  }

  @Override
  public JSON setString(String name, String value) {
    // TODO: implement this
   MyJSON object=this;
   object.setString(name, value);
    return this;
  }

  @Override
  public void getObjects(Collection<String> names) {
    // TODO: implement this
    Collection object=null;
    if (object.containsAll(names)== true){
        System.out.println("True");
    }else{
      System.out.println("False");
    }
  }

  @Override
  public void getStrings(Collection<String> names) {
    // TODO: implement this
      Collection object=null;
    if (object.containsAll(names)== true){
      System.out.print(names);
              
    }else{
      System.out.println("False");
    }
  }
}
