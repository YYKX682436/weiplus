package dd5;

/* loaded from: classes8.dex */
public final class b1 implements uc5.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final zy2.a5 f229091a;

    /* renamed from: b, reason: collision with root package name */
    public final long f229092b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f229093c;

    public b1(zy2.a5 snapshot, long j17, java.lang.String talker) {
        kotlin.jvm.internal.o.g(snapshot, "snapshot");
        kotlin.jvm.internal.o.g(talker, "talker");
        this.f229091a = snapshot;
        this.f229092b = j17;
        this.f229093c = talker;
    }

    @Override // uc5.r0
    public java.util.List a() {
        return this.f229091a.f477349c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dd5.b1)) {
            return false;
        }
        dd5.b1 b1Var = (dd5.b1) obj;
        return kotlin.jvm.internal.o.b(this.f229091a, b1Var.f229091a) && this.f229092b == b1Var.f229092b && kotlin.jvm.internal.o.b(this.f229093c, b1Var.f229093c);
    }

    public int hashCode() {
        return (((this.f229091a.hashCode() * 31) + java.lang.Long.hashCode(this.f229092b)) * 31) + this.f229093c.hashCode();
    }

    public java.lang.String toString() {
        return "ViewModel(snapshot=" + this.f229091a + ", msgId=" + this.f229092b + ", talker=" + this.f229093c + ')';
    }
}
