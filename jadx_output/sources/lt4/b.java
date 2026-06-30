package lt4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f321286d = 0;

    public b(lt4.c cVar, lt4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f321286d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f321286d;
        this.f321286d = i17 + 1;
        if (i17 == 0) {
            return lt4.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
