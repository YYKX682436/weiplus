package n21;

/* loaded from: classes8.dex */
public class n implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n21.o f334275d;

    public n(n21.o oVar) {
        this.f334275d = oVar;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        n21.o oVar = this.f334275d;
        java.lang.String str2 = oVar.f334278b;
        if (str2 != null && ((n21.b) m1Var).f334242h.equals(str2)) {
            gm0.j1.d().q(240, oVar.f334280d);
            if (i18 == 0) {
                if (n21.h.f334267h == null) {
                    n21.h.f334267h = new n21.h();
                }
                n21.h.f334267h.getClass();
                gm0.j1.i();
                java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.q1((java.lang.Integer) gm0.j1.u().c().l(16646145, null)));
                if (valueOf.intValue() < 0) {
                    valueOf = 0;
                }
                gm0.j1.i();
                gm0.j1.u().c().w(16646145, java.lang.Integer.valueOf(valueOf.intValue() + 1));
            }
            com.tencent.mm.vfs.z7 a17 = com.tencent.mm.vfs.z7.a(oVar.f334278b);
            java.lang.String str3 = a17.f213279f;
            if (str3 != null) {
                java.lang.String l17 = com.tencent.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
                    a17 = new com.tencent.mm.vfs.z7(a17.f213277d, a17.f213278e, l17, a17.f213280g, a17.f213281h);
                }
            }
            try {
                try {
                    com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(a17, null);
                    if (m17.a()) {
                        m17.f213266a.d(m17.f213267b);
                    }
                } catch (java.lang.Exception e17) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.SpeexUploadCore", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                }
            } finally {
                n21.o.b().c();
                oVar.f334278b = null;
            }
        }
    }
}
