package km2;

/* loaded from: classes3.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f309108a;

    /* renamed from: b, reason: collision with root package name */
    public android.os.Bundle f309109b;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.Object f309110c;

    public i(java.lang.String str, android.os.Bundle bundle, java.lang.Object obj) {
        this.f309108a = str;
        this.f309109b = bundle;
        this.f309110c = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof km2.i)) {
            return false;
        }
        km2.i iVar = (km2.i) obj;
        return kotlin.jvm.internal.o.b(this.f309108a, iVar.f309108a) && kotlin.jvm.internal.o.b(this.f309109b, iVar.f309109b) && kotlin.jvm.internal.o.b(this.f309110c, iVar.f309110c);
    }

    public int hashCode() {
        java.lang.String str = this.f309108a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        android.os.Bundle bundle = this.f309109b;
        int hashCode2 = (hashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
        java.lang.Object obj = this.f309110c;
        return hashCode2 + (obj != null ? obj.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "StateWrapper:" + this.f309108a + ',' + this.f309109b;
    }
}
