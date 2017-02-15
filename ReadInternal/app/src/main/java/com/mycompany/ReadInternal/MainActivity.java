package com.mycompany.ReadInternal;

import android.app.*;
import android.os.*;
import java.io.*;
import android.util.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		try
		{
			FileInputStream fis=new FileInputStream("/data/data/com.mycompany.InternalStorage/files/hello");
			try
			{
				byte[] b=new byte[fis.available()];
				int m;
				int i=0;
				while ((m=fis.read())!=-1)
				{b[i]=(byte) m;i++;}
				Log.d("Test",new String(b));
			}
			catch (IOException e)
			{}

		}
		catch (FileNotFoundException e)
		{}
    }
}
