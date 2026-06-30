package k72;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f304719d = 0;

    public e(k72.f fVar, k72.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f304719d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f304719d;
        this.f304719d = i17 + 1;
        if (i17 == 0) {
            return k72.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
