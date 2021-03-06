/* 
 * TinyUmbrella - making iDevice restores possible... 
 * Copyright (C) 2009-2010 semaphore 
 * 
 * This program is free software: you can redistribute it and/or modify 
 * it under the terms of the GNU General Public License as published by 
 * the Free Software Foundation, either version 3 of the License, or 
 * (at your option) any later version. 
 * 
  * This program is distributed in the hope that it will be useful, 
  * but WITHOUT ANY WARRANTY; without even the implied warranty of 
  * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the 
  * GNU General Public License for more details. 
  * 
  * You should have received a copy of the GNU General Public License 
  * along with this program.  If not, see <http://www.gnu.org/licenses/>. 
  */ 

package com.apicloud.loader.platforms.ios.semaphore.util.plist;
 
/**
 * Brought to you by:
 * User: semaphore
 * Date: May 17, 2010
 * Time: 1:26:19 PM
 */
public class BooleanElement extends PElementAdapter<Boolean> {
   private Boolean value;
 
    public BooleanElement(Boolean value) {
     this.value = value;
   }
 
   public Boolean getValue() {
        return value;
   }
 
   public void setValue(Boolean value) {
     this.value = value;
   }
 
   public PElementType getType() {
     return PElementType.BOOLEAN;
   }
 
   public String toString() {
        return "boolean : " + value;
   }
 }
