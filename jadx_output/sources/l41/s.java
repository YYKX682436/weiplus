package l41;

/* loaded from: classes2.dex */
public final class s extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f315916d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f315917e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f315918f;

    public s(java.lang.String str) {
        this.f315916d = "";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.oc0();
        lVar.f70665b = new r45.pc0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/delopenimkefucontact";
        lVar.f70667d = 5997;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f315918f = a17;
        this.f315916d = str != null ? str : "";
        r45.oc0 oc0Var = (r45.oc0) a17.f70710a.f70684a;
        if (oc0Var != null) {
            oc0Var.f382143d = str;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDelOpenIMKefuContact", "delOpenImKefuContact username: " + str);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f315917e = u0Var;
        return dispatch(sVar, this.f315918f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5997;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDelOpenIMKefuContact", "delOpenImKefuContact onGYNetEnd errType: " + i18 + ", errCode: " + i19 + ", errMsg: " + str + ", type: 5997, username: " + this.f315916d);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.modelbase.u0 u0Var = this.f315917e;
            kotlin.jvm.internal.o.d(u0Var);
            u0Var.onSceneEnd(i18, i19, str, this);
        } else {
            com.tencent.mm.modelbase.u0 u0Var2 = this.f315917e;
            kotlin.jvm.internal.o.d(u0Var2);
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
