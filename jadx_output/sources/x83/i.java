package x83;

/* loaded from: classes2.dex */
public class i extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f452571d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f452572e;

    public i(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.v44 v44Var = new r45.v44();
        r45.w44 w44Var = new r45.w44();
        lVar.f70664a = v44Var;
        lVar.f70665b = w44Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/extdeviceloginconfirmcancel";
        lVar.f70667d = 973;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        v44Var.f387878d = str;
        this.f452572e = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f452571d = u0Var;
        return dispatch(sVar, this.f452572e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 973;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f452571d.onSceneEnd(i18, i19, str, this);
    }
}
