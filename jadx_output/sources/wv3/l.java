package wv3;

/* loaded from: classes5.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f450065a;

    /* renamed from: b, reason: collision with root package name */
    public final wv3.k f450066b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f450067c;

    public l(java.lang.String id6, wv3.k type, java.lang.String original) {
        kotlin.jvm.internal.o.g(id6, "id");
        kotlin.jvm.internal.o.g(type, "type");
        kotlin.jvm.internal.o.g(original, "original");
        this.f450065a = id6;
        this.f450066b = type;
        this.f450067c = original;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wv3.l)) {
            return false;
        }
        wv3.l lVar = (wv3.l) obj;
        return kotlin.jvm.internal.o.b(this.f450065a, lVar.f450065a) && kotlin.jvm.internal.o.b(this.f450066b, lVar.f450066b) && kotlin.jvm.internal.o.b(this.f450067c, lVar.f450067c);
    }

    public int hashCode() {
        return (((this.f450065a.hashCode() * 31) + this.f450066b.hashCode()) * 31) + this.f450067c.hashCode();
    }

    public java.lang.String toString() {
        return "WCMusicIdInfo(id=" + this.f450065a + ", type=" + this.f450066b + ", original=" + this.f450067c + ')';
    }
}
