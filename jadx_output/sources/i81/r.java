package i81;

/* loaded from: classes7.dex */
public class r extends com.tencent.mm.plugin.appbrand.jsapi.c0 implements com.tencent.mm.plugin.appbrand.jsapi.t {

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f289610q;

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.c f289611r;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.appstorage.u1 f289612s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.ia f289613t;

    /* renamed from: u, reason: collision with root package name */
    public i81.q f289614u;

    public r(com.tencent.mm.plugin.appbrand.e9 e9Var, com.tencent.mm.plugin.appbrand.c cVar) {
        com.tencent.mm.plugin.appbrand.appstorage.u1 y0Var;
        this.f289610q = e9Var;
        this.f289611r = cVar;
        if (((i81.m0) i95.n0.c(i81.m0.class)) != null) {
            java.util.Map map = i81.j.f289592a;
            y0Var = i81.i.f289590a;
        } else {
            y0Var = new com.tencent.mm.plugin.appbrand.appstorage.y0();
        }
        this.f289612s = y0Var;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.page.ia getCustomViewContainer() {
        com.tencent.mm.plugin.appbrand.page.ia iaVar = this.f289613t;
        if (iaVar != null) {
            return iaVar;
        }
        if (!(getContentView() instanceof android.view.ViewGroup)) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.page.ia iaVar2 = new com.tencent.mm.plugin.appbrand.page.ia((android.view.ViewGroup) getContentView());
        this.f289613t = iaVar2;
        return iaVar2;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public com.tencent.mm.plugin.appbrand.jsapi.s M(boolean z17) {
        return z17 ? getGlobalCustomViewContainer() : getCustomViewContainer();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public boolean S() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void a(int i17, java.lang.String str) {
        this.f289610q.a(i17, str);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public <T extends com.tencent.mm.plugin.appbrand.jsapi.g0> T b(java.lang.Class<T> cls) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public boolean c(java.lang.String str, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void d(java.lang.String str, java.lang.String str2, int[] iArr) {
        this.f289611r.d(new i81.v(this, str, str2));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void e(java.lang.String str, java.lang.String str2, int i17) {
        this.f289611r.d(new i81.t(this, str, str2, i17));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k0 f(java.lang.String str) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public void g(java.lang.String str, java.lang.String str2) {
        e(str, str2, 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public java.lang.String getAppId() {
        return this.f289610q.getAppId();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public u81.b getAppState() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ qu5.a getAsyncHandler() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ fl1.g2 getAuthorizeDialogContainer() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public int getComponentId() {
        return hashCode();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public android.view.View getContentView() {
        i81.q qVar;
        i81.q qVar2 = this.f289614u;
        if (qVar2 != null) {
            return qVar2.getContentContainer();
        }
        if (getRuntime() != null) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = getRuntime();
            com.tencent.mm.plugin.appbrand.ui.vc vcVar = runtime.f74811t;
            if (vcVar instanceof com.tencent.mm.plugin.appbrand.ui.wc) {
                qVar = ((com.tencent.mm.plugin.appbrand.ui.wc) vcVar).getRuntimeAdViewContainer();
            } else {
                qVar = runtime.f74818y;
                if (qVar == null) {
                    qVar = null;
                }
            }
            java.lang.Object[] objArr = new java.lang.Object[3];
            objArr[0] = qVar;
            objArr[1] = runtime.f74803n;
            com.tencent.mm.plugin.appbrand.ui.vc vcVar2 = runtime.f74811t;
            objArr[2] = vcVar2 == null ? "null" : vcVar2.getClass().getSimpleName();
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "getRuntimeAdViewContainer:%s, appId:%s, splash:%s", objArr);
            this.f289614u = qVar;
            if (qVar != null) {
                return qVar.getContentContainer();
            }
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public android.content.Context getContext() {
        return this.f289610q.getContext();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public fl1.g2 getDialogContainer() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.appstorage.u1 getFileSystem() {
        return this.f289612s;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public com.tencent.mm.plugin.appbrand.jsapi.s getGlobalCustomViewContainer() {
        if (getRuntime().D1 != null) {
            return getRuntime().D1;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.jsapi.k getInterceptor() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.Cif getInvokeCostManager() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.jsruntime.t getJsRuntime() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ androidx.lifecycle.y getLifecycleOwner() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public android.widget.FrameLayout getPageArea() {
        return null;
    }

    public com.tencent.mm.plugin.appbrand.AppBrandRuntime getRuntime() {
        return this.f289610q.t3();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public /* bridge */ /* synthetic */ xi1.g getWindowAndroid() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void h() {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void i(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var, int[] iArr) {
        this.f289611r.d(new i81.u(this, n5Var));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public boolean isRunning() {
        return (getRuntime() == null || getRuntime().L0()) ? false : true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public void j(java.lang.Runnable runnable, long j17) {
        this.f289610q.j(runnable, j17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public <T extends com.tencent.mm.plugin.appbrand.jsapi.h0> T k(java.lang.Class<T> cls) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public boolean l(com.tencent.mm.plugin.appbrand.jsapi.h0 h0Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public void m(java.lang.Runnable runnable) {
        this.f289610q.m(runnable);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public android.content.Context n() {
        return getContext();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public void o(java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f312615d).g(runnable);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public void p(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var) {
        this.f289611r.d(new i81.s(this, n5Var));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public <T extends nd.b> T q(java.lang.Class<T> cls) {
        return (T) this.f289610q.q(cls);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void r(com.tencent.mm.plugin.appbrand.jsapi.g0 g0Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public boolean s(java.lang.String str) {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void setEvalInterceptor(com.tencent.mm.plugin.appbrand.jsapi.i iVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void setInterceptor(com.tencent.mm.plugin.appbrand.jsapi.k kVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public /* bridge */ /* synthetic */ boolean t() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void u(java.util.Collection<com.tencent.mm.plugin.appbrand.jsapi.g0> collection) {
    }

    public void y() {
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) {
            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: i81.r$$a
                @Override // java.lang.Runnable
                public final void run() {
                    i81.r.this.y();
                }
            });
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandServiceAdComponentView[AppBrandSplashAd]", "destroy view containers");
        com.tencent.mm.plugin.appbrand.page.ia iaVar = this.f289613t;
        if (iaVar != null) {
            iaVar.h();
            this.f289613t = null;
        }
        i81.q qVar = this.f289614u;
        if (qVar != null) {
            qVar.removeAllViews();
            this.f289614u = null;
        }
    }
}
