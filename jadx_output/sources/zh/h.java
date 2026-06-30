package zh;

/* loaded from: classes11.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f472849a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f472850b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f472851c;

    public h(int i17, java.lang.String reason, java.lang.String subReason) {
        kotlin.jvm.internal.o.g(reason, "reason");
        kotlin.jvm.internal.o.g(subReason, "subReason");
        this.f472849a = i17;
        this.f472850b = reason;
        this.f472851c = subReason;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zh.h)) {
            return false;
        }
        zh.h hVar = (zh.h) obj;
        return this.f472849a == hVar.f472849a && kotlin.jvm.internal.o.b(this.f472850b, hVar.f472850b) && kotlin.jvm.internal.o.b(this.f472851c, hVar.f472851c);
    }

    public int hashCode() {
        int i17 = this.f472849a * 31;
        java.lang.String str = this.f472850b;
        int hashCode = (i17 + (str != null ? str.hashCode() : 0)) * 31;
        java.lang.String str2 = this.f472851c;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "SmokeResult(code=" + this.f472849a + ", reason=" + this.f472850b + ", subReason=" + this.f472851c + ")";
    }
}
