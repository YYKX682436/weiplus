package f50;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f259579d = 0;

    public f(f50.g gVar, f50.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f259579d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f259579d;
        this.f259579d = i17 + 1;
        if (i17 == 0) {
            return e50.b1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
