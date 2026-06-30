package lt;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f321144d = 0;

    public f(lt.g gVar, lt.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f321144d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f321144d;
        this.f321144d = i17 + 1;
        if (i17 == 0) {
            return c63.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
