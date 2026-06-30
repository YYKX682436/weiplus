package oh1;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f345260d = 0;

    public n(oh1.o oVar, oh1.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f345260d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f345260d;
        this.f345260d = i17 + 1;
        if (i17 == 0) {
            return oh1.j1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
