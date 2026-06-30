package o0;

/* loaded from: classes5.dex */
public final class h implements java.util.ListIterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f341848d;

    /* renamed from: e, reason: collision with root package name */
    public int f341849e;

    public h(java.util.List list, int i17) {
        kotlin.jvm.internal.o.g(list, "list");
        this.f341848d = list;
        this.f341849e = i17;
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        this.f341848d.add(this.f341849e, obj);
        this.f341849e++;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f341849e < this.f341848d.size();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f341849e > 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f341849e;
        this.f341849e = i17 + 1;
        return this.f341848d.get(i17);
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f341849e;
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        int i17 = this.f341849e - 1;
        this.f341849e = i17;
        return this.f341848d.get(i17);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f341849e - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        int i17 = this.f341849e - 1;
        this.f341849e = i17;
        this.f341848d.remove(i17);
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        this.f341848d.set(this.f341849e, obj);
    }
}
