package p16;

/* loaded from: classes14.dex */
public class a1 extends java.util.AbstractList implements java.util.RandomAccess, p16.c0 {

    /* renamed from: d, reason: collision with root package name */
    public final p16.c0 f351269d;

    public a1(p16.c0 c0Var) {
        this.f351269d = c0Var;
    }

    @Override // p16.c0
    public p16.c0 b() {
        return this;
    }

    @Override // p16.c0
    public java.util.List c() {
        return this.f351269d.c();
    }

    @Override // p16.c0
    public p16.g f(int i17) {
        return this.f351269d.f(i17);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.lang.Object get(int i17) {
        return (java.lang.String) this.f351269d.get(i17);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator iterator() {
        return new p16.z0(this);
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator listIterator(int i17) {
        return new p16.y0(this, i17);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f351269d.size();
    }

    @Override // p16.c0
    public void z(p16.g gVar) {
        throw new java.lang.UnsupportedOperationException();
    }
}
