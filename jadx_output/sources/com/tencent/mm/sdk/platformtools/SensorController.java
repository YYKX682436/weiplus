package com.tencent.mm.sdk.platformtools;

/* loaded from: classes12.dex */
public class SensorController extends android.content.BroadcastReceiver implements android.hardware.SensorEventListener {

    /* renamed from: o, reason: collision with root package name */
    public static double f192427o = -1.0d;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f192428p = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.hardware.SensorManager f192429d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.q7 f192430e;

    /* renamed from: f, reason: collision with root package name */
    public final android.hardware.Sensor f192431f;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f192434i;

    /* renamed from: m, reason: collision with root package name */
    public final float f192435m;

    /* renamed from: g, reason: collision with root package name */
    public boolean f192432g = false;

    /* renamed from: h, reason: collision with root package name */
    public boolean f192433h = false;

    /* renamed from: n, reason: collision with root package name */
    public float f192436n = -1.0f;

    public SensorController(android.content.Context context) {
        this.f192435m = -1.0f;
        if (context == null) {
            return;
        }
        this.f192434i = context;
        android.hardware.SensorManager sensorManager = (android.hardware.SensorManager) context.getSystemService("sensor");
        this.f192429d = sensorManager;
        android.hardware.Sensor defaultSensor = sensorManager.getDefaultSensor(8);
        this.f192431f = defaultSensor;
        if (defaultSensor != null) {
            this.f192435m = java.lang.Math.min(10.0f, defaultSensor.getMaximumRange());
        }
        float f17 = this.f192435m;
        if (f17 < 0.0f) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SensorController", "error, getMaximumRange return %s, set to 1", java.lang.Float.valueOf(f17));
            this.f192435m = 1.0f;
        }
    }

    public synchronized void a() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SensorController", "sensor callback removed");
        try {
            this.f192434i.unregisterReceiver(this);
        } catch (java.lang.Exception unused) {
        }
        this.f192429d.unregisterListener(this, this.f192431f);
        this.f192429d.unregisterListener(this);
        this.f192433h = false;
        this.f192430e = null;
        this.f192436n = -1.0f;
    }

    public synchronized void b(com.tencent.mm.sdk.platformtools.q7 q7Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SensorController", "sensor callback set, isRegistered:" + this.f192433h + ", proximitySensor: " + this.f192431f + ", maxValue: " + this.f192435m);
        if (!this.f192433h) {
            this.f192436n = -1.0f;
            android.content.IntentFilter intentFilter = new android.content.IntentFilter();
            intentFilter.addAction("android.intent.action.HEADSET_PLUG");
            this.f192434i.registerReceiver(this, intentFilter);
            this.f192429d.registerListener(this, this.f192431f, 2);
            this.f192433h = true;
        }
        this.f192430e = q7Var;
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(android.hardware.Sensor sensor, int i17) {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(android.content.Context context, android.content.Intent intent) {
        java.lang.String action;
        if (intent == null || (action = intent.getAction()) == null || !action.equals("android.intent.action.HEADSET_PLUG")) {
            return;
        }
        int intExtra = intent.getIntExtra("state", 0);
        if (intExtra == 1) {
            this.f192432g = true;
        }
        if (intExtra == 0) {
            this.f192432g = false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r2 < 0.0f) goto L20;
     */
    @Override // android.hardware.SensorEventListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void onSensorChanged(android.hardware.SensorEvent r13) {
        /*
            Method dump skipped, instructions count: 213
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.sdk.platformtools.SensorController.onSensorChanged(android.hardware.SensorEvent):void");
    }
}
