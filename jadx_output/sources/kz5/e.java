package kz5;

/* loaded from: classes5.dex */
public class e implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f313964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kz5.h f313965e;

    public e(kz5.h hVar) {
        this.f313965e = hVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f313964d < this.f313965e.d();
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        int i17 = this.f313964d;
        this.f313964d = i17 + 1;
        return this.f313965e.get(i17);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
