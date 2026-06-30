package n0;

/* loaded from: classes14.dex */
public final class q1 implements java.lang.Iterable, java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final n0.k4 f333682d;

    /* renamed from: e, reason: collision with root package name */
    public final int f333683e;

    /* renamed from: f, reason: collision with root package name */
    public int f333684f;

    public q1(n0.k4 table, int i17) {
        kotlin.jvm.internal.o.g(table, "table");
        this.f333682d = table;
        int b17 = n0.l4.b(table.f333590d, i17);
        int i18 = i17 + 1;
        this.f333683e = i18 < table.f333591e ? n0.l4.b(table.f333590d, i18) : table.f333593g;
        this.f333684f = b17;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f333684f < this.f333683e;
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return this;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        java.lang.Object obj;
        int i17 = this.f333684f;
        if (i17 >= 0) {
            java.lang.Object[] objArr = this.f333682d.f333592f;
            if (i17 < objArr.length) {
                obj = objArr[i17];
                this.f333684f = i17 + 1;
                return obj;
            }
        }
        obj = null;
        this.f333684f = i17 + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
