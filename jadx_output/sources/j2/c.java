package j2;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f297212a;

    /* renamed from: b, reason: collision with root package name */
    public final int f297213b;

    /* renamed from: c, reason: collision with root package name */
    public final int f297214c;

    public c(java.lang.Object span, int i17, int i18) {
        kotlin.jvm.internal.o.g(span, "span");
        this.f297212a = span;
        this.f297213b = i17;
        this.f297214c = i18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j2.c)) {
            return false;
        }
        j2.c cVar = (j2.c) obj;
        return kotlin.jvm.internal.o.b(this.f297212a, cVar.f297212a) && this.f297213b == cVar.f297213b && this.f297214c == cVar.f297214c;
    }

    public int hashCode() {
        return (((this.f297212a.hashCode() * 31) + java.lang.Integer.hashCode(this.f297213b)) * 31) + java.lang.Integer.hashCode(this.f297214c);
    }

    public java.lang.String toString() {
        return "SpanRange(span=" + this.f297212a + ", start=" + this.f297213b + ", end=" + this.f297214c + ')';
    }
}
