package fu1;

/* loaded from: classes14.dex */
public class e extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f266833d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f266834e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f266835f;

    /* renamed from: g, reason: collision with root package name */
    public int f266836g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f266837h;

    public e(int i17, java.util.LinkedList linkedList, java.lang.String str, java.lang.String str2, r45.o46 o46Var, int i18, r45.pd6 pd6Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.y36();
        lVar.f70665b = new r45.z36();
        lVar.f70666c = "/cgi-bin/micromsg-bin/sharecarditem";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f266833d = a17;
        r45.y36 y36Var = (r45.y36) a17.f70710a.f70684a;
        y36Var.f390759d = i17;
        y36Var.f390760e = linkedList;
        y36Var.f390761f = str;
        y36Var.f390762g = str2;
        if (linkedList != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneShareCardItem", "list length is " + linkedList.size());
        }
        y36Var.f390763h = o46Var;
        y36Var.f390764i = i18;
        y36Var.f390765m = pd6Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f266834e = u0Var;
        return dispatch(sVar, this.f266833d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneShareCardItem", "onGYNetEnd, cmdType = %d, errType = %d, errCode = %d", java.lang.Integer.valueOf(com.tencent.mm.plugin.appbrand.jsapi.lbs.v0.CTRL_INDEX), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        com.tencent.mm.modelbase.o oVar = this.f266833d;
        if (i18 == 0 && i19 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneShareCardItem", "do ShareCardItem netscene success!");
            r45.z36 z36Var = (r45.z36) oVar.f70711b.f70700a;
            if (z36Var != null) {
                this.f266835f = z36Var.f391683f;
                this.f266836g = z36Var.f391681d;
                this.f266837h = z36Var.f391682e;
            }
        } else {
            r45.z36 z36Var2 = (r45.z36) oVar.f70711b.f70700a;
            if (z36Var2 != null) {
                this.f266835f = z36Var2.f391683f;
                this.f266836g = z36Var2.f391681d;
                this.f266837h = z36Var2.f391682e;
            }
        }
        this.f266834e.onSceneEnd(i18, i19, str, this);
    }
}
