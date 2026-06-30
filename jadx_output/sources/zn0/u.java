package zn0;

/* loaded from: classes3.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Long f474401a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Long f474402b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f474403c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Integer f474404d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f474405e;

    public u(java.lang.Long l17, java.lang.Long l18, java.lang.String str, java.lang.Integer num, java.lang.String str2) {
        this.f474401a = l17;
        this.f474402b = l18;
        this.f474403c = str;
        this.f474404d = num;
        this.f474405e = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn0.u)) {
            return false;
        }
        zn0.u uVar = (zn0.u) obj;
        return kotlin.jvm.internal.o.b(this.f474401a, uVar.f474401a) && kotlin.jvm.internal.o.b(this.f474402b, uVar.f474402b) && kotlin.jvm.internal.o.b(this.f474403c, uVar.f474403c) && kotlin.jvm.internal.o.b(this.f474404d, uVar.f474404d) && kotlin.jvm.internal.o.b(this.f474405e, uVar.f474405e);
    }

    public int hashCode() {
        java.lang.Long l17 = this.f474401a;
        int hashCode = (l17 == null ? 0 : l17.hashCode()) * 31;
        java.lang.Long l18 = this.f474402b;
        int hashCode2 = (hashCode + (l18 == null ? 0 : l18.hashCode())) * 31;
        java.lang.String str = this.f474403c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.Integer num = this.f474404d;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        java.lang.String str2 = this.f474405e;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "FinderLivePublishMediaStreamReporterExtInfo(liveId=" + this.f474401a + ", feedId=" + this.f474402b + ", sdkUserId=" + this.f474403c + ", sdkRoomId=" + this.f474404d + ", anchorNickname=" + this.f474405e + ')';
    }
}
