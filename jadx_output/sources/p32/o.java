package p32;

/* loaded from: classes4.dex */
public class o extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f351509d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f351510e;

    public o(java.lang.String str, java.lang.String str2, int i17, java.lang.String str3) {
        this.f351510e = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.u64();
        lVar.f70665b = new r45.v64();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/rank/addlike";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.auth.v1.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f351510e = a17;
        r45.u64 u64Var = (r45.u64) a17.f70710a.f70684a;
        u64Var.f387085e = str2;
        u64Var.f387084d = str;
        u64Var.f387086f = i17;
        u64Var.f387087g = str3;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f351509d = u0Var;
        return dispatch(sVar, this.f351510e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.auth.v1.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f351509d.onSceneEnd(i18, i19, str, this);
    }
}
