package cx;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f224446d = 0;

    public n(cx.o oVar, cx.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f224446d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f224446d;
        this.f224446d = i17 + 1;
        if (i17 == 0) {
            return cx.u1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
