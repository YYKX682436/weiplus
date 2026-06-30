package ef0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f252204d = 0;

    public f(ef0.g gVar, ef0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f252204d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f252204d;
        this.f252204d = i17 + 1;
        if (i17 == 0) {
            return ef0.v1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
