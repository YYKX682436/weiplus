package so2;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final long f410262a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f410263b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f410264c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Long f410265d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Long f410266e;

    public b(long j17, boolean z17, boolean z18, java.lang.Long l17, java.lang.Long l18, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 2) != 0 ? false : z17;
        z18 = (i17 & 4) != 0 ? false : z18;
        l17 = (i17 & 8) != 0 ? null : l17;
        l18 = (i17 & 16) != 0 ? null : l18;
        this.f410262a = j17;
        this.f410263b = z17;
        this.f410264c = z18;
        this.f410265d = l17;
        this.f410266e = l18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof so2.b)) {
            return false;
        }
        so2.b bVar = (so2.b) obj;
        return this.f410262a == bVar.f410262a && this.f410263b == bVar.f410263b && this.f410264c == bVar.f410264c && kotlin.jvm.internal.o.b(this.f410265d, bVar.f410265d) && kotlin.jvm.internal.o.b(this.f410266e, bVar.f410266e);
    }

    public int hashCode() {
        int hashCode = ((((java.lang.Long.hashCode(this.f410262a) * 31) + java.lang.Boolean.hashCode(this.f410263b)) * 31) + java.lang.Boolean.hashCode(this.f410264c)) * 31;
        java.lang.Long l17 = this.f410265d;
        int hashCode2 = (hashCode + (l17 == null ? 0 : l17.hashCode())) * 31;
        java.lang.Long l18 = this.f410266e;
        return hashCode2 + (l18 != null ? l18.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "AdCardState(adFeedId=" + this.f410262a + ", isClosed=" + this.f410263b + ", isHide=" + this.f410264c + ", startPlayOffsetMs=" + this.f410265d + ", countDownLastTimeMs=" + this.f410266e + ')';
    }
}
