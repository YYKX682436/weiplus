package zl2;

/* loaded from: classes3.dex */
public final class c5 {

    /* renamed from: a, reason: collision with root package name */
    public long f473704a;

    /* renamed from: b, reason: collision with root package name */
    public long f473705b;

    public c5(long j17, long j18) {
        this.f473704a = j17;
        this.f473705b = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zl2.c5)) {
            return false;
        }
        zl2.c5 c5Var = (zl2.c5) obj;
        return this.f473704a == c5Var.f473704a && this.f473705b == c5Var.f473705b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f473704a) * 31) + java.lang.Long.hashCode(this.f473705b);
    }

    public java.lang.String toString() {
        return "QuotaConfig(noticeAmount=" + this.f473704a + ", saveTime=" + this.f473705b + ')';
    }
}
