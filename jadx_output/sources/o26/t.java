package o26;

/* loaded from: classes12.dex */
public final class t implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.Object f342612d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f342613e = true;

    public t(java.lang.Object obj) {
        this.f342612d = obj;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342613e;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!this.f342613e) {
            throw new java.util.NoSuchElementException();
        }
        this.f342613e = false;
        return this.f342612d;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException();
    }
}
