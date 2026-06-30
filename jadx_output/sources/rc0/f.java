package rc0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f393916d = 0;

    public f(rc0.g gVar, rc0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f393916d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f393916d;
        this.f393916d = i17 + 1;
        if (i17 == 0) {
            return rc0.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
