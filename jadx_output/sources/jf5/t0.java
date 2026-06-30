package jf5;

/* loaded from: classes5.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f299510a;

    /* renamed from: b, reason: collision with root package name */
    public final int f299511b;

    public t0(int i17, int i18) {
        this.f299510a = i17;
        this.f299511b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf5.t0)) {
            return false;
        }
        jf5.t0 t0Var = (jf5.t0) obj;
        return this.f299510a == t0Var.f299510a && this.f299511b == t0Var.f299511b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f299510a) * 31) + java.lang.Integer.hashCode(this.f299511b);
    }

    public java.lang.String toString() {
        return "SelectionSourceRange(start=" + this.f299510a + ", end=" + this.f299511b + ')';
    }
}
