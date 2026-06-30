package pf1;

/* loaded from: classes7.dex */
public final class v implements com.tencent.mm.plugin.appbrand.jsapi.l {

    /* renamed from: d, reason: collision with root package name */
    public final pf1.c f353798d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f353799e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f353800f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f353801g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f353802h;

    /* renamed from: i, reason: collision with root package name */
    public final pf1.h f353803i;

    /* renamed from: m, reason: collision with root package name */
    public final java.util.HashMap f353804m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.plugin.appbrand.gf f353805n;

    public v(pf1.c view) {
        kotlin.jvm.internal.o.g(view, "view");
        this.f353798d = view;
        this.f353799e = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());
        this.f353800f = new java.util.concurrent.atomic.AtomicBoolean(false);
        this.f353801g = jz5.h.b(new pf1.t(this));
        this.f353802h = jz5.h.b(new pf1.u(this));
        this.f353803i = new pf1.h(view);
        java.util.HashMap hashMap = new java.util.HashMap();
        for (com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var : kz5.b0.c(new pf1.f())) {
            java.lang.String k17 = k0Var.k();
            kotlin.jvm.internal.o.f(k17, "getName(...)");
            hashMap.put(k17, k0Var);
        }
        this.f353804m = hashMap;
        this.f353805n = new com.tencent.mm.plugin.appbrand.gf();
    }

    public final java.lang.String B(java.lang.String apiName, java.lang.String str, int i17) {
        kotlin.jvm.internal.o.g(apiName, "apiName");
        com.tencent.mm.plugin.appbrand.jsapi.k0 k0Var = (com.tencent.mm.plugin.appbrand.jsapi.k0) this.f353804m.get(apiName);
        if (k0Var == null) {
            return pf1.a.f353768a;
        }
        org.json.JSONObject jSONObject = null;
        if (!(k0Var instanceof com.tencent.mm.plugin.appbrand.jsapi.f)) {
            if (!(k0Var instanceof com.tencent.mm.plugin.appbrand.jsapi.a1)) {
                return pf1.a.f353770c;
            }
            if (!(str == null || str.length() == 0)) {
                try {
                    jSONObject = new org.json.JSONObject(str);
                } catch (org.json.JSONException unused) {
                }
            }
            return jSONObject == null ? pf1.a.f353769b : ((com.tencent.mm.plugin.appbrand.jsapi.a1) k0Var).z(this, jSONObject);
        }
        if (!(str == null || str.length() == 0)) {
            try {
                jSONObject = new org.json.JSONObject(str);
            } catch (org.json.JSONException unused2) {
            }
        }
        if (jSONObject == null) {
            return pf1.a.f353769b;
        }
        com.tencent.mm.plugin.appbrand.jsapi.f fVar = (com.tencent.mm.plugin.appbrand.jsapi.f) k0Var;
        if (fVar.z()) {
            fVar.A(this, jSONObject, i17);
        } else {
            ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.f353801g).getValue()).post(new pf1.s(k0Var, this, jSONObject, i17));
        }
        return "";
    }

    public final void L() {
        g("sys:init", "{}");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void a(int i17, java.lang.String str) {
        pf1.h hVar = this.f353803i;
        hVar.getClass();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.invokeCallbackHandler(");
        sb6.append(i17);
        sb6.append(", ");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str == null) {
            str = "{}";
        }
        sb6.append(str);
        sb6.append(')');
        pf1.h.a(hVar, sb6.toString(), null, 2, null);
    }

    public final java.lang.String a0() {
        return ((pf1.q) this.f353798d).getAppId();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public <T extends com.tencent.mm.plugin.appbrand.jsapi.g0> T b(java.lang.Class<T> cls) {
        com.tencent.mm.plugin.appbrand.e9 C0;
        if (cls == null || (C0 = ((pf1.q) this.f353798d).getRuntime().C0()) == null) {
            return null;
        }
        return (T) C0.b(cls);
    }

    public final com.tencent.mm.plugin.appbrand.gf b0() {
        return this.f353805n;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public boolean c(java.lang.String str, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        return true;
    }

    public final pf1.c c0() {
        return this.f353798d;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void d(java.lang.String str, java.lang.String str2, int[] iArr) {
        g(str, str2);
    }

    public final void d0() {
        pf1.r rVar = new pf1.r();
        rVar.s("active", java.lang.Boolean.FALSE);
        p(rVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public void e(java.lang.String str, java.lang.String str2, int i17) {
        pf1.h hVar = this.f353803i;
        hVar.getClass();
        if (str == null) {
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("typeof WeixinJSBridge !== 'undefined' && WeixinJSBridge.subscribeHandler('");
        sb6.append(str);
        sb6.append("', ");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        if (str2 == null) {
            str2 = "{}";
        }
        sb6.append(str2);
        sb6.append(')');
        pf1.h.a(hVar, sb6.toString(), null, 2, null);
    }

    public final void e0() {
        pf1.r rVar = new pf1.r();
        rVar.s("active", java.lang.Boolean.TRUE);
        p(rVar);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k0 f(java.lang.String str) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public void g(java.lang.String str, java.lang.String str2) {
        e(str, str2, 0);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public java.lang.String getAppId() {
        return ((pf1.q) this.f353798d).getAppId();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public u81.b getAppState() {
        return ((pf1.q) this.f353798d).getRuntime().N.b();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public qu5.a getAsyncHandler() {
        return (com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.f353801g).getValue();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ fl1.g2 getAuthorizeDialogContainer() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public int getComponentId() {
        return hashCode();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public android.content.Context getContext() {
        return ((pf1.q) this.f353798d).getAndroidContext();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public fl1.g2 getDialogContainer() {
        return ((pf1.q) this.f353798d).getRuntime().getDialogContainer();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.appstorage.u1 getFileSystem() {
        return null;
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
        return (com.tencent.mm.plugin.appbrand.jsruntime.t) ((jz5.n) this.f353802h).getValue();
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
        this.f353799e.removeCallbacksAndMessages(null);
        if (this.f353800f.get()) {
            ((com.tencent.mm.sdk.platformtools.n3) ((jz5.n) this.f353801g).getValue()).getLooper().quit();
        }
        this.f353803i.getClass();
        ((com.tencent.mm.plugin.appbrand.jsruntime.t) ((jz5.n) this.f353802h).getValue()).destroy();
        this.f353805n.a();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public void i(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var, int[] iArr) {
        if (n5Var == null) {
            return;
        }
        if (!(n5Var instanceof com.tencent.mm.plugin.appbrand.jsapi.webview.b)) {
            p(n5Var);
            return;
        }
        pf1.c cVar = this.f353798d;
        com.tencent.mm.plugin.appbrand.e9 C0 = ((pf1.q) cVar).getRuntime().C0();
        if (C0 == null) {
            return;
        }
        com.tencent.mm.plugin.appbrand.jsapi.webview.b bVar = (com.tencent.mm.plugin.appbrand.jsapi.webview.b) n5Var;
        bVar.s("webviewId", java.lang.Integer.valueOf(cVar.hashCode()));
        bVar.s("htmlId", java.lang.Integer.valueOf(((pf1.q) cVar).getHtmlId()));
        bVar.v(C0, cVar.hashCode());
        bVar.m();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l, com.tencent.mm.plugin.appbrand.jsapi.d0
    public boolean isRunning() {
        return !((pf1.q) this.f353798d).getRuntime().L0();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public void j(java.lang.Runnable runnable, long j17) {
        if (runnable == null) {
            return;
        }
        ((pf1.q) this.f353798d).getRuntime().j(runnable, j17);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public <T extends com.tencent.mm.plugin.appbrand.jsapi.h0> T k(java.lang.Class<T> clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        return (T) ((pf1.q) this.f353798d).getRuntime().k(clazz);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public boolean l(com.tencent.mm.plugin.appbrand.jsapi.h0 h0Var) {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public void m(java.lang.Runnable runnable) {
        ((pf1.q) this.f353798d).getRuntime().m(runnable);
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
        if (n5Var == null) {
            return;
        }
        g(n5Var.k(), n5Var.o());
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.l
    public <T extends nd.b> T q(java.lang.Class<T> cls) {
        return (T) ((pf1.q) this.f353798d).getRuntime().K1(cls);
    }

    public void r(com.tencent.mm.plugin.appbrand.jsapi.g0 g0Var) {
    }

    public boolean s(java.lang.String str) {
        return true;
    }

    public void setEvalInterceptor(com.tencent.mm.plugin.appbrand.jsapi.i iVar) {
    }

    public void setInterceptor(com.tencent.mm.plugin.appbrand.jsapi.k kVar) {
    }

    public /* bridge */ /* synthetic */ boolean t() {
        return false;
    }

    public void u(java.util.Collection<com.tencent.mm.plugin.appbrand.jsapi.g0> collection) {
    }
}
