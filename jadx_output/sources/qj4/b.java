package qj4;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final qj4.b f363906a = new qj4.b();

    public final java.lang.String a(long j17, int i17, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.ActionResult", "getActionResultJsonString() called with: redDotType = " + j17 + ", btnStyle = " + i17 + " hasNotifyRedDot:" + z17);
        try {
            qj4.a aVar = new qj4.a();
            ai4.m0 m0Var = ai4.m0.f5173a;
            mj4.h M = m0Var.M(en1.a.a());
            if (M != null) {
                aVar.l(((mj4.k) M).l());
            }
            hj4.b i18 = m0Var.i();
            int i19 = 1;
            if (i18.a() == 1) {
                aVar.j(i18.f281661b);
                aVar.k(0);
                if (!z17) {
                    i19 = 0;
                }
                aVar.n(i19);
            } else {
                if (M != null) {
                    si4.a G = m0Var.G();
                    java.lang.String b17 = mj4.d.b(xe0.j0.a(M, false, 1, null));
                    java.lang.String a17 = en1.a.a();
                    kotlin.jvm.internal.o.f(a17, "username(...)");
                    aVar.k(G.w(b17, kz5.c0.d(a17)).size());
                } else if (i17 == 1 || i17 == 2) {
                    aVar.k(si4.a.g(m0Var.G(), null, 1, null));
                } else {
                    aVar.k(0);
                }
                if (j17 == 1) {
                    aVar.n(1);
                } else {
                    aVar.n(0);
                }
            }
            java.lang.String jSONObject = aVar.toJson().toString();
            kotlin.jvm.internal.o.f(jSONObject, "toString(...)");
            return jSONObject;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TextStatus.ActionResult", e17, "Error", new java.lang.Object[0]);
            return "";
        }
    }
}
