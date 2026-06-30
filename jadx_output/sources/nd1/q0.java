package nd1;

/* loaded from: classes7.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.page.v5 f336382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336383e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f336384f;

    public q0(nd1.r0 r0Var, com.tencent.mm.plugin.appbrand.page.v5 v5Var, int i17, long j17) {
        this.f336382d = v5Var;
        this.f336383e = i17;
        this.f336384f = j17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.appbrand.page.v5 v5Var = this.f336382d;
        if (v5Var.a2() == null) {
            return;
        }
        v5Var.a2().E(this.f336383e, this.f336384f);
    }
}
