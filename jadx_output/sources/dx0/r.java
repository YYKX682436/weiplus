package dx0;

/* loaded from: classes5.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.base.MJID f244473a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTimeRange f244474b;

    public r(com.tencent.maas.base.MJID segmentID, com.tencent.maas.model.time.MJTimeRange timeRange) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        kotlin.jvm.internal.o.g(timeRange, "timeRange");
        this.f244473a = segmentID;
        this.f244474b = timeRange;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj == null || !(obj instanceof dx0.r)) {
            return false;
        }
        dx0.r rVar = (dx0.r) obj;
        return kotlin.jvm.internal.o.b(this.f244473a.value(), rVar.f244473a.value()) && kotlin.jvm.internal.o.b(dx0.o.c(this.f244474b), dx0.o.c(rVar.f244474b));
    }

    public int hashCode() {
        return java.util.Objects.hash(this.f244473a.value(), dx0.o.c(this.f244474b));
    }
}
