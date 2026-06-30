package j11;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f297096a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f297097b;

    public a(java.lang.String str, java.lang.String str2) {
        this.f297096a = str;
        this.f297097b = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j11.a)) {
            return false;
        }
        j11.a aVar = (j11.a) obj;
        return kotlin.jvm.internal.o.b(this.f297096a, aVar.f297096a) && kotlin.jvm.internal.o.b(this.f297097b, aVar.f297097b);
    }

    public int hashCode() {
        java.lang.String str = this.f297096a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f297097b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CustomSceneUser(user=" + this.f297096a + ", room=" + this.f297097b + ')';
    }
}
