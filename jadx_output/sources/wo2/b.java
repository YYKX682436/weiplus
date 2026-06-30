package wo2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f448064d = 0;

    public b(wo2.c cVar, wo2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f448064d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f448064d;
        this.f448064d = i17 + 1;
        if (i17 == 0) {
            return wo2.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
