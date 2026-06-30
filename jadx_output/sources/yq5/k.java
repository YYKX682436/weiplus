package yq5;

/* loaded from: classes11.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final yq5.d f464600a;

    /* renamed from: b, reason: collision with root package name */
    public final yq5.c f464601b;

    /* renamed from: c, reason: collision with root package name */
    public final jz5.g f464602c;

    public k(yq5.d imageSource, yq5.c cVar) {
        kotlin.jvm.internal.o.g(imageSource, "imageSource");
        this.f464600a = imageSource;
        this.f464601b = cVar;
        this.f464602c = jz5.h.b(new yq5.j(this));
    }

    public final java.lang.String a() {
        return (java.lang.String) ((jz5.n) this.f464602c).getValue();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yq5.k)) {
            return false;
        }
        yq5.k kVar = (yq5.k) obj;
        return kotlin.jvm.internal.o.b(this.f464600a, kVar.f464600a) && kotlin.jvm.internal.o.b(this.f464601b, kVar.f464601b);
    }

    public int hashCode() {
        int hashCode = this.f464600a.hashCode() * 31;
        yq5.c cVar = this.f464601b;
        return hashCode + (cVar == null ? 0 : cVar.hashCode());
    }

    public java.lang.String toString() {
        return "SubsamplingImage(imageSource=" + this.f464600a + ", imageInfo=" + this.f464601b + ')';
    }
}
