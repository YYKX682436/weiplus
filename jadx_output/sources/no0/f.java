package no0;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final long f338715a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f338716b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f338717c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f338718d;

    /* renamed from: e, reason: collision with root package name */
    public final int f338719e;

    public f(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        this.f338715a = j17;
        this.f338716b = str;
        this.f338717c = str2;
        this.f338718d = str3;
        this.f338719e = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof no0.f)) {
            return false;
        }
        no0.f fVar = (no0.f) obj;
        return this.f338715a == fVar.f338715a && kotlin.jvm.internal.o.b(this.f338716b, fVar.f338716b) && kotlin.jvm.internal.o.b(this.f338717c, fVar.f338717c) && kotlin.jvm.internal.o.b(this.f338718d, fVar.f338718d) && this.f338719e == fVar.f338719e;
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.f338715a) * 31;
        java.lang.String str = this.f338716b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f338717c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f338718d;
        return ((hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31) + java.lang.Integer.hashCode(this.f338719e);
    }

    public java.lang.String toString() {
        return "CloseLiveMicInfo(liveId=" + this.f338715a + ", audience=" + this.f338716b + ", micId=" + this.f338717c + ", sdkUserId=" + this.f338718d + ", micType=" + this.f338719e + ')';
    }
}
