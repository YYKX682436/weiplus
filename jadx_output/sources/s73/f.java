package s73;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f404180d = 0;

    public f(s73.g gVar, s73.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f404180d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f404180d;
        this.f404180d = i17 + 1;
        if (i17 == 0) {
            return s73.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
