package dt3;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f243219d = 0;

    public b(dt3.c cVar, dt3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f243219d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f243219d;
        this.f243219d = i17 + 1;
        if (i17 == 0) {
            return dt3.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
