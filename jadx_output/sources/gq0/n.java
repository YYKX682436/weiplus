package gq0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f274485d = 0;

    public n(gq0.o oVar, gq0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f274485d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f274485d;
        this.f274485d = i17 + 1;
        if (i17 == 0) {
            return uq0.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
