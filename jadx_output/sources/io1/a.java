package io1;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f293452a;

    /* renamed from: b, reason: collision with root package name */
    public final io1.b f293453b;

    /* renamed from: c, reason: collision with root package name */
    public final po1.d f293454c;

    /* renamed from: d, reason: collision with root package name */
    public float f293455d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f293456e;

    /* renamed from: f, reason: collision with root package name */
    public final int f293457f;

    public a(long j17, io1.b deleteType, po1.d deviceInfo, float f17, boolean z17, int i17) {
        kotlin.jvm.internal.o.g(deleteType, "deleteType");
        kotlin.jvm.internal.o.g(deviceInfo, "deviceInfo");
        this.f293452a = j17;
        this.f293453b = deleteType;
        this.f293454c = deviceInfo;
        this.f293455d = f17;
        this.f293456e = z17;
        this.f293457f = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof io1.a)) {
            return false;
        }
        io1.a aVar = (io1.a) obj;
        return this.f293452a == aVar.f293452a && this.f293453b == aVar.f293453b && kotlin.jvm.internal.o.b(this.f293454c, aVar.f293454c) && java.lang.Float.compare(this.f293455d, aVar.f293455d) == 0 && this.f293456e == aVar.f293456e && this.f293457f == aVar.f293457f;
    }

    public int hashCode() {
        return (((((((((java.lang.Long.hashCode(this.f293452a) * 31) + this.f293453b.hashCode()) * 31) + this.f293454c.hashCode()) * 31) + java.lang.Float.hashCode(this.f293455d)) * 31) + java.lang.Boolean.hashCode(this.f293456e)) * 31) + java.lang.Integer.hashCode(this.f293457f);
    }

    public java.lang.String toString() {
        return "DeleteParams(pkgId=" + this.f293452a + ", deleteType=" + this.f293453b + ", deviceInfo=" + this.f293454c + ", progress=" + this.f293455d + ", isDone=" + this.f293456e + ", errorCode=" + this.f293457f + ')';
    }
}
