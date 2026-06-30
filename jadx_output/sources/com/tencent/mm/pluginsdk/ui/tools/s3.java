package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class s3 implements android.hardware.SensorEventListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.t3 f191895d;

    public s3(com.tencent.mm.pluginsdk.ui.tools.t3 t3Var) {
        this.f191895d = t3Var;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.HeadingPitchSensorMgr", "onAccuracyChanged");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        if (sensorEvent.sensor.getType() == 3) {
            com.tencent.mm.pluginsdk.ui.tools.t3 t3Var = this.f191895d;
            float[] fArr = t3Var.f191914a;
            float[] fArr2 = sensorEvent.values;
            fArr[0] = fArr2[0];
            fArr[1] = fArr2[1];
            fArr[2] = fArr2[2];
            int i17 = t3Var.f191915b;
            t3Var.getClass();
            if (i17 == -10000) {
                t3Var.f191915b = (int) t3Var.f191914a[0];
            } else {
                float f17 = t3Var.f191914a[0];
                int i18 = t3Var.f191915b;
                if (f17 - i18 > 300.0f || f17 - i18 < -300.0f) {
                    t3Var.f191915b = (int) f17;
                } else {
                    t3Var.f191915b = (int) ((i18 * 0.6d) + (f17 * 0.4d));
                }
            }
            if (t3Var.f191915b == 0) {
                t3Var.f191915b = 1;
            }
            if (t3Var.f191915b == 365) {
                t3Var.f191915b = 364;
            }
            int i19 = t3Var.f191916c;
            t3Var.getClass();
            if (i19 == -10000) {
                t3Var.f191916c = (int) t3Var.f191914a[1];
                return;
            }
            float f18 = t3Var.f191914a[1];
            if (f18 < -68.0f) {
                int i27 = (int) (((f18 + 68.0f) / 1.5d) - 68.0d);
                if (i27 < -89) {
                    i27 = -89;
                }
                t3Var.f191916c = i27;
                return;
            }
            if (f18 > 89.0f) {
                t3Var.f191916c = 89;
            } else {
                t3Var.f191916c = (int) ((t3Var.f191916c * 0.6d) + (f18 * 0.4d));
            }
        }
    }
}
