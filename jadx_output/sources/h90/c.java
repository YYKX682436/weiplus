package h90;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f279672d = 0;

    public c(h90.d dVar, h90.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f279672d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f279672d;
        this.f279672d = i17 + 1;
        if (i17 == 0) {
            return g90.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
