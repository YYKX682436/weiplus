package ya3;

/* loaded from: classes2.dex */
public class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f460588d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f460589e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f460590f = false;

    public a(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.xl0();
        lVar.f70665b = new r45.yl0();
        lVar.f70666c = "/cgi-bin/micromsg-bin/exittrackroom";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.sensor.q.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f460589e = a17;
        ((r45.xl0) a17.f70710a.f70684a).f390209d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f460588d = u0Var;
        return dispatch(sVar, this.f460589e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.sensor.q.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.yl0 yl0Var = (r45.yl0) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 == 0 && i19 == 0) {
            this.f460590f = yl0Var.f391200e > 0;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f460588d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
