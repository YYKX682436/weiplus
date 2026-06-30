package ts4;

/* loaded from: classes2.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f421713d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f421714e;

    public a(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.c65();
        lVar.f70665b = new r45.d65();
        lVar.f70666c = "/cgi-bin/mmpay-bin/payibgcheckjsapisign";
        lVar.f70667d = 1767;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f421714e = a17;
        r45.c65 c65Var = (r45.c65) a17.f70710a.f70684a;
        c65Var.f371330d = str;
        c65Var.f371333g = str4;
        c65Var.f371331e = str2;
        c65Var.f371334h = str5;
        c65Var.f371335i = str6;
        c65Var.f371332f = str3;
        c65Var.f371336m = str7;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f421713d = u0Var;
        return dispatch(sVar, this.f421714e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1767;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneIbgCheckJsapi", "check jsapi: errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.d65 d65Var = (r45.d65) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i19 == 0 && i18 == 0) {
            i19 = d65Var.f372180d;
            str = d65Var.f372181e;
        }
        this.f421713d.onSceneEnd(i18, i19, str, this);
    }
}
