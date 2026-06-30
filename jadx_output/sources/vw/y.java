package vw;

/* loaded from: classes6.dex */
public class y implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f440754d = 0;

    public y(vw.z zVar, vw.x xVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f440754d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f440754d;
        this.f440754d = i17 + 1;
        if (i17 == 0) {
            return vw.h.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
