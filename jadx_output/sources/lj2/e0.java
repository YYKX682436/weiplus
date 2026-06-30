package lj2;

/* loaded from: classes3.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.view.View f318852a;

    /* renamed from: b, reason: collision with root package name */
    public final lj2.f0 f318853b;

    public e0(android.view.View attachView, lj2.f0 orientation) {
        kotlin.jvm.internal.o.g(attachView, "attachView");
        kotlin.jvm.internal.o.g(orientation, "orientation");
        this.f318852a = attachView;
        this.f318853b = orientation;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lj2.e0)) {
            return false;
        }
        lj2.e0 e0Var = (lj2.e0) obj;
        return kotlin.jvm.internal.o.b(this.f318852a, e0Var.f318852a) && this.f318853b == e0Var.f318853b;
    }

    public int hashCode() {
        return (this.f318852a.hashCode() * 31) + this.f318853b.hashCode();
    }

    public java.lang.String toString() {
        return "AttachData(attachView=" + this.f318852a + ", orientation=" + this.f318853b + ')';
    }
}
