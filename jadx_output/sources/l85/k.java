package l85;

/* loaded from: classes6.dex */
public class k implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f317189d = 0;

    public k(l85.l lVar, l85.j jVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f317189d < 4;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f317189d;
        this.f317189d = i17 + 1;
        if (i17 == 0) {
            return c61.o7.INSTANCE;
        }
        if (i17 == 1) {
            return com.tencent.mm.feature.finder.live.x4.INSTANCE;
        }
        if (i17 == 2) {
            return wo2.m.INSTANCE;
        }
        if (i17 == 3) {
            return q92.j.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 4");
    }
}
