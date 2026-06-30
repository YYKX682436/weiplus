package com.tencent.mm.plugin.lite.dynamic_module;

/* loaded from: classes7.dex */
public class LiteAppModuleMotion extends bd.d {
    private static final java.lang.String LITE_APP_MODULE_MOTION_THREAD_NAME = "lite_app_module_motion_thread";
    private static final java.lang.String TAG = "MicroMsg.LiteAppModuleMotion";
    private static final java.util.HashMap<java.lang.String, android.os.HandlerThread> THREAD_MAP = new java.util.HashMap<>();
    private static final java.util.HashMap<java.lang.Long, android.hardware.SensorEventListener> listenerStore = new java.util.HashMap<>();

    private static android.os.HandlerThread fetchSensorThread(java.lang.String str) {
        android.os.HandlerThread handlerThread;
        java.lang.String str2 = "MicroMsg.LiteAppModuleMotion." + str;
        java.util.HashMap<java.lang.String, android.os.HandlerThread> hashMap = THREAD_MAP;
        synchronized (hashMap) {
            handlerThread = hashMap.get(str2);
            if (handlerThread == null) {
                int i17 = pu5.i.f358473b;
                handlerThread = pu5.f.a(str2, 5);
                hashMap.put(str2, handlerThread);
            }
        }
        if (handlerThread.getLooper() == null) {
            handlerThread.start();
        }
        return handlerThread;
    }

    private int getUpdateInterval(int i17) {
        if (i17 >= 0 && i17 <= 0) {
            return 0;
        }
        if (i17 <= 0 || i17 > 1) {
            return (i17 <= 1 || i17 > 2) ? 3 : 2;
        }
        return 1;
    }

    @bd.c(uiThread = false)
    public void offDeviceOrientationChange() {
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");
        if (sensorManager == null) {
            com.tencent.mars.xlog.Log.e(TAG, "get sensor manager fail");
            return;
        }
        android.hardware.SensorEventListener sensorEventListener = listenerStore.get(java.lang.Long.valueOf(getCallback().f19197a));
        if (sensorEventListener == null) {
            com.tencent.mars.xlog.Log.i(TAG, "listener already stopped");
        } else {
            sensorManager.unregisterListener(sensorEventListener);
        }
    }

    @bd.c(uiThread = true)
    public void onDeviceOrientationChange(org.json.JSONObject jSONObject) {
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");
        if (sensorManager == null) {
            com.tencent.mars.xlog.Log.e(TAG, "get sensor manager fail");
            return;
        }
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(11);
        if (defaultSensor == null) {
            com.tencent.mars.xlog.Log.e(TAG, "sensor not supported");
            return;
        }
        android.hardware.SensorEventListener sensorEventListener = new android.hardware.SensorEventListener() { // from class: com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleMotion.1
            @Override // android.hardware.SensorEventListener
            public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
            }

            @Override // android.hardware.SensorEventListener
            public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
                if (sensorEvent.sensor.getType() == 11) {
                    float[] fArr = new float[16];
                    android.hardware.SensorManager.getRotationMatrixFromVector(fArr, sensorEvent.values);
                    float[] fArr2 = new float[3];
                    android.hardware.SensorManager.getOrientation(fArr, fArr2);
                    float f17 = -fArr2[1];
                    float f18 = -fArr2[0];
                    float f19 = fArr2[2];
                    com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleMotion.TAG, "Pitch: " + f17 + ", Yaw: " + f18 + ", Roll: " + f19);
                    org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                    try {
                        jSONObject2.put("pitch", f17);
                        jSONObject2.put("yaw", f18);
                        jSONObject2.put("roll", f19);
                        com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleMotion.this.getCallback().a(jSONObject2, true, false);
                    } catch (org.json.JSONException unused) {
                    }
                }
            }
        };
        sensorManager.registerListener(sensorEventListener, defaultSensor, getUpdateInterval(jSONObject.optInt("interval")), new android.os.Handler(fetchSensorThread(LITE_APP_MODULE_MOTION_THREAD_NAME).getLooper()));
        listenerStore.put(java.lang.Long.valueOf(getCallback().f19197a), sensorEventListener);
    }
}
