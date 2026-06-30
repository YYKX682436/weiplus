package zy2;

/* loaded from: classes2.dex */
public final class c5 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f477367a;

    /* renamed from: b, reason: collision with root package name */
    public final long f477368b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f477369c;

    /* renamed from: d, reason: collision with root package name */
    public final float f477370d;

    public c5(java.lang.String feedId, long j17, boolean z17, float f17) {
        kotlin.jvm.internal.o.g(feedId, "feedId");
        this.f477367a = feedId;
        this.f477368b = j17;
        this.f477369c = z17;
        this.f477370d = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zy2.c5)) {
            return false;
        }
        zy2.c5 c5Var = (zy2.c5) obj;
        return kotlin.jvm.internal.o.b(this.f477367a, c5Var.f477367a) && this.f477368b == c5Var.f477368b && this.f477369c == c5Var.f477369c && java.lang.Float.compare(this.f477370d, c5Var.f477370d) == 0;
    }

    public int hashCode() {
        return (((((this.f477367a.hashCode() * 31) + java.lang.Long.hashCode(this.f477368b)) * 31) + java.lang.Boolean.hashCode(this.f477369c)) * 31) + java.lang.Float.hashCode(this.f477370d);
    }

    public java.lang.String toString() {
        return "FinderNotifyStopPlayParam(feedId=" + this.f477367a + ", playbackTime=" + this.f477368b + ", isPause=" + this.f477369c + ", playbackRate=" + this.f477370d + ')';
    }
}
