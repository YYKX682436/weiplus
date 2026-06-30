package h80;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f279516d = 0;

    public f(h80.g gVar, h80.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f279516d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f279516d;
        this.f279516d = i17 + 1;
        if (i17 == 0) {
            return h80.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
