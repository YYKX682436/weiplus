package mx3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f332547d = 0;

    public f(mx3.g gVar, mx3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f332547d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f332547d;
        this.f332547d = i17 + 1;
        if (i17 == 0) {
            return mx3.w.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
