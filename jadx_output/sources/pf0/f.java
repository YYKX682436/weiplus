package pf0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f353759d = 0;

    public f(pf0.g gVar, pf0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f353759d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f353759d;
        this.f353759d = i17 + 1;
        if (i17 == 0) {
            return kn4.e0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
