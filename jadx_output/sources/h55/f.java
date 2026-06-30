package h55;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f279100d = 0;

    public f(h55.g gVar, h55.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f279100d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f279100d;
        this.f279100d = i17 + 1;
        if (i17 == 0) {
            return h55.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
