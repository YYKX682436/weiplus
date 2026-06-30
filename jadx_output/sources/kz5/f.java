package kz5;

/* loaded from: classes5.dex */
public class f extends kz5.e implements java.util.ListIterator {

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ kz5.h f313966f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(kz5.h hVar, int i17) {
        super(hVar);
        this.f313966f = hVar;
        int d17 = hVar.d();
        if (i17 >= 0 && i17 <= d17) {
            this.f313964d = i17;
            return;
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + d17);
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f313964d > 0;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f313964d;
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i17 = this.f313964d - 1;
        this.f313964d = i17;
        return this.f313966f.get(i17);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f313964d - 1;
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
