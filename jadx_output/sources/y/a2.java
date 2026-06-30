package y;

/* loaded from: classes14.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    public final y.i1 f458306a;

    /* renamed from: b, reason: collision with root package name */
    public final y.t1 f458307b;

    /* renamed from: c, reason: collision with root package name */
    public final y.u f458308c;

    public a2(y.i1 i1Var, y.t1 t1Var, y.u uVar, y.n1 n1Var) {
        this.f458306a = i1Var;
        this.f458307b = t1Var;
        this.f458308c = uVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y.a2)) {
            return false;
        }
        y.a2 a2Var = (y.a2) obj;
        return kotlin.jvm.internal.o.b(this.f458306a, a2Var.f458306a) && kotlin.jvm.internal.o.b(this.f458307b, a2Var.f458307b) && kotlin.jvm.internal.o.b(this.f458308c, a2Var.f458308c) && kotlin.jvm.internal.o.b(null, null);
    }

    public int hashCode() {
        y.i1 i1Var = this.f458306a;
        int hashCode = (i1Var == null ? 0 : i1Var.hashCode()) * 31;
        y.t1 t1Var = this.f458307b;
        int hashCode2 = (hashCode + (t1Var == null ? 0 : t1Var.hashCode())) * 31;
        y.u uVar = this.f458308c;
        return ((hashCode2 + (uVar == null ? 0 : uVar.hashCode())) * 31) + 0;
    }

    public java.lang.String toString() {
        return "TransitionData(fade=" + this.f458306a + ", slide=" + this.f458307b + ", changeSize=" + this.f458308c + ", scale=null)";
    }

    public /* synthetic */ a2(y.i1 i1Var, y.t1 t1Var, y.u uVar, y.n1 n1Var, int i17, kotlin.jvm.internal.i iVar) {
        this((i17 & 1) != 0 ? null : i1Var, (i17 & 2) != 0 ? null : t1Var, (i17 & 4) != 0 ? null : uVar, (i17 & 8) != 0 ? null : n1Var);
    }
}
