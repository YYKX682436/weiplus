package tc0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f417114d = 0;

    public f(tc0.g gVar, tc0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f417114d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f417114d;
        this.f417114d = i17 + 1;
        if (i17 == 0) {
            return tc0.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
