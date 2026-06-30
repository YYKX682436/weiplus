package lx;

/* loaded from: classes11.dex */
public final class g5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.c0 f321773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ lx.m5 f321774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f321775f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ lx.i5 f321776g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f321777h;

    public g5(kotlin.jvm.internal.c0 c0Var, lx.m5 m5Var, java.lang.String str, lx.i5 i5Var, yz5.l lVar) {
        this.f321773d = c0Var;
        this.f321774e = m5Var;
        this.f321775f = str;
        this.f321776g = i5Var;
        this.f321777h = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f321773d.f310112d) {
            return;
        }
        lx.m5.a(this.f321774e);
        com.tencent.mars.xlog.Log.w("MicroMsg.FlutterBizPublishPlugin", "launchMapMiniProgramWithCallback: timeout, removing callback");
        ft.q4 q4Var = (ft.q4) i95.n0.c(ft.q4.class);
        ((xc1.t) q4Var).Bi(this.f321775f, this.f321776g);
        this.f321777h.invoke(kotlin.Result.m520boximpl(kotlin.Result.m521constructorimpl("")));
    }
}
