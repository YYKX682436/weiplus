package pm5;

/* loaded from: classes12.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f356892d;

    /* renamed from: e, reason: collision with root package name */
    public final pm5.a f356893e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Iterator f356894f = java.util.Collections.emptyList().iterator();

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f356895g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f356896h;

    public c(java.util.Iterator it, pm5.a aVar) {
        this.f356892d = it;
        this.f356893e = aVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f356896h) {
            return true;
        }
        if (this.f356894f == null) {
            return false;
        }
        while (!this.f356894f.hasNext()) {
            this.f356895g = null;
            this.f356894f = null;
            java.util.Iterator it = this.f356892d;
            if (!it.hasNext()) {
                return false;
            }
            java.lang.Iterable a17 = this.f356893e.a(it.next());
            this.f356894f = a17 != null ? a17.iterator() : java.util.Collections.emptyList().iterator();
        }
        this.f356895g = this.f356894f.next();
        this.f356896h = true;
        return true;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!this.f356896h && !hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = this.f356895g;
        this.f356895g = null;
        this.f356896h = false;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("remove");
    }
}
