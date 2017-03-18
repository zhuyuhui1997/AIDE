package com.mycompany.AttributeSet;

import android.app.*;
import android.os.*;
import org.xmlpull.v1.*;
import android.util.*;
import java.io.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		int type;
		int i=0;
		XmlPullParser parser=getResources().getXml(R.layout.main);
		try
		{
			while ((type = parser.next()) != XmlPullParser.START_TAG &&
				   type != XmlPullParser.END_DOCUMENT)
			{
				i++;
				System.out.println(i);
				System.out.println(parser.getText());
			}
		}
		catch (XmlPullParserException e)
		{}
		catch (IOException e)
		{}
		System.out.println("linearlayout:");
		System.out.println(parser.getAttributeCount());
		System.out.println(parser.getAttributeName(0));
		System.out.println(parser.getAttributeName(1));
		System.out.println(parser.getAttributeName(2));
		System.out.println(parser.getName());
		System.out.println(parser.getAttributeValue(0));
		System.out.println(parser.getAttributeValue(1));
		System.out.println(parser.getAttributeValue(2));
		System.out.println(parser.getText());
		System.out.println(parser.getAttributeNamespace(1));
		try
		{
			while ((type = parser.next()) != XmlPullParser.START_TAG &&
				   type != XmlPullParser.END_DOCUMENT)
			{
				i++;
				System.out.println(i);
				System.out.println(parser.getText());
			}
			
			
		}
		catch (XmlPullParserException e)
		{}
		catch (IOException e)
		{}
        System.out.println("CustomView:");
		System.out.println(parser.getName());
		System.out.println(parser.getAttributeCount());
		System.out.println(parser.getAttributeName(0));
	    System.out.println(parser.getAttributeName(1));
		System.out.println(parser.getAttributeName(2));
		System.out.println(parser.getAttributeValue(0));
		System.out.println(parser.getAttributeValue("http://schemas.android.com/apk/res/android","id"));
		
		
    }
}
