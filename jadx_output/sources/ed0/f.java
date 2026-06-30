package ed0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f251208d = 0;

    public f(ed0.g gVar, ed0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f251208d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f251208d;
        this.f251208d = i17 + 1;
        if (i17 == 0) {
            return dd0.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
