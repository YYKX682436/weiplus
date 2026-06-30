package ev;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f256828d = 0;

    public b(ev.c cVar, ev.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f256828d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f256828d;
        this.f256828d = i17 + 1;
        if (i17 == 0) {
            return ev.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
