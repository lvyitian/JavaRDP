/* RectangleOrder.java
 * Component: ProperJavaRDP
 * 
 * Revision: $Revision: 1.1.1.1 $
 * Author: $Author: suvarov $
 * Date: $Date: 2007/03/08 00:26:35 $
 *
 * Copyright (c) 2005 Propero Limited
 *
 * Purpose: 
 */
package com.elusiva.rdp.orders;

public class RectangleOrder implements Order {

    private int x = 0;
    private int y = 0;
    private int cx = 0;
    private int cy = 0;
    public int color = 0;    
    
    public RectangleOrder() {
    }

    public int getX() {
	return this.x;
    }

    public int getY() {
	return this.y;
    }
    
    public int getCX() {
	return this.cx;
    }
    
    public int getCY() {
	return this.cy;
    }
    
    public int getColor() {
	return this.color;
    }
    
    public void setX(int x) {
	this.x = x;
    }
    
    public void setY(int y) {
	this.y = y;
    }
    
    public void setCX(int cx) {
	this.cx = cx;
    }
    
    public void setCY(int cy) {
	this.cy = cy;
    }

    public void setColor(int color) {
	this.color = color;
    }
    
    public void reset() {
	x = 0;
	y = 0;
	cx = 0;
	cy = 0;
	color = 0; 
    }
}   
	
