package k14;

/* loaded from: classes2.dex */
public class d0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f303317d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f303318e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f303319f;

    /* renamed from: g, reason: collision with root package name */
    public final int f303320g;

    public d0(java.lang.String str, java.lang.String str2, int i17, int i18) {
        this.f303318e = str;
        this.f303319f = str2;
        this.f303320g = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f303317d = u0Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.cp4 cp4Var = new r45.cp4();
        cp4Var.f371762d = this.f303318e;
        cp4Var.f371763e = this.f303319f;
        cp4Var.f371764f = this.f303320g;
        lVar.f70664a = cp4Var;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/moduserauth";
        lVar.f70665b = new r45.dp4();
        lVar.f70667d = 1144;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        return dispatch(sVar, lVar.a(), this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1144;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.dp4 dp4Var = (r45.dp4) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        com.tencent.mm.modelbase.u0 u0Var = this.f303317d;
        r45.qv6 qv6Var = dp4Var.f372647d;
        u0Var.onSceneEnd(i18, qv6Var.f384304d, qv6Var.f384305e, this);
    }
}
