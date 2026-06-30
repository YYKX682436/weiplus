package w90;

/* loaded from: classes.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f444052d = 0;

    public b(w90.c cVar, w90.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f444052d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f444052d;
        this.f444052d = i17 + 1;
        if (i17 == 0) {
            return w90.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
