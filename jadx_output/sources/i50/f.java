package i50;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f288454d = 0;

    public f(i50.g gVar, i50.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f288454d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f288454d;
        this.f288454d = i17 + 1;
        if (i17 == 0) {
            return h13.d0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
