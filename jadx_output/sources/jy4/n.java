package jy4;

/* loaded from: classes.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f302538d = 0;

    public n(jy4.o oVar, jy4.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f302538d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f302538d;
        this.f302538d = i17 + 1;
        if (i17 == 0) {
            return jy4.c0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
