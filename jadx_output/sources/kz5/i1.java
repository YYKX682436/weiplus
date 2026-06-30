package kz5;

/* loaded from: classes14.dex */
public final class i1 implements java.util.ListIterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ListIterator f313977d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kz5.j1 f313978e;

    public i1(kz5.j1 j1Var, int i17) {
        this.f313978e = j1Var;
        this.f313977d = j1Var.f313979d.listIterator(kz5.i0.G(j1Var, i17));
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        java.util.ListIterator listIterator = this.f313977d;
        listIterator.add(obj);
        listIterator.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f313977d.hasPrevious();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f313977d.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        return this.f313977d.previous();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return kz5.c0.h(this.f313978e) - this.f313977d.previousIndex();
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        return this.f313977d.next();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return kz5.c0.h(this.f313978e) - this.f313977d.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        this.f313977d.remove();
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        this.f313977d.set(obj);
    }
}
