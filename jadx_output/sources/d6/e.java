package d6;

/* loaded from: classes10.dex */
public final class e implements d6.h {

    /* renamed from: c, reason: collision with root package name */
    public final coil.size.Size f226638c;

    public e(coil.size.Size size) {
        kotlin.jvm.internal.o.g(size, "size");
        this.f226638c = size;
    }

    @Override // d6.h
    public java.lang.Object a(kotlin.coroutines.Continuation continuation) {
        return this.f226638c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            if (obj instanceof d6.e) {
                if (kotlin.jvm.internal.o.b(this.f226638c, ((d6.e) obj).f226638c)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f226638c.hashCode();
    }

    public java.lang.String toString() {
        return "RealSizeResolver(size=" + this.f226638c + ')';
    }
}
