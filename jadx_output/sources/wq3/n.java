package wq3;

/* loaded from: classes2.dex */
public class n extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f448573d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f448574e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.LinkedList f448575f;

    public n(java.lang.String str, java.lang.String str2, r45.d5 d5Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.oh3();
        lVar.f70665b = new r45.ph3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getlastestexpressinfo";
        lVar.f70667d = 578;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f448574e = a17;
        r45.oh3 oh3Var = (r45.oh3) a17.f70710a.f70684a;
        oh3Var.f382266d = str;
        oh3Var.f382267e = str2;
        oh3Var.f382268f = d5Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f448573d = u0Var;
        return dispatch(sVar, this.f448574e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 578;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        int i27;
        r45.ph3 ph3Var = (r45.ph3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 == 0 && i19 == 0 && ph3Var.f383058f == 0) {
            this.f448575f = ph3Var.f383056d;
        }
        if (i19 == 0 && (i27 = ph3Var.f383058f) != 0) {
            str = ph3Var.f383059g;
            i19 = i27;
        }
        this.f448573d.onSceneEnd(i18, i19, str, this);
    }
}
