package fe0;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f261389d = 0;

    public g(fe0.h hVar, fe0.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f261389d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f261389d;
        this.f261389d = i17 + 1;
        if (i17 == 0) {
            return ee0.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
