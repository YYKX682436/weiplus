package nq0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f338927d = 0;

    public f(nq0.g gVar, nq0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f338927d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f338927d;
        this.f338927d = i17 + 1;
        if (i17 == 0) {
            return nq0.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
