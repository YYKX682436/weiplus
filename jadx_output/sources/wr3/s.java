package wr3;

/* loaded from: classes11.dex */
public final class s extends wr3.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final wr3.n0 f448874a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.s5 f448875b;

    /* renamed from: c, reason: collision with root package name */
    public final int f448876c;

    public s(wr3.n0 status, r45.s5 message, int i17) {
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(message, "message");
        this.f448874a = status;
        this.f448875b = message;
        this.f448876c = i17;
    }

    @Override // wr3.c0
    public int a() {
        return this.f448876c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr3.s)) {
            return false;
        }
        wr3.s sVar = (wr3.s) obj;
        return this.f448874a == sVar.f448874a && kotlin.jvm.internal.o.b(this.f448875b, sVar.f448875b) && this.f448876c == sVar.f448876c;
    }

    public int hashCode() {
        return (((this.f448874a.hashCode() * 31) + this.f448875b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f448876c);
    }

    public java.lang.String toString() {
        return "AudioDataItem(status=" + this.f448874a + ", message=" + this.f448875b + ", viewType=" + this.f448876c + ')';
    }
}
