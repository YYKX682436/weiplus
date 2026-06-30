package dk5;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f234598d = 0;

    public e(dk5.f fVar, dk5.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f234598d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f234598d;
        this.f234598d = i17 + 1;
        if (i17 == 0) {
            return dk5.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
