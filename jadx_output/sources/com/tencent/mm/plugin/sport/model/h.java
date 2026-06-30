package com.tencent.mm.plugin.sport.model;

/* loaded from: classes12.dex */
public class h implements android.hardware.SensorEventListener {

    /* renamed from: f, reason: collision with root package name */
    public android.hardware.SensorManager f171786f;

    /* renamed from: h, reason: collision with root package name */
    public android.hardware.Sensor f171788h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f171789i;

    /* renamed from: d, reason: collision with root package name */
    public long f171784d = 0;

    /* renamed from: e, reason: collision with root package name */
    public long f171785e = 0;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.sport.model.a0 f171787g = null;

    public h() {
        boolean z17 = com.tencent.mm.plugin.sport.model.c0.a(com.tencent.mm.sdk.platformtools.x2.f193071a) && com.tencent.mm.plugin.sport.model.c0.e();
        this.f171789i = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.MMSportStepDetector", "isSupportDeviceStep %b", java.lang.Boolean.valueOf(z17));
        if (this.f171789i) {
            a();
        }
    }

    public final boolean a() {
        try {
            if (this.f171786f == null) {
                this.f171786f = (android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");
            }
            if (this.f171787g == null) {
                this.f171787g = new com.tencent.mm.plugin.sport.model.a0(this);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sport.MMSportStepDetector", "Exception in registerDetector %s", e17.getMessage());
        }
        if (this.f171786f == null || !com.tencent.mm.sdk.platformtools.x2.f193071a.getPackageManager().hasSystemFeature("android.hardware.sensor.stepcounter") || !((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).Ri(d85.g0.HEALTHY, d85.f0.F)) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.MMSportStepDetector", "no step sensor");
            return false;
        }
        android.hardware.Sensor defaultSensor = this.f171786f.getDefaultSensor(19);
        this.f171788h = defaultSensor;
        if (defaultSensor == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.MMSportStepDetector", " TYPE_STEP_COUNTER sensor null");
            return false;
        }
        boolean registerListener = this.f171786f.registerListener(this.f171787g, this.f171788h, com.tencent.mm.plugin.sport.model.t.c().optInt("stepCounterRateUs", com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEOUTPUTBUFFER_ILLEGAL));
        if (registerListener) {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_REGISTER_STEP_COUNTER_FAIL_INT, 0);
        } else {
            gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_REGISTER_STEP_COUNTER_FAIL_INT, 1);
            b();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.MMSportStepDetector", "registerDetector() ok.(result : %s)", java.lang.Boolean.valueOf(registerListener));
        return registerListener;
    }

    public final void b() {
        try {
            if (this.f171786f == null) {
                this.f171786f = (android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");
            }
            com.tencent.mm.plugin.sport.model.a0 a0Var = this.f171787g;
            if (a0Var != null) {
                this.f171786f.unregisterListener(a0Var);
                this.f171787g = null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Sport.MMSportStepDetector", "unregisterDetector() success!");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sport.MMSportStepDetector", "Exception in unregisterDetector %s", e17.getMessage());
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(android.hardware.SensorEvent sensorEvent) {
        float[] fArr;
        int i17 = 0;
        if (sensorEvent != null && (fArr = sensorEvent.values) != null && fArr.length > 0) {
            long j17 = fArr[0];
            long j18 = sensorEvent.timestamp;
            long c17 = c01.id.c();
            if (java.lang.Math.abs(j17 - this.f171784d) >= 20 || c17 - this.f171785e >= 60000) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Sport.MMSportStepDetector", "Step change %d, sensorNanoTime %s", java.lang.Long.valueOf(j17), java.lang.Long.valueOf(j18));
                this.f171784d = j17;
                this.f171785e = c17;
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putLong("lastTickTime", this.f171785e);
                bundle.putLong("lastStep", this.f171784d);
                bundle.putLong("lastTime", j18);
                com.tencent.mm.ipcinvoker.d0.d(com.tencent.mm.sdk.platformtools.w9.f193054b, bundle, com.tencent.mm.plugin.sport.model.l.class, new com.tencent.mm.plugin.sport.model.g(this));
                return;
            }
            return;
        }
        if (sensorEvent == null || sensorEvent.values == null) {
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Boolean.valueOf(sensorEvent == null);
            objArr[1] = java.lang.Boolean.valueOf(sensorEvent != null);
            com.tencent.mars.xlog.Log.e("MicroMsg.Sport.MMSportStepDetector", "[Willen][Step] SensorEvent Exception. event==null:%s , event.values==null:%s", objArr);
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.Sport.MMSportStepDetector", "[Willen][Step] SensorEvent Exception accuracy: %d, timestamp: %s", java.lang.Integer.valueOf(sensorEvent.accuracy), java.lang.Long.valueOf(sensorEvent.timestamp));
        float[] fArr2 = sensorEvent.values;
        int length = fArr2.length;
        int i18 = 0;
        while (i17 < length) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Sport.MMSportStepDetector", "[Willen][Step] SensorEvent Exception event[%d]: %f", java.lang.Integer.valueOf(i18), java.lang.Float.valueOf(fArr2[i17]));
            i17++;
            i18++;
        }
    }
}
