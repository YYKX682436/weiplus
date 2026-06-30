package ty2;

/* loaded from: classes9.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final int f423117a;

    /* renamed from: b, reason: collision with root package name */
    public final bw5.q5 f423118b;

    public v(int i17, bw5.q5 q5Var) {
        this.f423117a = i17;
        this.f423118b = q5Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ty2.v)) {
            return false;
        }
        ty2.v vVar = (ty2.v) obj;
        return this.f423117a == vVar.f423117a && kotlin.jvm.internal.o.b(this.f423118b, vVar.f423118b);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f423117a) * 31;
        bw5.q5 q5Var = this.f423118b;
        return hashCode + (q5Var == null ? 0 : q5Var.hashCode());
    }

    public java.lang.String toString() {
        return "ViewStatus(measureWidth=" + this.f423117a + ", item=" + this.f423118b + ')';
    }
}
