package x83;

/* loaded from: classes4.dex */
public class j extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f452573d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f452574e;

    public j(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.x44 x44Var = new r45.x44();
        r45.y44 y44Var = new r45.y44();
        lVar.f70664a = x44Var;
        lVar.f70665b = y44Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/kidswatchloginconfirmget";
        lVar.f70667d = 5218;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f452574e = lVar.a();
        x44Var.f389769d = str;
        x44Var.f389770e = str2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f452573d = u0Var;
        return dispatch(sVar, this.f452574e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5218;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f452573d.onSceneEnd(i18, i19, str, this);
    }
}
