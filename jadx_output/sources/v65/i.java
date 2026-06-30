package v65;

/* loaded from: classes.dex */
public interface i {
    static /* synthetic */ kotlinx.coroutines.r2 b(v65.i iVar, kotlinx.coroutines.a1 a1Var, yz5.p pVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchDefault");
        }
        if ((i17 & 1) != 0) {
            a1Var = kotlinx.coroutines.a1.DEFAULT;
        }
        return iVar.d(a1Var, pVar);
    }

    static /* synthetic */ kotlinx.coroutines.r2 c(v65.i iVar, kotlinx.coroutines.a1 a1Var, yz5.p pVar, int i17, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: launchMain");
        }
        if ((i17 & 1) != 0) {
            a1Var = kotlinx.coroutines.a1.DEFAULT;
        }
        return iVar.a(a1Var, pVar);
    }

    kotlinx.coroutines.r2 a(kotlinx.coroutines.a1 a1Var, yz5.p pVar);

    kotlinx.coroutines.r2 d(kotlinx.coroutines.a1 a1Var, yz5.p pVar);
}
