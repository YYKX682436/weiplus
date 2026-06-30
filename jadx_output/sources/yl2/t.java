package yl2;

/* loaded from: classes3.dex */
public final class t extends yl2.w {

    /* renamed from: a, reason: collision with root package name */
    public final int f463072a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f463073b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(int i17, java.lang.String verifyUrl) {
        super(null);
        kotlin.jvm.internal.o.g(verifyUrl, "verifyUrl");
        this.f463072a = i17;
        this.f463073b = verifyUrl;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl2.t)) {
            return false;
        }
        yl2.t tVar = (yl2.t) obj;
        return this.f463072a == tVar.f463072a && kotlin.jvm.internal.o.b(this.f463073b, tVar.f463073b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f463072a) * 31) + this.f463073b.hashCode();
    }

    public java.lang.String toString() {
        return "NeedVerify(precheckType=" + this.f463072a + ", verifyUrl=" + this.f463073b + ')';
    }
}
