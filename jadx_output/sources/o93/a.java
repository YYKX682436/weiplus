package o93;

/* loaded from: classes7.dex */
public final class a implements com.tencent.mm.plugin.appbrand.jsapi.d0 {

    /* renamed from: g, reason: collision with root package name */
    public o93.f f343717g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f343718h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.appbrand.appstorage.u1 f343719i;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f343714d = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    public final o93.d f343715e = new o93.d();

    /* renamed from: f, reason: collision with root package name */
    public final o93.b f343716f = new o93.b();

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f343720m = "";

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f343721n = "liteapp";

    /* renamed from: o, reason: collision with root package name */
    public long f343722o = 1;

    public final void B(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
    }

    public final void L(java.lang.String appId) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f343721n = appId;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public void a(int i17, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "callback callbackId:%s dst:%s", java.lang.Integer.valueOf(i17), str);
        o93.i.b().a(i17, str);
    }

    public final void a0(long j17) {
        this.f343722o = j17;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public <T extends com.tencent.mm.plugin.appbrand.jsapi.g0> T b(java.lang.Class<T> cls) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = cls != null ? cls.getName() : null;
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "getConfig clazz name:%s", objArr);
        o93.b bVar = this.f343716f;
        if (bVar != null) {
            return bVar;
        }
        try {
            T t17 = (T) new d56.b(cls, cls).c().f226632b;
            if (t17 != null) {
                try {
                    r(t17);
                } catch (java.lang.Exception unused) {
                    bVar = t17;
                    kotlin.jvm.internal.o.d(cls);
                    com.tencent.mars.xlog.Log.e("WxaLiteApp.LiteAppAppBrandComponent", "Make sure %s has default constructor", cls.getName());
                    return bVar;
                }
            }
            return t17;
        } catch (java.lang.Exception unused2) {
        }
    }

    public final void b0(android.content.Context context) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f343718h = new java.lang.ref.WeakReference(context);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public boolean c(java.lang.String str, com.tencent.mm.plugin.appbrand.jsruntime.c0 c0Var) {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "checkIsActivatedForEval %s", str);
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public void d(java.lang.String str, java.lang.String str2, int[] iArr) {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "publish event:%s data:%s dst:%d", str, str2, iArr);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public void e(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "dispatch event:%s data:%s src:%d", str, str2, java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.k0 f(java.lang.String str) {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public void g(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "dispatch event:%s data:%s", str, str2);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public java.lang.String getAppId() {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "getAppId");
        return this.f343721n;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l, uh1.u
    public u81.b getAppState() {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "getAppState");
        return u81.b.FOREGROUND;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public qu5.a getAsyncHandler() {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "getAsyncHandler");
        return this.f343714d;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ fl1.g2 getAuthorizeDialogContainer() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public int getComponentId() {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "getComponentId");
        return 0;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public android.content.Context getContext() {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "getContext");
        java.lang.ref.WeakReference weakReference = this.f343718h;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        if (context != null) {
            return context;
        }
        android.content.Context context2 = com.tencent.mm.sdk.platformtools.x2.f193071a;
        kotlin.jvm.internal.o.f(context2, "getContext(...)");
        return context2;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public fl1.g2 getDialogContainer() {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "getDialogContainer");
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.appstorage.u1 getFileSystem() {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "getFileSystem");
        com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var = this.f343719i;
        if (u1Var == null) {
            java.lang.String o17 = new com.tencent.mm.vfs.r6(com.tencent.mm.plugin.lite.logic.y2.g(), "luggage/liteapp/objects").o();
            kotlin.jvm.internal.o.f(o17, "getAbsolutePath(...)");
            this.f343720m = o17;
            com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "tmpDirPath: " + this.f343720m);
            this.f343719i = new o93.c(this.f343720m, this.f343721n, this.f343722o);
        } else {
            if (u1Var == null) {
                kotlin.jvm.internal.o.o("mFS");
                throw null;
            }
            ((o93.c) u1Var).f343724e = this.f343721n;
            if (u1Var == null) {
                kotlin.jvm.internal.o.o("mFS");
                throw null;
            }
            ((o93.c) u1Var).f343725f = this.f343722o;
        }
        com.tencent.mm.plugin.appbrand.appstorage.u1 u1Var2 = this.f343719i;
        if (u1Var2 != null) {
            return u1Var2;
        }
        kotlin.jvm.internal.o.o("mFS");
        throw null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.jsapi.k getInterceptor() {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "getInterceptor");
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.Cif getInvokeCostManager() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public com.tencent.mm.plugin.appbrand.jsruntime.t getJsRuntime() {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "getJsRuntime");
        return this.f343715e;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public /* bridge */ /* synthetic */ androidx.lifecycle.y getLifecycleOwner() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    /* renamed from: getRuntime */
    public com.tencent.mm.plugin.appbrand.AppBrandRuntime t3() {
        java.lang.ref.WeakReference weakReference = this.f343718h;
        if ((weakReference != null ? (android.content.Context) weakReference.get() : null) == null) {
            com.tencent.mars.xlog.Log.w("WxaLiteApp.LiteAppAppBrandComponent", "not call setContext");
            return null;
        }
        java.lang.ref.WeakReference weakReference2 = this.f343718h;
        android.content.Context context = weakReference2 != null ? (android.content.Context) weakReference2.get() : null;
        kotlin.jvm.internal.o.d(context);
        this.f343717g = new o93.f(context);
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "context: " + getContext());
        o93.f fVar = this.f343717g;
        kotlin.jvm.internal.o.d(fVar);
        return fVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public /* bridge */ /* synthetic */ xi1.g getWindowAndroid() {
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public void h() {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "cleanup");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public void i(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var, int[] iArr) {
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = n5Var != null ? n5Var.k() : null;
        objArr[1] = java.lang.String.valueOf(iArr);
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "publish event:%s dst:%s", objArr);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public boolean isRunning() {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "isRunning");
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public void j(java.lang.Runnable runnable, long j17) {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "scheduleToUiThreadDelayed");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public <T extends com.tencent.mm.plugin.appbrand.jsapi.h0> T k(java.lang.Class<T> clazz) {
        kotlin.jvm.internal.o.g(clazz, "clazz");
        throw new jz5.k("An operation is not implemented: Not yet implemented");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public boolean l(com.tencent.mm.plugin.appbrand.jsapi.h0 h0Var) {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "attachEnvContext");
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public void m(java.lang.Runnable runnable) {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "scheduleToUiThread");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.t
    public android.content.Context n() {
        java.lang.ref.WeakReference weakReference = this.f343718h;
        android.content.Context context = weakReference != null ? (android.content.Context) weakReference.get() : null;
        return context instanceof android.app.Activity ? context : getContext();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public void o(java.lang.Runnable runnable) {
        ((ku5.t0) ku5.t0.f312615d).g(runnable);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public void p(com.tencent.mm.plugin.appbrand.jsapi.n5 n5Var) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = n5Var != null ? n5Var.k() : null;
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "dispatch event:%s", objArr);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, com.tencent.mm.plugin.appbrand.jsapi.l
    public <T extends nd.b> T q(java.lang.Class<T> cls) {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "customize");
        return null;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public void r(com.tencent.mm.plugin.appbrand.jsapi.g0 g0Var) {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "attachConfig");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public boolean s(java.lang.String str) {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "checkIsActivatedForEval %s", str);
        return true;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public void setEvalInterceptor(com.tencent.mm.plugin.appbrand.jsapi.i iVar) {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "setEvalInterceptor");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public void setInterceptor(com.tencent.mm.plugin.appbrand.jsapi.k kVar) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        objArr[0] = java.lang.Integer.valueOf(kVar != null ? kVar.hashCode() : 0);
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "setInterceptor interceptor:%s", objArr);
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public /* bridge */ /* synthetic */ boolean t() {
        return false;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public void u(java.util.Collection<com.tencent.mm.plugin.appbrand.jsapi.g0> collection) {
        com.tencent.mars.xlog.Log.i("WxaLiteApp.LiteAppAppBrandComponent", "attachConfig");
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0, uh1.v
    public /* bridge */ /* synthetic */ uh1.u v() {
        return super.v();
    }

    @Override // com.tencent.mm.plugin.appbrand.jsapi.d0
    public com.tencent.mm.plugin.appbrand.appstorage.ICommLibReader x() {
        return null;
    }

    public final long y() {
        return this.f343722o;
    }
}
