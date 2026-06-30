package p05;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f350497d = 0;

    public e(p05.f fVar, p05.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f350497d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f350497d;
        this.f350497d = i17 + 1;
        if (i17 == 0) {
            return p05.l1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
