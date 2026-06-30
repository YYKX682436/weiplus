package rw2;

/* loaded from: classes10.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final long f400596a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f400597b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.tav.coremedia.CMTime f400598c;

    public g(long j17, yz5.p callback, com.tencent.tav.coremedia.CMTime cmTime, int i17, kotlin.jvm.internal.i iVar) {
        if ((i17 & 4) != 0) {
            cmTime = com.tencent.tav.coremedia.CMTime.fromMs(j17);
            kotlin.jvm.internal.o.f(cmTime, "fromMs(...)");
        }
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(cmTime, "cmTime");
        this.f400596a = j17;
        this.f400597b = callback;
        this.f400598c = cmTime;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw2.g)) {
            return false;
        }
        rw2.g gVar = (rw2.g) obj;
        return this.f400596a == gVar.f400596a && kotlin.jvm.internal.o.b(this.f400597b, gVar.f400597b) && kotlin.jvm.internal.o.b(this.f400598c, gVar.f400598c);
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f400596a) * 31) + this.f400597b.hashCode()) * 31) + this.f400598c.hashCode();
    }

    public java.lang.String toString() {
        return "Request(timeMs=" + this.f400596a + ", callback=" + this.f400597b + ", cmTime=" + this.f400598c + ')';
    }
}
