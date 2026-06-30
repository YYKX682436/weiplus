package zs2;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f475256a;

    public f(int i17) {
        this.f475256a = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zs2.f) && this.f475256a == ((zs2.f) obj).f475256a;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f475256a);
    }

    public java.lang.String toString() {
        return "LiveMsgOffsetProcessConfig,scene:" + this.f475256a;
    }
}
