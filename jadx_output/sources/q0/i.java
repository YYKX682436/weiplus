package q0;

/* loaded from: classes14.dex */
public final class i extends q0.a {

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.Object[] f359234f;

    /* renamed from: g, reason: collision with root package name */
    public final q0.m f359235g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(java.lang.Object[] root, java.lang.Object[] tail, int i17, int i18, int i19) {
        super(i17, i18);
        kotlin.jvm.internal.o.g(root, "root");
        kotlin.jvm.internal.o.g(tail, "tail");
        this.f359234f = tail;
        int i27 = (i18 - 1) & (-32);
        this.f359235g = new q0.m(root, i17 > i27 ? i27 : i17, i27, i19);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public java.lang.Object next() {
        if (!hasNext()) {
            throw new java.util.NoSuchElementException();
        }
        q0.m mVar = this.f359235g;
        if (mVar.hasNext()) {
            this.f359216d++;
            return mVar.next();
        }
        int i17 = this.f359216d;
        this.f359216d = i17 + 1;
        return this.f359234f[i17 - mVar.f359217e];
    }

    @Override // java.util.ListIterator
    public java.lang.Object previous() {
        if (!hasPrevious()) {
            throw new java.util.NoSuchElementException();
        }
        int i17 = this.f359216d;
        q0.m mVar = this.f359235g;
        int i18 = mVar.f359217e;
        if (i17 <= i18) {
            this.f359216d = i17 - 1;
            return mVar.previous();
        }
        int i19 = i17 - 1;
        this.f359216d = i19;
        return this.f359234f[i19 - i18];
    }
}
