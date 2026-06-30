package hx5;

/* loaded from: classes13.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f285707a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f285708b;

    /* renamed from: c, reason: collision with root package name */
    public final int f285709c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f285710d;

    public d(java.lang.String appId, java.lang.String UUID, int i17, java.lang.String versionName) {
        kotlin.jvm.internal.o.g(appId, "appId");
        kotlin.jvm.internal.o.g(UUID, "UUID");
        kotlin.jvm.internal.o.g(versionName, "versionName");
        this.f285707a = appId;
        this.f285708b = UUID;
        this.f285709c = i17;
        this.f285710d = versionName;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hx5.d)) {
            return false;
        }
        hx5.d dVar = (hx5.d) obj;
        return kotlin.jvm.internal.o.b(this.f285707a, dVar.f285707a) && kotlin.jvm.internal.o.b(this.f285708b, dVar.f285708b) && this.f285709c == dVar.f285709c && kotlin.jvm.internal.o.b(this.f285710d, dVar.f285710d);
    }

    public int hashCode() {
        return (((((this.f285707a.hashCode() * 31) + this.f285708b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f285709c)) * 31) + this.f285710d.hashCode();
    }

    public java.lang.String toString() {
        return "WVAAppInfo(appId=" + this.f285707a + ", UUID=" + this.f285708b + ", versionCode=" + this.f285709c + ", versionName=" + this.f285710d + ')';
    }
}
