package kn4;

/* loaded from: classes6.dex */
public class e implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f309683d = 0;

    public e(kn4.f fVar, kn4.d dVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f309683d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f309683d;
        this.f309683d = i17 + 1;
        if (i17 == 0) {
            return kn4.u.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
