package uh4;

/* loaded from: classes.dex */
public class o implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f427987d = 0;

    public o(uh4.p pVar, uh4.n nVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f427987d < 5;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f427987d;
        this.f427987d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.teenmode.ui.r1.INSTANCE;
        }
        if (i17 == 1) {
            return com.tencent.mm.plugin.teenmode.ui.d.INSTANCE;
        }
        if (i17 == 2) {
            return com.tencent.mm.plugin.teenmode.ui.u1.INSTANCE;
        }
        if (i17 == 3) {
            return com.tencent.mm.plugin.teenmode.ui.o1.INSTANCE;
        }
        if (i17 == 4) {
            return com.tencent.mm.plugin.teenmode.ui.c3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 5");
    }
}
