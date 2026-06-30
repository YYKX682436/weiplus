package dz0;

/* loaded from: classes5.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f244885a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f244886b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f244887c;

    public j(java.lang.String segmentId, java.lang.String localPath, int[] timeMsRangeOfSegment) {
        kotlin.jvm.internal.o.g(segmentId, "segmentId");
        kotlin.jvm.internal.o.g(localPath, "localPath");
        kotlin.jvm.internal.o.g(timeMsRangeOfSegment, "timeMsRangeOfSegment");
        this.f244885a = segmentId;
        this.f244886b = localPath;
        this.f244887c = timeMsRangeOfSegment;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz0.j)) {
            return false;
        }
        dz0.j jVar = (dz0.j) obj;
        return kotlin.jvm.internal.o.b(this.f244885a, jVar.f244885a) && kotlin.jvm.internal.o.b(this.f244886b, jVar.f244886b) && kotlin.jvm.internal.o.b(this.f244887c, jVar.f244887c);
    }

    public int hashCode() {
        return (((this.f244885a.hashCode() * 31) + this.f244886b.hashCode()) * 31) + java.util.Arrays.hashCode(this.f244887c);
    }

    public java.lang.String toString() {
        return "SegmentItemDataJumpSecondCutApp(segmentId=" + this.f244885a + ", localPath=" + this.f244886b + ", timeMsRangeOfSegment=" + java.util.Arrays.toString(this.f244887c) + ')';
    }
}
