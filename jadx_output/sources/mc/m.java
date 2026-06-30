package mc;

/* loaded from: classes14.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public android.hardware.SensorManager f325526a;

    /* renamed from: b, reason: collision with root package name */
    public mc.j f325527b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f325528c = false;

    /* renamed from: d, reason: collision with root package name */
    public mc.l f325529d;

    public final void a() {
        android.hardware.SensorManager sensorManager;
        if (!this.f325528c || (sensorManager = this.f325526a) == null) {
            return;
        }
        this.f325528c = false;
        sensorManager.unregisterListener(this.f325527b);
        this.f325529d = null;
    }
}
