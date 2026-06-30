package yb1;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f460649d = 0;

    public c(yb1.d dVar, yb1.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f460649d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f460649d;
        this.f460649d = i17 + 1;
        if (i17 == 0) {
            return yb1.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
