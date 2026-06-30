package jg1;

/* loaded from: classes7.dex */
public class b extends android.widget.LinearLayout implements com.tencent.mm.plugin.appbrand.jsapi.t {

    /* renamed from: h, reason: collision with root package name */
    public static volatile int f299642h;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.page.v5 f299643d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f299644e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Runnable f299645f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.page.ia f299646g;

    public b(android.content.Context context, com.tencent.mm.plugin.appbrand.page.v5 v5Var) {
        super(context);
        this.f299645f = new jg1.a(this);
        this.f299643d = v5Var;
        this.f299644e = this;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void A(com.tencent.mm.plugin.appbrand.jsapi.y yVar) {
    }

    public void B() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKeyBoardComponentView", "destroy view containers");
        y();
        this.f299646g = null;
        this.f299644e = null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void C(com.tencent.mm.plugin.appbrand.jsapi.y yVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void D() {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void E(com.tencent.mm.plugin.appbrand.jsapi.u uVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void F(com.tencent.mm.plugin.appbrand.jsapi.u uVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void G(com.tencent.mm.plugin.appbrand.jsapi.a0 a0Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public boolean H() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void I(com.tencent.mm.plugin.appbrand.jsapi.x xVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void J(com.tencent.mm.plugin.appbrand.jsapi.z zVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void K(com.tencent.mm.plugin.appbrand.jsapi.w wVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public com.tencent.mm.plugin.appbrand.jsapi.s M(boolean z17) {
        return z17 ? getGlobalCustomViewContainer() : getCustomViewContainer();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void N(com.tencent.mm.plugin.appbrand.jsapi.b0 b0Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void O(com.tencent.mm.plugin.appbrand.jsapi.v vVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void P(com.tencent.mm.plugin.appbrand.jsapi.a0 a0Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void Q(boolean z17) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void R(com.tencent.mm.plugin.appbrand.jsapi.v vVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public boolean S() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void T(com.tencent.mm.plugin.appbrand.jsapi.z zVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void U(com.tencent.mm.plugin.appbrand.jsapi.x xVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void V() {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void W(com.tencent.mm.plugin.appbrand.jsapi.b0 b0Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void X() {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void Y() {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void Z() {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void a(int i17, java.lang.String str) {
        this.f299643d.a(i17, str);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public <T extends com.tencent.mm.plugin.appbrand.jsapi.g0> T b(java.lang.Class<T> cls) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public boolean c(java.lang.String str, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        return this.f299643d.c(str, c0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void d(java.lang.String str, java.lang.String str2, int[] iArr) {
        this.f299643d.g(str, str2);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void e(java.lang.String str, java.lang.String str2, int i17) {
        this.f299643d.e(str, str2, i17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k0 f(java.lang.String str) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public void g(java.lang.String str, java.lang.String str2) {
        this.f299643d.g(str, str2);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public java.lang.String getAppId() {
        return this.f299643d.getAppId();
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
        return this.f299644e;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public fl1.g2 getDialogContainer() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.appstorage.u1 getFileSystem() {
        return null;
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

    public int getRootContainerViewId() {
        return f299642h;
    }

    public com.tencent.mm.plugin.appbrand.AppBrandRuntime getRuntime() {
        return this.f299643d.t3();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public /* bridge */ /* synthetic */ xi1.g getWindowAndroid() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void h() {
        B();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void i(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var, int[] iArr) {
        n5Var.q(this.f299643d, getComponentId()).m();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public boolean isRunning() {
        return (getRuntime() == null || getRuntime().L0()) ? false : true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public void j(java.lang.Runnable runnable, long j17) {
        this.f299643d.j(runnable, j17);
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
        this.f299643d.m(runnable);
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
        this.f299643d.g(n5Var.k(), n5Var.o());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t, com.tencent.mm.plugin.appbrand.jsapi.l
    public <T extends nd.b> T q(java.lang.Class<T> cls) {
        return (T) this.f299643d.q(cls);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void r(com.tencent.mm.plugin.appbrand.jsapi.g0 g0Var) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public boolean s(java.lang.String str) {
        return this.f299643d.s(str);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void setEvalInterceptor(com.tencent.mm.plugin.appbrand.jsapi.i iVar) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void setInterceptor(com.tencent.mm.plugin.appbrand.jsapi.k kVar) {
    }

    public void setRootContainerViewId(int i17) {
        f299642h = i17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public /* bridge */ /* synthetic */ boolean t() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void u(java.util.Collection<com.tencent.mm.plugin.appbrand.jsapi.g0> collection) {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void w(com.tencent.mm.plugin.appbrand.jsapi.w wVar) {
    }

    public void y() {
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrandKeyBoardComponentView", "clear views");
        ik1.h0.b(this.f299645f);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public void z() {
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.t
    public com.tencent.mm.plugin.appbrand.page.ia getCustomViewContainer() {
        com.tencent.mm.plugin.appbrand.page.ia iaVar = this.f299646g;
        if (iaVar != null) {
            return iaVar;
        }
        if (!(getContentView() instanceof android.view.ViewGroup)) {
            return null;
        }
        com.tencent.mm.plugin.appbrand.page.ia iaVar2 = new com.tencent.mm.plugin.appbrand.page.ia((android.view.ViewGroup) getContentView());
        this.f299646g = iaVar2;
        return iaVar2;
    }
}
