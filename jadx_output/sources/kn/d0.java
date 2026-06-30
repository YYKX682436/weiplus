package kn;

/* loaded from: classes8.dex */
public class d0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f309383d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f309384e;

    /* renamed from: f, reason: collision with root package name */
    public r45.lt6 f309385f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f309386g;

    public d0(java.lang.String str, java.lang.String str2, int i17) {
        java.lang.Object[] objArr = new java.lang.Object[1];
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        objArr[0] = str == null ? "" : str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUpgradeAssociateChatRoom", "NetSceneUpgradeAssociateChatRoom roomname:%s", objArr);
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70666c = "/cgi-bin/micromsg-bin/upgradeassociatechatroom";
        lVar.f70667d = 3927;
        lVar.f70664a = new r45.kt6();
        lVar.f70665b = new r45.lt6();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f309384e = a17;
        this.f309386g = str;
        r45.kt6 kt6Var = (r45.kt6) a17.f70710a.f70684a;
        kt6Var.f378943d = str;
        kt6Var.f378944e = str2;
        kt6Var.f378945f = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f309383d = u0Var;
        com.tencent.mm.modelbase.o oVar = this.f309384e;
        this.f309385f = (r45.lt6) oVar.f70711b.f70700a;
        return dispatch(sVar, oVar, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3927;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f309383d.onSceneEnd(i18, i19, str, this);
    }
}
