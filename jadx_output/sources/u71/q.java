package u71;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f425109d = 0;

    public q(u71.r rVar, u71.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f425109d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f425109d;
        this.f425109d = i17 + 1;
        if (i17 == 0) {
            return u71.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
