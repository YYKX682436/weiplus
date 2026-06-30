package jm4;

/* loaded from: classes.dex */
public final class q4 {
    public q4(kotlin.jvm.internal.i iVar) {
    }

    public static void a(jm4.q4 q4Var, java.lang.String key, boolean z17, long j17, java.lang.String sessionId, int i17, java.lang.Object obj) {
        if ((i17 & 2) != 0) {
            z17 = false;
        }
        if ((i17 & 4) != 0) {
            j17 = 0;
        }
        if ((i17 & 8) != 0) {
            sessionId = "";
        }
        q4Var.getClass();
        kotlin.jvm.internal.o.g(key, "key");
        kotlin.jvm.internal.o.g(sessionId, "sessionId");
        urgen.ur_0025.UR_6E34.UR_E20A(key, z17, j17, sessionId);
    }
}
