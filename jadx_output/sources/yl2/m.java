package yl2;

/* loaded from: classes3.dex */
public final class m extends yl2.o {

    /* renamed from: a, reason: collision with root package name */
    public final int f463044a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f463045b;

    /* renamed from: c, reason: collision with root package name */
    public final yl2.q f463046c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(int i17, java.lang.String verifyUrl, yl2.q qVar) {
        super(null);
        kotlin.jvm.internal.o.g(verifyUrl, "verifyUrl");
        this.f463044a = i17;
        this.f463045b = verifyUrl;
        this.f463046c = qVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yl2.m)) {
            return false;
        }
        yl2.m mVar = (yl2.m) obj;
        return this.f463044a == mVar.f463044a && kotlin.jvm.internal.o.b(this.f463045b, mVar.f463045b) && kotlin.jvm.internal.o.b(this.f463046c, mVar.f463046c);
    }

    public int hashCode() {
        int hashCode = ((java.lang.Integer.hashCode(this.f463044a) * 31) + this.f463045b.hashCode()) * 31;
        yl2.q qVar = this.f463046c;
        return hashCode + (qVar == null ? 0 : qVar.hashCode());
    }

    public java.lang.String toString() {
        return "NeedAuth(precheckType=" + this.f463044a + ", verifyUrl=" + this.f463045b + ", liveVerifyResult=" + this.f463046c + ')';
    }
}
