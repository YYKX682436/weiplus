package wx;

/* loaded from: classes6.dex */
public class n0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f450423d = 0;

    public n0(wx.o0 o0Var, wx.m0 m0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f450423d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f450423d;
        this.f450423d = i17 + 1;
        if (i17 == 0) {
            return wx.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
