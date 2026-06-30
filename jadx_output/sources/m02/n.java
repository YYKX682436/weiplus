package m02;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f322547d = 0;

    public n(m02.o oVar, m02.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f322547d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f322547d;
        this.f322547d = i17 + 1;
        if (i17 == 0) {
            return l02.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
