package d85;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f227245d = 0;

    public u(d85.v vVar, d85.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f227245d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f227245d;
        this.f227245d = i17 + 1;
        if (i17 == 0) {
            return d85.h1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
