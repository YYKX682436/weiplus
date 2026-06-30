package v11;

/* loaded from: classes8.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f432375a;

    public f0(int i17) {
        this.f432375a = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v11.f0) && this.f432375a == ((v11.f0) obj).f432375a;
    }

    public int hashCode() {
        return java.lang.Integer.hashCode(this.f432375a);
    }

    public java.lang.String toString() {
        return "NativeMarkdownSpacingConfig(blockSpacingPx=" + this.f432375a + ')';
    }
}
