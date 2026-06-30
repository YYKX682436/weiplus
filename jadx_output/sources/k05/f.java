package k05;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f303150d = 0;

    public f(k05.g gVar, k05.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f303150d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f303150d;
        this.f303150d = i17 + 1;
        if (i17 == 0) {
            return k05.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
