package nu4;

/* loaded from: classes7.dex */
public final class o implements android.webkit.ValueCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nu4.b0 f340265a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsruntime.r f340267c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f340268d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f340269e;

    public o(nu4.b0 b0Var, java.lang.String str, com.tencent.mm.plugin.appbrand.jsruntime.r rVar, java.lang.String str2, java.lang.String str3, yz5.l lVar) {
        this.f340265a = b0Var;
        this.f340266b = str;
        this.f340267c = rVar;
        this.f340268d = str2;
        this.f340269e = lVar;
    }

    @Override // android.webkit.ValueCallback
    public void onReceiveValue(java.lang.Object obj) {
        nu4.b0 b0Var = this.f340265a;
        java.util.HashMap hashMap = b0Var.H;
        com.tencent.mm.plugin.appbrand.jsruntime.r rVar = this.f340267c;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(rVar.o());
        java.lang.String str = this.f340266b;
        hashMap.put(str, valueOf);
        com.tencent.mars.xlog.Log.i(b0Var.C, "createPrefetcherJsContext end prefetcherId: " + str + ", " + this.f340268d + ", /prefetcher.js, contextId: " + rVar.o() + ", " + rVar.hashCode());
        yz5.l lVar = this.f340269e;
        if (lVar != null) {
            lVar.invoke(rVar);
        }
    }
}
