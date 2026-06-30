package n61;

/* loaded from: classes4.dex */
public class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f335181d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f335182e;

    public c(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.rc5();
        lVar.f70665b = new r45.sc5();
        lVar.f70667d = 268;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70666c = "/cgi-bin/micromsg-bin/privacypolicychoise";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f335182e = a17;
        r45.rc5 rc5Var = (r45.rc5) a17.f70710a.f70684a;
        rc5Var.f384728d = i17;
        rc5Var.f384729e = str;
        rc5Var.f384730f = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePrivacyPolicyChoice", "NetScenePrivacyPolicyChoice %s %s %s", java.lang.Integer.valueOf(i17), str, str2);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f335181d = u0Var;
        return dispatch(sVar, this.f335182e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 268;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePrivacyPolicyChoice", "errType %d,errCode %d,errMsg %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f335181d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
