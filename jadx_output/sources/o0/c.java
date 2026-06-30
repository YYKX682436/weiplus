package o0;

/* loaded from: classes14.dex */
public final class c implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f341836d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o0.d f341837e;

    public c(o0.d dVar) {
        this.f341837e = dVar;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f341836d < this.f341837e.f341838d;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        java.lang.Object[] objArr = this.f341837e.f341839e;
        int i17 = this.f341836d;
        this.f341836d = i17 + 1;
        java.lang.Object obj = objArr[i17];
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException("null cannot be cast to non-null type T of androidx.compose.runtime.collection.IdentityArraySet");
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
