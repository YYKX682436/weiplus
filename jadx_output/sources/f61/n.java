package f61;

/* loaded from: classes.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f259839d = 0;

    public n(f61.o oVar, f61.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f259839d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f259839d;
        this.f259839d = i17 + 1;
        if (i17 == 0) {
            return f61.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
