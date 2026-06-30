package ft;

/* loaded from: classes6.dex */
public class g2 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f266388d = 0;

    public g2(ft.h2 h2Var, ft.f2 f2Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f266388d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f266388d;
        this.f266388d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.wexnet.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
