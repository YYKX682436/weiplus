package wq3;

/* loaded from: classes2.dex */
public class q extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f448585d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f448586e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f448587f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.LinkedList f448588g;

    /* renamed from: h, reason: collision with root package name */
    public java.util.LinkedList f448589h;

    public q(java.util.LinkedList linkedList, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.rb5();
        lVar.f70665b = new r45.sb5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/presubmitorder";
        lVar.f70667d = 554;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f448586e = a17;
        r45.rb5 rb5Var = (r45.rb5) a17.f70710a.f70684a;
        rb5Var.f384704e = linkedList;
        rb5Var.f384703d = linkedList != null ? linkedList.size() : 0;
        rb5Var.f384705f = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f448585d = u0Var;
        return dispatch(sVar, this.f448586e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 554;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        int i27;
        r45.sb5 sb5Var = (r45.sb5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 == 0 && i19 == 0 && sb5Var.f385613g == 0) {
            java.lang.String str2 = sb5Var.f385612f;
            this.f448588g = sb5Var.f385611e;
            this.f448587f = str2;
            this.f448589h = sb5Var.f385615i;
        }
        if (i19 == 0 && (i27 = sb5Var.f385613g) != 0) {
            str = sb5Var.f385614h;
            i19 = i27;
        }
        this.f448585d.onSceneEnd(i18, i19, str, this);
    }
}
