package tp1;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f421077d = 0;

    public n(tp1.o oVar, tp1.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f421077d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f421077d;
        this.f421077d = i17 + 1;
        if (i17 == 0) {
            return tp1.p1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
