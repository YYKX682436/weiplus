package q71;

/* loaded from: classes7.dex */
public class l extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f360348d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f360349e;

    public l(int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.nd0();
        lVar.f70665b = new r45.od0();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxaapp/autofill/deleteinfo";
        lVar.f70667d = tj.d.CTRL_INDEX;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f360349e = a17;
        r45.nd0 nd0Var = (r45.nd0) a17.f70710a.f70684a;
        nd0Var.f381257e = "invoice_info";
        nd0Var.f381258f = i17;
        nd0Var.f381259g = 2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f360348d = u0Var;
        return dispatch(sVar, this.f360349e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return tj.d.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDeleteUserAutoFillInfo", "");
        }
        this.f360348d.onSceneEnd(i18, i19, str, this);
    }
}
