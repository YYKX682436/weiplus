package in5;

/* loaded from: classes2.dex */
public final class x0 {

    /* renamed from: a, reason: collision with root package name */
    public final in5.c f293158a;

    /* renamed from: b, reason: collision with root package name */
    public final long f293159b;

    /* renamed from: c, reason: collision with root package name */
    public int f293160c;

    public x0(in5.c convertData, long j17) {
        kotlin.jvm.internal.o.g(convertData, "convertData");
        this.f293158a = convertData;
        this.f293159b = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof in5.x0)) {
            return false;
        }
        in5.x0 x0Var = (in5.x0) obj;
        return kotlin.jvm.internal.o.b(this.f293158a, x0Var.f293158a) && this.f293159b == x0Var.f293159b;
    }

    public int hashCode() {
        return (this.f293158a.hashCode() * 31) + java.lang.Long.hashCode(this.f293159b);
    }

    public java.lang.String toString() {
        return "WxRVDataItem(convertData=" + this.f293158a + ", exposeTimestamp=" + this.f293159b + ')';
    }

    public /* synthetic */ x0(in5.c cVar, long j17, int i17, kotlin.jvm.internal.i iVar) {
        this(cVar, (i17 & 2) != 0 ? hq.d.a() : j17);
    }
}
