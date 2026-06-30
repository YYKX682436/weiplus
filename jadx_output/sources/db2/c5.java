package db2;

/* loaded from: classes2.dex */
public final class c5 {

    /* renamed from: a, reason: collision with root package name */
    public final long f227927a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f227928b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f227929c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f227930d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f227931e;

    /* renamed from: f, reason: collision with root package name */
    public final int f227932f;

    /* renamed from: g, reason: collision with root package name */
    public final int f227933g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f227934h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f227935i;

    /* renamed from: j, reason: collision with root package name */
    public final r45.bc1 f227936j;

    public c5(long j17, java.lang.String str, java.lang.String objectNonceId, boolean z17, boolean z18, int i17, int i18, java.lang.String str2, java.lang.String str3, r45.bc1 bc1Var) {
        kotlin.jvm.internal.o.g(objectNonceId, "objectNonceId");
        this.f227927a = j17;
        this.f227928b = str;
        this.f227929c = objectNonceId;
        this.f227930d = z17;
        this.f227931e = z18;
        this.f227932f = i17;
        this.f227933g = i18;
        this.f227934h = str2;
        this.f227935i = str3;
        this.f227936j = bc1Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof db2.c5)) {
            return false;
        }
        db2.c5 c5Var = (db2.c5) obj;
        return this.f227927a == c5Var.f227927a && kotlin.jvm.internal.o.b(this.f227928b, c5Var.f227928b) && kotlin.jvm.internal.o.b(this.f227929c, c5Var.f227929c) && this.f227930d == c5Var.f227930d && this.f227931e == c5Var.f227931e && this.f227932f == c5Var.f227932f && this.f227933g == c5Var.f227933g && kotlin.jvm.internal.o.b(this.f227934h, c5Var.f227934h) && kotlin.jvm.internal.o.b(this.f227935i, c5Var.f227935i) && kotlin.jvm.internal.o.b(this.f227936j, c5Var.f227936j);
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.f227927a) * 31;
        java.lang.String str = this.f227928b;
        int hashCode2 = (((((((((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f227929c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f227930d)) * 31) + java.lang.Boolean.hashCode(this.f227931e)) * 31) + java.lang.Integer.hashCode(this.f227932f)) * 31) + java.lang.Integer.hashCode(this.f227933g)) * 31;
        java.lang.String str2 = this.f227934h;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f227935i;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        r45.bc1 bc1Var = this.f227936j;
        return hashCode4 + (bc1Var != null ? bc1Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FinderLikeCGIParams(feedId=" + this.f227927a + ", dupFlag=" + this.f227928b + ", objectNonceId=" + this.f227929c + ", like=" + this.f227930d + ", isPrivate=" + this.f227931e + ", scene=" + this.f227932f + ", source=" + this.f227933g + ", exportID=" + this.f227934h + ", newLifeSearchClickId=" + this.f227935i + ", showMileStoneInfo=" + this.f227936j + ')';
    }
}
