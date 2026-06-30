package p04;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f350431d = 0;

    public b(p04.c cVar, p04.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f350431d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f350431d;
        this.f350431d = i17 + 1;
        if (i17 == 0) {
            return o04.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
