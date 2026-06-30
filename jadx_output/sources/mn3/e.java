package mn3;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f330177d = 0;

    public e(mn3.f fVar, mn3.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f330177d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f330177d;
        this.f330177d = i17 + 1;
        if (i17 == 0) {
            return mn3.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
