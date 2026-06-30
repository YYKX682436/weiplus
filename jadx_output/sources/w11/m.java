package w11;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f442084d = 0;

    public m(w11.n nVar, w11.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f442084d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f442084d;
        this.f442084d = i17 + 1;
        if (i17 == 0) {
            return w11.l1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
