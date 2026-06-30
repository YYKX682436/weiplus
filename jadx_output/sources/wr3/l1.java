package wr3;

/* loaded from: classes11.dex */
public final class l1 extends wr3.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final wr3.n0 f448834a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.s5 f448835b;

    /* renamed from: c, reason: collision with root package name */
    public final int f448836c;

    public l1(wr3.n0 status, r45.s5 message, int i17) {
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(message, "message");
        this.f448834a = status;
        this.f448835b = message;
        this.f448836c = i17;
    }

    @Override // wr3.c0
    public int a() {
        return this.f448836c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr3.l1)) {
            return false;
        }
        wr3.l1 l1Var = (wr3.l1) obj;
        return this.f448834a == l1Var.f448834a && kotlin.jvm.internal.o.b(this.f448835b, l1Var.f448835b) && this.f448836c == l1Var.f448836c;
    }

    public int hashCode() {
        return (((this.f448834a.hashCode() * 31) + this.f448835b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f448836c);
    }

    public java.lang.String toString() {
        return "PicDataItem(status=" + this.f448834a + ", message=" + this.f448835b + ", viewType=" + this.f448836c + ')';
    }
}
