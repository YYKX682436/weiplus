package hh4;

/* loaded from: classes5.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f281476d = 0;

    public g(hh4.h hVar, hh4.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f281476d < 5;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f281476d;
        this.f281476d = i17 + 1;
        if (i17 == 0) {
            return ll3.x1.INSTANCE;
        }
        if (i17 == 1) {
            return ah0.l2.INSTANCE;
        }
        if (i17 == 2) {
            return com.tencent.mm.plugin.wenote.multitask.k.INSTANCE;
        }
        if (i17 == 3) {
            return com.tencent.mm.plugin.finder.live.view.n7.INSTANCE;
        }
        if (i17 == 4) {
            return uy.n.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 5");
    }
}
