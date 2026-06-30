package s40;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f402902d = 0;

    public j(s40.k kVar, s40.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f402902d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f402902d;
        this.f402902d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.finder.live.j1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
