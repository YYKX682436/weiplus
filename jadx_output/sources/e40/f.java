package e40;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f247616d = 0;

    public f(e40.g gVar, e40.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f247616d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f247616d;
        this.f247616d = i17 + 1;
        if (i17 == 0) {
            return d40.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
