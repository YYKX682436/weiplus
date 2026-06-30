package px;

/* loaded from: classes6.dex */
public class i implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f358751d = 0;

    public i(px.j jVar, px.h hVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f358751d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f358751d;
        this.f358751d = i17 + 1;
        if (i17 == 0) {
            return px.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
