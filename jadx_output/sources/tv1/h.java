package tv1;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f422259d = 0;

    public h(tv1.i iVar, tv1.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f422259d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f422259d;
        this.f422259d = i17 + 1;
        if (i17 == 0) {
            return tv1.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
