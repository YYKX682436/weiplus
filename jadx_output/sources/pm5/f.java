package pm5;

/* loaded from: classes12.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f356899d;

    /* renamed from: e, reason: collision with root package name */
    public final pm5.d f356900e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f356901f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f356902g;

    public f(java.util.Iterator it, pm5.d dVar) {
        this.f356899d = it;
        this.f356900e = dVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        java.lang.Object next;
        if (this.f356902g) {
            return true;
        }
        do {
            java.util.Iterator it = this.f356899d;
            if (!it.hasNext()) {
                return false;
            }
            next = it.next();
        } while (this.f356900e.b(next));
        this.f356901f = next;
        this.f356902g = true;
        return true;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!this.f356902g && !hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = this.f356901f;
        this.f356901f = null;
        this.f356902g = false;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("remove");
    }
}
