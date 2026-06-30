package xh1;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final kotlinx.coroutines.q f454489a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Class f454490b;

    public b(kotlinx.coroutines.q continuation, java.lang.Class respClazz) {
        kotlin.jvm.internal.o.g(continuation, "continuation");
        kotlin.jvm.internal.o.g(respClazz, "respClazz");
        this.f454489a = continuation;
        this.f454490b = respClazz;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh1.b)) {
            return false;
        }
        xh1.b bVar = (xh1.b) obj;
        return kotlin.jvm.internal.o.b(this.f454489a, bVar.f454489a) && kotlin.jvm.internal.o.b(this.f454490b, bVar.f454490b);
    }

    public int hashCode() {
        return (this.f454489a.hashCode() * 31) + this.f454490b.hashCode();
    }

    public java.lang.String toString() {
        return "RequestContext(continuation=" + this.f454489a + ", respClazz=" + this.f454490b + ')';
    }
}
