package k70;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f304668d = 0;

    public n(k70.o oVar, k70.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f304668d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f304668d;
        this.f304668d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.insane_statistic.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
