package q26;

/* loaded from: classes10.dex */
public final class l implements java.util.Iterator, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f359865d;

    /* renamed from: e, reason: collision with root package name */
    public int f359866e = -2;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q26.m f359867f;

    public l(q26.m mVar) {
        this.f359867f = mVar;
    }

    public final void b() {
        java.lang.Object invoke;
        int i17 = this.f359866e;
        q26.m mVar = this.f359867f;
        if (i17 == -2) {
            invoke = mVar.f359870a.invoke();
        } else {
            yz5.l lVar = mVar.f359871b;
            java.lang.Object obj = this.f359865d;
            kotlin.jvm.internal.o.d(obj);
            invoke = lVar.invoke(obj);
        }
        this.f359865d = invoke;
        this.f359866e = invoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f359866e < 0) {
            b();
        }
        return this.f359866e == 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        if (this.f359866e < 0) {
            b();
        }
        if (this.f359866e == 0) {
            throw new java.util.NoSuchElementException();
        }
        java.lang.Object obj = this.f359865d;
        kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
        this.f359866e = -1;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
