package fe0;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f261413d = 0;

    public k(fe0.l lVar, fe0.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f261413d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f261413d;
        this.f261413d = i17 + 1;
        if (i17 == 0) {
            return ee0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
