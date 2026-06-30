package o72;

/* loaded from: classes6.dex */
public class o0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343434d = 0;

    public o0(o72.p0 p0Var, o72.n0 n0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343434d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343434d;
        this.f343434d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.pluginsdk.model.w1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
