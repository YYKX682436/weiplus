package st2;

/* loaded from: classes3.dex */
public final class e2 implements l81.v0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ gk2.e f412275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l81.b1 f412276b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f412277c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f412278d;

    public e2(gk2.e eVar, l81.b1 b1Var, long j17, boolean z17) {
        this.f412275a = eVar;
        this.f412276b = b1Var;
        this.f412277c = j17;
        this.f412278d = z17;
    }

    @Override // l81.v0
    public void a(int i17, java.lang.String str) {
        st2.f2 f2Var = st2.f2.f412287a;
        com.tencent.mars.xlog.Log.i("MiniProgramPreloadHelper", "prerender mini pro fail,errCode:" + i17 + ",errMsg:" + str);
        if (this.f412278d) {
            f2Var.c(this.f412276b);
            com.tencent.mars.xlog.Log.i("MiniProgramPreloadHelper", "[prepareEnv]");
            ((com.tencent.mm.plugin.appbrand.service.f5) i95.n0.c(com.tencent.mm.plugin.appbrand.service.f5.class)).Yf(com.tencent.mm.plugin.appbrand.service.x6.f88833x);
            st2.f2.f412288b = true;
        }
        gk2.e eVar = this.f412275a;
        if (eVar != null) {
            st2.k2.f412388a.a(eVar, this.f412276b, this.f412277c, java.lang.System.currentTimeMillis());
        }
    }

    @Override // l81.v0
    public void onSuccess() {
        st2.f2 f2Var = st2.f2.f412287a;
        com.tencent.mars.xlog.Log.i("MiniProgramPreloadHelper", "prerender mini pro success!");
        gk2.e eVar = this.f412275a;
        if (eVar != null) {
            st2.k2.f412388a.a(eVar, this.f412276b, this.f412277c, java.lang.System.currentTimeMillis());
        }
    }
}
