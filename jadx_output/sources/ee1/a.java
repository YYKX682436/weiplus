package ee1;

/* loaded from: classes4.dex */
public final class a extends ee1.e {

    /* renamed from: a, reason: collision with root package name */
    public final int f251569a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f251570b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, java.lang.String retMsg) {
        super(null);
        kotlin.jvm.internal.o.g(retMsg, "retMsg");
        this.f251569a = i17;
        this.f251570b = retMsg;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ee1.a)) {
            return false;
        }
        ee1.a aVar = (ee1.a) obj;
        return this.f251569a == aVar.f251569a && kotlin.jvm.internal.o.b(this.f251570b, aVar.f251570b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f251569a) * 31) + this.f251570b.hashCode();
    }

    public java.lang.String toString() {
        return "BizError(retCode=" + this.f251569a + ", retMsg=" + this.f251570b + ')';
    }
}
