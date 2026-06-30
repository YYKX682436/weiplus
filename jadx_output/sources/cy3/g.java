package cy3;

/* loaded from: classes10.dex */
public interface g {
    static void a(cy3.g gVar, cy3.e status, android.os.Bundle bundle, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: statusChange");
        }
        cy3.d dVar = (cy3.d) gVar;
        dVar.getClass();
        kotlin.jvm.internal.o.g(status, "status");
        int ordinal = status.ordinal();
        androidx.lifecycle.j0 j0Var = dVar.f224767i;
        if (ordinal == 0) {
            j0Var.postValue(cy3.e.f224770d);
        } else if (ordinal == 1) {
            j0Var.postValue(cy3.e.f224771e);
        } else {
            if (ordinal != 2) {
                return;
            }
            j0Var.postValue(cy3.e.f224772f);
        }
    }
}
