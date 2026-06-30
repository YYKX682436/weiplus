package xs5;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public long f456404a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f456405b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f456406c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f456407d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f456408e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456409f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456410g;

    public a(long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i17, kotlin.jvm.internal.i iVar) {
        j17 = (i17 & 1) != 0 ? 0L : j17;
        str = (i17 & 2) != 0 ? "" : str;
        str2 = (i17 & 4) != 0 ? "" : str2;
        str3 = (i17 & 8) != 0 ? "" : str3;
        str4 = (i17 & 16) != 0 ? "" : str4;
        str5 = (i17 & 32) != 0 ? "" : str5;
        str6 = (i17 & 64) != 0 ? "" : str6;
        this.f456404a = j17;
        this.f456405b = str;
        this.f456406c = str2;
        this.f456407d = str3;
        this.f456408e = str4;
        this.f456409f = str5;
        this.f456410g = str6;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xs5.a)) {
            return false;
        }
        xs5.a aVar = (xs5.a) obj;
        return this.f456404a == aVar.f456404a && kotlin.jvm.internal.o.b(this.f456405b, aVar.f456405b) && kotlin.jvm.internal.o.b(this.f456406c, aVar.f456406c) && kotlin.jvm.internal.o.b(this.f456407d, aVar.f456407d) && kotlin.jvm.internal.o.b(this.f456408e, aVar.f456408e) && kotlin.jvm.internal.o.b(this.f456409f, aVar.f456409f) && kotlin.jvm.internal.o.b(this.f456410g, aVar.f456410g);
    }

    public int hashCode() {
        int hashCode = java.lang.Long.hashCode(this.f456404a) * 31;
        java.lang.String str = this.f456405b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f456406c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f456407d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        java.lang.String str4 = this.f456408e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        java.lang.String str5 = this.f456409f;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        java.lang.String str6 = this.f456410g;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "feedObjectId: " + this.f456404a + "  redIconUrl: " + this.f456405b + " jumpTabId: " + this.f456406c + " nonceId: " + this.f456407d + " userName: " + this.f456408e + " finderNickName: " + this.f456409f + " coverUrl: " + this.f456410g;
    }
}
