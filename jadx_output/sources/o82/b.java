package o82;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343640d = 0;

    public b(o82.c cVar, o82.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343640d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343640d;
        this.f343640d = i17 + 1;
        if (i17 == 0) {
            return o82.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
