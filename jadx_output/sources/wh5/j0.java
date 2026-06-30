package wh5;

/* loaded from: classes3.dex */
public final class j0 implements vh5.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f446072a;

    public j0(boolean z17) {
        this.f446072a = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wh5.j0) && this.f446072a == ((wh5.j0) obj).f446072a;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.f446072a);
    }

    public java.lang.String toString() {
        return "ImageScanData(hideButton=" + this.f446072a + ')';
    }
}
