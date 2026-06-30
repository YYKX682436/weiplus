package va3;

/* loaded from: classes15.dex */
public class e0 implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public float f434274d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public long f434275e = 200;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ va3.f0 f434276f;

    public e0(va3.f0 f0Var) {
        this.f434276f = f0Var;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 3) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f434275e;
            float f17 = sensorEvent.values[0];
            if (f17 <= 0.0f) {
                f17 += (((((int) f17) * (-1)) / com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) + 1) * com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
            }
            float f18 = f17 % 360.0f;
            if (currentTimeMillis <= 200 || java.lang.Math.abs(f18 - this.f434274d) <= 3.0f) {
                return;
            }
            va3.f0 f0Var = this.f434276f;
            f0Var.f434285h = f18;
            java.util.HashSet hashSet = f0Var.f434280c;
            if (hashSet != null) {
                hashSet.size();
            }
            if (hashSet != null) {
                java.util.Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    java.lang.ref.WeakReference weakReference = (java.lang.ref.WeakReference) it.next();
                    if (weakReference != null && weakReference.get() != null) {
                        ((va3.d0) weakReference.get()).a(f0Var.f434286i ? f0Var.f434281d : f0Var.f434285h);
                    }
                }
            }
            this.f434274d = f18;
            this.f434275e = java.lang.System.currentTimeMillis();
        }
    }
}
