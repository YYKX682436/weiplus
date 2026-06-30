package n0;

/* loaded from: classes14.dex */
public final class n4 implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f333626d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f333627e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.o4 f333628f;

    public n4(int i17, int i18, n0.o4 o4Var) {
        this.f333627e = i18;
        this.f333628f = o4Var;
        this.f333626d = i17;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f333626d < this.f333627e;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            return null;
        }
        n0.o4 o4Var = this.f333628f;
        java.lang.Object[] objArr = o4Var.f333645c;
        int i17 = this.f333626d;
        this.f333626d = i17 + 1;
        return objArr[o4Var.g(i17)];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
