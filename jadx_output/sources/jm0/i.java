package jm0;

/* loaded from: classes4.dex */
public final class i {
    public i(kotlin.jvm.internal.i iVar) {
    }

    public final androidx.lifecycle.c1 a(java.lang.Class modelClass) {
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        synchronized (jm0.k.f300270i) {
            gm0.j1.b().c();
            if (!jm0.k.class.isAssignableFrom(modelClass)) {
                throw new java.lang.IllegalArgumentException("getLiveDB modelClass must extends BaseMvvmDB");
            }
            a17 = new androidx.lifecycle.j1(gm0.j1.b().f273245h, new jm0.h()).a(modelClass);
        }
        return a17;
    }
}
