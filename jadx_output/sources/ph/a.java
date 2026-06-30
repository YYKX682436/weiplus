package ph;

/* loaded from: classes12.dex */
public abstract class a {
    public static rh.e3 a(java.lang.Class cls) {
        ph.u uVar;
        if (!ih.d.c() || (uVar = (ph.u) ih.d.d().a(ph.u.class)) == null) {
            return null;
        }
        return uVar.f354296h.i(cls);
    }

    public static void b(java.lang.Class cls, wh.t0 t0Var) {
        ph.u uVar;
        rh.e3 i17;
        if (!ih.d.c() || (uVar = (ph.u) ih.d.d().a(ph.u.class)) == null || (i17 = uVar.f354296h.i(cls)) == null) {
            return;
        }
        t0Var.accept(i17);
    }
}
