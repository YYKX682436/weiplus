package q26;

/* loaded from: classes14.dex */
public final class m0 implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f359872d;

    /* renamed from: e, reason: collision with root package name */
    public int f359873e = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f359874f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q26.n0 f359875g;

    public m0(q26.n0 n0Var) {
        this.f359875g = n0Var;
        this.f359872d = n0Var.f359876a.iterator();
    }

    public final void b() {
        java.util.Iterator it = this.f359872d;
        if (it.hasNext()) {
            java.lang.Object next = it.next();
            if (((java.lang.Boolean) this.f359875g.f359877b.invoke(next)).booleanValue()) {
                this.f359873e = 1;
                this.f359874f = next;
                return;
            }
        }
        this.f359873e = 0;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f359873e == -1) {
            b();
        }
        return this.f359873e == 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (this.f359873e == -1) {
            b();
        }
        if (this.f359873e == 0) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = this.f359874f;
        this.f359874f = null;
        this.f359873e = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
