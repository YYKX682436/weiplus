package op3;

/* loaded from: classes5.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f347244d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f347245e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.autogen.mmdata.rpt.RevokePatActionReportStruct f347246f;

    /* renamed from: g, reason: collision with root package name */
    public final long f347247g;

    /* renamed from: h, reason: collision with root package name */
    public final long f347248h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f347249i;

    public a(java.lang.String str, long j17, long j18, long j19, java.lang.String str2) {
        java.lang.Object l17 = gm0.j1.u().c().l(290818, 0);
        int P = l17 != null ? com.tencent.mm.sdk.platformtools.t8.P(l17.toString(), 0) : 0;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ws5();
        lVar.f70665b = new r45.xs5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/revokemsg";
        lVar.f70667d = 594;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f347247g = j17;
        this.f347248h = j18;
        this.f347249i = str2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f347244d = a17;
        r45.ws5 ws5Var = (r45.ws5) a17.f70710a.f70684a;
        ws5Var.f389417d = str;
        ws5Var.f389418e = 0;
        ws5Var.f389420g = 0;
        ws5Var.f389424n = j18;
        ws5Var.f389419f = (int) (j19 / 1000);
        ws5Var.f389421h = c01.z1.r();
        ws5Var.f389422i = str2;
        ws5Var.f389423m = P;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRevokePatMsg", "clientMsgId:%s,newClientMsgId:%d,svrMsgId:%d,createTime:%d,fromUserName:%s,toUserName:%s,indexOfRequest:%d", ws5Var.f389417d, java.lang.Integer.valueOf(ws5Var.f389418e), java.lang.Integer.valueOf(ws5Var.f389420g), java.lang.Integer.valueOf(ws5Var.f389419f), ws5Var.f389421h, ws5Var.f389422i, java.lang.Integer.valueOf(ws5Var.f389423m));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f347245e = u0Var;
        return dispatch(sVar, this.f347244d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 594;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRevokePatMsg", "onGYNetEnd errType %d, errCode %d, errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            ((lp3.l) ((mp3.j) i95.n0.c(mp3.j.class))).Ai(this.f347247g, this.f347248h, this.f347249i);
            java.lang.Object l17 = gm0.j1.u().c().l(290818, 0);
            gm0.j1.u().c().w(290818, java.lang.Integer.valueOf((l17 != null ? com.tencent.mm.sdk.platformtools.t8.P(l17.toString(), 0) : 0) + 1));
            com.tencent.mm.autogen.mmdata.rpt.RevokePatActionReportStruct revokePatActionReportStruct = this.f347246f;
            if (revokePatActionReportStruct != null) {
                revokePatActionReportStruct.f60020l = 2;
                revokePatActionReportStruct.k();
                com.tencent.mm.autogen.mmdata.rpt.RevokePatActionReportStruct struct = this.f347246f;
                kotlin.jvm.internal.o.g(struct, "struct");
                struct.o();
            }
        } else {
            com.tencent.mm.autogen.mmdata.rpt.RevokePatActionReportStruct revokePatActionReportStruct2 = this.f347246f;
            if (revokePatActionReportStruct2 != null) {
                revokePatActionReportStruct2.f60020l = 1;
                revokePatActionReportStruct2.k();
                com.tencent.mm.autogen.mmdata.rpt.RevokePatActionReportStruct struct2 = this.f347246f;
                kotlin.jvm.internal.o.g(struct2, "struct");
                struct2.o();
            }
        }
        this.f347245e.onSceneEnd(i18, i19, str, this);
    }
}
