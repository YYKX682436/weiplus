package g2;

/* loaded from: classes14.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final a2.d f267744a;

    /* renamed from: b, reason: collision with root package name */
    public final g2.v f267745b;

    public r0(a2.d text, g2.v offsetMapping) {
        kotlin.jvm.internal.o.g(text, "text");
        kotlin.jvm.internal.o.g(offsetMapping, "offsetMapping");
        this.f267744a = text;
        this.f267745b = offsetMapping;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2.r0)) {
            return false;
        }
        g2.r0 r0Var = (g2.r0) obj;
        return kotlin.jvm.internal.o.b(this.f267744a, r0Var.f267744a) && kotlin.jvm.internal.o.b(this.f267745b, r0Var.f267745b);
    }

    public int hashCode() {
        return (this.f267744a.hashCode() * 31) + this.f267745b.hashCode();
    }

    public java.lang.String toString() {
        return "TransformedText(text=" + ((java.lang.Object) this.f267744a) + ", offsetMapping=" + this.f267745b + ')';
    }
}
