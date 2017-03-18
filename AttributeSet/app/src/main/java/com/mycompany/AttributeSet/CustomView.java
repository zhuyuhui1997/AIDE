package com.mycompany.AttributeSet;
import android.view.*;
import android.util.*;
import android.content.*;
import org.xmlpull.v1.*;

public class CustomView  extends View
{
	
	public CustomView(Context context,AttributeSet att){
		super(context,att);
		System.out.println("view"+att.getAttributeCount());
		System.out.println("view"+att.getAttributeName(1));
		System.out.println("view"+att.getAttributeValue("http://schemas.android.com/apk/res/android","layout_width"));
		System.out.println("view"+att.getAttributeValue("http://schemas.android.com/apk/res/android","id"));
		
	}
}
