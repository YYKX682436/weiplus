package t62;

/* loaded from: classes12.dex */
public class a implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f415995d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ t62.b f415996e;

    public a(t62.b bVar, java.lang.String str) {
        this.f415996e = bVar;
        this.f415995d = str;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        boolean z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderOpenApi", "[handleGetSimpleWxaInfo] errType:%d  errCode:%d  errMsg:%s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        r45.eq3 eq3Var = ((s62.a) m1Var).f403410i;
        t62.b bVar = this.f415996e;
        if (eq3Var == null) {
            bVar.c(v25.a.a(4301));
            return;
        }
        java.util.Iterator it = eq3Var.f373673e.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            r45.rv6 rv6Var = (r45.rv6) it.next();
            if ("snsapi_wxaapp_info".equals(rv6Var.f385228d) && rv6Var.f385229e == 1) {
                z17 = true;
                break;
            }
        }
        com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi extControlProviderOpenApi = bVar.f415998i;
        java.lang.String[] strArr = com.tencent.mm.plugin.ext.openapi.provider.ExtControlProviderOpenApi.f99859t;
        com.tencent.mars.xlog.Log.i("MicroMsg.ExtControlProviderOpenApi", "[handleGetSimpleWxaInfo] appid:%s  pkgName:%s  signatureMd5:%s hasPermission:%b", extControlProviderOpenApi.f99875g, extControlProviderOpenApi.d(), this.f415995d, java.lang.Boolean.valueOf(z17));
        if (!z17) {
            bVar.c(v25.a.a(4301));
            return;
        }
        try {
            int parseInt = java.lang.Integer.parseInt(bVar.f415997h[1]);
            bVar.f415997h[1] = java.lang.Math.min(parseInt, eq3Var.f373674f) + "";
        } catch (java.lang.NumberFormatException unused) {
        }
        bVar.c(bVar.f415998i.n(bVar.f415997h, true));
    }
}
