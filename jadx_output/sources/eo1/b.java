package eo1;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f255547a;

    /* renamed from: b, reason: collision with root package name */
    public eo1.c f255548b;

    public b(java.lang.String deviceId, eo1.c errorType) {
        kotlin.jvm.internal.o.g(deviceId, "deviceId");
        kotlin.jvm.internal.o.g(errorType, "errorType");
        this.f255547a = deviceId;
        this.f255548b = errorType;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eo1.b)) {
            return false;
        }
        eo1.b bVar = (eo1.b) obj;
        return kotlin.jvm.internal.o.b(this.f255547a, bVar.f255547a) && this.f255548b == bVar.f255548b;
    }

    public int hashCode() {
        return (this.f255547a.hashCode() * 31) + this.f255548b.hashCode();
    }

    public java.lang.String toString() {
        return "ErrorInfo(deviceId=" + this.f255547a + ", errorType=" + this.f255548b + ')';
    }
}
