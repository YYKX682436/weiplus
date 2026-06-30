package xs;

/* loaded from: classes6.dex */
public class h0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f456256d = 0;

    public h0(xs.i0 i0Var, xs.g0 g0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f456256d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f456256d;
        this.f456256d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.pluginsdk.ui.chat.q9.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
