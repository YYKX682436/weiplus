package ni3;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f337542d = 0;

    public c(ni3.d dVar, ni3.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f337542d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f337542d;
        this.f337542d = i17 + 1;
        if (i17 == 0) {
            return ni3.i1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
