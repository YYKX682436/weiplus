package q71;

/* loaded from: classes8.dex */
public class o extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f360355d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f360356e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f360357f;

    public o(int i17, java.lang.String str, java.lang.String str2, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.aj5();
        lVar.f70665b = new r45.bj5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/rcptinfoquery";
        lVar.f70667d = 417;
        lVar.f70668e = 202;
        lVar.f70669f = 1000000202;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f360356e = a17;
        r45.aj5 aj5Var = (r45.aj5) a17.f70710a.f70684a;
        aj5Var.f370053d = i17;
        aj5Var.f370054e = str;
        aj5Var.f370055f = str2;
        aj5Var.f370056g = i18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f360355d = u0Var;
        return dispatch(sVar, this.f360356e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 417;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.bj5 bj5Var = (r45.bj5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            java.lang.String str2 = bj5Var.f370809f;
            this.f360357f = bj5Var.f370810g == 1;
            java.util.LinkedList linkedList = bj5Var.f370807d.f391139e;
            if (linkedList != null) {
                linkedList.size();
                o71.l.wi();
                o71.l.Bi().j(bj5Var.f370807d.f391139e);
                o71.l.wi();
                o71.l.Bi().i();
            }
        }
        this.f360355d.onSceneEnd(i18, i19, str, this);
    }
}
