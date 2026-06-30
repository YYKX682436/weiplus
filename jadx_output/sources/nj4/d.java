package nj4;

/* loaded from: classes11.dex */
public final class d extends nj4.e {

    /* renamed from: e, reason: collision with root package name */
    public boolean f337934e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f337935f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(nj4.e groupData) {
        super(groupData.f337936d);
        kotlin.jvm.internal.o.g(groupData, "groupData");
        this.f337935f = this.f337936d.f5134a;
    }

    @Override // nj4.e, nj4.i, xm3.a
    public java.lang.Object clone() {
        return super.clone();
    }

    @Override // nj4.e, java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(java.lang.Object obj) {
        compareTo((nj4.i) obj);
        return 0;
    }

    @Override // nj4.e, xm3.a, in5.c
    public int h() {
        return 5;
    }

    @Override // nj4.e
    /* renamed from: n */
    public int compareTo(nj4.i other) {
        kotlin.jvm.internal.o.g(other, "other");
        return 0;
    }

    @Override // nj4.e, xm3.d
    /* renamed from: o */
    public boolean X(nj4.i other) {
        kotlin.jvm.internal.o.g(other, "other");
        return (other instanceof nj4.d) && kotlin.jvm.internal.o.b(((nj4.d) other).f337936d.f5134a, this.f337936d.f5134a);
    }

    @Override // nj4.e, xm3.d
    public java.lang.String v() {
        return this.f337935f;
    }
}
