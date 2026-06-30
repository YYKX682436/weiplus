package yv;

/* loaded from: classes.dex */
public class r implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f465947d = 0;

    public r(yv.s sVar, yv.q qVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f465947d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f465947d;
        this.f465947d = i17 + 1;
        if (i17 == 0) {
            return yv.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
