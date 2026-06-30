package jf5;

/* loaded from: classes11.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final jf5.f0 f299484a;

    /* renamed from: b, reason: collision with root package name */
    public final int f299485b;

    public n0(jf5.f0 content, int i17) {
        kotlin.jvm.internal.o.g(content, "content");
        this.f299484a = content;
        this.f299485b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jf5.n0)) {
            return false;
        }
        jf5.n0 n0Var = (jf5.n0) obj;
        return kotlin.jvm.internal.o.b(this.f299484a, n0Var.f299484a) && this.f299485b == n0Var.f299485b;
    }

    public int hashCode() {
        return (this.f299484a.hashCode() * 31) + java.lang.Integer.hashCode(this.f299485b);
    }

    public java.lang.String toString() {
        return "SelectionAnchor(content=" + this.f299484a + ", offset=" + this.f299485b + ')';
    }
}
