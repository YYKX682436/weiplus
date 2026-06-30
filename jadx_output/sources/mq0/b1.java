package mq0;

/* loaded from: classes7.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public long f330540a;

    /* renamed from: b, reason: collision with root package name */
    public long f330541b;

    /* renamed from: c, reason: collision with root package name */
    public long f330542c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f330543d;

    public b1(long j17, long j18, long j19, boolean z17, int i17, kotlin.jvm.internal.i iVar) {
        j17 = (i17 & 1) != 0 ? 0L : j17;
        j18 = (i17 & 2) != 0 ? 0L : j18;
        j19 = (i17 & 4) != 0 ? 0L : j19;
        z17 = (i17 & 8) != 0 ? false : z17;
        this.f330540a = j17;
        this.f330541b = j18;
        this.f330542c = j19;
        this.f330543d = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mq0.b1)) {
            return false;
        }
        mq0.b1 b1Var = (mq0.b1) obj;
        return this.f330540a == b1Var.f330540a && this.f330541b == b1Var.f330541b && this.f330542c == b1Var.f330542c && this.f330543d == b1Var.f330543d;
    }

    public int hashCode() {
        return (((((java.lang.Long.hashCode(this.f330540a) * 31) + java.lang.Long.hashCode(this.f330541b)) * 31) + java.lang.Long.hashCode(this.f330542c)) * 31) + java.lang.Boolean.hashCode(this.f330543d);
    }

    public java.lang.String toString() {
        return "Info(initTime=" + this.f330540a + ", renderStartTime=" + this.f330541b + ", exposeTime=" + this.f330542c + ", preloadDone=" + this.f330543d + ')';
    }
}
