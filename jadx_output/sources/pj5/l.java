package pj5;

/* loaded from: classes9.dex */
public final class l extends xm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final r45.lo5 f355387d;

    public l(r45.lo5 remind) {
        kotlin.jvm.internal.o.g(remind, "remind");
        this.f355387d = remind;
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        pj5.l other = (pj5.l) obj;
        kotlin.jvm.internal.o.g(other, "other");
        r45.lo5 lo5Var = this.f355387d;
        java.lang.String str = lo5Var.f379675d;
        r45.lo5 lo5Var2 = other.f355387d;
        return kotlin.jvm.internal.o.b(str, lo5Var2.f379675d) && lo5Var.f379677f == lo5Var2.f379677f;
    }

    @Override // xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        pj5.l other = (pj5.l) obj;
        kotlin.jvm.internal.o.g(other, "other");
        return this.f355387d.f379677f - other.f355387d.f379677f;
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.String RemindId = this.f355387d.f379675d;
        kotlin.jvm.internal.o.f(RemindId, "RemindId");
        return RemindId;
    }
}
