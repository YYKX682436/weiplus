package m40;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f323429d = 0;

    public z(m40.a0 a0Var, m40.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f323429d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f323429d;
        this.f323429d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.finder.live.e5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
