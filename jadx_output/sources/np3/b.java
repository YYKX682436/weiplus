package np3;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f338795d = 0;

    public b(np3.c cVar, np3.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f338795d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f338795d;
        this.f338795d = i17 + 1;
        if (i17 == 0) {
            return np3.k.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
