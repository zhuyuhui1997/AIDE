package com.mycompany.AssetManager;

import android.app.*;
import android.os.*;
import android.content.res.*;
import java.io.*;
import java.util.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		AssetManager  asset=getResources().getAssets();
		try
		{
			System.out.println("try  to  read");
			InputStream in=asset.open("hello.txt");
			System.out.println(Arrays.toString(asset.list("")));
			System.out.println(Arrays.toString(asset.getLocales()));
			BufferedReader bufferreader=new BufferedReader(new InputStreamReader(in));
			System.out.println("content:"+bufferreader.readLine());
			System.out.println("read  success");
		}
		catch (IOException e)
		{
			System.out.println("io exceptiin");
		}
    }
}
