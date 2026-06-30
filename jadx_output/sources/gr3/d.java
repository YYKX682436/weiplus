package gr3;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f274854a;

    /* renamed from: b, reason: collision with root package name */
    public final int f274855b;

    /* renamed from: c, reason: collision with root package name */
    public final long f274856c;

    public d(long j17, int i17, long j18) {
        this.f274854a = j17;
        this.f274855b = i17;
        this.f274856c = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gr3.d)) {
            return false;
        }
        gr3.d dVar = (gr3.d) obj;
        return this.f274854a == dVar.f274854a && this.f274855b == dVar.f274855b && this.f274856c == dVar.f274856c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f274854a) * 31) + java.lang.Integer.hashCode(this.f274855b)) * 31) + java.lang.Long.hashCode(this.f274856c);
    }

    public java.lang.String toString() {
        return "BizProfileMsgTripletInfo(mid=" + this.f274854a + ", idx=" + this.f274855b + ", bizUin=" + this.f274856c + ')';
    }
}
