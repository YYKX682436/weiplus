package w11;

/* loaded from: classes6.dex */
public class q implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f442110d = 0;

    public q(w11.r rVar, w11.p pVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f442110d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f442110d;
        this.f442110d = i17 + 1;
        if (i17 == 0) {
            return w11.y1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
