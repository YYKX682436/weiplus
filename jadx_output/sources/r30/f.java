package r30;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f368940d = 0;

    public f(r30.g gVar, r30.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f368940d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f368940d;
        this.f368940d = i17 + 1;
        if (i17 == 0) {
            return q30.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
