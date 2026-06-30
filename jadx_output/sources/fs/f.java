package fs;

/* loaded from: classes12.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Iterator f266075d;

    /* renamed from: e, reason: collision with root package name */
    public final fs.d f266076e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f266077f = null;

    public f(java.util.Iterator it, fs.d dVar) {
        this.f266075d = it;
        this.f266076e = dVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        java.lang.Object next;
        if (this.f266077f != null) {
            return true;
        }
        do {
            java.util.Iterator it = this.f266075d;
            if (!it.hasNext()) {
                return false;
            }
            next = it.next();
        } while (!this.f266076e.a(next));
        this.f266077f = next;
        return true;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = this.f266077f;
        this.f266077f = null;
        return obj;
    }
}
