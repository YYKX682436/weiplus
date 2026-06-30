package vf0;

/* loaded from: classes7.dex */
public final class g3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f436170a;

    /* renamed from: b, reason: collision with root package name */
    public final int f436171b;

    public g3(int i17, int i18) {
        this.f436170a = i17;
        this.f436171b = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vf0.g3)) {
            return false;
        }
        vf0.g3 g3Var = (vf0.g3) obj;
        return this.f436170a == g3Var.f436170a && this.f436171b == g3Var.f436171b;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f436170a) * 31) + java.lang.Integer.hashCode(this.f436171b);
    }

    public java.lang.String toString() {
        return "VideoSendParam(forwardType=" + this.f436170a + ", source=" + this.f436171b + ')';
    }
}
