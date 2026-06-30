package ct1;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f222224d = 0;

    public e(ct1.f fVar, ct1.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f222224d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f222224d;
        this.f222224d = i17 + 1;
        if (i17 == 0) {
            return bt1.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
