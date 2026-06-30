package u1;

/* loaded from: classes13.dex */
public final class q implements java.util.ListIterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f423658d;

    /* renamed from: e, reason: collision with root package name */
    public final int f423659e;

    /* renamed from: f, reason: collision with root package name */
    public final int f423660f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u1.s f423661g;

    public q(u1.s sVar, int i17, int i18, int i19, int i27, kotlin.jvm.internal.i iVar) {
        this(sVar, (i27 & 1) != 0 ? 0 : i17, (i27 & 2) != 0 ? 0 : i18, (i27 & 4) != 0 ? sVar.f423668g : i19);
    }

    @Override // java.util.ListIterator
    public void add(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f423658d < this.f423660f;
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f423658d > this.f423659e;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        java.lang.Object[] objArr = this.f423661g.f423665d;
        int i17 = this.f423658d;
        this.f423658d = i17 + 1;
        return objArr[i17];
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f423658d - this.f423659e;
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        java.lang.Object[] objArr = this.f423661g.f423665d;
        int i17 = this.f423658d - 1;
        this.f423658d = i17;
        return objArr[i17];
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return (this.f423658d - this.f423659e) - 1;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public void set(java.lang.Object obj) {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public q(u1.s sVar, int i17, int i18, int i19) {
        this.f423661g = sVar;
        this.f423658d = i17;
        this.f423659e = i18;
        this.f423660f = i19;
    }
}
