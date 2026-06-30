package va3;

/* loaded from: classes9.dex */
public class b0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f434262d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f434263e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f434264f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f434265g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f434266h = new java.util.ArrayList();

    /* renamed from: i, reason: collision with root package name */
    public byte[] f434267i = null;

    /* renamed from: m, reason: collision with root package name */
    public boolean f434268m = false;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f434269n;

    /* renamed from: o, reason: collision with root package name */
    public int f434270o;

    public b0(r45.nk3 nk3Var, java.lang.String str) {
        this.f434269n = "";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = nk3Var;
        lVar.f70665b = new r45.ok3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getpoilist";
        lVar.f70667d = 457;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f434263e = a17;
        r45.nk3 nk3Var2 = (r45.nk3) a17.f70710a.f70684a;
        int i17 = nk3Var2.f381459e;
        this.f434269n = str;
        boolean z17 = nk3Var2.f381461g.f371839d == 0;
        this.f434264f = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetPoiList", "lat: %f lng: %f scene: %d opcode: %d oriLat： %f oriLng: %f isAutoQuery: %s isFirst:%s, indoorSwitch:%s, buildingId:%s, poiFloor: %s", java.lang.Double.valueOf(nk3Var2.f381463i), java.lang.Double.valueOf(nk3Var2.f381462h), java.lang.Integer.valueOf(nk3Var2.f381458d), java.lang.Integer.valueOf(nk3Var2.f381459e), java.lang.Double.valueOf(nk3Var2.f381465n), java.lang.Double.valueOf(nk3Var2.f381464m), java.lang.Integer.valueOf(nk3Var2.f381466o), java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(nk3Var2.f381469r), nk3Var2.f381470s, nk3Var2.f381471t);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetPoiList", "NetSceneGetPoiList done.");
        this.f434262d = u0Var;
        return dispatch(sVar, this.f434263e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 457;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.ok3 ok3Var = (r45.ok3) this.f434263e.f70711b.f70700a;
        java.util.List list = this.f434266h;
        ((java.util.ArrayList) list).clear();
        java.lang.String str2 = ok3Var.f382325m;
        this.f434265g = ok3Var.f382329q;
        this.f434270o = ok3Var.f382328p;
        java.util.LinkedList linkedList = ok3Var.f382320e;
        if (linkedList != null) {
            linkedList.size();
            if (linkedList.size() > 0) {
                java.lang.String str3 = ((r45.d35) linkedList.get(0)).f372035e;
                java.lang.String str4 = ((r45.d35) linkedList.get(0)).f372041n;
                java.lang.String str5 = ((r45.d35) linkedList.get(0)).f372044q;
                java.lang.String str6 = ((r45.d35) linkedList.get(0)).f372042o;
            }
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                ((java.util.ArrayList) list).add(new com.tencent.mm.plugin.location.ui.impl.d0((r45.d35) it.next(), this.f434265g));
            }
        }
        r45.cu5 cu5Var = ok3Var.f382323h;
        if (cu5Var != null) {
            this.f434267i = x51.j1.d(cu5Var);
        }
        this.f434268m = ok3Var.f382322g == 1;
        this.f434262d.onSceneEnd(i18, i19, str, this);
    }
}
