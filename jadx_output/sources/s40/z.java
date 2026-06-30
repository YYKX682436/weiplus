package s40;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f402919d = 0;

    public z(s40.a0 a0Var, s40.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f402919d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f402919d;
        this.f402919d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.finder.live.g5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
