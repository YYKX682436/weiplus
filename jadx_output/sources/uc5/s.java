package uc5;

/* loaded from: classes5.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    public final int f426544a;

    /* renamed from: b, reason: collision with root package name */
    public final long f426545b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f426546c;

    public s(int i17, long j17, boolean z17) {
        this.f426544a = i17;
        this.f426545b = j17;
        this.f426546c = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uc5.s)) {
            return false;
        }
        uc5.s sVar = (uc5.s) obj;
        return this.f426544a == sVar.f426544a && this.f426545b == sVar.f426545b && this.f426546c == sVar.f426546c;
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.f426544a) * 31) + java.lang.Long.hashCode(this.f426545b)) * 31) + java.lang.Boolean.hashCode(this.f426546c);
    }

    public java.lang.String toString() {
        return "ScanResult(loadedCount=" + this.f426544a + ", lastScannedTime=" + this.f426545b + ", hasMore=" + this.f426546c + ')';
    }
}
