package zn1;

/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f474456a;

    /* renamed from: b, reason: collision with root package name */
    public final int f474457b;

    public n0(int i17, int i18) {
        this.f474456a = i17;
        this.f474457b = i18;
    }

    public final int a(zn1.n0 other) {
        kotlin.jvm.internal.o.g(other, "other");
        int i17 = this.f474456a;
        int i18 = other.f474456a;
        return i17 != i18 ? i17 - i18 : this.f474457b - other.f474457b;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof zn1.n0)) {
            return super.equals(obj);
        }
        zn1.n0 n0Var = (zn1.n0) obj;
        return this.f474456a == n0Var.f474456a && this.f474457b == n0Var.f474457b;
    }

    public int hashCode() {
        return (this.f474456a * 31) + this.f474457b;
    }

    public java.lang.String toString() {
        return "Version(major=" + this.f474456a + ", minor=" + this.f474457b + ')';
    }
}
