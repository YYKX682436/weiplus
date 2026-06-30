package y;

/* loaded from: classes14.dex */
public abstract class y0 {
    static {
        new y.z0(new y.a2(null, null, null, null, 15, null));
    }

    public y0(kotlin.jvm.internal.i iVar) {
    }

    public final y.y0 a(y.y0 enter) {
        kotlin.jvm.internal.o.g(enter, "enter");
        y.a2 a2Var = ((y.z0) this).f458486a;
        y.i1 i1Var = a2Var.f458306a;
        if (i1Var == null) {
            i1Var = ((y.z0) enter).f458486a.f458306a;
        }
        y.t1 t1Var = a2Var.f458307b;
        if (t1Var == null) {
            t1Var = ((y.z0) enter).f458486a.f458307b;
        }
        y.u uVar = a2Var.f458308c;
        if (uVar == null) {
            uVar = ((y.z0) enter).f458486a.f458308c;
        }
        a2Var.getClass();
        ((y.z0) enter).f458486a.getClass();
        return new y.z0(new y.a2(i1Var, t1Var, uVar, null));
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof y.y0) && kotlin.jvm.internal.o.b(((y.z0) ((y.y0) obj)).f458486a, ((y.z0) this).f458486a);
    }

    public int hashCode() {
        return ((y.z0) this).f458486a.hashCode();
    }
}
