package r01;

/* loaded from: classes.dex */
public class j3 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f368125d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f368126e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object f368127f;

    public j3(java.lang.String str, int i17, java.lang.String str2, java.lang.Object obj) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.jb3();
        lVar.f70665b = new r45.kb3();
        lVar.f70666c = "/cgi-bin/mmocbiz-bin/getbizjsapiresult";
        lVar.f70667d = cc1.w.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f368126e = a17;
        r45.jb3 jb3Var = (r45.jb3) a17.f70710a.f70684a;
        jb3Var.f377685d = str;
        jb3Var.f377686e = i17;
        jb3Var.f377687f = str2;
        this.f368127f = obj;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f368125d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetBizJsApiResult", "do scene");
        return dispatch(sVar, this.f368126e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return cc1.w.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f368125d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
