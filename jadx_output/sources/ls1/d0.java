package ls1;

/* loaded from: classes8.dex */
public final class d0 implements com.tencent.mm.ipcinvoker.wx_extension.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ls1.e0 f320971a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f320972b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f320973c;

    public d0(ls1.e0 e0Var, java.lang.String str, nw4.y2 y2Var) {
        this.f320971a = e0Var;
        this.f320972b = str;
        this.f320973c = y2Var;
    }

    @Override // com.tencent.mm.ipcinvoker.wx_extension.v
    public final void a(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar) {
        ls1.e0 e0Var = this.f320971a;
        java.util.HashSet hashSet = e0Var.f320979e2;
        java.lang.String str2 = this.f320972b;
        hashSet.remove(str2);
        com.tencent.mm.protobuf.f fVar = oVar.f70711b.f70700a;
        if (fVar instanceof r45.s83) {
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.GetA8KeyResp");
            r45.s83 s83Var = (r45.s83) fVar;
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(s83Var.f385545d);
            nw4.y2 y2Var = this.f320973c;
            if (K0) {
                com.tencent.mars.xlog.Log.e(e0Var.B1(), "updatePageAuth fail fullurl is null");
                ax4.a.a(82);
                nw4.n g07 = e0Var.g0();
                if (g07 != null) {
                    g07.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
                    return;
                }
                return;
            }
            if (i17 != 0 || i18 != 0) {
                ax4.a.a(82);
                nw4.n g08 = e0Var.g0();
                if (g08 != null) {
                    g08.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
                    return;
                }
                return;
            }
            try {
                e0Var.R.g(s83Var.f385545d, new com.tencent.mm.protocal.JsapiPermissionWrapper(x51.j1.d(s83Var.f385560v)), new com.tencent.mm.protocal.GeneralControlWrapper(s83Var.f385551m));
                java.lang.String FullURL = s83Var.f385545d;
                kotlin.jvm.internal.o.f(FullURL, "FullURL");
                e0Var.K1(str2, FullURL, com.tencent.mm.plugin.webview.permission.d.g(s83Var.f385562x));
                ax4.a.c(109);
                java.util.HashMap hashMap = new java.util.HashMap();
                java.lang.String FullURL2 = s83Var.f385545d;
                kotlin.jvm.internal.o.f(FullURL2, "FullURL");
                hashMap.put("fullUrl", FullURL2);
                com.tencent.mars.xlog.Log.i(e0Var.B1(), "updatePageAuth values:%s", hashMap);
                ax4.a.a(81);
                nw4.n g09 = e0Var.g0();
                if (g09 != null) {
                    g09.e(y2Var.f341013c, y2Var.f341019i + ":ok", hashMap);
                }
            } catch (java.lang.Exception unused) {
                ax4.a.a(82);
                nw4.n g010 = e0Var.g0();
                if (g010 != null) {
                    g010.e(y2Var.f341013c, y2Var.f341019i + ":fail", null);
                }
            }
        }
    }
}
