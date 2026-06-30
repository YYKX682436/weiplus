package mz0;

/* loaded from: classes3.dex */
public final class m2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f333002a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Boolean f333003b;

    public m2(java.lang.String str, java.lang.Boolean bool) {
        this.f333002a = str;
        this.f333003b = bool;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz0.m2)) {
            return false;
        }
        mz0.m2 m2Var = (mz0.m2) obj;
        return kotlin.jvm.internal.o.b(this.f333002a, m2Var.f333002a) && kotlin.jvm.internal.o.b(this.f333003b, m2Var.f333003b);
    }

    public int hashCode() {
        java.lang.String str = this.f333002a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.Boolean bool = this.f333003b;
        return hashCode + (bool != null ? bool.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "SnsBgmExportData(listenId=" + this.f333002a + ", isMajorOwned=" + this.f333003b + ')';
    }
}
