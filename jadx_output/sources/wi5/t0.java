package wi5;

/* loaded from: classes.dex */
public final class t0 extends j75.b {

    /* renamed from: b, reason: collision with root package name */
    public final ri5.j f446341b;

    /* renamed from: c, reason: collision with root package name */
    public final int f446342c;

    /* renamed from: d, reason: collision with root package name */
    public final int f446343d;

    public t0(ri5.j item, int i17, int i18) {
        kotlin.jvm.internal.o.g(item, "item");
        this.f446341b = item;
        this.f446342c = i17;
        this.f446343d = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wi5.t0)) {
            return false;
        }
        wi5.t0 t0Var = (wi5.t0) obj;
        return kotlin.jvm.internal.o.b(this.f446341b, t0Var.f446341b) && this.f446342c == t0Var.f446342c && this.f446343d == t0Var.f446343d;
    }

    public int hashCode() {
        return (((this.f446341b.hashCode() * 31) + java.lang.Integer.hashCode(this.f446342c)) * 31) + java.lang.Integer.hashCode(this.f446343d);
    }

    public java.lang.String toString() {
        return "SelectUserAction(item=" + this.f446341b + ", position=" + this.f446342c + ", from=" + this.f446343d + ')';
    }
}
