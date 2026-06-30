package com.tencent.mm.plugin.sport.model;

/* loaded from: classes12.dex */
public class i extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f171790d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f171791e;

    /* renamed from: f, reason: collision with root package name */
    public r45.n87 f171792f;

    public i() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 1947;
        lVar.f70666c = "/cgi-bin/mmoc-bin/hardware/getwxsportconfig";
        lVar.f70664a = new r45.m87();
        lVar.f70665b = new r45.n87();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f171791e = a17;
        r45.m87 m87Var = (r45.m87) a17.f70710a.f70684a;
        m87Var.f380253g = o45.wf.f343026d;
        m87Var.f380250d = com.tencent.mm.storage.la.m0();
        m87Var.f380251e = android.os.Build.BRAND;
        java.lang.String m17 = wo.w0.m();
        m87Var.f380252f = m17;
        m87Var.f380254h = wo.q.f447784e;
        java.lang.String str = o45.wf.f343027e;
        m87Var.f380255i = str;
        java.lang.String str2 = wo.q.f447785f;
        m87Var.f380256m = str2;
        java.lang.String str3 = com.tencent.mm.sdk.platformtools.z.f193111g;
        m87Var.f380257n = str3;
        java.lang.String str4 = android.os.Build.MANUFACTURER;
        m87Var.f380258o = str4;
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.NetSceneGetWeSportConfig", "request params=[%s, %s, %s, %s, %s, %s, %s, %s, %s]", m87Var.f380250d, m87Var.f380251e, m17, m87Var.f380253g, str2, str, str2, str3, str4);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f171790d = u0Var;
        return dispatch(sVar, this.f171791e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1947;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Sport.NetSceneGetWeSportConfig", "onGYNetEnd %d %d %d %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            this.f171790d.onSceneEnd(i18, i19, str, this);
        } else {
            this.f171792f = (r45.n87) this.f171791e.f70711b.f70700a;
            this.f171790d.onSceneEnd(i18, i19, str, this);
        }
    }
}
