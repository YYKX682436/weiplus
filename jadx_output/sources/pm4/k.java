package pm4;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f356884d = 0;

    public k(pm4.l lVar, pm4.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f356884d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f356884d;
        this.f356884d = i17 + 1;
        if (i17 == 0) {
            return lf0.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
