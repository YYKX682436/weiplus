package xh3;

/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f454576a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f454577b;

    public f(java.lang.String mediaId, java.lang.String tag) {
        kotlin.jvm.internal.o.g(mediaId, "mediaId");
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f454576a = mediaId;
        this.f454577b = tag;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xh3.f)) {
            return false;
        }
        xh3.f fVar = (xh3.f) obj;
        return kotlin.jvm.internal.o.b(this.f454576a, fVar.f454576a) && kotlin.jvm.internal.o.b(this.f454577b, fVar.f454577b);
    }

    public int hashCode() {
        return (this.f454576a.hashCode() * 31) + this.f454577b.hashCode();
    }

    public java.lang.String toString() {
        return "RecordTask(mediaId=" + this.f454576a + ", tag=" + this.f454577b + ')';
    }
}
