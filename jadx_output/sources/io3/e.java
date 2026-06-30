package io3;

/* loaded from: classes13.dex */
public class e implements android.hardware.SensorEventListener {

    /* renamed from: e, reason: collision with root package name */
    public final io3.d f293505e;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f293504d = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f293506f = new java.util.HashMap();

    /* renamed from: h, reason: collision with root package name */
    public android.os.HandlerThread f293508h = null;

    /* renamed from: i, reason: collision with root package name */
    public android.os.Handler f293509i = null;

    /* renamed from: g, reason: collision with root package name */
    public final android.hardware.SensorManager f293507g = (android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationContext().getSystemService("sensor");

    public e(io3.d dVar) {
        this.f293505e = null;
        this.f293505e = dVar;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        java.util.ArrayList arrayList;
        try {
            int a17 = jo3.a.a(sensorEvent.sensor.getType());
            io3.f fVar = (io3.f) ((java.util.HashMap) this.f293506f).get(java.lang.Integer.valueOf(a17));
            if (fVar == null) {
                return;
            }
            fVar.a(sensorEvent);
            java.util.List list = fVar.f293513d;
            if (((java.util.ArrayList) list).size() < 20) {
                arrayList = null;
            } else {
                java.util.ArrayList arrayList2 = new java.util.ArrayList(list);
                ((java.util.ArrayList) list).clear();
                arrayList = arrayList2;
            }
            if (arrayList == null) {
                return;
            }
            ((io3.c) this.f293505e).c(2, a17, arrayList, 0L);
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NormsgSensorListener", "onSensorChanged() error:" + th6.toString());
        }
    }
}
