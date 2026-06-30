package q44;

/* loaded from: classes4.dex */
public class d implements q44.b {

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.Sensor f360102a;

    /* renamed from: b, reason: collision with root package name */
    public final android.hardware.SensorManager f360103b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f360104c = false;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f360105d = 0;

    /* renamed from: e, reason: collision with root package name */
    public float f360106e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public float f360107f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public final android.hardware.SensorEventListener f360108g = new q44.c(this);

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f360109h;

    public d(android.content.Context context, android.hardware.Sensor sensor) {
        this.f360103b = (android.hardware.SensorManager) context.getSystemService("sensor");
        this.f360102a = sensor;
    }

    @Override // q44.b
    public void a(q44.a aVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setOnTwistDegreeChangeListener", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
        this.f360109h = new java.lang.ref.WeakReference(aVar);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setOnTwistDegreeChangeListener", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
    }

    @Override // q44.b
    public boolean b() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
        boolean z17 = this.f360104c;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSensorEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
        return z17;
    }

    @Override // q44.b
    public void reset() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("reset", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
        this.f360106e = 0.0f;
        this.f360107f = 0.0f;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("reset", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
    }

    @Override // q44.b
    public void setEnabled(boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
        if (this.f360102a == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
            return;
        }
        try {
            if (!z17) {
                this.f360103b.unregisterListener(this.f360108g);
                this.f360104c = false;
            } else if (!this.f360104c) {
                this.f360105d = 0L;
                this.f360103b.registerListener(this.f360108g, this.f360102a, 1);
                this.f360104c = true;
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("TwistGravityImpl", "setEnabled exp=" + th6.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setEnabled", "com.tencent.mm.plugin.sns.ad.helper.twist.TwistGravityImpl");
    }
}
