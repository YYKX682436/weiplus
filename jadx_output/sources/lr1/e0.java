package lr1;

/* loaded from: classes4.dex */
public class e0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f320654d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f320655e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.LinkedList f320656f;

    public e0() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.c93();
        lVar.f70665b = new r45.d93();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getapplist";
        lVar.f70667d = 387;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f320655e = a17;
        this.f320656f = new java.util.LinkedList();
        r45.c93 c93Var = (r45.c93) a17.f70710a.f70684a;
        gm0.j1.i();
        java.lang.Object l17 = gm0.j1.u().c().l(196610, null);
        java.lang.Object[] objArr = new java.lang.Object[2];
        objArr[0] = 196610;
        objArr[1] = l17 == null ? "null" : l17.toString();
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.BrandServiceApplication", "get config, key[%d], value[%s]", objArr);
        int j17 = com.tencent.mm.sdk.platformtools.t8.j1((java.lang.Integer) l17, 0);
        c93Var.f371382d = j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.NetSceneGetAppList", "info: request hash code %d", java.lang.Integer.valueOf(j17));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f320654d = u0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.NetSceneGetAppList", "do scene");
        return dispatch(sVar, this.f320655e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 387;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.w("MicroMsg.BrandService.NetSceneGetAppList", "on scene end code(%d, %d)", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        if (i18 == 0 && i19 == 0) {
            r45.d93 d93Var = (r45.d93) this.f320655e.f70711b.f70700a;
            com.tencent.mars.xlog.Log.i("MicroMsg.BrandService.NetSceneGetAppList", "ok, hash code is %d, count is %d", java.lang.Integer.valueOf(d93Var.f372251f), java.lang.Integer.valueOf(d93Var.f372249d));
            yq1.n.b(196610, java.lang.Integer.valueOf(d93Var.f372251f));
            java.util.Iterator it = d93Var.f372250e.iterator();
            while (it.hasNext()) {
                this.f320656f.add(((r45.r0) it.next()).f384393d);
            }
        }
        this.f320654d.onSceneEnd(i18, i19, str, this);
    }
}
