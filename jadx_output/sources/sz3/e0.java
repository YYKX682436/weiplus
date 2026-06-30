package sz3;

/* loaded from: classes15.dex */
public final class e0 implements android.hardware.SensorEventListener {
    public final void a(int i17) {
        if (sz3.k0.f414062x <= 0 || java.lang.System.currentTimeMillis() - sz3.k0.f414062x >= 200) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ScanGoodsSensorDetectManager", "updateMotionDetectStatus type: " + i17);
            sz3.k0.f414062x = java.lang.System.currentTimeMillis();
            vz3.t tVar = vz3.t.f441710a;
            com.tencent.wechat.aff.iam_scan.n nVar = sz3.k0.f414061w;
            nVar.f217105e = !sz3.k0.f414039a.a();
            nVar.f217106f[2] = true;
            nVar.f217104d = java.lang.System.currentTimeMillis();
            nVar.f217106f[1] = true;
            tVar.f(nVar);
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
        kotlin.jvm.internal.o.g(sensor, "sensor");
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        float[] fArr;
        if ((sensorEvent != null ? sensorEvent.sensor : null) == null || (fArr = sensorEvent.values) == null || fArr.length < 3) {
            return;
        }
        sensorEvent.sensor.getType();
        if (sensorEvent.sensor.getType() == 10) {
            sz3.k0 k0Var = sz3.k0.f414039a;
            float[] fArr2 = sensorEvent.values;
            sz3.k0.f414048j = fArr2[0];
            sz3.k0.f414049k = fArr2[1];
            sz3.k0.f414050l = fArr2[2];
            sz3.k0.f414055q = java.lang.System.currentTimeMillis();
            a(sensorEvent.sensor.getType());
            return;
        }
        if (sensorEvent.sensor.getType() == 4) {
            float[] fArr3 = sensorEvent.values;
            float f17 = fArr3[0];
            float f18 = fArr3[1];
            float f19 = fArr3[2];
            sz3.k0 k0Var2 = sz3.k0.f414039a;
            sz3.k0.f414057s = java.lang.System.currentTimeMillis();
            double sqrt = java.lang.Math.sqrt((f17 * f17) + (f18 * f18) + (f19 * f19));
            sz3.k0 k0Var3 = sz3.k0.f414039a;
            sz3.k0.f414058t = sqrt > ((double) ((java.lang.Number) ((jz5.n) sz3.k0.f414041c).getValue()).floatValue());
            a(sensorEvent.sensor.getType());
        }
    }
}
