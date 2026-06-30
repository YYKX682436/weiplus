package db5;

/* loaded from: classes4.dex */
public interface y4 {
    static /* synthetic */ void a(db5.y4 y4Var, int i17, int i18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: smoothScrollBy");
        }
        if ((i19 & 2) != 0) {
            i18 = -1;
        }
        ((db5.b5) y4Var).e(i17, i18);
    }

    static void b(db5.y4 y4Var, int i17, int i18, int i19, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: smoothScrollTo");
        }
        if ((i19 & 2) != 0) {
            i18 = -1;
        }
        db5.b5 b5Var = (db5.b5) y4Var;
        b5Var.e(i17 - b5Var.c(), i18);
    }
}
