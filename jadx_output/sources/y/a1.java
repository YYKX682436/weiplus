package y;

/* loaded from: classes14.dex */
public abstract class a1 {
    static {
        new y.b1(new y.a2(null, null, null, null, 15, null));
    }

    public a1(kotlin.jvm.internal.i iVar) {
    }

    public final y.a1 a(y.a1 exit) {
        kotlin.jvm.internal.o.g(exit, "exit");
        y.a2 a2Var = ((y.b1) this).f458312a;
        y.i1 i1Var = a2Var.f458306a;
        if (i1Var == null) {
            i1Var = ((y.b1) exit).f458312a.f458306a;
        }
        y.t1 t1Var = a2Var.f458307b;
        if (t1Var == null) {
            t1Var = ((y.b1) exit).f458312a.f458307b;
        }
        y.u uVar = a2Var.f458308c;
        if (uVar == null) {
            uVar = ((y.b1) exit).f458312a.f458308c;
        }
        a2Var.getClass();
        ((y.b1) exit).f458312a.getClass();
        return new y.b1(new y.a2(i1Var, t1Var, uVar, null));
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof y.a1) && kotlin.jvm.internal.o.b(((y.b1) ((y.a1) obj)).f458312a, ((y.b1) this).f458312a);
    }

    public int hashCode() {
        return ((y.b1) this).f458312a.hashCode();
    }
}
