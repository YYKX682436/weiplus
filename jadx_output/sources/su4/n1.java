package su4;

/* loaded from: classes.dex */
public class n1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f413012d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f413013e;

    /* renamed from: f, reason: collision with root package name */
    public r45.aa7 f413014f;

    /* renamed from: g, reason: collision with root package name */
    public final su4.r1 f413015g;

    public n1(su4.r1 r1Var) {
        this.f413015g = r1Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 719;
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmwebsearch";
        lVar.f70664a = new r45.z97();
        lVar.f70665b = new r45.aa7();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f413013e = a17;
        r45.z97 z97Var = (r45.z97) a17.f70710a.f70684a;
        z97Var.f391822e = r1Var.f413062b;
        z97Var.f391821d = r1Var.f413061a;
        z97Var.f391824g = r1Var.f413064d;
        z97Var.f391826i = su4.r2.i();
        z97Var.f391823f = r1Var.f413063c;
        int i17 = r1Var.H;
        z97Var.f391825h = i17 == 0 ? com.tencent.mm.plugin.websearch.l2.a(0) : i17;
        z97Var.f391827m = r1Var.f413065e;
        z97Var.f391828n = r1Var.f413066f;
        z97Var.f391829o = r1Var.f413067g;
        z97Var.f391830p = r1Var.f413068h;
        z97Var.f391831q = r1Var.f413069i;
        z97Var.f391833s = r1Var.f413071k;
        z97Var.f391832r = r1Var.f413070j;
        z97Var.f391834t = r1Var.f413072l;
        z97Var.f391837w = r1Var.f413075o;
        z97Var.f391836v = r1Var.f413074n;
        z97Var.f391838x = r1Var.f413076p;
        z97Var.f391839y = r1Var.f413078r;
        z97Var.A = r1Var.f413082v;
        z97Var.F = com.tencent.mm.ui.bk.C() ? 1 : 0;
        z97Var.G = su4.r2.g();
        if (z97Var.f391826i == null) {
            r45.e64 e64Var = new r45.e64();
            z97Var.f391826i = e64Var;
            e64Var.f373053n = !su4.r2.j() ? 1 : 0;
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f413012d = u0Var;
        return dispatch(sVar, this.f413013e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 719;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        java.lang.Object[] objArr = {java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str};
        int i27 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebSearch.NetSceneMMWebSearch", "onGYNetEnd errType:%s errCode:%s errMsg:%s", objArr);
        this.f413014f = (r45.aa7) this.f413013e.f70711b.f70700a;
        com.tencent.mm.modelbase.u0 u0Var = this.f413012d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
