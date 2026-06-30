package l44;

/* loaded from: classes4.dex */
public abstract class r4 {

    /* renamed from: a, reason: collision with root package name */
    public final long f316326a;

    /* renamed from: b, reason: collision with root package name */
    public final long f316327b;

    /* renamed from: c, reason: collision with root package name */
    public final int f316328c = 1000;

    /* renamed from: d, reason: collision with root package name */
    public l44.q4 f316329d;

    /* renamed from: e, reason: collision with root package name */
    public l44.p4 f316330e;

    public r4(long j17, long j18) {
        this.f316326a = j17;
        this.f316327b = j18;
    }

    public void a(long j17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTick", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
        l44.p4 p4Var = this.f316330e;
        if (p4Var != null) {
            q84.c cVar = (q84.c) p4Var;
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCountDownTick", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
            a84.e0 d17 = a84.f0.d(j17, cVar.f360785b);
            java.lang.ref.WeakReference weakReference = cVar.f360786c;
            q84.d dVar = weakReference != null ? (q84.d) weakReference.get() : null;
            if (dVar != null) {
                dVar.a(j17, d17);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCountDownTick", "com.tencent.mm.plugin.sns.ad.widget.countdown.CountDownViewModel");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTick", "com.tencent.mm.plugin.sns.ad.helper.CountDownTimer");
    }
}
