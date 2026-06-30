package s04;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final long f401968a;

    /* renamed from: b, reason: collision with root package name */
    public final int f401969b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f401970c;

    public a(long j17, int i17, boolean z17) {
        this.f401968a = j17;
        this.f401969b = i17;
        this.f401970c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s04.a)) {
            return false;
        }
        s04.a aVar = (s04.a) obj;
        return this.f401968a == aVar.f401968a && this.f401969b == aVar.f401969b && this.f401970c == aVar.f401970c;
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f401968a) * 31) + java.lang.Integer.hashCode(this.f401969b)) * 31) + java.lang.Boolean.hashCode(this.f401970c);
    }

    public java.lang.String toString() {
        return "RecoveryReportData(lastRecoveryTime=" + this.f401968a + ", lastRecoveryType=" + this.f401969b + ", hasRecoveryData=" + this.f401970c + ')';
    }
}
