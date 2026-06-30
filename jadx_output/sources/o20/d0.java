package o20;

/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f342374a;

    /* renamed from: b, reason: collision with root package name */
    public final int f342375b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f342376c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f342377d;

    public d0(int i17, int i18, java.lang.String str, java.util.Map extraInfo, int i19, kotlin.jvm.internal.i iVar) {
        str = (i19 & 4) != 0 ? null : str;
        extraInfo = (i19 & 8) != 0 ? kz5.q0.f314001d : extraInfo;
        kotlin.jvm.internal.o.g(extraInfo, "extraInfo");
        this.f342374a = i17;
        this.f342375b = i18;
        this.f342376c = str;
        this.f342377d = extraInfo;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o20.d0)) {
            return false;
        }
        o20.d0 d0Var = (o20.d0) obj;
        return this.f342374a == d0Var.f342374a && this.f342375b == d0Var.f342375b && kotlin.jvm.internal.o.b(this.f342376c, d0Var.f342376c) && kotlin.jvm.internal.o.b(this.f342377d, d0Var.f342377d);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f342374a) * 31) + java.lang.Integer.hashCode(this.f342375b)) * 31;
        java.lang.String str = this.f342376c;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + this.f342377d.hashCode();
    }

    public java.lang.String toString() {
        return "PlayerErrorInfo(errorType=" + this.f342374a + ", errorCode=" + this.f342375b + ", errorMessage=" + this.f342376c + ", extraInfo=" + this.f342377d + ')';
    }
}
