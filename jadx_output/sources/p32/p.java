package p32;

/* loaded from: classes2.dex */
public class p extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f351511d = null;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f351512e;

    public p(java.lang.String str, java.lang.String str2) {
        this.f351512e = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.js6();
        lVar.f70665b = new r45.ks6();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/rank/updatecover";
        lVar.f70667d = 1040;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f351512e = a17;
        r45.js6 js6Var = (r45.js6) a17.f70710a.f70684a;
        js6Var.f378092d = str;
        js6Var.f378093e = str2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f351511d = u0Var;
        return dispatch(sVar, this.f351512e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1040;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f351511d.onSceneEnd(i18, i19, str, this);
    }
}
