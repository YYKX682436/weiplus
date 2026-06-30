package vg3;

/* loaded from: classes.dex */
public class a2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f436642d = 0;

    public a2(vg3.b2 b2Var, vg3.z1 z1Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f436642d < 7;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f436642d;
        this.f436642d = i17 + 1;
        switch (i17) {
            case 0:
                return zh4.r.INSTANCE;
            case 1:
                return r21.s.INSTANCE;
            case 2:
                return gc0.h0.INSTANCE;
            case 3:
                return j93.o.INSTANCE;
            case 4:
                return m73.n.INSTANCE;
            case 5:
                return com.tencent.mm.ui.conversation.t3.INSTANCE;
            case 6:
                return zf5.b.INSTANCE;
            default:
                throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 7");
        }
    }
}
