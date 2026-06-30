package sz3;

/* loaded from: classes15.dex */
public final class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final sz3.i0 f414028d = new sz3.i0();

    @Override // java.lang.Runnable
    public final void run() {
        android.hardware.SensorManager sensorManager;
        android.hardware.SensorManager sensorManager2;
        if (sz3.k0.f414043e == null) {
            java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.hardware.SensorManager");
            sz3.k0.f414043e = (android.hardware.SensorManager) systemService;
        }
        if (sz3.k0.f414044f == null) {
            android.hardware.SensorManager sensorManager3 = sz3.k0.f414043e;
            sz3.k0.f414044f = sensorManager3 != null ? sensorManager3.getDefaultSensor(10) : null;
        }
        sz3.k0 k0Var = sz3.k0.f414039a;
        if (((java.lang.Boolean) ((jz5.n) sz3.k0.f414040b).getValue()).booleanValue() && sz3.k0.f414045g == null) {
            android.hardware.SensorManager sensorManager4 = sz3.k0.f414043e;
            sz3.k0.f414045g = sensorManager4 != null ? sensorManager4.getDefaultSensor(4) : null;
        }
        if (sz3.k0.f414046h) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsSensorDetectManager", "startSensorShakeDetect");
        android.hardware.Sensor sensor = sz3.k0.f414044f;
        if (sensor != null && (sensorManager2 = sz3.k0.f414043e) != null) {
            sensorManager2.registerListener(sz3.k0.f414047i, sensor, 3);
        }
        android.hardware.Sensor sensor2 = sz3.k0.f414045g;
        if (sensor2 != null && (sensorManager = sz3.k0.f414043e) != null) {
            sensorManager.registerListener(sz3.k0.f414047i, sensor2, 3);
        }
        sz3.k0.f414046h = true;
    }
}
