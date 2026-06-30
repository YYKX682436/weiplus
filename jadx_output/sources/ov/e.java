package ov;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f349074d = 0;

    public e(ov.f fVar, ov.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f349074d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f349074d;
        this.f349074d = i17 + 1;
        if (i17 == 0) {
            return ov.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
