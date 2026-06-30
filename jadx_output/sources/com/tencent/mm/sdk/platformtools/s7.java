package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class s7 {

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.SensorManager f192971a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.r7 f192972b;

    public s7(android.content.Context context) {
        this.f192971a = (android.hardware.SensorManager) context.getSystemService("sensor");
    }

    public boolean a(java.lang.Runnable runnable) {
        java.util.List<android.hardware.Sensor> sensorList;
        android.hardware.SensorManager sensorManager = this.f192971a;
        if (sensorManager == null || (sensorList = sensorManager.getSensorList(1)) == null || sensorList.size() <= 0) {
            return false;
        }
        com.tencent.mm.sdk.platformtools.r7 r7Var = new com.tencent.mm.sdk.platformtools.r7(runnable);
        this.f192972b = r7Var;
        sensorManager.registerListener(r7Var, 2, 3);
        return true;
    }

    public void b() {
        com.tencent.mm.sdk.platformtools.r7 r7Var;
        android.hardware.SensorManager sensorManager = this.f192971a;
        if (sensorManager == null || (r7Var = this.f192972b) == null) {
            return;
        }
        sensorManager.unregisterListener(r7Var, 2);
    }
}
