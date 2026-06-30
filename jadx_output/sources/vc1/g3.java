package vc1;

/* loaded from: classes13.dex */
public class g3 implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public float f434969d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public long f434970e = 200;

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        vc1.c3 c3Var;
        if (sensorEvent.sensor.getType() == 3) {
            long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f434970e;
            float f17 = sensorEvent.values[0];
            if (f17 <= 0.0f) {
                f17 += (((((int) f17) * (-1)) / com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1) + 1) * com.tencent.wxmm.v2helper.VOIP_ENC_HEIGHT_LV1;
            }
            float f18 = f17 % 360.0f;
            if (currentTimeMillis <= 200 || java.lang.Math.abs(f18 - this.f434969d) <= 3.0f) {
                return;
            }
            java.util.Map map = vc1.h3.f434975a;
            synchronized (map) {
                java.util.Iterator it = ((java.util.HashMap) map).values().iterator();
                while (it.hasNext()) {
                    for (vc1.a3 a3Var : ((java.util.HashMap) it.next()).values()) {
                        if (a3Var != null) {
                            float f19 = this.f434969d;
                            vc1.p1 p1Var = (vc1.p1) a3Var;
                            if (p1Var.f435063b0 && !p1Var.f435070f && (c3Var = p1Var.f435065c0) != null) {
                                c3Var.a(f19, f18);
                            }
                        }
                    }
                }
            }
            this.f434969d = f18;
            this.f434970e = java.lang.System.currentTimeMillis();
        }
    }
}
