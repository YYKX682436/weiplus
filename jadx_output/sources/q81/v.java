package q81;

/* loaded from: classes7.dex */
public class v implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ km5.b f360723a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q81.u f360724b;

    public v(q81.u uVar, km5.b bVar) {
        this.f360724b = uVar;
        this.f360723a = bVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        if (bool != null && bool.booleanValue()) {
            com.tencent.mm.plugin.appbrand.appcache.n6 n6Var = (com.tencent.mm.plugin.appbrand.appcache.n6) com.tencent.mm.plugin.appbrand.app.r9.fj(com.tencent.mm.plugin.appbrand.appcache.n6.class);
            q81.u uVar = this.f360724b;
            t81.c cVar = uVar.f360718a;
            boolean h17 = q81.n.h(n6Var.D0(cVar.field_appId, cVar.field_type, cVar.field_version), q81.m.GET_CODE);
            t81.c cVar2 = uVar.f360718a;
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.GetCodeRetryLogic", "record(%s %d %d) download ok, decryptResult %b", cVar2.field_appId, java.lang.Integer.valueOf(cVar2.field_type), java.lang.Integer.valueOf(cVar2.field_version), java.lang.Boolean.valueOf(h17));
        }
        this.f360723a.resume();
        return null;
    }
}
