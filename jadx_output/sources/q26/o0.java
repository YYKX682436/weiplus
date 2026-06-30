package q26;

/* loaded from: classes8.dex */
public final class o0 implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f359882d;

    /* renamed from: e, reason: collision with root package name */
    public int f359883e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q26.p0 f359884f;

    public o0(q26.p0 p0Var) {
        this.f359884f = p0Var;
        this.f359882d = p0Var.f359885a.iterator();
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f359882d.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        yz5.p pVar = this.f359884f.f359886b;
        int i17 = this.f359883e;
        this.f359883e = i17 + 1;
        if (i17 >= 0) {
            return pVar.invoke(java.lang.Integer.valueOf(i17), this.f359882d.next());
        }
        kz5.c0.p();
        throw null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
