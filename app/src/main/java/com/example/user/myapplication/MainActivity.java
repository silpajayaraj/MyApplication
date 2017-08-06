package com.example.user.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.MenuItem;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.widget.TextView;

import static com.example.user.myapplication.R.*;


public class MainActivity extends Activity implements SensorEventListener{
    private TextView xText,yText,zText;
    String sx,sy,sz;

    private Sensor mysensor;
    private SensorManager SM;
}

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
// create sensor manager
        SM=(SensorManager)getSystemService(SENSOR_SERVICE);
        //accelerometer sensor
        mysensor =SM.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        //register sensor listener
        SM.registerListener(this,mysensor,SensorManager.SENSOR_DELAY_NORMAL);
        //Assign textview
        xText=(TextView)findViewById(id.textView2);
        yText=(TextView)findViewById(id.textView3);
        zText=(TextView)findViewById(id.textView4);
        SM





    }


}
public class Activity1 : Activity, ISensorEventListener
        {
static readonly object _syncLock = new object();
        SensorManager _sensorManager;
        TextView _sensorTextView;

    public void OnAccuracyChanged(Sensor sensor, SensorStatus accuracy)
    {
        // We don't want to do anything here.
    }

    public void OnSensorChanged(SensorEvent e)
    {if(event.)
        lock (_syncLock)
        {
            _sensorTextView.Text = string.Format("x={0:f}, y={1:f}, z={2:f}", e.Values[0], e.Values[1], e.Values[2]);
        }
    }
protected override void OnCreate(Bundle savedInstanceState)
        {
        base.OnCreate(savedInstanceState);
        SetContentView(Resource.Layout.Main);
        _sensorManager = (SensorManager) GetSystemService(SensorService);
        _sensorTextView = FindViewById<TextView>(Resource.Id.accelerometer_text);
        }

protected override void OnResume()
        {
        base.OnResume();
        _sensorManager.RegisterListener(this,
        _sensorManager.GetDefaultSensor(SensorType.Accelerometer),
        SensorDelay.Ui);
        }

protected override void OnPause()
        {
        base.OnPause();
        _sensorManager.UnregisterListener(this);
        }