package vh4;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f437094d = 0;

    public k(vh4.l lVar, vh4.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f437094d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f437094d;
        this.f437094d = i17 + 1;
        if (i17 == 0) {
            return vh4.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
