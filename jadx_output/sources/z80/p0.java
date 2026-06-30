package z80;

/* loaded from: classes2.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.tencent.mm.plugin.location.model.LocationInfo f470655a;

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.location.model.LocationInfo f470656b;

    /* renamed from: c, reason: collision with root package name */
    public final long f470657c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f470658d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f470659e;

    public p0(com.tencent.mm.plugin.location.model.LocationInfo poiLocationInfo, com.tencent.mm.plugin.location.model.LocationInfo userLocationInfo, long j17, java.lang.String msgTalkerName, boolean z17) {
        kotlin.jvm.internal.o.g(poiLocationInfo, "poiLocationInfo");
        kotlin.jvm.internal.o.g(userLocationInfo, "userLocationInfo");
        kotlin.jvm.internal.o.g(msgTalkerName, "msgTalkerName");
        this.f470655a = poiLocationInfo;
        this.f470656b = userLocationInfo;
        this.f470657c = j17;
        this.f470658d = msgTalkerName;
        this.f470659e = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z80.p0)) {
            return false;
        }
        z80.p0 p0Var = (z80.p0) obj;
        return kotlin.jvm.internal.o.b(this.f470655a, p0Var.f470655a) && kotlin.jvm.internal.o.b(this.f470656b, p0Var.f470656b) && this.f470657c == p0Var.f470657c && kotlin.jvm.internal.o.b(this.f470658d, p0Var.f470658d) && this.f470659e == p0Var.f470659e;
    }

    public int hashCode() {
        return (((((((this.f470655a.hashCode() * 31) + this.f470656b.hashCode()) * 31) + java.lang.Long.hashCode(this.f470657c)) * 31) + this.f470658d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f470659e);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("poi:");
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo = this.f470655a;
        sb6.append(locationInfo.f144594p);
        sb6.append(',');
        sb6.append(locationInfo.f144591m);
        sb6.append(",[");
        sb6.append(locationInfo.f144586e);
        sb6.append(',');
        sb6.append(locationInfo.f144587f);
        sb6.append("]; user:[");
        com.tencent.mm.plugin.location.model.LocationInfo locationInfo2 = this.f470656b;
        sb6.append(locationInfo2.f144586e);
        sb6.append(',');
        sb6.append(locationInfo2.f144587f);
        sb6.append("]; isNearbyPoi:");
        sb6.append(this.f470659e);
        return sb6.toString();
    }
}
