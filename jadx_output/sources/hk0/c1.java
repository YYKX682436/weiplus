package hk0;

/* loaded from: classes3.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f281711a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f281712b;

    public c1(int i17, boolean z17) {
        this.f281711a = i17;
        this.f281712b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hk0.c1)) {
            return false;
        }
        hk0.c1 c1Var = (hk0.c1) obj;
        return this.f281711a == c1Var.f281711a && this.f281712b == c1Var.f281712b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f281711a) * 31) + java.lang.Boolean.hashCode(this.f281712b);
    }

    public java.lang.String toString() {
        return "ViewState(viewId=" + this.f281711a + ", isShow=" + this.f281712b + ')';
    }
}
