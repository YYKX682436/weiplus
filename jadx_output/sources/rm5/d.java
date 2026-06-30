package rm5;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final long f397481a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.p f397482b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.tav.coremedia.CMTime f397483c;

    public d(long j17, yz5.p callback, com.tencent.tav.coremedia.CMTime cmTime, int i17, kotlin.jvm.internal.i iVar) {
        cmTime = (i17 & 4) != 0 ? new com.tencent.tav.coremedia.CMTime(j17, 1000) : cmTime;
        kotlin.jvm.internal.o.g(callback, "callback");
        kotlin.jvm.internal.o.g(cmTime, "cmTime");
        this.f397481a = j17;
        this.f397482b = callback;
        this.f397483c = cmTime;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm5.d)) {
            return false;
        }
        rm5.d dVar = (rm5.d) obj;
        return this.f397481a == dVar.f397481a && kotlin.jvm.internal.o.b(this.f397482b, dVar.f397482b) && kotlin.jvm.internal.o.b(this.f397483c, dVar.f397483c);
    }

    public int hashCode() {
        return (((java.lang.Long.hashCode(this.f397481a) * 31) + this.f397482b.hashCode()) * 31) + this.f397483c.hashCode();
    }

    public java.lang.String toString() {
        return "Request(timeMs=" + this.f397481a + ", callback=" + this.f397482b + ", cmTime=" + this.f397483c + ')';
    }
}
