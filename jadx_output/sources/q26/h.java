package q26;

/* loaded from: classes5.dex */
public final class h implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f359843d;

    /* renamed from: e, reason: collision with root package name */
    public int f359844e = -1;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f359845f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ q26.i f359846g;

    public h(q26.i iVar) {
        this.f359846g = iVar;
        this.f359843d = iVar.f359847a.iterator();
    }

    public final void b() {
        java.lang.Object next;
        q26.i iVar;
        do {
            java.util.Iterator it = this.f359843d;
            if (!it.hasNext()) {
                this.f359844e = 0;
                return;
            } else {
                next = it.next();
                iVar = this.f359846g;
            }
        } while (((java.lang.Boolean) iVar.f359849c.invoke(next)).booleanValue() != iVar.f359848b);
        this.f359845f = next;
        this.f359844e = 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f359844e == -1) {
            b();
        }
        return this.f359844e == 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (this.f359844e == -1) {
            b();
        }
        if (this.f359844e == 0) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = this.f359845f;
        this.f359845f = null;
        this.f359844e = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
