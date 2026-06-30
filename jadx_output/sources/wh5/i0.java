package wh5;

/* loaded from: classes3.dex */
public final class i0 implements vh5.o {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f446070a;

    public i0(boolean z17) {
        this.f446070a = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wh5.i0) && this.f446070a == ((wh5.i0) obj).f446070a;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.f446070a);
    }

    public java.lang.String toString() {
        return "ImageOCRHelperBindData(hideButton=" + this.f446070a + ')';
    }
}
