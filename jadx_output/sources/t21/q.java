package t21;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f414882d = 0;

    public q(t21.r rVar, t21.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f414882d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f414882d;
        this.f414882d = i17 + 1;
        if (i17 == 0) {
            return t21.k2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
