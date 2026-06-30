package cx0;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.base.MJID f224496a;

    /* renamed from: b, reason: collision with root package name */
    public final ug.m f224497b;

    /* renamed from: c, reason: collision with root package name */
    public final int f224498c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f224499d;

    public b(com.tencent.maas.base.MJID segmentID, ug.m segmentType, int i17, boolean z17) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(segmentType, "segmentType");
        this.f224496a = segmentID;
        this.f224497b = segmentType;
        this.f224498c = i17;
        this.f224499d = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(cx0.b.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.mj_publisher.finder.movie_composing.timeline.mutation.TimelineMutationEntry");
        cx0.b bVar = (cx0.b) obj;
        return kotlin.jvm.internal.o.b(this.f224496a, bVar.f224496a) && this.f224497b == bVar.f224497b && this.f224498c == bVar.f224498c && this.f224499d == bVar.f224499d;
    }

    public int hashCode() {
        return this.f224496a.hashCode();
    }

    public java.lang.String toString() {
        return "TimelineMutationEntry(segmentID=" + this.f224496a + ", segmentType=" + this.f224497b + ", indexPath=" + this.f224498c + ", isVisualClipChanged=" + this.f224499d + ')';
    }
}
