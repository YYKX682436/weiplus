package q44;

/* loaded from: classes4.dex */
public class f implements q44.b {

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.Sensor f360111a;

    /* renamed from: b, reason: collision with root package name */
    public final android.hardware.SensorManager f360112b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f360113c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile double f360114d = 0.0d;

    /* renamed from: e, reason: collision with root package name */
    public volatile long f360115e = 0;

    /* renamed from: f, reason: collision with root package name */
    public volatile long f360116f = 0;

    /* renamed from: g, reason: collision with root package name */
    public final android.hardware.SensorEventListener f360117g = new q44.e(this);

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f360118h;

    public f(android.content.Context context, android.hardware.Sensor sensor) {
        this.f360112b = (android.hardware.SensorManager) context.getSystemService("sensor");
        this.f360111a = sensor;
    }

    @Override // q44.b
    public void a(q44.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnTwistDegreeChangeListener", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
        this.f360118h = new java.lang.ref.WeakReference(aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnTwistDegreeChangeListener", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
    }

    @Override // q44.b
    public boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
        boolean z17 = this.f360113c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
        return z17;
    }

    @Override // q44.b
    public void reset() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
        this.f360115e = 0L;
        this.f360114d = 0.0d;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
    }

    @Override // q44.b
    public void setEnabled(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
        if (this.f360111a == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
            return;
        }
        try {
            if (!z17) {
                this.f360112b.unregisterListener(this.f360117g);
                this.f360113c = false;
            } else if (!this.f360113c) {
                this.f360116f = 0L;
                this.f360112b.registerListener(this.f360117g, this.f360111a, 1);
                this.f360113c = true;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("TwistGyrosImpl", "setEnabled exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGyrosImpl");
    }
}
