package mf0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f325999d = 0;

    public f(mf0.g gVar, mf0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f325999d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f325999d;
        this.f325999d = i17 + 1;
        if (i17 == 0) {
            return mf0.i0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
