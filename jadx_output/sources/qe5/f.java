package qe5;

/* loaded from: classes9.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final int f362092a;

    /* renamed from: b, reason: collision with root package name */
    public final long f362093b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f362094c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f362095d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f362096e;

    public f(int i17, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f362092a = i17;
        this.f362093b = j17;
        this.f362094c = str;
        this.f362095d = str2;
        this.f362096e = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qe5.f)) {
            return false;
        }
        qe5.f fVar = (qe5.f) obj;
        return this.f362092a == fVar.f362092a && this.f362093b == fVar.f362093b && kotlin.jvm.internal.o.b(this.f362094c, fVar.f362094c) && kotlin.jvm.internal.o.b(this.f362095d, fVar.f362095d) && kotlin.jvm.internal.o.b(this.f362096e, fVar.f362096e);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f362092a) * 31) + java.lang.Long.hashCode(this.f362093b)) * 31;
        java.lang.String str = this.f362094c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f362095d;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        java.lang.String str3 = this.f362096e;
        return hashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "AppAttachQueryParams(appType=" + this.f362092a + ", msgId=" + this.f362093b + ", talker=" + this.f362094c + ", mediaId=" + this.f362095d + ", msgContent=" + this.f362096e + ')';
    }
}
