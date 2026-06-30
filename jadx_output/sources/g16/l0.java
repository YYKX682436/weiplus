package g16;

/* loaded from: classes15.dex */
public abstract class l0 {
    public static final g16.q0 a(g16.k0 k0Var, n16.b classId, m16.g jvmMetadataVersion) {
        kotlin.jvm.internal.o.g(k0Var, "<this>");
        kotlin.jvm.internal.o.g(classId, "classId");
        kotlin.jvm.internal.o.g(jvmMetadataVersion, "jvmMetadataVersion");
        g16.j0 a17 = ((t06.h) k0Var).a(classId, jvmMetadataVersion);
        if (a17 == null) {
            return null;
        }
        g16.i0 i0Var = a17 instanceof g16.i0 ? (g16.i0) a17 : null;
        if (i0Var != null) {
            return i0Var.f267628a;
        }
        return null;
    }
}
