package tv1;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f422256d = 0;

    public d(tv1.e eVar, tv1.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f422256d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f422256d;
        this.f422256d = i17 + 1;
        if (i17 == 0) {
            return tv1.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
