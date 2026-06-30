package db2;

/* loaded from: classes2.dex */
public final class a5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f227891a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f227892b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f227893c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f227894d;

    /* renamed from: e, reason: collision with root package name */
    public final int f227895e;

    /* renamed from: f, reason: collision with root package name */
    public final int f227896f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f227897g;

    /* renamed from: h, reason: collision with root package name */
    public final r45.t21 f227898h;

    /* renamed from: i, reason: collision with root package name */
    public final r45.bc1 f227899i;

    public a5(long j17, java.lang.String str, java.lang.String objectNonceId, boolean z17, int i17, int i18, java.lang.String str2, r45.t21 newLifeReportInfo, r45.bc1 bc1Var) {
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        kotlin.jvm.internal.o.g(newLifeReportInfo, "newLifeReportInfo");
        this.f227891a = j17;
        this.f227892b = str;
        this.f227893c = objectNonceId;
        this.f227894d = z17;
        this.f227895e = i17;
        this.f227896f = i18;
        this.f227897g = str2;
        this.f227898h = newLifeReportInfo;
        this.f227899i = bc1Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db2.a5)) {
            return false;
        }
        db2.a5 a5Var = (db2.a5) obj;
        return this.f227891a == a5Var.f227891a && kotlin.jvm.internal.o.b(this.f227892b, a5Var.f227892b) && kotlin.jvm.internal.o.b(this.f227893c, a5Var.f227893c) && this.f227894d == a5Var.f227894d && this.f227895e == a5Var.f227895e && this.f227896f == a5Var.f227896f && kotlin.jvm.internal.o.b(this.f227897g, a5Var.f227897g) && kotlin.jvm.internal.o.b(this.f227898h, a5Var.f227898h) && kotlin.jvm.internal.o.b(this.f227899i, a5Var.f227899i);
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.f227891a) * 31;
        java.lang.String str = this.f227892b;
        int hashCode2 = (((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f227893c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f227894d)) * 31) + java.lang.Integer.hashCode(this.f227895e)) * 31) + java.lang.Integer.hashCode(this.f227896f)) * 31;
        java.lang.String str2 = this.f227897g;
        int hashCode3 = (((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + this.f227898h.hashCode()) * 31;
        r45.bc1 bc1Var = this.f227899i;
        return hashCode3 + (bc1Var != null ? bc1Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FinderFavCGIParams(feedId=" + this.f227891a + ", dupFlag=" + this.f227892b + ", objectNonceId=" + this.f227893c + ", fav=" + this.f227894d + ", scene=" + this.f227895e + ", source=" + this.f227896f + ", memberProviderUsername=" + this.f227897g + ", newLifeReportInfo=" + this.f227898h + ", showMileStoneInfo=" + this.f227899i + ')';
    }
}
