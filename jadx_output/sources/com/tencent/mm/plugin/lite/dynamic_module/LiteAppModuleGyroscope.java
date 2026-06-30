package com.tencent.mm.plugin.lite.dynamic_module;

/* loaded from: classes7.dex */
public class LiteAppModuleGyroscope extends bd.d {
    private static final java.lang.String LITE_APP_MODULE_GYROSCOPE_SESSION_ID_PREFIX = "lite_app_module_gyroscope_session_id_";
    private static final java.lang.String LITE_APP_MODULE_GYROSCOPE_THREAD_NAME = "lite_app_module_gyroscope_thread";
    private static final int SENSOR_DELAY_FASTEST = 10;
    private static final int SENSOR_DELAY_GAME = 20;
    private static final int SENSOR_DELAY_NORMAL = 200;
    private static final int SENSOR_DELAY_UI = 60;
    private static final java.lang.String TAG = "MicroMsg.LiteAppModuleGyroscope";
    private static final java.util.Map<java.lang.String, com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleGyroscope.SensorEventListenerImpl> listenerStore = new java.util.HashMap();
    private static final java.util.HashMap<java.lang.String, android.os.HandlerThread> THREAD_MAP = new java.util.HashMap<>();

    /* loaded from: classes15.dex */
    public static class SensorEventListenerImpl implements android.hardware.SensorEventListener {
        private static final int SENSOR_REFRESH_DATA_INTERVAL_SHORT = 5;
        private bd.e mCallback;
        private final ra3.c mLimiter = new ra3.c(5, new ra3.b() { // from class: com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleGyroscope.SensorEventListenerImpl.1
            @Override // ra3.b
            public boolean onAction(java.lang.Object... objArr) {
                float[] fArr = (float[]) objArr[0];
                java.util.HashMap hashMap = new java.util.HashMap();
                hashMap.put("x", java.lang.Float.valueOf(fArr[0]));
                hashMap.put("y", java.lang.Float.valueOf(fArr[1]));
                hashMap.put("z", java.lang.Float.valueOf(fArr[2]));
                org.json.JSONObject jSONObject = new org.json.JSONObject(hashMap);
                if (com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleGyroscope.SensorEventListenerImpl.this.mCallback != null) {
                    com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleGyroscope.SensorEventListenerImpl.this.mCallback.a(jSONObject, true, false);
                }
                return true;
            }
        });

        public bd.e getCallback() {
            return this.mCallback;
        }

        @Override // android.hardware.SensorEventListener
        public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        }

