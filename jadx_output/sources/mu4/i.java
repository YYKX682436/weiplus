package mu4;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f331423a;

    /* renamed from: b, reason: collision with root package name */
    public final long f331424b;

    public i(java.lang.String appId, long j17) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f331423a = appId;
        this.f331424b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mu4.i)) {
            return false;
        }
        mu4.i iVar = (mu4.i) obj;
        return kotlin.jvm.internal.o.b(this.f331423a, iVar.f331423a) && this.f331424b == iVar.f331424b;
    }

    public int hashCode() {
        return (this.f331423a.hashCode() * 31) + java.lang.Long.hashCode(this.f331424b);
    }

    public java.lang.String toString() {
        return "ClientInfo(appId=" + this.f331423a + ", idKey=" + this.f331424b + ')';
    }
}
