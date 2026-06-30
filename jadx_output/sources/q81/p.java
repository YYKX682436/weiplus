package q81;

/* loaded from: classes7.dex */
public final class p implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360714a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f360715b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f360716c;

    public p(java.lang.String str, java.lang.String str2, int i17) {
        this.f360714a = str;
        this.f360715b = str2;
        this.f360716c = i17;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(fVar.f70615a);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(fVar.f70616b);
        java.lang.String str2 = fVar.f70617c;
        java.lang.String str3 = this.f360714a;
        java.lang.String str4 = this.f360715b;
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.CmdPreLaunch", "getContact(%s %s) back, errType %d, errCode %d, errMsg %s", str3, str4, valueOf, valueOf2, str2);
        r45.v54 v54Var = (r45.v54) fVar.f70618d;
        boolean z17 = false;
        if (v54Var != null && fVar.f70616b == 0 && fVar.f70615a == 0) {
            if (v54Var == null || (str = v54Var.f387908m) == null) {
                str = "";
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
                str4 = str;
            }
            com.tencent.mm.plugin.appbrand.launching.i9 Zi = com.tencent.mm.plugin.appbrand.app.r9.Zi();
            java.lang.String str5 = "appId = [" + str4 + "], storage = null? [%b]";
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(Zi == null);
            com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.CmdPreLaunch", str5, objArr);
            if (Zi != null) {
                Zi.d(str4);
                if (Zi.z0(str4, (r45.v54) fVar.f70618d) != null) {
                    z17 = true;
                }
            }
        }
        int i17 = this.f360716c;
        if (z17) {
            r81.f.INSTANCE.b(i17, be1.r.CTRL_INDEX);
        } else {
            r81.f.INSTANCE.b(i17, 170);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.AppBrand.Predownload.CmdPreLaunch", "callInner: preLaunch res = [%b]", java.lang.Boolean.valueOf(z17));
        return jz5.f0.f302826a;
    }
}
