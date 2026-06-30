package jm4;

/* loaded from: classes11.dex */
public abstract class f3 {
    public static void a(jm4.g3 g3Var, jm4.k3 k3Var, int i17, java.lang.String clientId, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: loadList");
        }
        if ((i18 & 2) != 0) {
            i17 = -1;
        }
        if ((i18 & 4) != 0) {
            clientId = "";
        }
        jm4.h3 h3Var = (jm4.h3) g3Var;
        h3Var.getClass();
        kotlin.jvm.internal.o.g(clientId, "clientId");
        urgen.ur_0025.UR_C8FE.UR_2453(h3Var.getCppPointer(), k3Var, i17, clientId);
    }
}
