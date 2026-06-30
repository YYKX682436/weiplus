package uj;

/* loaded from: classes7.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public long f428163a;

    /* renamed from: b, reason: collision with root package name */
    public final long f428164b;

    public l(long j17, long j18, int i17, kotlin.jvm.internal.i iVar) {
        j17 = (i17 & 1) != 0 ? 0L : j17;
        j18 = (i17 & 2) != 0 ? 0L : j18;
        this.f428163a = j17;
        this.f428164b = j18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uj.l)) {
            return false;
        }
        uj.l lVar = (uj.l) obj;
        return this.f428163a == lVar.f428163a && this.f428164b == lVar.f428164b;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f428163a) * 31) + java.lang.Long.hashCode(this.f428164b);
    }

    public java.lang.String toString() {
        return "Info(initTime=" + this.f428163a + ", renderStartTime=" + this.f428164b + ')';
    }
}
