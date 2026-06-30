package wf0;

/* loaded from: classes6.dex */
public class z implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445550d = 0;

    public z(wf0.a0 a0Var, wf0.y yVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445550d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445550d;
        this.f445550d = i17 + 1;
        if (i17 == 0) {
            return vf0.t1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
