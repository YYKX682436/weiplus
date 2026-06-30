package s40;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f402908d = 0;

    public n(s40.o oVar, s40.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f402908d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f402908d;
        this.f402908d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.finder.live.o1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
