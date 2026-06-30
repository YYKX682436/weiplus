package uh4;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f427993d = 0;

    public w(uh4.x xVar, uh4.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f427993d < 5;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f427993d;
        this.f427993d = i17 + 1;
        if (i17 == 0) {
            return n02.h.INSTANCE;
        }
        if (i17 == 1) {
            return lc0.t.INSTANCE;
        }
        if (i17 == 2) {
            return r43.p0.INSTANCE;
        }
        if (i17 == 3) {
            return com.tencent.mm.plugin.appbrand.app.ea.INSTANCE;
        }
        if (i17 == 4) {
            return zu4.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 5");
    }
}
