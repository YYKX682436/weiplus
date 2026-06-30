package pm4;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f356878d = 0;

    public c(pm4.d dVar, pm4.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f356878d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f356878d;
        this.f356878d = i17 + 1;
        if (i17 == 0) {
            return om4.o.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
