package yf4;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f461828d = 0;

    public b(yf4.c cVar, yf4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f461828d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f461828d;
        this.f461828d = i17 + 1;
        if (i17 == 0) {
            return yf4.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
