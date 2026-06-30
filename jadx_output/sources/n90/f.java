package n90;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f335788d = 0;

    public f(n90.g gVar, n90.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f335788d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f335788d;
        this.f335788d = i17 + 1;
        if (i17 == 0) {
            return n90.x0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
