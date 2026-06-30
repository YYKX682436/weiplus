package oo1;

/* loaded from: classes5.dex */
public final class b implements oo1.h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f347122a;

    /* renamed from: b, reason: collision with root package name */
    public long f347123b;

    /* renamed from: c, reason: collision with root package name */
    public long f347124c;

    /* renamed from: d, reason: collision with root package name */
    public long f347125d;

    /* renamed from: e, reason: collision with root package name */
    public long f347126e;

    public b(java.lang.String talker, long j17, long j18, long j19, long j27) {
        kotlin.jvm.internal.o.g(talker, "talker");
        this.f347122a = talker;
        this.f347123b = j17;
        this.f347124c = j18;
        this.f347125d = j19;
        this.f347126e = j27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oo1.b)) {
            return false;
        }
        oo1.b bVar = (oo1.b) obj;
        return kotlin.jvm.internal.o.b(this.f347122a, bVar.f347122a) && this.f347123b == bVar.f347123b && this.f347124c == bVar.f347124c && this.f347125d == bVar.f347125d && this.f347126e == bVar.f347126e;
    }

    public int hashCode() {
        return (((((((this.f347122a.hashCode() * 31) + java.lang.Long.hashCode(this.f347123b)) * 31) + java.lang.Long.hashCode(this.f347124c)) * 31) + java.lang.Long.hashCode(this.f347125d)) * 31) + java.lang.Long.hashCode(this.f347126e);
    }

    public java.lang.String toString() {
        return "RoamConvInfo(talker=" + this.f347122a + ", msgCount=" + this.f347123b + ", msgSize=" + this.f347124c + ", mediaSize=" + this.f347125d + ", lastCreateTime=" + this.f347126e + ')';
    }
}
