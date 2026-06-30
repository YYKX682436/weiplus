package g16;

/* loaded from: classes15.dex */
public final class t0 {
    public t0(kotlin.jvm.internal.i iVar) {
    }

    public final g16.u0 a(m16.f signature) {
        kotlin.jvm.internal.o.g(signature, "signature");
        if (signature instanceof m16.e) {
            java.lang.String name = signature.c();
            java.lang.String desc = signature.b();
            kotlin.jvm.internal.o.g(name, "name");
            kotlin.jvm.internal.o.g(desc, "desc");
            return new g16.u0(name.concat(desc), null);
        }
        if (!(signature instanceof m16.d)) {
            throw new jz5.j();
        }
        java.lang.String name2 = signature.c();
        java.lang.String desc2 = signature.b();
        kotlin.jvm.internal.o.g(name2, "name");
        kotlin.jvm.internal.o.g(desc2, "desc");
        return new g16.u0(name2 + '#' + desc2, null);
    }
}
