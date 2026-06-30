package hm3;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final int f282226a;

    /* renamed from: b, reason: collision with root package name */
    public final long f282227b;

    /* renamed from: c, reason: collision with root package name */
    public final long f282228c;

    /* renamed from: d, reason: collision with root package name */
    public final long f282229d;

    public b(int i17, long j17, long j18, long j19) {
        this.f282226a = i17;
        this.f282227b = j17;
        this.f282228c = j18;
        this.f282229d = j19;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hm3.b)) {
            return false;
        }
        hm3.b bVar = (hm3.b) obj;
        return this.f282226a == bVar.f282226a && this.f282227b == bVar.f282227b && this.f282228c == bVar.f282228c && this.f282229d == bVar.f282229d;
    }

    public int hashCode() {
        return (((((java.lang.Integer.hashCode(this.f282226a) * 31) + java.lang.Long.hashCode(this.f282227b)) * 31) + java.lang.Long.hashCode(this.f282228c)) * 31) + java.lang.Long.hashCode(this.f282229d);
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f282226a);
        sb6.append(": cost:");
        long j17 = this.f282229d;
        long j18 = this.f282227b;
        sb6.append(j17 - j18);
        sb6.append(" dispatchCost:");
        sb6.append(j17 - this.f282228c);
        sb6.append(" time:");
        sb6.append(k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, j18 / 1000));
        return sb6.toString();
    }
}
