package q26;

/* loaded from: classes14.dex */
public final class k0 implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f359863d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Iterator f359864e;

    public k0(q26.l0 l0Var) {
        this.f359863d = l0Var.f359869b;
        this.f359864e = l0Var.f359868a.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359863d > 0 && this.f359864e.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359863d;
        if (i17 == 0) {
            throw new java.util.NoSuchElementException();
        }
        this.f359863d = i17 - 1;
        return this.f359864e.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
