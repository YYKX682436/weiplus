package sj4;

/* loaded from: classes10.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f408870a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f408871b;

    /* renamed from: c, reason: collision with root package name */
    public final int f408872c;

    /* renamed from: d, reason: collision with root package name */
    public final int f408873d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f408874e;

    public m1(java.lang.String str, java.lang.String str2, int i17, int i18, java.lang.String str3) {
        this.f408870a = str;
        this.f408871b = str2;
        this.f408872c = i17;
        this.f408873d = i18;
        this.f408874e = str3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sj4.m1)) {
            return false;
        }
        sj4.m1 m1Var = (sj4.m1) obj;
        return kotlin.jvm.internal.o.b(this.f408870a, m1Var.f408870a) && kotlin.jvm.internal.o.b(this.f408871b, m1Var.f408871b) && this.f408872c == m1Var.f408872c && this.f408873d == m1Var.f408873d && kotlin.jvm.internal.o.b(this.f408874e, m1Var.f408874e);
    }

    public int hashCode() {
        java.lang.String str = this.f408870a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        java.lang.String str2 = this.f408871b;
        int hashCode2 = (((((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31) + java.lang.Integer.hashCode(this.f408872c)) * 31) + java.lang.Integer.hashCode(this.f408873d)) * 31;
        java.lang.String str3 = this.f408874e;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "WeAppJumpParam(username=" + this.f408870a + ", enterPath=" + this.f408871b + ", version=" + this.f408872c + ", versionType=" + this.f408873d + ", extraData=" + this.f408874e + ')';
    }
}
