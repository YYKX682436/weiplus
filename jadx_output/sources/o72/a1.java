package o72;

/* loaded from: classes6.dex */
public class a1 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343306d = 0;

    public a1(o72.b1 b1Var, o72.z0 z0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343306d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343306d;
        this.f343306d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.fav.ui.ma.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
