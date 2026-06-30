package ow0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final sw0.f f349278a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f349279b;

    public a(sw0.f page, boolean z17) {
        kotlin.jvm.internal.o.g(page, "page");
        this.f349278a = page;
        this.f349279b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ow0.a)) {
            return false;
        }
        ow0.a aVar = (ow0.a) obj;
        return this.f349278a == aVar.f349278a && this.f349279b == aVar.f349279b;
    }

    public int hashCode() {
        return (this.f349278a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f349279b);
    }

    public java.lang.String toString() {
        return "Args(page=" + this.f349278a + ", isAutoRecognitionSubtitle=" + this.f349279b + ')';
    }
}
