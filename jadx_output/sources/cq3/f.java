package cq3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f221449d = 0;

    public f(cq3.g gVar, cq3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f221449d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f221449d;
        this.f221449d = i17 + 1;
        if (i17 == 0) {
            return cq3.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
