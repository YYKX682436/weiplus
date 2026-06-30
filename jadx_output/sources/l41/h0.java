package l41;

/* loaded from: classes4.dex */
public class h0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, ab0.x {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f315821d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f315822e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f315823f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f315824g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f315825h;

    public h0(java.lang.String str, java.lang.String str2, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.nx6();
        lVar.f70665b = new r45.ox6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/verifyopenimcontact";
        lVar.f70667d = td1.h.CTRL_INDEX;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315822e = a17;
        this.f315823f = str;
        this.f315824g = str2;
        r45.nx6 nx6Var = (r45.nx6) a17.f70710a.f70684a;
        nx6Var.f381737d = str;
        nx6Var.f381738e = str2;
        nx6Var.f381739f = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.FreeWifi.NetSceneVerifyOpenIMContact", "tp_username: %s, verify_ticket:%s", str, str2);
    }

    public java.lang.String H() {
        return this.f315823f;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f315821d = u0Var;
        return dispatch(sVar, this.f315822e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return td1.h.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FreeWifi.NetSceneVerifyOpenIMContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, tp_username = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, this.f315823f);
        com.tencent.mm.modelbase.u0 u0Var = this.f315821d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
