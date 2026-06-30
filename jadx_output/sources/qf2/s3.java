package qf2;

/* loaded from: classes3.dex */
public final class s3 {

    /* renamed from: a, reason: collision with root package name */
    public xh2.a f362575a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f362576b;

    /* renamed from: c, reason: collision with root package name */
    public kotlinx.coroutines.r2 f362577c;

    /* renamed from: d, reason: collision with root package name */
    public qf2.a4 f362578d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f362579e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qf2.t3 f362580f;

    public s3(qf2.t3 t3Var, xh2.a data) {
        kotlin.jvm.internal.o.g(data, "data");
        this.f362580f = t3Var;
        this.f362575a = data;
        this.f362576b = "MicUserCounter_" + this.f362575a.b() + '_' + hashCode();
    }

    public final void a() {
        kn0.p pVar;
        long e17 = this.f362575a.f454521b.f454559k - c01.id.e();
        java.lang.String str = this.f362576b;
        com.tencent.mars.xlog.Log.i(str, "onBind time duration: " + e17);
        if (e17 > 0) {
            qf2.t3 t3Var = this.f362580f;
            tn0.w0 Q6 = t3Var.f362590a.Q6();
            long j17 = Q6 != null && (pVar = Q6.D) != null && pVar.h() ? 0L : ((mm2.o4) t3Var.f362590a.business(mm2.o4.class)).V / 1000;
            int i17 = (int) (e17 + j17);
            com.tencent.mars.xlog.Log.i(str, "startCountDown duration: " + e17 + " delayOffest: " + j17 + " timeLeft: " + i17);
            qf2.a4 a4Var = this.f362578d;
            if (a4Var != null) {
                ((wj2.j0) a4Var).a(i17);
            }
            kotlin.jvm.internal.f0 f0Var = new kotlin.jvm.internal.f0();
            f0Var.f310116d = i17;
            kotlinx.coroutines.r2 r2Var = this.f362577c;
            if (r2Var != null) {
                kotlinx.coroutines.p2.a(r2Var, null, 1, null);
            }
            qf2.q3 q3Var = t3Var.f362590a;
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            this.f362577c = com.tencent.mm.plugin.finder.live.util.y.d(q3Var, kotlinx.coroutines.internal.b0.f310484a, null, new qf2.r3(f0Var, this, null), 2, null);
        }
    }
}
