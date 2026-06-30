package ku0;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final zu0.a f312060a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f312061b;

    public a(zu0.a media, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        kotlin.jvm.internal.o.g(media, "media");
        this.f312060a = media;
        this.f312061b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ku0.a)) {
            return false;
        }
        ku0.a aVar = (ku0.a) obj;
        return kotlin.jvm.internal.o.b(this.f312060a, aVar.f312060a) && this.f312061b == aVar.f312061b;
    }

    public int hashCode() {
        return (this.f312060a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f312061b);
    }

    public java.lang.String toString() {
        return "ImageData(media=" + this.f312060a + ", isSelected=" + this.f312061b + ')';
    }
}
