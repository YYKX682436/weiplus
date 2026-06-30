package l41;

/* loaded from: classes4.dex */
public class f0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f315808d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f315809e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f315810f;

    public f0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this.f315810f = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.hz5();
        lVar.f70665b = new r45.iz5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/sendopenimverifyrequest";
        lVar.f70667d = 243;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315809e = a17;
        r45.hz5 hz5Var = (r45.hz5) a17.f70710a.f70684a;
        hz5Var.f376572d = str;
        hz5Var.f376573e = str2;
        hz5Var.f376574f = str3;
        hz5Var.f376575g = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendOpenIMVerifyRequest", "init user:%s anti:%s", str, str3);
    }

    public void H(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendOpenIMVerifyRequest", "setClientMsgIdWithExtInfo: clientMsgId=%s, openImCustomInfo=%s, openImAppId=%s, descWordingId=%s", java.lang.Long.valueOf(j17), str, str2, str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendOpenIMVerifyRequest", "setClientMsgId: %s", java.lang.Long.valueOf(j17));
        com.tencent.mm.modelbase.o oVar = this.f315809e;
        ((r45.hz5) oVar.f70710a.f70684a).f376576h = java.lang.String.valueOf(j17);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (str != null && !str.isEmpty()) {
            r45.k15 k15Var = new r45.k15();
            k15Var.f378312d = "openImCustomInfo";
            k15Var.f378313e = str;
            arrayList.add(k15Var);
        }
        if (str2 != null && !str2.isEmpty()) {
            r45.k15 k15Var2 = new r45.k15();
            k15Var2.f378312d = "openImAppId";
            k15Var2.f378313e = str2;
            arrayList.add(k15Var2);
        }
        if (str3 != null && !str3.isEmpty()) {
            r45.k15 k15Var3 = new r45.k15();
            k15Var3.f378312d = "descWordingId";
            k15Var3.f378313e = str3;
            arrayList.add(k15Var3);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendOpenIMVerifyRequest", "setMsgExtInfo: size=%s", java.lang.Integer.valueOf(arrayList.size()));
        r45.hz5 hz5Var = (r45.hz5) oVar.f70710a.f70684a;
        if (!arrayList.isEmpty()) {
            hz5Var.f376577i = new java.util.LinkedList(arrayList);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendOpenIMVerifyRequest", "setClientMsgIdWithExtInfo: extInfo set, size=%s", java.lang.Integer.valueOf(arrayList.size()));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f315808d = u0Var;
        return dispatch(sVar, this.f315809e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 243;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendOpenIMVerifyRequest", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s, tp_username = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str, this.f315810f);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSendOpenIMVerifyRequest", "errType:%d, errCode:%d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        }
        this.f315808d.onSceneEnd(i18, i19, str, this);
    }
}
