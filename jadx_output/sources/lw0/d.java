package lw0;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f321531a;

    /* renamed from: b, reason: collision with root package name */
    public final long f321532b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f321533c;

    public d(java.lang.String materialID, long j17, java.lang.String str) {
        kotlin.jvm.internal.o.g(materialID, "materialID");
        this.f321531a = materialID;
        this.f321532b = j17;
        this.f321533c = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lw0.d)) {
            return false;
        }
        lw0.d dVar = (lw0.d) obj;
        return kotlin.jvm.internal.o.b(this.f321531a, dVar.f321531a) && this.f321532b == dVar.f321532b && kotlin.jvm.internal.o.b(this.f321533c, dVar.f321533c);
    }

    public int hashCode() {
        int hashCode = ((this.f321531a.hashCode() * 31) + java.lang.Long.hashCode(this.f321532b)) * 31;
        java.lang.String str = this.f321533c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "WhenWhereData(materialID=" + this.f321531a + ", timestamp=" + this.f321532b + ", location=" + this.f321533c + ')';
    }
}
