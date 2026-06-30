package ob0;

/* loaded from: classes6.dex */
public class w0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343976d = 0;

    public w0(ob0.x0 x0Var, ob0.v0 v0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343976d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343976d;
        this.f343976d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.performance.b2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
