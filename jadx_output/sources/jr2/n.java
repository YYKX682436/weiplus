package jr2;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f301379d = 0;

    public n(jr2.o oVar, jr2.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f301379d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f301379d;
        this.f301379d = i17 + 1;
        if (i17 == 0) {
            return jr2.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
