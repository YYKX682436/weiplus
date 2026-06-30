package fr1;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f265704d = 0;

    public n(fr1.o oVar, fr1.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f265704d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f265704d;
        this.f265704d = i17 + 1;
        if (i17 == 0) {
            return fr1.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
