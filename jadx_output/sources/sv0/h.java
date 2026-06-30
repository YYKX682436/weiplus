package sv0;

/* loaded from: classes5.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.maas.base.MJID f413223a;

    /* renamed from: b, reason: collision with root package name */
    public final long f413224b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f413225c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f413226d;

    public h(com.tencent.maas.base.MJID segmentID, long j17, boolean z17, boolean z18) {
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        this.f413223a = segmentID;
        this.f413224b = j17;
        this.f413225c = z17;
        this.f413226d = z18;
    }

    public static sv0.h a(sv0.h hVar, com.tencent.maas.base.MJID segmentID, long j17, boolean z17, boolean z18, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            segmentID = hVar.f413223a;
        }
        if ((i17 & 2) != 0) {
            j17 = hVar.f413224b;
        }
        long j18 = j17;
        if ((i17 & 4) != 0) {
            z17 = hVar.f413225c;
        }
        boolean z19 = z17;
        if ((i17 & 8) != 0) {
            z18 = hVar.f413226d;
        }
        hVar.getClass();
        kotlin.jvm.internal.o.g(segmentID, "segmentID");
        return new sv0.h(segmentID, j18, z19, z18);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sv0.h)) {
            return false;
        }
        sv0.h hVar = (sv0.h) obj;
        return kotlin.jvm.internal.o.b(this.f413223a, hVar.f413223a) && this.f413224b == hVar.f413224b && this.f413225c == hVar.f413225c && this.f413226d == hVar.f413226d;
    }

    public int hashCode() {
        return (((((this.f413223a.hashCode() * 31) + java.lang.Long.hashCode(this.f413224b)) * 31) + java.lang.Boolean.hashCode(this.f413225c)) * 31) + java.lang.Boolean.hashCode(this.f413226d);
    }

    public java.lang.String toString() {
        return "SimpleSegmentInfo(segmentID=" + this.f413223a + ", durationInMs=" + this.f413224b + ", isImage=" + this.f413225c + ", selected=" + this.f413226d + ')';
    }
}
