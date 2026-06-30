package ti0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f419533d = 0;

    public f(ti0.g gVar, ti0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f419533d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f419533d;
        this.f419533d = i17 + 1;
        if (i17 == 0) {
            return ti0.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
