package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class t3 implements com.tencent.mm.pluginsdk.ui.tools.q8 {

    /* renamed from: f, reason: collision with root package name */
    public static com.tencent.mm.pluginsdk.ui.tools.t3 f191913f;

    /* renamed from: a, reason: collision with root package name */
    public final float[] f191914a = new float[3];

    /* renamed from: b, reason: collision with root package name */
    public int f191915b = com.tencent.tinker.loader.shareutil.ShareConstants.ERROR_LOAD_GET_INTENT_FAIL;

    /* renamed from: c, reason: collision with root package name */
    public int f191916c = com.tencent.tinker.loader.shareutil.ShareConstants.ERROR_LOAD_GET_INTENT_FAIL;

    /* renamed from: d, reason: collision with root package name */
    public android.hardware.SensorManager f191917d;

    /* renamed from: e, reason: collision with root package name */
    public android.hardware.SensorEventListener f191918e;

    @Override // com.tencent.mm.pluginsdk.ui.tools.q8
    public void a(android.content.Context context) {
        d(context);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.q8
    public void b(android.content.Context context) {
        android.hardware.SensorEventListener sensorEventListener;
        android.hardware.SensorManager sensorManager = this.f191917d;
        if (sensorManager == null || (sensorEventListener = this.f191918e) == null) {
            return;
        }
        sensorManager.unregisterListener(sensorEventListener);
        this.f191917d = null;
        this.f191918e = null;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.q8
    public void c(android.content.Context context) {
        android.hardware.SensorEventListener sensorEventListener;
        f191913f = null;
        android.hardware.SensorManager sensorManager = this.f191917d;
        if (sensorManager == null || (sensorEventListener = this.f191918e) == null) {
            return;
        }
        sensorManager.unregisterListener(sensorEventListener);
        this.f191917d = null;
        this.f191918e = null;
    }

    public void d(android.content.Context context) {
        if (context == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.HeadingPitchSensorMgr", "initSensor() context == null");
            return;
        }
        if (this.f191917d == null) {
            this.f191917d = (android.hardware.SensorManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("sensor");
        }
        if (this.f191918e == null) {
            this.f191918e = new com.tencent.mm.pluginsdk.ui.tools.s3(this);
        }
        android.hardware.SensorManager sensorManager = this.f191917d;
        sensorManager.registerListener(this.f191918e, sensorManager.getDefaultSensor(3), 3);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.q8
    public java.lang.String getName() {
        return "HeadingPitchSensorMgr";
    }
}
