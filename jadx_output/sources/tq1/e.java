package tq1;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f421216d = 0;

    public e(tq1.f fVar, tq1.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f421216d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f421216d;
        this.f421216d = i17 + 1;
        if (i17 == 0) {
            return tq1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
