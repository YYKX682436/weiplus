package i;

/* loaded from: classes16.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f286483d = 0;

    public e(i.f fVar, i.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f286483d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f286483d;
        this.f286483d = i17 + 1;
        if (i17 == 0) {
            return i.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
