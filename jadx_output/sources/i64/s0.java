package i64;

/* loaded from: classes4.dex */
public class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f289311d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f289312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f289313f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f289314g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ i64.b1 f289315h;

    public s0(i64.b1 b1Var, long j17, int i17, boolean z17, boolean z18) {
        this.f289315h = b1Var;
        this.f289311d = j17;
        this.f289312e = i17;
        this.f289313f = z17;
        this.f289314g = z18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$2");
        this.f289315h.A(this.f289311d, this.f289312e, this.f289313f, this.f289314g);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ad.model.SnsAdStatistic$2");
    }
}
