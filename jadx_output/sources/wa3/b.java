package wa3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f444188d = 0;

    public b(wa3.c cVar, wa3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f444188d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f444188d;
        this.f444188d = i17 + 1;
        if (i17 == 0) {
            return wa3.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
