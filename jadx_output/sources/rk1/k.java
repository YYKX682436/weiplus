package rk1;

/* loaded from: classes7.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.y8 f396422d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info f396423e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info f396424f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rk1.m f396425g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396426h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f396427i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f396428m;

    public k(com.tencent.mm.plugin.appbrand.appcache.y8 y8Var, com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info wxaPkg$Info, com.tencent.mm.plugin.appbrand.appcache.WxaPkg$Info wxaPkg$Info2, rk1.m mVar, java.lang.String str, int i17, java.lang.String str2) {
        this.f396422d = y8Var;
        this.f396423e = wxaPkg$Info;
        this.f396424f = wxaPkg$Info2;
        this.f396425g = mVar;
        this.f396426h = str;
        this.f396427i = i17;
        this.f396428m = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Process.setThreadPriority(-4);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.io.InputStream c17 = this.f396422d.c(this.f396423e.f75389e);
        if (c17 != null) {
            java.io.Reader inputStreamReader = new java.io.InputStreamReader(c17, r26.c.f368865a);
            java.io.BufferedReader bufferedReader = inputStreamReader instanceof java.io.BufferedReader ? (java.io.BufferedReader) inputStreamReader : new java.io.BufferedReader(inputStreamReader, 8192);
            try {
                java.util.Iterator it = vz5.v.b(bufferedReader).iterator();
                while (it.hasNext()) {
                    try {
                        arrayList.add(java.lang.Integer.valueOf(java.lang.Integer.parseInt((java.lang.String) it.next())));
                    } catch (java.lang.Exception e17) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Appbrand.WasmCacheService", e17, "readline precompile.txt", new java.lang.Object[0]);
                    }
                }
                vz5.b.a(bufferedReader, null);
            } finally {
            }
        }
        if (arrayList.size() == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Appbrand.WasmCacheService", "func list empty, abort");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Appbrand.WasmCacheService", "wasm fileName: %s!!", this.f396424f.f75389e);
        ik1.b0 b0Var = new ik1.b0();
        com.tencent.mm.plugin.appbrand.appcache.y8 y8Var = this.f396422d;
        java.lang.String fileName = this.f396424f.f75389e;
        kotlin.jvm.internal.o.f(fileName, "fileName");
        com.tencent.mm.plugin.appbrand.appcache.v3.c(y8Var, fileName, b0Var);
        java.lang.String fileName2 = this.f396424f.f75389e;
        kotlin.jvm.internal.o.f(fileName2, "fileName");
        java.lang.String substring = fileName2.substring(1);
        kotlin.jvm.internal.o.f(substring, "substring(...)");
        rk1.m mVar = this.f396425g;
        java.lang.String appId = this.f396426h;
        int i17 = this.f396427i;
        java.lang.String packageMD5 = this.f396428m;
        java.lang.Object value = b0Var.f291824a;
        kotlin.jvm.internal.o.f(value, "value");
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) value;
        rk1.i iVar = new rk1.i(this.f396425g, this.f396426h);
        mVar.getClass();
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(packageMD5, "packageMD5");
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = rk1.m.f396434i;
        if (concurrentHashMap.contains(appId)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Appbrand.WasmCacheService", "already added task for appId: %s", appId);
        } else {
            rk1.e eVar = new rk1.e(appId, i17, packageMD5, byteBuffer, substring, iVar, arrayList);
            concurrentHashMap.put(appId, eVar);
            if (concurrentHashMap.size() > 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Appbrand.WasmCacheService", "more than 1 task, pending for appId: %s", appId);
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.Appbrand.WasmCacheService", "create task for appId: %s", appId);
                mVar.wi(eVar);
            }
        }
        int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_android_appbrand_wasm_precompile_cache_timeout, 10000);
        com.tencent.mars.xlog.Log.i("MicroMsg.Appbrand.WasmCacheService", "set compile timeout: %d", java.lang.Integer.valueOf(Ni));
        ((ku5.t0) ku5.t0.f312615d).k(new rk1.j(this.f396425g, this.f396426h), Ni);
    }
}
