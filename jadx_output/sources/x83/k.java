package x83;

/* loaded from: classes4.dex */
public class k extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f452575d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f452576e;

    public k(java.lang.String str, java.lang.String str2, boolean z17, int i17, r45.u44 u44Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.z44 z44Var = new r45.z44();
        r45.a54 a54Var = new r45.a54();
        lVar.f70664a = z44Var;
        lVar.f70665b = a54Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/extdeviceloginconfirmok";
        lVar.f70667d = 972;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        z44Var.f391691d = str;
        z44Var.f391692e = str2;
        z44Var.f391694g = z17;
        z44Var.f391695h = i17;
        z44Var.f391696i = u44Var;
        this.f452576e = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f452575d = u0Var;
        return dispatch(sVar, this.f452576e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 972;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f452575d.onSceneEnd(i18, i19, str, this);
    }
}
