package vr3;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final r45.s5 f439631a;

    /* renamed from: b, reason: collision with root package name */
    public final wr3.n0 f439632b;

    public h(r45.s5 s5Var, wr3.n0 n0Var) {
        this.f439631a = s5Var;
        this.f439632b = n0Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vr3.h)) {
            return false;
        }
        vr3.h hVar = (vr3.h) obj;
        return kotlin.jvm.internal.o.b(this.f439631a, hVar.f439631a) && this.f439632b == hVar.f439632b;
    }

    public int hashCode() {
        r45.s5 s5Var = this.f439631a;
        int hashCode = (s5Var == null ? 0 : s5Var.hashCode()) * 31;
        wr3.n0 n0Var = this.f439632b;
        return hashCode + (n0Var != null ? n0Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "OutBoxData(msg=" + this.f439631a + ", status=" + this.f439632b + ')';
    }
}
