package we2;

/* loaded from: classes3.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final int f445232a;

    /* renamed from: b, reason: collision with root package name */
    public final int f445233b;

    /* renamed from: c, reason: collision with root package name */
    public final we2.d f445234c;

    public m(int i17, int i18, we2.d spanItem) {
        kotlin.jvm.internal.o.g(spanItem, "spanItem");
        this.f445232a = i17;
        this.f445233b = i18;
        this.f445234c = spanItem;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof we2.m)) {
            return false;
        }
        we2.m mVar = (we2.m) obj;
        return this.f445232a == mVar.f445232a && this.f445233b == mVar.f445233b && kotlin.jvm.internal.o.b(this.f445234c, mVar.f445234c);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f445232a) * 31) + java.lang.Integer.hashCode(this.f445233b)) * 31) + this.f445234c.hashCode();
    }

    public java.lang.String toString() {
        return "SpanPositionInfo(startPos=" + this.f445232a + ", endPos=" + this.f445233b + ", spanItem=" + this.f445234c + ')';
    }
}
