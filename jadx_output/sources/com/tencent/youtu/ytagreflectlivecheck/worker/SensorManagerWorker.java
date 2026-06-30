package com.tencent.youtu.ytagreflectlivecheck.worker;

/* loaded from: classes14.dex */
public class SensorManagerWorker {
    private static final java.lang.String TAG = "MicroMsg.LightSensor";
    private boolean mHasStarted;
    private com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker.LightSensorListener mLightSensorListener;
    private com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker.OnGetValue mOnGetValue;
    private android.hardware.SensorManager mSensorManager;

    /* loaded from: classes14.dex */
    public class LightSensorListener implements android.hardware.SensorEventListener {
        private float lux;

        private LightSensorListener() {
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
            if (sensorEvent.sensor.getType() == 5) {
                this.lux = sensorEvent.values[0];
                if (com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker.this.mOnGetValue != null) {
                    com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker.this.mOnGetValue.onGetValue(this.lux);
                }
            }
        }
    }

    /* loaded from: classes14.dex */
    public interface OnGetValue {
        void onGetValue(float f17);
    }

    /* loaded from: classes14.dex */
    public static class Singleton {
        private static com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker instance = new com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker();

        private Singleton() {
        }
    }

    public static com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker getInstance() {
        return com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker.Singleton.instance;
    }

    public float getLux() {
        com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker.LightSensorListener lightSensorListener = this.mLightSensorListener;
        if (lightSensorListener == null) {
            return -1.0f;
        }
        float unused = lightSensorListener.lux;
        return this.mLightSensorListener.lux;
    }

    public int start(android.content.Context context, com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker.OnGetValue onGetValue) {
        if (this.mHasStarted) {
            com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[SensorManagerWorker.start] light sensor has started");
            return 2;
        }
        this.mHasStarted = true;
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getApplicationContext().getSystemService("sensor");
        this.mSensorManager = sensorManager;
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(5);
        if (defaultSensor == null) {
            com.tencent.youtu.ytagreflectlivecheck.jni.YTAGReflectLiveCheckJNIInterface.nativeLog(TAG, "[SensorManagerWorker.start] System do not have lightSensor");
            return 1;
        }
        com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker.LightSensorListener lightSensorListener = new com.tencent.youtu.ytagreflectlivecheck.worker.SensorManagerWorker.LightSensorListener();
        this.mLightSensorListener = lightSensorListener;
        this.mSensorManager.registerListener(lightSensorListener, defaultSensor, 3);
        this.mOnGetValue = onGetValue;
        return 0;
    }

    public void stop() {
        android.hardware.SensorManager sensorManager;
        if (!this.mHasStarted || (sensorManager = this.mSensorManager) == null) {
            return;
        }
        this.mHasStarted = false;
        sensorManager.unregisterListener(this.mLightSensorListener);
    }

    private SensorManagerWorker() {
        this.mHasStarted = false;
    }
}
