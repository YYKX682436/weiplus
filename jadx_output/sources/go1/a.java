package go1;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f273918a;

    /* renamed from: b, reason: collision with root package name */
    public final long f273919b;

    /* renamed from: c, reason: collision with root package name */
    public final long f273920c;

    /* renamed from: d, reason: collision with root package name */
    public final long f273921d;

    /* renamed from: e, reason: collision with root package name */
    public final long f273922e;

    public a(java.lang.String talker, long j17, long j18, long j19, long j27) {
        kotlin.jvm.internal.o.g(talker, "talker");
        this.f273918a = talker;
        this.f273919b = j17;
        this.f273920c = j18;
        this.f273921d = j19;
        this.f273922e = j27;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof go1.a)) {
            return false;
        }
        go1.a aVar = (go1.a) obj;
        return kotlin.jvm.internal.o.b(this.f273918a, aVar.f273918a) && this.f273919b == aVar.f273919b && this.f273920c == aVar.f273920c && this.f273921d == aVar.f273921d && this.f273922e == aVar.f273922e;
    }

    public int hashCode() {
        return (((((((this.f273918a.hashCode() * 31) + java.lang.Long.hashCode(this.f273919b)) * 31) + java.lang.Long.hashCode(this.f273920c)) * 31) + java.lang.Long.hashCode(this.f273921d)) * 31) + java.lang.Long.hashCode(this.f273922e);
    }

    public java.lang.String toString() {
        return "ConvInfo(talker=" + this.f273918a + ", startTime=" + this.f273919b + ", endTime=" + this.f273920c + ", estimatedSize=" + this.f273921d + ", fullDiffOff=" + this.f273922e + ')';
    }
}
