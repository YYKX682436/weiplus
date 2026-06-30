package h50;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f279005d = 0;

    public f(h50.g gVar, h50.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f279005d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f279005d;
        this.f279005d = i17 + 1;
        if (i17 == 0) {
            return h50.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
