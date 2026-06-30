package xe;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f453735a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f453736b;

    public b(java.lang.String appId, java.lang.String str) {
        kotlin.jvm.internal.o.g(appId, "appId");
        this.f453735a = appId;
        this.f453736b = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xe.b)) {
            return false;
        }
        xe.b bVar = (xe.b) obj;
        return kotlin.jvm.internal.o.b(this.f453735a, bVar.f453735a) && kotlin.jvm.internal.o.b(this.f453736b, bVar.f453736b);
    }

    public int hashCode() {
        int hashCode = this.f453735a.hashCode() * 31;
        java.lang.String str = this.f453736b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "PendingFinishRuntimeMessage(appId=" + this.f453735a + ", instanceId=" + this.f453736b + ')';
    }
}
