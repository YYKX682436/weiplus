package mv0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.c f331530a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f331531b;

    public b(com.tencent.maas.moviecomposing.c type, boolean z17) {
        kotlin.jvm.internal.o.g(type, "type");
        this.f331530a = type;
        this.f331531b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv0.b)) {
            return false;
        }
        mv0.b bVar = (mv0.b) obj;
        return this.f331530a == bVar.f331530a && this.f331531b == bVar.f331531b;
    }

    public int hashCode() {
        return (this.f331530a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f331531b);
    }

    public java.lang.String toString() {
        return "CanvasAspectRatioType(type=" + this.f331530a + ", isOriginal=" + this.f331531b + ')';
    }
}
