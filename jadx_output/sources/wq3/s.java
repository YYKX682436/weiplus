package wq3;

/* loaded from: classes2.dex */
public class s extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f448592d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f448593e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f448594f;

    public s(r45.a76 a76Var, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.nh6();
        lVar.f70665b = new r45.oh6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/submitmallorder";
        lVar.f70667d = 556;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f448593e = a17;
        r45.nh6 nh6Var = (r45.nh6) a17.f70710a.f70684a;
        nh6Var.f381403d = a76Var;
        nh6Var.f381404e = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f448592d = u0Var;
        return dispatch(sVar, this.f448593e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 556;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        r45.oh6 oh6Var = (r45.oh6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 == 0 && i19 == 0) {
            this.f448594f = oh6Var.f382272d;
        }
        this.f448592d.onSceneEnd(i18, i19, str, this);
    }
}
