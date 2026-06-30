package ed0;

/* loaded from: classes6.dex */
public class n implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f251220d = 0;

    public n(ed0.o oVar, ed0.m mVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f251220d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f251220d;
        this.f251220d = i17 + 1;
        if (i17 == 0) {
            return dd0.j0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
