package wj0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f446558d = 0;

    public f(wj0.g gVar, wj0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f446558d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f446558d;
        this.f446558d = i17 + 1;
        if (i17 == 0) {
            return wj0.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
