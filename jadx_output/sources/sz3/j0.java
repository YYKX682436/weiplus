package sz3;

/* loaded from: classes15.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final sz3.j0 f414036d = new sz3.j0();

    @Override // java.lang.Runnable
    public final void run() {
        if (sz3.k0.f414046h) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsSensorDetectManager", "stopSensorShakeDetect");
            android.hardware.SensorManager sensorManager = sz3.k0.f414043e;
            if (sensorManager != null) {
                sensorManager.unregisterListener(sz3.k0.f414047i);
            }
        }
        sz3.k0.f414046h = false;
    }
}
