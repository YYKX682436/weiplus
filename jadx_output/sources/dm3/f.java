package dm3;

/* loaded from: classes.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f241694d = 0;

    public f(dm3.g gVar, dm3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f241694d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f241694d;
        this.f241694d = i17 + 1;
        if (i17 == 0) {
            return dm3.k0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
