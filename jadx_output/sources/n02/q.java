package n02;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f333899d = 0;

    public q(n02.r rVar, n02.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f333899d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f333899d;
        this.f333899d = i17 + 1;
        if (i17 == 0) {
            return n02.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
