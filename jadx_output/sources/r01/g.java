package r01;

/* loaded from: classes9.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f368070a;

    /* renamed from: b, reason: collision with root package name */
    public final int f368071b;

    /* renamed from: c, reason: collision with root package name */
    public final long f368072c;

    public g(long j17, int i17, long j18) {
        this.f368070a = j17;
        this.f368071b = i17;
        this.f368072c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof r01.g)) {
            return false;
        }
        r01.g gVar = (r01.g) obj;
        return this.f368070a == gVar.f368070a && this.f368071b == gVar.f368071b && this.f368072c == gVar.f368072c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f368070a) * 31) + java.lang.Integer.hashCode(this.f368071b)) * 31) + java.lang.Long.hashCode(this.f368072c);
    }

    public java.lang.String toString() {
        return "BrandServiceMsgTripletInfo(mid=" + this.f368070a + ", idx=" + this.f368071b + ", bizUin=" + this.f368072c + ')';
    }
}
