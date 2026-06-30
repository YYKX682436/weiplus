package k01;

/* loaded from: classes2.dex */
public class b1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, k01.p0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f303004d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f303005e;

    public b1(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.sf7();
        lVar.f70665b = new r45.tf7();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/wxausrevent/wxatmplcomplaint";
        lVar.f70667d = 1198;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f303004d = a17;
        ((r45.sf7) a17.f70710a.f70684a).f385688d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetServiceNotifyOptions", "doScene");
        this.f303005e = u0Var;
        return dispatch(sVar, this.f303004d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1198;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetServiceNotifyOptions", "onGYNetEnd, errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f303005e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
