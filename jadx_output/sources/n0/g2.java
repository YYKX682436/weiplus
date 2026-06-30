package n0;

/* loaded from: classes14.dex */
public final class g2 implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final n0.k4 f333511d;

    /* renamed from: e, reason: collision with root package name */
    public final int f333512e;

    /* renamed from: f, reason: collision with root package name */
    public int f333513f;

    /* renamed from: g, reason: collision with root package name */
    public final int f333514g;

    public g2(n0.k4 table, int i17, int i18) {
        kotlin.jvm.internal.o.g(table, "table");
        this.f333511d = table;
        this.f333512e = i18;
        this.f333513f = i17;
        this.f333514g = table.f333596m;
        if (table.f333595i) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    public final void b() {
        if (this.f333511d.f333596m != this.f333514g) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f333513f < this.f333512e;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        b();
        int i17 = this.f333513f;
        this.f333513f = n0.l4.c(this.f333511d.f333590d, i17) + i17;
        return new n0.f2(this, i17);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
