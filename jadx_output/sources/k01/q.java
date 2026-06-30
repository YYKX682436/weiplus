package k01;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f303049d = 0;

    public q(k01.r rVar, k01.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f303049d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f303049d;
        this.f303049d = i17 + 1;
        if (i17 == 0) {
            return k01.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
