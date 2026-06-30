package f01;

/* loaded from: classes6.dex */
public class s implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f258386d = 0;

    public s(f01.t tVar, f01.r rVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f258386d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f258386d;
        this.f258386d = i17 + 1;
        if (i17 == 0) {
            return f01.i.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
