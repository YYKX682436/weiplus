package l41;

/* loaded from: classes4.dex */
public class o extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, ab0.s {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f315882d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f315883e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f315884f;

    public o(java.lang.String str, java.lang.String str2, byte[] bArr) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.q4();
        lVar.f70665b = new r45.r4();
        lVar.f70666c = "/cgi-bin/micromsg-bin/addopenimcontact";
        lVar.f70667d = ma1.a.CTRL_INDEX;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315883e = a17;
        this.f315884f = str;
        r45.q4 q4Var = (r45.q4) a17.f70710a.f70684a;
        q4Var.f383650d = str;
        q4Var.f383651e = str2;
        if (bArr != null && bArr.length > 0) {
            q4Var.f383653g = com.tencent.mm.protobuf.g.b(bArr);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneAddOpenIMContact", "tp_username: %s, antispam_ticket:%s spamContext:%s", str, str2, bArr);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f315882d = u0Var;
        return dispatch(sVar, this.f315883e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return ma1.a.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        int intValue = ((java.lang.Integer) bm5.o1.f22719a.d(new com.tencent.mm.repairer.config.openim.RepairerConfigOpenIMAddContactStrategy())).intValue();
        if (intValue == 1) {
            i19 = -1;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Openim.NetSceneAddOpenIMContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, tp_username = %s rValue:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, this.f315884f, java.lang.Integer.valueOf(intValue));
        com.tencent.mm.modelbase.u0 u0Var = this.f315882d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
