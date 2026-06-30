package p16;

/* loaded from: classes14.dex */
public class y0 implements java.util.ListIterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.ListIterator f351370d;

    public y0(p16.a1 a1Var, int i17) {
        this.f351370d = a1Var.f351269d.listIterator(i17);
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f351370d.hasNext();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f351370d.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        return (java.lang.String) this.f351370d.next();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f351370d.nextIndex();
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        return (java.lang.String) this.f351370d.previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f351370d.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException();
    }
}
