package q26;

/* loaded from: classes14.dex */
public final class d implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f359833d;

    /* renamed from: e, reason: collision with root package name */
    public int f359834e;

    public d(q26.e eVar) {
        this.f359833d = eVar.f359836a.iterator();
        this.f359834e = eVar.f359837b;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        java.util.Iterator it;
        while (true) {
            int i17 = this.f359834e;
            it = this.f359833d;
            if (i17 <= 0 || !it.hasNext()) {
                break;
            }
            it.next();
            this.f359834e--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        java.util.Iterator it;
        while (true) {
            int i17 = this.f359834e;
            it = this.f359833d;
            if (i17 <= 0 || !it.hasNext()) {
                break;
            }
            it.next();
            this.f359834e--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
