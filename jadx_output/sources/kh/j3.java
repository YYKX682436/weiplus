package kh;

/* loaded from: classes12.dex */
public final class j3 extends kh.o3 {
    public j3(kh.g3 g3Var) {
        super(g3Var);
    }

    @Override // kh.o3
    public java.lang.String a(java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(name, "name");
        if (i17 == android.os.Process.myPid()) {
            kh.i3 i3Var = this.f307881a;
            if (i3Var != null) {
                return i3Var.a(this, name);
            }
            return null;
        }
        if (i17 <= 0 || !pj.e.f(name, i17)) {
            return null;
        }
        return r26.i0.n(name, "_fake", false) ? name : name.concat("_fake");
    }
}
