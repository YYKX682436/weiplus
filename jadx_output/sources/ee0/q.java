package ee0;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f251509d = 0;

    public q(ee0.r rVar, ee0.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f251509d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f251509d;
        this.f251509d = i17 + 1;
        if (i17 == 0) {
            return ee0.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
