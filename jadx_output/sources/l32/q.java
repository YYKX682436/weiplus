package l32;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f315417d = 0;

    public q(l32.r rVar, l32.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f315417d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f315417d;
        this.f315417d = i17 + 1;
        if (i17 == 0) {
            return l32.y.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
