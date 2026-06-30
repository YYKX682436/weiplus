package si1;

/* loaded from: classes6.dex */
public class p implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f408281d = 0;

    public p(si1.q qVar, si1.o oVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f408281d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f408281d;
        this.f408281d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.appbrand.task.checkdemo.g.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
