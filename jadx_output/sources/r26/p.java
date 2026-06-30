package r26;

/* loaded from: classes5.dex */
public final class p extends kz5.b implements r26.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r26.q f368908d;

    public p(r26.q qVar) {
        this.f368908d = qVar;
    }

    @Override // kz5.b, java.util.Collection
    public final /* bridge */ boolean contains(java.lang.Object obj) {
        if (obj == null ? true : obj instanceof r26.k) {
            return super.contains((r26.k) obj);
        }
        return false;
    }

    @Override // kz5.b
    public int d() {
        return this.f368908d.f368909a.groupCount() + 1;
    }

    public r26.k e(int i17) {
        r26.q qVar = this.f368908d;
        java.util.regex.Matcher matcher = qVar.f368909a;
        e06.k m17 = e06.p.m(matcher.start(i17), matcher.end(i17));
        if (m17.h().intValue() < 0) {
            return null;
        }
        java.lang.String group = qVar.f368909a.group(i17);
        kotlin.jvm.internal.o.f(group, "group(...)");
        return new r26.k(group, m17);
    }

    @Override // kz5.b, java.util.Collection
    public boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public java.util.Iterator iterator() {
        return new q26.q0((q26.r0) q26.h0.o(kz5.n0.J(kz5.c0.g(this)), new r26.o(this)));
    }
}
