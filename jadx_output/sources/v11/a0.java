package v11;

/* loaded from: classes11.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final float f432326a;

    /* renamed from: b, reason: collision with root package name */
    public final int f432327b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Float f432328c;

    public a0(float f17, int i17, java.lang.Float f18) {
        this.f432326a = f17;
        this.f432327b = i17;
        this.f432328c = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.a0)) {
            return false;
        }
        v11.a0 a0Var = (v11.a0) obj;
        return java.lang.Float.compare(this.f432326a, a0Var.f432326a) == 0 && this.f432327b == a0Var.f432327b && kotlin.jvm.internal.o.b(this.f432328c, a0Var.f432328c);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Float.hashCode(this.f432326a) * 31) + java.lang.Integer.hashCode(this.f432327b)) * 31;
        java.lang.Float f17 = this.f432328c;
        return hashCode + (f17 == null ? 0 : f17.hashCode());
    }

    public java.lang.String toString() {
        return "NativeMarkdownHeadingStyleConfig(textSizeDp=" + this.f432326a + ", topPaddingPx=" + this.f432327b + ", fontWeight=" + this.f432328c + ')';
    }

    public /* synthetic */ a0(float f17, int i17, java.lang.Float f18, int i18, kotlin.jvm.internal.i iVar) {
        this(f17, (i18 & 2) != 0 ? 0 : i17, (i18 & 4) != 0 ? null : f18);
    }
}
