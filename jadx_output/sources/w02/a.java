package w02;

/* loaded from: classes12.dex */
public final class a {
    public a(kotlin.jvm.internal.i iVar) {
    }

    public final w02.b a() {
        androidx.lifecycle.c1 a17;
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(w02.b.class)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(w02.b.class);
        }
        return (w02.b) a17;
    }
}
