package vs3;

/* loaded from: classes9.dex */
public class d extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f439880d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f439881e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f439882f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f439883g;

    public d(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        this.f439882f = str2;
        this.f439883g = str3;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.q33();
        lVar.f70665b = new r45.r33();
        lVar.f70666c = "/cgi-bin/mmpay-bin/flowdatarechargepreinquery";
        lVar.f70667d = 1555;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f439881e = a17;
        r45.q33 q33Var = (r45.q33) a17.f70710a.f70684a;
        q33Var.f383618d = str;
        q33Var.f383619e = str2;
        q33Var.f383620f = str3;
        q33Var.f383621g = str4;
        q33Var.f383622h = str5;
        q33Var.f383623i = bt4.f.b().c(str);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f439880d = u0Var;
        return dispatch(sVar, this.f439881e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1555;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f439880d.onSceneEnd(i18, i19, str, this);
    }
}
