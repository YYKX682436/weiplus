package q71;

/* loaded from: classes8.dex */
public class p extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f360358d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f360359e;

    /* renamed from: f, reason: collision with root package name */
    public final int f360360f;

    public p(int i17) {
        this.f360360f = 0;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.cj5();
        lVar.f70665b = new r45.dj5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/rcptinforemove";
        lVar.f70667d = com.tencent.wxmm.v2helper.EMethodEhanceHeadsetEC;
        lVar.f70668e = 201;
        lVar.f70669f = 1000000201;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f360359e = a17;
        this.f360360f = i17;
        ((r45.cj5) a17.f70710a.f70684a).f371599d = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f360358d = u0Var;
        return dispatch(sVar, this.f360359e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.wxmm.v2helper.EMethodEhanceHeadsetEC;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.dj5 dj5Var = (r45.dj5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            java.util.LinkedList linkedList = dj5Var.f372532e.f391139e;
            if (linkedList != null) {
                linkedList.size();
                o71.l.wi();
                o71.l.Bi().j(dj5Var.f372532e.f391139e);
                o71.l.wi();
                o71.l.Bi().i();
            }
        }
        this.f360358d.onSceneEnd(i18, i19, str, this);
    }
}
