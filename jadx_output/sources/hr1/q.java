package hr1;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f283362d = 0;

    public q(hr1.r rVar, hr1.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f283362d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f283362d;
        this.f283362d = i17 + 1;
        if (i17 == 0) {
            return hr1.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
