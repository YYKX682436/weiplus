package i11;

/* loaded from: classes4.dex */
public class q extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f287141d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f287142e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f287143f = "";

    public q(u60.h hVar) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.i93();
        lVar.f70665b = new r45.j93();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getaddress";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.appdownload.t.CTRL_INDEX;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f287142e = a17;
        r45.i93 i93Var = (r45.i93) a17.f70710a.f70684a;
        double d17 = hVar.f424868a;
        i93Var.f376840e = d17;
        double d18 = hVar.f424869b;
        i93Var.f376839d = d18;
        i93Var.f376843h = hVar.f424870c;
        i93Var.f376841f = hVar.f424871d;
        i93Var.f376842g = hVar.f424872e;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetAddress", "Latitude:%s, Longitude:%s, scene:%s, indoorswitch:%s, poiFloor:%s", java.lang.Double.valueOf(d17), java.lang.Double.valueOf(d18), java.lang.Integer.valueOf(hVar.f424870c), java.lang.Integer.valueOf(hVar.f424871d), hVar.f424872e);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f287141d = u0Var;
        return dispatch(sVar, this.f287142e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.appdownload.t.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.modelbase.u0 u0Var = this.f287141d;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            }
            return;
        }
        this.f287143f = ((r45.j93) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a).f377665d;
        com.tencent.mm.modelbase.u0 u0Var2 = this.f287141d;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
