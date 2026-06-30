package un4;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f429488d = 0;

    public b(un4.c cVar, un4.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f429488d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f429488d;
        this.f429488d = i17 + 1;
        if (i17 == 0) {
            return tn4.q.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
