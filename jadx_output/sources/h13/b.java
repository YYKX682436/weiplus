package h13;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f278113d = 0;

    public b(h13.c cVar, h13.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f278113d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f278113d;
        this.f278113d = i17 + 1;
        if (i17 == 0) {
            return h13.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
