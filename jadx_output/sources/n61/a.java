package n61;

/* loaded from: classes9.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f335176d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f335177e;

    public a(int i17, int i18, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.zh();
        lVar.f70665b = new r45.ai();
        lVar.f70666c = "/cgi-bin/micromsg-bin/bindlinkedincontact";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.media.q4.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f335177e = a17;
        r45.zh zhVar = (r45.zh) a17.f70710a.f70684a;
        zhVar.f392045d = i17;
        zhVar.f392046e = i18;
        zhVar.f392047f = str;
        zhVar.f392048g = str2;
        zhVar.f392049h = str3;
        zhVar.f392050i = str4;
        zhVar.f392051m = str5;
        zhVar.f392052n = str6;
        zhVar.f392053o = str7;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f335176d = u0Var;
        return dispatch(sVar, this.f335177e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.media.q4.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.o oVar = this.f335177e;
        r45.zh zhVar = (r45.zh) oVar.f70710a.f70684a;
        if (i18 == 0 && i19 == 0) {
            gm0.j1.u().c().w(286722, zhVar.f392048g);
            gm0.j1.u().c().w(286721, zhVar.f392047f);
            gm0.j1.u().c().w(286723, zhVar.f392049h);
        }
        this.f335176d.onSceneEnd(i18, i19, str, this);
    }
}
