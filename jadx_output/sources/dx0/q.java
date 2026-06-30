package dx0;

/* loaded from: classes5.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public com.tencent.maas.moviecomposing.m0 f244469a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.maas.model.time.MJTimeRange f244470b;

    /* renamed from: c, reason: collision with root package name */
    public dx0.p f244471c;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.maas.model.time.MJTime f244472d;

    public q(com.tencent.maas.moviecomposing.m0 m0Var, com.tencent.maas.model.time.MJTimeRange timeRange, dx0.p pVar, com.tencent.maas.model.time.MJTime mJTime) {
        kotlin.jvm.internal.o.g(timeRange, "timeRange");
        this.f244469a = m0Var;
        this.f244470b = timeRange;
        this.f244471c = pVar;
        this.f244472d = mJTime;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dx0.q)) {
            return false;
        }
        dx0.q qVar = (dx0.q) obj;
        return kotlin.jvm.internal.o.b(this.f244469a, qVar.f244469a) && kotlin.jvm.internal.o.b(this.f244470b, qVar.f244470b) && kotlin.jvm.internal.o.b(this.f244471c, qVar.f244471c) && kotlin.jvm.internal.o.b(this.f244472d, qVar.f244472d);
    }

    public int hashCode() {
        com.tencent.maas.moviecomposing.m0 m0Var = this.f244469a;
        int hashCode = (((m0Var == null ? 0 : m0Var.hashCode()) * 31) + this.f244470b.hashCode()) * 31;
        dx0.p pVar = this.f244471c;
        int hashCode2 = (hashCode + (pVar == null ? 0 : pVar.hashCode())) * 31;
        com.tencent.maas.model.time.MJTime mJTime = this.f244472d;
        return hashCode2 + (mJTime != null ? mJTime.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ThumbnailData(taskID=" + this.f244469a + ", timeRange=" + this.f244470b + ", thumbnailInfo=" + this.f244471c + ", timeStamp=" + this.f244472d + ')';
    }
}
