package x0;

/* loaded from: classes13.dex */
public final class b1 implements java.util.ListIterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.f0 f450865d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ x0.c1 f450866e;

    public b1(kotlin.jvm.internal.f0 f0Var, x0.c1 c1Var) {
        this.f450865d = f0Var;
        this.f450866e = c1Var;
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        java.lang.Object obj2 = x0.j0.f450899a;
        throw new java.lang.IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f450865d.f310116d < this.f450866e.f450872g - 1;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f450865d.f310116d >= 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        kotlin.jvm.internal.f0 f0Var = this.f450865d;
        int i17 = f0Var.f310116d + 1;
        x0.c1 c1Var = this.f450866e;
        x0.j0.a(i17, c1Var.f450872g);
        f0Var.f310116d = i17;
        return c1Var.get(i17);
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f450865d.f310116d + 1;
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        kotlin.jvm.internal.f0 f0Var = this.f450865d;
        int i17 = f0Var.f310116d;
        x0.c1 c1Var = this.f450866e;
        x0.j0.a(i17, c1Var.f450872g);
        f0Var.f310116d = i17 - 1;
        return c1Var.get(i17);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f450865d.f310116d;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        java.lang.Object obj = x0.j0.f450899a;
        throw new java.lang.IllegalStateException("Cannot modify a state list through an iterator".toString());
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        java.lang.Object obj2 = x0.j0.f450899a;
        throw new java.lang.IllegalStateException("Cannot modify a state list through an iterator".toString());
    }
}
