package f30;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f259263d = 0;

    public e(f30.f fVar, f30.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f259263d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f259263d;
        this.f259263d = i17 + 1;
        if (i17 == 0) {
            return f30.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
