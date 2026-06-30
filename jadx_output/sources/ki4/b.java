package ki4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f308119d = 0;

    public b(ki4.c cVar, ki4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f308119d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f308119d;
        this.f308119d = i17 + 1;
        if (i17 == 0) {
            return ki4.s.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
