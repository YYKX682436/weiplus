package n61;

/* loaded from: classes2.dex */
public class d extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f335183d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f335184e;

    public d(int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.dr6();
        lVar.f70665b = new r45.er6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/unbindlinkedincontact";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.contact.n0.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f335184e = a17;
        ((r45.dr6) a17.f70710a.f70684a).f372706d = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f335183d = u0Var;
        return dispatch(sVar, this.f335184e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.contact.n0.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.o oVar = this.f335184e;
        if (i18 == 0 && i19 == 0) {
            gm0.j1.u().c().w(286722, "");
            gm0.j1.u().c().w(286721, "");
            gm0.j1.u().c().w(286723, "");
        }
        this.f335183d.onSceneEnd(i18, i19, str, this);
    }
}
