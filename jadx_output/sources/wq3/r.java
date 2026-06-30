package wq3;

/* loaded from: classes2.dex */
public class r extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f448590d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f448591e;

    public r(r45.a76 a76Var, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.lh6();
        lVar.f70665b = new r45.mh6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/submitmallfreeorder";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.lab.d.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f448591e = a17;
        ((r45.lh6) a17.f70710a.f70684a).f379495d = a76Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f448590d = u0Var;
        return dispatch(sVar, this.f448591e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.lab.d.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.mh6 mh6Var = (r45.mh6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 == 0 && i19 == 0) {
            java.lang.String str2 = mh6Var.f380529d;
        }
        this.f448590d.onSceneEnd(i18, i19, str, this);
    }
}
