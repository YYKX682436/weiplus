package vc;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f434879d = 0;

    public n(vc.o oVar, vc.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f434879d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f434879d;
        this.f434879d = i17 + 1;
        if (i17 == 0) {
            return vc.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
