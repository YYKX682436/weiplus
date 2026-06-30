package ds1;

/* loaded from: classes7.dex */
public final class g implements com.tencent.mm.plugin.appbrand.jsruntime.s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.r f242839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ds1.j f242840b;

    public g(com.tencent.mm.plugin.appbrand.jsruntime.r rVar, ds1.j jVar) {
        this.f242839a = rVar;
        this.f242840b = jVar;
    }

    @Override // com.tencent.mm.plugin.appbrand.jsruntime.s
    public final void a(java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.e("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "[game-web-prefetch] handleException, message : %s\n, stackTrace : %s", str, str2);
        java.lang.String format = java.lang.String.format("try {WxGameJsCoreBridge.invokeError(\"%s\");} catch(e) {console.log(e);}", java.util.Arrays.copyOf(new java.lang.Object[]{u46.k.a("exception : " + str + " ; stack : " + str2)}, 1));
        kotlin.jvm.internal.o.f(format, "format(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.GameWebPrefetcherJsEngineInterceptor", "[game-web-prefetch] handleException, js = %s", format);
        ((com.tencent.mm.plugin.appbrand.jsruntime.n) this.f242839a).evaluateJavascript(format, null);
        ds1.j jVar = this.f242840b;
        mu4.x0 x0Var = jVar.f242848e;
        mu4.j0 j0Var = new mu4.j0();
        java.lang.String str3 = str + '\t' + str2;
        jx3.f.INSTANCE.d(20821, jVar.f242850g, jVar.f242851h, str3 != null ? r26.i0.u(str3, ',', '.', false, 4, null) : null);
        x0Var.a(j0Var);
        jVar.f242849f.a(new mu4.a0());
    }
}
