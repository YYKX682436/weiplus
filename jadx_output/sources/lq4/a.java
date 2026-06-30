package lq4;

/* loaded from: classes4.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final lq4.b a() {
        androidx.lifecycle.c1 a17;
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(lq4.b.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(lq4.b.class);
        }
        lq4.b bVar = (lq4.b) a17;
        if (!bVar.f320462m && gm0.j1.a()) {
            bVar.f320462m = bVar.O6(gm0.j1.u().h() + "/VoIPDB-8.db");
        }
        return bVar;
    }
}
