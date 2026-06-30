package wh;

/* loaded from: classes8.dex */
public final class d1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f445759a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f445760b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f445761c;

    /* renamed from: d, reason: collision with root package name */
    public final int f445762d;

    public d1(java.lang.String manufacture, java.lang.String action, java.lang.String settingName, int i17) {
        kotlin.jvm.internal.o.g(manufacture, "manufacture");
        kotlin.jvm.internal.o.g(action, "action");
        kotlin.jvm.internal.o.g(settingName, "settingName");
        this.f445759a = manufacture;
        this.f445760b = action;
        this.f445761c = settingName;
        this.f445762d = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wh.d1)) {
            return false;
        }
        wh.d1 d1Var = (wh.d1) obj;
        return kotlin.jvm.internal.o.b(this.f445759a, d1Var.f445759a) && kotlin.jvm.internal.o.b(this.f445760b, d1Var.f445760b) && kotlin.jvm.internal.o.b(this.f445761c, d1Var.f445761c) && this.f445762d == d1Var.f445762d;
    }

    public int hashCode() {
        java.lang.String str = this.f445759a;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        java.lang.String str2 = this.f445760b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        java.lang.String str3 = this.f445761c;
        return ((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.f445762d;
    }

    public java.lang.String toString() {
        return "PowerSaveModeEntry(manufacture=" + this.f445759a + ", action=" + this.f445760b + ", settingName=" + this.f445761c + ", positive=" + this.f445762d + ")";
    }
}
