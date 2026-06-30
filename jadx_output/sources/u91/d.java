package u91;

/* loaded from: classes7.dex */
public final class d extends com.tencent.mm.plugin.appbrand.jsapi.c0 implements com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l {

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.e9 f425819q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.ia f425820r;

    /* renamed from: s, reason: collision with root package name */
    public android.view.ViewGroup f425821s;

    public d(com.tencent.mm.plugin.appbrand.e9 service) {
        kotlin.jvm.internal.o.g(service, "service");
        this.f425819q = service;
        com.tencent.mars.xlog.Log.i("DirectGame.AppBrandServiceDirectGameComponentView", com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_INIT);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public com.tencent.mm.plugin.appbrand.jsapi.s M(boolean z17) {
        return z17 ? getGlobalCustomViewContainer() : getCustomViewContainer();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public boolean S() {
        return 2 == getContext().getResources().getConfiguration().orientation;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void a(int i17, java.lang.String str) {
        this.f425819q.a(i17, str);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public <T extends com.tencent.mm.plugin.appbrand.jsapi.g0> T b(java.lang.Class<T> cls) {
        return (T) this.f425819q.b(cls);
    }

    public final void b0() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = getRuntime();
        if (runtime != null) {
            runtime.m(new u91.c(this));
        }
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public boolean c(java.lang.String api, com.tencent.mm.plugin.appbrand.jsruntime.c0 JsRt) {
        kotlin.jvm.internal.o.g(api, "api");
        kotlin.jvm.internal.o.g(JsRt, "JsRt");
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public com.tencent.mm.plugin.appbrand.page.ia getCustomViewContainer() {
        com.tencent.mm.plugin.appbrand.page.ia iaVar = this.f425820r;
        if (iaVar != null) {
            return iaVar;
        }
        if (!(getContentView() instanceof android.view.ViewGroup)) {
            return null;
        }
        this.f425820r = new com.tencent.mm.plugin.appbrand.page.ia((android.view.ViewGroup) getContentView());
        com.tencent.mars.xlog.Log.i("DirectGame.AppBrandServiceDirectGameComponentView", "getCustomViewContainer, create customViewContainer:" + this.f425820r);
        return this.f425820r;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void d(java.lang.String str, java.lang.String str2, int[] iArr) {
        this.f425819q.d(str, str2, iArr);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void e(java.lang.String str, java.lang.String str2, int i17) {
        this.f425819q.e(str, str2, i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k0 f(java.lang.String str) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public void g(java.lang.String str, java.lang.String str2) {
        this.f425819q.g(str, str2);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public java.lang.String getAppId() {
        return this.f425819q.getAppId();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public u81.b getAppState() {
        return this.f425819q.getAppState();
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
        u91.b bVar;
        android.view.ViewGroup viewGroup = this.f425821s;
        if (viewGroup != null) {
            return viewGroup;
        }
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = getRuntime();
        boolean z17 = false;
        if (runtime != null && runtime.M0()) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime2 = getRuntime();
            if (runtime2 != null) {
                if (runtime2.D == null) {
                    u91.b bVar2 = new u91.b(runtime2.f74795d, runtime2);
                    runtime2.D = bVar2;
                    com.tencent.mm.plugin.appbrand.ef.DirectGameCoverViewContainer.a(runtime2, bVar2);
                    com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandRuntime", "[DirectGame] create directGameCoverViewContainer, appId:%s", runtime2.f74803n);
                }
                bVar = runtime2.D;
            } else {
                bVar = null;
            }
            this.f425821s = bVar;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getContentView, get runtimeCoverViewContainer:");
            android.view.ViewGroup viewGroup2 = this.f425821s;
            sb6.append(viewGroup2 != null ? viewGroup2.getClass().getSimpleName() : null);
            com.tencent.mars.xlog.Log.i("DirectGame.AppBrandServiceDirectGameComponentView", sb6.toString());
        }
        return this.f425821s;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public android.content.Context getContext() {
        return this.f425819q.getContext();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public fl1.g2 getDialogContainer() {
        return this.f425819q.getDialogContainer();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.appstorage.u1 getFileSystem() {
        return this.f425819q.getFileSystem();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public com.tencent.mm.plugin.appbrand.jsapi.s getGlobalCustomViewContainer() {
        com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = getRuntime();
        if (runtime != null) {
            return runtime.D1;
        }
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.jsapi.k getInterceptor() {
        return this.f425819q.getInterceptor();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.Cif getInvokeCostManager() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.jsruntime.t getJsRuntime() {
        return this.f425819q.getJsRuntime();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ androidx.lifecycle.y getLifecycleOwner() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public android.widget.FrameLayout getPageArea() {
        return null;
    }

    public final com.tencent.mm.plugin.appbrand.AppBrandRuntime getRuntime() {
        return this.f425819q.t3();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public /* bridge */ /* synthetic */ xi1.g getWindowAndroid() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void h() {
        this.f425819q.h();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void i(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var, int[] iArr) {
        this.f425819q.i(n5Var, iArr);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public boolean isRunning() {
        if (getRuntime() != null) {
            com.tencent.mm.plugin.appbrand.AppBrandRuntime runtime = getRuntime();
            kotlin.jvm.internal.o.d(runtime);
            if (!runtime.L0()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public void j(java.lang.Runnable runnable, long j17) {
        this.f425819q.j(runnable, j17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public <T extends com.tencent.mm.plugin.appbrand.jsapi.h0> T k(java.lang.Class<T> p07) {
        kotlin.jvm.internal.o.g(p07, "p0");
        return (T) this.f425819q.k(p07);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public boolean l(com.tencent.mm.plugin.appbrand.jsapi.h0 h0Var) {
        return this.f425819q.l(h0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public void m(java.lang.Runnable runnable) {
        this.f425819q.m(runnable);
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
        this.f425819q.p(n5Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public <T extends nd.b> T q(java.lang.Class<T> cls) {
        return (T) this.f425819q.q(cls);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void r(com.tencent.mm.plugin.appbrand.jsapi.g0 g0Var) {
        this.f425819q.r(g0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public boolean s(java.lang.String api) {
        kotlin.jvm.internal.o.g(api, "api");
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void setEvalInterceptor(com.tencent.mm.plugin.appbrand.jsapi.i iVar) {
        this.f425819q.setEvalInterceptor(iVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void setInterceptor(com.tencent.mm.plugin.appbrand.jsapi.k kVar) {
        this.f425819q.setInterceptor(kVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public /* bridge */ /* synthetic */ boolean t() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void u(java.util.Collection<com.tencent.mm.plugin.appbrand.jsapi.g0> collection) {
        this.f425819q.u(collection);
    }
}
