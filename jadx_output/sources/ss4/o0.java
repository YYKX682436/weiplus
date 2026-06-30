package ss4;

/* loaded from: classes8.dex */
public final class o0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f412116a;

    /* renamed from: b, reason: collision with root package name */
    public final int f412117b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f412118c;

    /* renamed from: d, reason: collision with root package name */
    public final int f412119d;

    public o0(java.lang.String oldUri, int i17, java.lang.String newUri, int i18) {
        kotlin.jvm.internal.o.g(oldUri, "oldUri");
        kotlin.jvm.internal.o.g(newUri, "newUri");
        this.f412116a = oldUri;
        this.f412117b = i17;
        this.f412118c = newUri;
        this.f412119d = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ss4.o0)) {
            return false;
        }
        ss4.o0 o0Var = (ss4.o0) obj;
        return kotlin.jvm.internal.o.b(this.f412116a, o0Var.f412116a) && this.f412117b == o0Var.f412117b && kotlin.jvm.internal.o.b(this.f412118c, o0Var.f412118c) && this.f412119d == o0Var.f412119d;
    }

    public int hashCode() {
        return (((((this.f412116a.hashCode() * 31) + java.lang.Integer.hashCode(this.f412117b)) * 31) + this.f412118c.hashCode()) * 31) + java.lang.Integer.hashCode(this.f412119d);
    }

    public java.lang.String toString() {
        return "RouteEntry(oldUri=" + this.f412116a + ", oldFuncId=" + this.f412117b + ", newUri=" + this.f412118c + ", newFuncId=" + this.f412119d + ')';
    }
}
