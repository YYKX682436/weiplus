package xs;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f456248d = 0;

    public f(xs.g gVar, xs.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f456248d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f456248d;
        this.f456248d = i17 + 1;
        if (i17 == 0) {
            return vm.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
