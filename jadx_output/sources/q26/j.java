package q26;

/* loaded from: classes12.dex */
public final class j implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f359853d;

    /* renamed from: e, reason: collision with root package name */
    public java.util.Iterator f359854e;

    /* renamed from: f, reason: collision with root package name */
    public int f359855f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q26.k f359856g;

    public j(q26.k kVar) {
        this.f359856g = kVar;
        this.f359853d = kVar.f359860a.iterator();
    }

    public final boolean b() {
        java.util.Iterator it;
        java.util.Iterator it6 = this.f359854e;
        if (it6 != null && it6.hasNext()) {
            this.f359855f = 1;
            return true;
        }
        do {
            java.util.Iterator it7 = this.f359853d;
            if (!it7.hasNext()) {
                this.f359855f = 2;
                this.f359854e = null;
                return false;
            }
            java.lang.Object next = it7.next();
            q26.k kVar = this.f359856g;
            it = (java.util.Iterator) kVar.f359862c.invoke(kVar.f359861b.invoke(next));
        } while (!it.hasNext());
        this.f359854e = it;
        this.f359855f = 1;
        return true;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        int i17 = this.f359855f;
        if (i17 == 1) {
            return true;
        }
        if (i17 == 2) {
            return false;
        }
        return b();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359855f;
        if (i17 == 2) {
            throw new java.util.NoSuchElementException();
        }
        if (i17 == 0 && !b()) {
            throw new java.util.NoSuchElementException();
        }
        this.f359855f = 0;
        java.util.Iterator it = this.f359854e;
        kotlin.jvm.internal.o.d(it);
        return it.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
