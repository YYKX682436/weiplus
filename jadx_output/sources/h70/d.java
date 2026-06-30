package h70;

/* loaded from: classes6.dex */
public class d implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f279376d = 0;

    public d(h70.e eVar, h70.c cVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f279376d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f279376d;
        this.f279376d = i17 + 1;
        if (i17 == 0) {
            return h70.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
