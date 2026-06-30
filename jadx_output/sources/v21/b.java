package v21;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f432787d = 0;

    public b(v21.c cVar, v21.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f432787d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f432787d;
        this.f432787d = i17 + 1;
        if (i17 == 0) {
            return v21.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
