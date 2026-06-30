package i53;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f288570d = 0;

    public f(i53.g gVar, i53.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f288570d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f288570d;
        this.f288570d = i17 + 1;
        if (i17 == 0) {
            return i53.q0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
