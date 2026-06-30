package g16;

/* loaded from: classes15.dex */
public abstract class v0 {
    public static final java.lang.String a(g16.a1 a1Var, o06.g classDescriptor, java.lang.String jvmDescriptor) {
        java.lang.String internalName;
        kotlin.jvm.internal.o.g(a1Var, "<this>");
        kotlin.jvm.internal.o.g(classDescriptor, "classDescriptor");
        kotlin.jvm.internal.o.g(jvmDescriptor, "jvmDescriptor");
        n06.d dVar = n06.d.f333953a;
        n16.e i17 = v16.f.g(classDescriptor).i();
        kotlin.jvm.internal.o.f(i17, "toUnsafe(...)");
        n16.b g17 = dVar.g(i17);
        if (g17 != null) {
            internalName = w16.d.b(g17).e();
            kotlin.jvm.internal.o.f(internalName, "getInternalName(...)");
        } else {
            internalName = g16.u.a(classDescriptor, g16.c1.f267600a);
        }
        kotlin.jvm.internal.o.g(internalName, "internalName");
        return internalName + '.' + jvmDescriptor;
    }
}
