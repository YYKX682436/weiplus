package jc3;

/* loaded from: classes7.dex */
public final class p0 implements com.tencent.mm.plugin.appbrand.jsapi.l {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f298973d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f298974e;

    /* renamed from: f, reason: collision with root package name */
    public final yz5.l f298975f;

    /* renamed from: g, reason: collision with root package name */
    public lc3.e f298976g;

    public p0(android.content.Context ctx, java.lang.String appId, yz5.l callback, lc3.e eVar) {
        kotlin.jvm.internal.o.g(ctx, "ctx");
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f298973d = ctx;
        this.f298974e = appId;
        this.f298975f = callback;
        this.f298976g = eVar;
    }

    public final void B(lc3.e eVar) {
        this.f298976g = eVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void a(int i17, java.lang.String data) {
        kotlin.jvm.internal.o.g(data, "data");
        lc3.a0 a0Var = new lc3.a0(data);
        if (!a0Var.has("errCode")) {
            java.lang.String optString = a0Var.optString("errMsg");
            kotlin.jvm.internal.o.d(optString);
            if (r26.i0.n(optString, ":ok", false)) {
                a0Var.put("errCode", 0);
            } else {
                a0Var.put("errCode", 4096);
            }
        }
        this.f298975f.invoke(a0Var);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public <T extends com.tencent.mm.plugin.appbrand.jsapi.g0> T b(java.lang.Class<T> cls) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public boolean c(java.lang.String str, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void d(java.lang.String str, java.lang.String str2, int[] iArr) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void e(java.lang.String str, java.lang.String str2, int i17) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k0 f(java.lang.String str) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public void g(java.lang.String str, java.lang.String str2) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public java.lang.String getAppId() {
        return this.f298974e;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public u81.b getAppState() {
        return u81.b.FOREGROUND;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ qu5.a getAsyncHandler() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ fl1.g2 getAuthorizeDialogContainer() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public int getComponentId() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public android.content.Context getContext() {
        return this.f298973d;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public fl1.g2 getDialogContainer() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.appstorage.u1 getFileSystem() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.jsapi.k getInterceptor() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.Cif getInvokeCostManager() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.jsruntime.t getJsRuntime() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ androidx.lifecycle.y getLifecycleOwner() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public /* bridge */ /* synthetic */ xi1.g getWindowAndroid() {
        return null;
    }

    public void h() {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public void i(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var, int[] iArr) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public boolean isRunning() {
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public void j(java.lang.Runnable runnable, long j17) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public <T extends com.tencent.mm.plugin.appbrand.jsapi.h0> T k(java.lang.Class<T> clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public boolean l(com.tencent.mm.plugin.appbrand.jsapi.h0 h0Var) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public void m(java.lang.Runnable runnable) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public android.content.Context n() {
        return getContext();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public void o(java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f312615d).g(runnable);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public void p(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public <T extends nd.b> T q(java.lang.Class<T> cls) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    public void r(com.tencent.mm.plugin.appbrand.jsapi.g0 g0Var) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    public boolean s(java.lang.String str) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    public void setEvalInterceptor(com.tencent.mm.plugin.appbrand.jsapi.i iVar) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    public void setInterceptor(com.tencent.mm.plugin.appbrand.jsapi.k kVar) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    public /* bridge */ /* synthetic */ boolean t() {
        return false;
    }

    public void u(java.util.Collection<com.tencent.mm.plugin.appbrand.jsapi.g0> collection) {
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    public final lc3.e y() {
        return this.f298976g;
    }

    public /* synthetic */ p0(android.content.Context context, java.lang.String str, yz5.l lVar, lc3.e eVar, int i17, kotlin.jvm.internal.i iVar) {
        this(context, str, lVar, (i17 & 8) != 0 ? null : eVar);
    }
}
