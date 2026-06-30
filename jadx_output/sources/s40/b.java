package s40;

/* loaded from: classes6.dex */
public class b implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f402890d = 0;

    public b(s40.c cVar, s40.a aVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f402890d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f402890d;
        this.f402890d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.finder.live.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
