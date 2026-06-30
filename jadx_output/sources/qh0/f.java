package qh0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f363395d = 0;

    public f(qh0.g gVar, qh0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f363395d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f363395d;
        this.f363395d = i17 + 1;
        if (i17 == 0) {
            return qh0.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
