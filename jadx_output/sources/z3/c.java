package z3;

/* loaded from: classes13.dex */
public abstract class c {
    public static final androidx.lifecycle.c1 a(java.lang.Class modelClass, androidx.lifecycle.m1 m1Var, java.lang.String str, androidx.lifecycle.f1 f1Var, n0.o oVar, int i17, int i18) {
        androidx.lifecycle.c1 a17;
        kotlin.jvm.internal.o.g(modelClass, "modelClass");
        n0.y0 y0Var = (n0.y0) oVar;
        y0Var.U(564615719);
        if ((i18 & 2) != 0 && (m1Var = z3.b.f469858a.a(y0Var, 0)) == null) {
            throw new java.lang.IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString());
        }
        if ((i18 & 4) != 0) {
            str = null;
        }
        if ((i18 & 8) != 0) {
            f1Var = null;
        }
        androidx.lifecycle.j1 j1Var = f1Var != null ? new androidx.lifecycle.j1(m1Var.getViewModel(), f1Var) : new androidx.lifecycle.j1(m1Var);
        if (str != null) {
            a17 = j1Var.b(str, modelClass);
            kotlin.jvm.internal.o.f(a17, "{\n        provider.get(key, javaClass)\n    }");
        } else {
            a17 = j1Var.a(modelClass);
            kotlin.jvm.internal.o.f(a17, "{\n        provider.get(javaClass)\n    }");
        }
        y0Var.o(false);
        return a17;
    }
}
