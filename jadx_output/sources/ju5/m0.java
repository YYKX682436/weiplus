package ju5;

/* loaded from: classes15.dex */
public class m0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju5.n0 f302125d;

    public m0(ju5.n0 n0Var) {
        this.f302125d = n0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        ju5.n0 n0Var = this.f302125d;
        n0Var.h(n0Var.f302131d, n0Var.f302133f);
        n0Var.getClass();
        try {
            android.content.SharedPreferences c17 = fu5.d.b().c();
            int i17 = c17.getInt(zt5.j.a().f475604a, -1);
            zt5.h.a("Soter.TaskInit", "soter: ask status: %d", java.lang.Integer.valueOf(i17));
            boolean z17 = i17 != 0;
            int[] iArr = n0Var.f302133f;
            if (z17 && wt5.a.h()) {
                zt5.h.c("Soter.TaskInit", "invalid ask, remove all key", new java.lang.Object[0]);
                wt5.a.r();
                for (int i18 : iArr) {
                    wt5.a.s((java.lang.String) fu5.d.b().a().get(i18, ""), false);
                }
                return;
            }
            for (int i19 : iArr) {
                java.lang.String str = (java.lang.String) fu5.d.b().a().get(i19, "");
                if (!zt5.l.b(str)) {
                    int i27 = c17.getInt(str, 0);
                    zt5.h.a("Soter.TaskInit", "soter: %s status: %d", str, java.lang.Integer.valueOf(i27));
                    if ((i27 != 0) && wt5.a.i(str)) {
                        zt5.h.c("Soter.TaskInit", "remove invalid ask: %s", str);
                        wt5.a.s(str, false);
                    }
                }
            }
        } catch (java.lang.Exception e17) {
            zt5.h.d("Soter.TaskInit", e17, "soter: removeAbnormalKeys failed");
        }
    }
}
