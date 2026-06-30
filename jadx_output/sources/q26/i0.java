package q26;

/* loaded from: classes14.dex */
public final class i0 implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f359850d;

    /* renamed from: e, reason: collision with root package name */
    public int f359851e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q26.j0 f359852f;

    public i0(q26.j0 j0Var) {
        this.f359852f = j0Var;
        this.f359850d = j0Var.f359857a.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        q26.j0 j0Var;
        java.util.Iterator it;
        while (true) {
            int i17 = this.f359851e;
            j0Var = this.f359852f;
            int i18 = j0Var.f359858b;
            it = this.f359850d;
            if (i17 >= i18 || !it.hasNext()) {
                break;
            }
            it.next();
            this.f359851e++;
        }
        return this.f359851e < j0Var.f359859c && it.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        q26.j0 j0Var;
        java.util.Iterator it;
        while (true) {
            int i17 = this.f359851e;
            j0Var = this.f359852f;
            int i18 = j0Var.f359858b;
            it = this.f359850d;
            if (i17 >= i18 || !it.hasNext()) {
                break;
            }
            it.next();
            this.f359851e++;
        }
        int i19 = this.f359851e;
        if (i19 >= j0Var.f359859c) {
            throw new java.util.NoSuchElementException();
        }
        this.f359851e = i19 + 1;
        return it.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
