package zn1;

/* loaded from: classes5.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f474441a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f474442b;

    public g(java.lang.String str, java.lang.String str2) {
        this.f474441a = str;
        this.f474442b = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zn1.g)) {
            return false;
        }
        zn1.g gVar = (zn1.g) obj;
        return kotlin.jvm.internal.o.b(this.f474441a, gVar.f474441a) && kotlin.jvm.internal.o.b(this.f474442b, gVar.f474442b);
    }

    public int hashCode() {
        java.lang.String str = this.f474441a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f474442b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "AccessoryInfo(manufacturer=" + this.f474441a + ", model=" + this.f474442b + ')';
    }
}
