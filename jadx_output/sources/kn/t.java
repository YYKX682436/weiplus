package kn;

/* loaded from: classes.dex */
public class t extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f309461d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f309462e = null;

    /* renamed from: f, reason: collision with root package name */
    public int f309463f;

    /* renamed from: g, reason: collision with root package name */
    public int f309464g;

    public t(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.yc3();
        lVar.f70665b = new r45.zc3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getchatroomupgradestatus";
        lVar.f70667d = md1.e1.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f309461d = a17;
        ((r45.yc3) a17.f70710a.f70684a).f390961d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f309462e = u0Var;
        return dispatch(sVar, this.f309461d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return md1.e1.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.zc3 zc3Var = (r45.zc3) this.f309461d.f70711b.f70700a;
        this.f309463f = zc3Var.f391903d;
        this.f309464g = zc3Var.f391909m;
        this.f309462e.onSceneEnd(i18, i19, str, this);
    }
}
