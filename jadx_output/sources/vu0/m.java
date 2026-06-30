package vu0;

/* loaded from: classes5.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.base.MJID f440117a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.moviecomposing.segments.CaptionItem f440118b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTime f440119c;

    public m(com.tencent.maas.base.MJID segmentID, com.tencent.maas.moviecomposing.segments.CaptionItem captionItem, com.tencent.maas.model.time.MJTime duration) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(captionItem, "captionItem");
        kotlin.jvm.internal.o.g(duration, "duration");
        this.f440117a = segmentID;
        this.f440118b = captionItem;
        this.f440119c = duration;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vu0.m)) {
            return false;
        }
        vu0.m mVar = (vu0.m) obj;
        return kotlin.jvm.internal.o.b(this.f440117a, mVar.f440117a) && kotlin.jvm.internal.o.b(this.f440118b, mVar.f440118b) && kotlin.jvm.internal.o.b(this.f440119c, mVar.f440119c);
    }

    public int hashCode() {
        return (((this.f440117a.hashCode() * 31) + this.f440118b.hashCode()) * 31) + this.f440119c.hashCode();
    }

    public java.lang.String toString() {
        return "TimbreIdentity(segmentID=" + this.f440117a + ", captionItem=" + this.f440118b + ", duration=" + this.f440119c + ')';
    }
}
