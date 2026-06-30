package dk2;

/* loaded from: classes14.dex */
public final class d5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f233316a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f233317b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f233318c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f233319d;

    public d5(java.lang.String resultCode, java.lang.String resultDesc, java.lang.String str, java.lang.String str2) {
        kotlin.jvm.internal.o.g(resultCode, "resultCode");
        kotlin.jvm.internal.o.g(resultDesc, "resultDesc");
        this.f233316a = resultCode;
        this.f233317b = resultDesc;
        this.f233318c = str;
        this.f233319d = str2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dk2.d5)) {
            return false;
        }
        dk2.d5 d5Var = (dk2.d5) obj;
        return kotlin.jvm.internal.o.b(this.f233316a, d5Var.f233316a) && kotlin.jvm.internal.o.b(this.f233317b, d5Var.f233317b) && kotlin.jvm.internal.o.b(this.f233318c, d5Var.f233318c) && kotlin.jvm.internal.o.b(this.f233319d, d5Var.f233319d);
    }

    public int hashCode() {
        int hashCode = ((this.f233316a.hashCode() * 31) + this.f233317b.hashCode()) * 31;
        java.lang.String str = this.f233318c;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.lang.String str2 = this.f233319d;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CtidAuthResult(resultCode=" + this.f233316a + ", resultDesc=" + this.f233317b + ", idCardAuthData=" + this.f233318c + ", certPwdData=" + this.f233319d + ')';
    }
}
