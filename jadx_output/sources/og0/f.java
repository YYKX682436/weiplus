package og0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f345114d = 0;

    public f(og0.g gVar, og0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f345114d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f345114d;
        this.f345114d = i17 + 1;
        if (i17 == 0) {
            return ng0.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
