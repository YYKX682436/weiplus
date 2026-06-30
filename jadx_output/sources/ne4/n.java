package ne4;

/* loaded from: classes9.dex */
public class n implements d50.q {

    /* renamed from: a, reason: collision with root package name */
    public du5.c f336568a;

    /* renamed from: b, reason: collision with root package name */
    public ne4.m f336569b;

    /* renamed from: c, reason: collision with root package name */
    public ne4.l f336570c;

    public void a(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterManager", "cancel");
        du5.c cVar = this.f336568a;
        if (cVar != null) {
            cVar.a(z17);
        }
        ne4.m mVar = this.f336569b;
        if (mVar != null) {
            mVar.f336566a = null;
        }
        ne4.l lVar = this.f336570c;
        if (lVar != null) {
            lVar.f336564a = null;
        }
    }

    public final void b(d50.p pVar, boolean z17, int i17, iu5.e eVar, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterManager", "prepare auth key internal: %s, %s, %s", java.lang.Boolean.valueOf(z17), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        cu5.b.e(new ne4.k(this, pVar, i18, eVar, z17, i17), z17, true, i17, eVar, new oe4.i());
    }

    public void c(d50.o oVar, android.content.Context context, int i17, int i18, java.lang.String str, d50.n nVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterManager", "request authorize and sign: %s, %s, %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), str);
        if (this.f336568a == null) {
            this.f336568a = new du5.c();
        }
        this.f336568a.b();
        ju5.c cVar = new ju5.c(null);
        cVar.f302069d = i18;
        cVar.f302066a = i17;
        cVar.f302068c = context;
        cVar.f302077l = this.f336568a;
        cVar.f302067b = str;
        if (nVar != null) {
            cVar.f302074i = true;
            cVar.f302070e = nVar.f226517a;
            cVar.f302071f = nVar.f226518b;
            cVar.f302072g = null;
            cVar.f302073h = nVar.f226519c;
        }
        ne4.l lVar = this.f336570c;
        if (lVar != null) {
            lVar.f336564a = null;
        }
        ne4.l lVar2 = new ne4.l(oVar, i18);
        this.f336570c = lVar2;
        cVar.f302078m = lVar2;
        ne4.m mVar = this.f336569b;
        if (mVar != null) {
            mVar.f336566a = null;
        }
        ne4.m mVar2 = new ne4.m(oVar, i17);
        this.f336569b = mVar2;
        cu5.b.g(mVar2, cVar);
    }
}