        @Override // android.hardware.SensorEventListener
        public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
            ra3.b bVar;
            if (sensorEvent.sensor.getType() != 4) {
                return;
            }
            float[] fArr = sensorEvent.values;
            if (fArr == null || fArr.length < 3) {
                com.tencent.mars.xlog.Log.w(com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleGyroscope.TAG, "gyroscope sensor callback data invalidate.");
                return;
            }
            com.tencent.mars.xlog.Log.i(com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleGyroscope.TAG, "onSensorChanged invoked, x:%f, y:%f, z:%f", java.lang.Float.valueOf(fArr[0]), java.lang.Float.valueOf(fArr[1]), java.lang.Float.valueOf(fArr[2]));
            ra3.c cVar = this.mLimiter;
            java.lang.Object[] objArr = {fArr};
            cVar.getClass();
            if ((java.lang.System.currentTimeMillis() - cVar.f393490a < 5) || (bVar = cVar.f393491b) == null || !bVar.onAction(objArr)) {
                return;
            }
            cVar.f393490a = java.lang.System.currentTimeMillis();
        }

        public void setCallback(bd.e eVar) {
            this.mCallback = eVar;
        }
    }

    private static android.os.HandlerThread fetchSensorThread(java.lang.String str) {
        android.os.HandlerThread handlerThread;
        java.lang.String str2 = "MicroMsg.LiteAppModuleGyroscope." + str;
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

    private int getSensorRefreshInterval(int i17) {
        if (i17 >= 0 && i17 <= 10) {
            return 0;
        }
        if (i17 <= 10 || i17 > 20) {
            return (i17 <= 20 || i17 > 60) ? 3 : 2;
        }
        return 1;
    }

    @bd.c(uiThread = false)
    public boolean offGyroscopeChange() {
        com.tencent.mars.xlog.Log.i(TAG, "offGyroscopeChange start ...");
        com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleGyroscope.SensorEventListenerImpl sensorEventListenerImpl = listenerStore.get(LITE_APP_MODULE_GYROSCOPE_SESSION_ID_PREFIX + getCallback().f19197a);
        if (sensorEventListenerImpl == null) {
            com.tencent.mars.xlog.Log.e(TAG, "no listener registered before, fail");
            return false;
        }
        if (sensorEventListenerImpl.getCallback() == null) {
            com.tencent.mars.xlog.Log.e(TAG, "no js callback registered before, fail");
            return false;
        }
        sensorEventListenerImpl.setCallback(null);
        com.tencent.mars.xlog.Log.i(TAG, "offGyroscopeChange success ...");
        return true;
    }

    @bd.c(uiThread = true)
    public void onGyroscopeChange() {
        com.tencent.mars.xlog.Log.i(TAG, "onGyroscopeChange start ...");
        if (((android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor")) == null) {
            com.tencent.mars.xlog.Log.e(TAG, "get sensor manager fail");
            return;
        }
        com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleGyroscope.SensorEventListenerImpl sensorEventListenerImpl = listenerStore.get(LITE_APP_MODULE_GYROSCOPE_SESSION_ID_PREFIX + getCallback().f19197a);
        if (sensorEventListenerImpl == null) {
            com.tencent.mars.xlog.Log.e(TAG, "no listener registered before, fail");
        } else {
            sensorEventListenerImpl.setCallback(getCallback());
            com.tencent.mars.xlog.Log.i(TAG, "onGyroscopeChange success ...");
        }
    }

    @bd.c(uiThread = false)
    public boolean startGyroscope(org.json.JSONObject jSONObject) {
        com.tencent.mars.xlog.Log.i(TAG, "startGyroscope start ...");
        try {
            int i17 = jSONObject.getInt("interval");
            if (i17 < 0) {
                com.tencent.mars.xlog.Log.e(TAG, "illegal update interval, fail");
                return false;
            }
            java.lang.String str = LITE_APP_MODULE_GYROSCOPE_SESSION_ID_PREFIX + getCallback().f19197a;
            java.util.Map<java.lang.String, com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleGyroscope.SensorEventListenerImpl> map = listenerStore;
            if (map.get(str) != null) {
                com.tencent.mars.xlog.Log.e(TAG, "listener already exists, fail");
                return false;
            }
            android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");
            if (sensorManager == null) {
                com.tencent.mars.xlog.Log.e(TAG, "get sensor manager fail");
                return false;
            }
            android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(4);
            com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleGyroscope.SensorEventListenerImpl sensorEventListenerImpl = new com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleGyroscope.SensorEventListenerImpl();
            map.put(str, sensorEventListenerImpl);
            if (!sensorManager.registerListener(sensorEventListenerImpl, defaultSensor, getSensorRefreshInterval(i17), new android.os.Handler(fetchSensorThread(LITE_APP_MODULE_GYROSCOPE_THREAD_NAME).getLooper()))) {
                com.tencent.mars.xlog.Log.e(TAG, "listener register fail");
                sensorManager.unregisterListener(sensorEventListenerImpl);
            }
            com.tencent.mars.xlog.Log.i(TAG, "startGyroscope success ...");
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(TAG, "no interval args, error:" + e17);
            return false;
        }
    }

    @bd.c(uiThread = false)
    public boolean stopGyroscope() {
        com.tencent.mars.xlog.Log.i(TAG, "stopGyroscope start ...");
        java.lang.String str = LITE_APP_MODULE_GYROSCOPE_SESSION_ID_PREFIX + getCallback().f19197a;
        java.util.Map<java.lang.String, com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleGyroscope.SensorEventListenerImpl> map = listenerStore;
        com.tencent.mm.plugin.lite.dynamic_module.LiteAppModuleGyroscope.SensorEventListenerImpl sensorEventListenerImpl = map.get(str);
        if (sensorEventListenerImpl == null) {
            com.tencent.mars.xlog.Log.e(TAG, "no listener registered before, fail");
            return false;
        }
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");
        if (sensorManager == null) {
            com.tencent.mars.xlog.Log.e(TAG, "get sensor manager fail");
            return false;
        }
        sensorManager.unregisterListener(sensorEventListenerImpl);
        map.remove(str);
        com.tencent.mars.xlog.Log.i(TAG, "stopGyroscope success ...");
        return true;
    }
}
