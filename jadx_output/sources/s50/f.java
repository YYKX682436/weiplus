package s50;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f403045d = 0;

    public f(s50.g gVar, s50.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f403045d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f403045d;
        this.f403045d = i17 + 1;
        if (i17 == 0) {
            return s50.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
