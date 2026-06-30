package wz2;

/* loaded from: classes14.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public android.hardware.SensorManager f450771a;

    /* renamed from: b, reason: collision with root package name */
    public wz2.d f450772b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f450773c = false;

    public f(wz2.c cVar) {
    }

    public void a(android.content.Context context) {
        if (this.f450773c) {
            return;
        }
        this.f450773c = true;
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");
        this.f450771a = sensorManager;
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(5);
        if (defaultSensor != null) {
            wz2.d dVar = new wz2.d(this, null);
            this.f450772b = dVar;
            this.f450771a.registerListener(dVar, defaultSensor, 3);
        }
    }
}
