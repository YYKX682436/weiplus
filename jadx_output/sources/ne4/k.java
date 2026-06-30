package ne4;

/* loaded from: classes9.dex */
public class k implements eu5.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ d50.p f336558a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f336559b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ iu5.e f336560c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f336561d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f336562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ne4.n f336563f;

    public k(ne4.n nVar, d50.p pVar, int i17, iu5.e eVar, boolean z17, int i18) {
        this.f336563f = nVar;
        this.f336558a = pVar;
        this.f336559b = i17;
        this.f336560c = eVar;
        this.f336561d = z17;
        this.f336562e = i18;
    }

    @Override // eu5.b
    public void a(eu5.e eVar) {
        eu5.c cVar = (eu5.c) eVar;
        java.lang.String str = cVar.f475606b;
        int i17 = cVar.f475605a;
        if (i17 == 1003) {
            str = re4.g0.f394536b;
        } else if (i17 == 1004) {
            str = re4.g0.f394537c;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SoterManager", "prepare callback result: %s, %s", java.lang.Integer.valueOf(i17), cVar.f475606b);
        boolean a17 = cVar.a();
        d50.p pVar = this.f336558a;
        int i18 = this.f336559b;
        if (a17) {
            re4.g0.g(0);
            if (pVar != null) {
                pVar.c(cVar);
            }
        } else {
            if (i18 >= 2) {
                if (pVar != null) {
                    pVar.b(cVar);
                }
                m05.i.f322570a.a("5", "2", java.lang.String.valueOf(cVar.f475605a), str);
            } else {
                if (i18 == 1) {
                    com.tencent.mars.xlog.Log.w("MicroMsg.SoterManager", "need remove ask");
                    wt5.a.r();
                }
                if (pVar != null) {
                    pVar.a(i18);
                }
                com.tencent.mars.xlog.Log.i("MicroMsg.SoterManager", "do prepare authkey retry: %s", java.lang.Integer.valueOf(i18));
                java.lang.Object obj = this.f336560c;
                if (obj instanceof com.tencent.mm.modelbase.m1) {
                    ((com.tencent.mm.modelbase.m1) obj).reset();
                }
                this.f336563f.b(this.f336558a, this.f336561d, this.f336562e, this.f336560c, i18 + 1);
            }
            re4.n.c(2, cVar.f475605a, 1L);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(17806, java.lang.Integer.valueOf(cVar.f475605a), str, java.lang.Integer.valueOf(i18));
    }
}
