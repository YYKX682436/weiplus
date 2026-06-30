package q26;

/* loaded from: classes14.dex */
public final class o extends q26.p implements java.util.Iterator, kotlin.coroutines.Continuation, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public int f359878d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f359879e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.Iterator f359880f;

    /* renamed from: g, reason: collision with root package name */
    public kotlin.coroutines.Continuation f359881g;

    @Override // q26.p
    public java.lang.Object b(java.lang.Object obj, kotlin.coroutines.Continuation frame) {
        this.f359879e = obj;
        this.f359878d = 3;
        this.f359881g = frame;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.jvm.internal.o.g(frame, "frame");
        return aVar;
    }

    public final java.lang.Throwable c() {
        int i17 = this.f359878d;
        if (i17 == 4) {
            return new java.util.NoSuchElementException();
        }
        if (i17 == 5) {
            return new java.lang.IllegalStateException("Iterator has failed.");
        }
        return new java.lang.IllegalStateException("Unexpected state of the iterator: " + this.f359878d);
    }

    @Override // kotlin.coroutines.Continuation
    public oz5.l getContext() {
        return oz5.m.f350329d;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i17 = this.f359878d;
            if (i17 != 0) {
                if (i17 != 1) {
                    if (i17 == 2 || i17 == 3) {
                        return true;
                    }
                    if (i17 == 4) {
                        return false;
                    }
                    throw c();
                }
                java.util.Iterator it = this.f359880f;
                kotlin.jvm.internal.o.d(it);
                if (it.hasNext()) {
                    this.f359878d = 2;
                    return true;
                }
                this.f359880f = null;
            }
            this.f359878d = 5;
            kotlin.coroutines.Continuation continuation = this.f359881g;
            kotlin.jvm.internal.o.d(continuation);
            this.f359881g = null;
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            continuation.resumeWith(kotlin.Result.m521constructorimpl(jz5.f0.f302826a));
        }
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f359878d;
        if (i17 == 0 || i17 == 1) {
            if (hasNext()) {
                return next();
            }
            throw new java.util.NoSuchElementException();
        }
        if (i17 == 2) {
            this.f359878d = 1;
            java.util.Iterator it = this.f359880f;
            kotlin.jvm.internal.o.d(it);
            return it.next();
        }
        if (i17 != 3) {
            throw c();
        }
        this.f359878d = 0;
        java.lang.Object obj = this.f359879e;
        this.f359879e = null;
        return obj;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new java.lang.UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object obj) {
        kotlin.ResultKt.throwOnFailure(obj);
        this.f359878d = 4;
    }
}
