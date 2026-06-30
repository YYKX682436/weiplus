package gh4;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f271917d = 0;

    public d(gh4.e eVar, gh4.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f271917d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f271917d;
        this.f271917d = i17 + 1;
        if (i17 == 0) {
            return gh4.g0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
