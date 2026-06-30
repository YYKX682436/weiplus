package nu2;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f340176d = 0;

    public b(nu2.c cVar, nu2.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f340176d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f340176d;
        this.f340176d = i17 + 1;
        if (i17 == 0) {
            return nu2.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
