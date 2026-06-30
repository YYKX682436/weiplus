package jt4;

/* loaded from: classes8.dex */
public class g extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f301646d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f301647e;

    /* renamed from: f, reason: collision with root package name */
    public r45.qh f301648f;

    public g(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ph();
        lVar.f70665b = new r45.qh();
        lVar.f70667d = 1986;
        lVar.f70666c = "/cgi-bin/mmpay-bin/bindecard";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f301647e = a17;
        r45.ph phVar = (r45.ph) a17.f70710a.f70684a;
        phVar.f383037d = str;
        phVar.f383038e = str2;
        phVar.f383039f = str3;
        phVar.f383040g = str4;
        phVar.f383041h = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBindECard", "cardType: %s, reqSerial: %s, openScene: %s, verifyCode: %s, bindToken: %s", str, str2, java.lang.Integer.valueOf(i17), str3, str4);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f301646d = u0Var;
        return dispatch(sVar, this.f301647e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1986;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBindECard", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.qh qhVar = (r45.qh) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f301648f = qhVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBindECard", "ret_code: %d, ret_msg: %s", java.lang.Integer.valueOf(qhVar.f383983d), this.f301648f.f383984e);
        com.tencent.mm.modelbase.u0 u0Var = this.f301646d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
