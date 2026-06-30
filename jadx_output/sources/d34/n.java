package d34;

/* loaded from: classes.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f226325d = 0;

    public n(d34.o oVar, d34.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f226325d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f226325d;
        this.f226325d = i17 + 1;
        if (i17 == 0) {
            return d34.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
