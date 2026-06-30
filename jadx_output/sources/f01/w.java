package f01;

/* loaded from: classes.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f258401d = 0;

    public w(f01.x xVar, f01.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f258401d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f258401d;
        this.f258401d = i17 + 1;
        if (i17 == 0) {
            return f01.e1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
