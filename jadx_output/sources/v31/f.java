package v31;

/* loaded from: classes7.dex */
public final class f implements x31.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.jsapi.l f433088a;

    public f(com.tencent.mm.plugin.appbrand.jsapi.l lVar) {
        this.f433088a = lVar;
    }

    @Override // x31.a
    public void b(int i17, java.lang.String status, java.lang.String extra) {
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(extra, "extra");
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("action", java.lang.Integer.valueOf(i17));
        hashMap.put("status", status);
        hashMap.put("extra", extra);
        java.lang.String gVar = new cl0.g(hashMap).toString();
        kotlin.jvm.internal.o.f(gVar, "toString(...)");
        com.tencent.mars.xlog.Log.i("MicroMsg.MagicNewPlayable.JsApiPredownloadPlayablePackage", "playableService callback result:".concat(gVar));
        w31.a aVar = new w31.a();
        aVar.p(this.f433088a);
        aVar.r(gVar);
        aVar.m();
    }
}
