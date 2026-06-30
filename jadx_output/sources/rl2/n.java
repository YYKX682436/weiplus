package rl2;

/* loaded from: classes8.dex */
public final class n {
    public n(kotlin.jvm.internal.i iVar) {
    }

    public final void a() {
        synchronized (this) {
            try {
                if (rl2.v.f397215h == null) {
                    rl2.v.f397215h = new d95.b0();
                    java.lang.String str = gm0.j1.u().h() + "FinderLiveTipsBar001.db";
                    java.util.HashMap hashMap = new java.util.HashMap();
                    hashMap.put(-1082358007, new rl2.m(this));
                    d95.b0 b0Var = rl2.v.f397215h;
                    kotlin.jvm.internal.o.d(b0Var);
                    if (!b0Var.S(str, hashMap, true, true)) {
                        pm0.z.b(xy2.b.f458155b, "FinderLiveTipsBarStorage_CreateDBFailed", false, null, null, false, false, null, 124, null);
                    }
                }
                d95.b0 b0Var2 = rl2.v.f397215h;
                if (b0Var2 != null && rl2.v.f397216i == null) {
                    rl2.v vVar = new rl2.v(b0Var2, null);
                    rl2.v.f397214g.addAll(rl2.v.y0(vVar));
                    rl2.v.f397216i = vVar;
                }
            } catch (java.lang.Throwable th6) {
                throw th6;
            }
        }
    }
}
