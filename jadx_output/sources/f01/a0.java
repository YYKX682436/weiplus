package f01;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f258332d = 0;

    public a0(f01.b0 b0Var, f01.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f258332d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f258332d;
        this.f258332d = i17 + 1;
        if (i17 == 0) {
            return f01.h1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
