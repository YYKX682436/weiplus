package f11;

/* loaded from: classes2.dex */
public class k extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, com.tencent.mm.feature.emoji.api.w6 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f258564d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f258565e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f258566f;

    public k(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.g34();
        lVar.f70665b = new r45.h34();
        lVar.f70666c = "/cgi-bin/micromsg-bin/jumpemotiondetail";
        lVar.f70667d = ma1.i.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f258565e = a17;
        ((r45.g34) a17.f70710a.f70684a).f374852d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f258564d = u0Var;
        return dispatch(sVar, this.f258565e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return ma1.i.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f258564d.onSceneEnd(i18, i19, str, this);
    }
}
