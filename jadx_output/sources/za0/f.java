package za0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f470868d = 0;

    public f(za0.g gVar, za0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f470868d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f470868d;
        this.f470868d = i17 + 1;
        if (i17 == 0) {
            return za0.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
