package gf;

/* loaded from: classes7.dex */
public final class m1 {
    public m1(kotlin.jvm.internal.i iVar) {
    }

    public final synchronized gf.o1 a(ze.n runtime) {
        gf.o1 o1Var;
        kotlin.jvm.internal.o.g(runtime, "runtime");
        java.util.HashMap hashMap = gf.o1.f271156c;
        o1Var = (gf.o1) hashMap.get(runtime);
        if (o1Var == null) {
            o1Var = new gf.o1(runtime);
            hashMap.put(runtime, o1Var);
        }
        return o1Var;
    }
}
