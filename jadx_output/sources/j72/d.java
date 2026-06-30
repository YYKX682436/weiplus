package j72;

/* loaded from: classes9.dex */
public class d extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f298045d;

    /* renamed from: e, reason: collision with root package name */
    public r45.of3 f298046e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f298047f;

    public d(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.nf3();
        lVar.f70665b = new r45.of3();
        lVar.f70667d = 1108;
        lVar.f70666c = "/cgi-bin/mmpay-bin/getfacecontractstatus";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f298045d = a17;
        r45.nf3 nf3Var = (r45.nf3) a17.f70710a.f70684a;
        r45.ae aeVar = new r45.ae();
        nf3Var.f381351g = aeVar;
        aeVar.f369960n = wo.w0.n();
        nf3Var.f381351g.f369961o = wo.w0.a() ? 1 : 0;
        nf3Var.f381351g.f369962p = wo.w0.b() ? 1 : 0;
        nf3Var.f381348d = i17;
        nf3Var.f381349e = str;
        nf3Var.f381350f = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUICGI", "[cgi-request]NetSceneGetFaceContract scene:%s,userInfo:%s,sign:%s", java.lang.Integer.valueOf(i17), str, str2);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f298047f = u0Var;
        return dispatch(sVar, this.f298045d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1108;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.FaceAgreementUICGI", "[cgi-ret]onGYNetEnd, errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f298046e = (r45.of3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f298047f.onSceneEnd(i18, i19, str, this);
    }
}
