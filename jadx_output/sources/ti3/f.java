package ti3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f419585d = 0;

    public f(ti3.g gVar, ti3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f419585d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f419585d;
        this.f419585d = i17 + 1;
        if (i17 == 0) {
            return ti3.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
