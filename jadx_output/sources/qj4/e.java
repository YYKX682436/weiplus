package qj4;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f363908d = 0;

    public e(qj4.f fVar, qj4.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f363908d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f363908d;
        this.f363908d = i17 + 1;
        if (i17 == 0) {
            return qj4.x.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
