package yg3;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f462321d = 0;

    public b(yg3.c cVar, yg3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f462321d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f462321d;
        this.f462321d = i17 + 1;
        if (i17 == 0) {
            return yg3.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
