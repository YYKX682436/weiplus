package o25;

/* loaded from: classes6.dex */
public class z0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342598d = 0;

    public z0(o25.a1 a1Var, o25.y0 y0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342598d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342598d;
        this.f342598d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.app.p7.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
