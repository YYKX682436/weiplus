package nw4;

/* loaded from: classes.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public long f340871a;

    /* renamed from: b, reason: collision with root package name */
    public int f340872b;

    public l(long j17, int i17) {
        this.f340871a = j17;
        this.f340872b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw4.l)) {
            return false;
        }
        nw4.l lVar = (nw4.l) obj;
        return this.f340871a == lVar.f340871a && this.f340872b == lVar.f340872b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f340871a) * 31) + java.lang.Integer.hashCode(this.f340872b);
    }

    public java.lang.String toString() {
        return "JsApiCallInfo(time=" + this.f340871a + ", count=" + this.f340872b + ')';
    }
}
