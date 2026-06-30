package wr3;

/* loaded from: classes11.dex */
public final class l extends wr3.c0 {

    /* renamed from: a, reason: collision with root package name */
    public final wr3.n0 f448829a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.s5 f448830b;

    /* renamed from: c, reason: collision with root package name */
    public final int f448831c;

    public l(wr3.n0 status, r45.s5 message, int i17) {
        kotlin.jvm.internal.o.g(status, "status");
        kotlin.jvm.internal.o.g(message, "message");
        this.f448829a = status;
        this.f448830b = message;
        this.f448831c = i17;
    }

    @Override // wr3.c0
    public int a() {
        return this.f448831c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wr3.l)) {
            return false;
        }
        wr3.l lVar = (wr3.l) obj;
        return this.f448829a == lVar.f448829a && kotlin.jvm.internal.o.b(this.f448830b, lVar.f448830b) && this.f448831c == lVar.f448831c;
    }

    public int hashCode() {
        return (((this.f448829a.hashCode() * 31) + this.f448830b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f448831c);
    }

    public java.lang.String toString() {
        return "ArticleItem(status=" + this.f448829a + ", message=" + this.f448830b + ", viewType=" + this.f448831c + ')';
    }
}
