package yq5;

/* loaded from: classes5.dex */
public final class e implements yq5.d {

    /* renamed from: a, reason: collision with root package name */
    public final yq5.f f464595a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f464596b;

    public e(yq5.f imageSource) {
        kotlin.jvm.internal.o.g(imageSource, "imageSource");
        this.f464595a = imageSource;
        this.f464596b = ((yq5.b) imageSource).f464590b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || yq5.e.class != obj.getClass()) {
            return false;
        }
        return kotlin.jvm.internal.o.b(this.f464595a, ((yq5.e) obj).f464595a);
    }

    public int hashCode() {
        return this.f464595a.hashCode();
    }

    public java.lang.String toString() {
        return "WrapperFactory(" + this.f464595a + ')';
    }
}
