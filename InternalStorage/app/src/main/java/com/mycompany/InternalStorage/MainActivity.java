package com.mycompany.InternalStorage;

import android.app.*;
import android.os.*;
import java.io.*;
import android.content.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		try
		{
			FileOutputStream fos=openFileOutput("hello", Context.MODE_WORLD_READABLE + Context.MODE_WORLD_WRITEABLE);
			try
			{
				fos.write("hello world".getBytes());
				fos.close();
			}
			catch (IOException e)
			{}
		}
		catch (FileNotFoundException e)
		{}

    }
}
