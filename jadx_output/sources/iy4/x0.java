package iy4;

/* loaded from: classes2.dex */
public class x0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f296026d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f296027e;

    public x0(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.sm0 sm0Var = new r45.sm0();
        r45.tm0 tm0Var = new r45.tm0();
        lVar.f70664a = sm0Var;
        lVar.f70665b = tm0Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/extdeviceloginconfirmcancel";
        lVar.f70667d = 973;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        sm0Var.f385843d = str;
        this.f296027e = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f296026d = u0Var;
        return dispatch(sVar, this.f296027e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 973;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f296026d.onSceneEnd(i18, i19, str, this);
    }
}
