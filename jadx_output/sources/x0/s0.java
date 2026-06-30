package x0;

/* loaded from: classes14.dex */
public final class s0 implements java.util.ListIterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final x0.i0 f450944d;

    /* renamed from: e, reason: collision with root package name */
    public int f450945e;

    /* renamed from: f, reason: collision with root package name */
    public int f450946f;

    public s0(x0.i0 list, int i17) {
        kotlin.jvm.internal.o.g(list, "list");
        this.f450944d = list;
        this.f450945e = i17 - 1;
        this.f450946f = list.h();
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        b();
        int i17 = this.f450945e + 1;
        x0.i0 i0Var = this.f450944d;
        i0Var.add(i17, obj);
        this.f450945e++;
        this.f450946f = i0Var.h();
    }

    public final void b() {
        if (this.f450944d.h() != this.f450946f) {
            throw new java.util.ConcurrentModificationException();
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f450945e < this.f450944d.size() - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f450945e >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        b();
        int i17 = this.f450945e + 1;
        x0.i0 i0Var = this.f450944d;
        x0.j0.a(i17, i0Var.size());
        java.lang.Object obj = i0Var.get(i17);
        this.f450945e = i17;
        return obj;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f450945e + 1;
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        b();
        int i17 = this.f450945e;
        x0.i0 i0Var = this.f450944d;
        x0.j0.a(i17, i0Var.size());
        this.f450945e--;
        return i0Var.get(this.f450945e);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f450945e;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        b();
        int i17 = this.f450945e;
        x0.i0 i0Var = this.f450944d;
        i0Var.remove(i17);
        this.f450945e--;
        this.f450946f = i0Var.h();
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        b();
        int i17 = this.f450945e;
        x0.i0 i0Var = this.f450944d;
        i0Var.set(i17, obj);
        this.f450946f = i0Var.h();
    }
}
