package er3;

/* loaded from: classes4.dex */
public class d extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f256025d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f256026e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f256027f;

    public d(java.lang.String str, java.lang.String str2) {
        this.f256027f = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ks3();
        lVar.f70665b = new r45.ls3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getwburl";
        lVar.f70667d = 205;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f256026e = a17;
        r45.ks3 ks3Var = (r45.ks3) a17.f70710a.f70684a;
        ks3Var.f378920e = str2;
        java.lang.String str3 = (java.lang.String) c01.d9.b().p().l(46, null);
        str3 = str3 == null ? "" : str3;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(com.tencent.mm.sdk.platformtools.t8.h(str3));
        ks3Var.f378919d = cu5Var;
        java.lang.String str4 = (java.lang.String) c01.d9.b().p().l(72, null);
        java.lang.String str5 = str4 != null ? str4 : "";
        r45.cu5 cu5Var2 = new r45.cu5();
        cu5Var2.d(com.tencent.mm.sdk.platformtools.t8.h(str5));
        ks3Var.f378923h = cu5Var2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f256025d = u0Var;
        return dispatch(sVar, this.f256026e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 205;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.String str2 = ((r45.ls3) this.f256026e.f70711b.f70700a).f379799d;
        this.f256025d.onSceneEnd(i18, i19, str, this);
    }
}
