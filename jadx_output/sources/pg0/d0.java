package pg0;

/* loaded from: classes.dex */
public class d0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f353981d = 0;

    public d0(pg0.e0 e0Var, pg0.c0 c0Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f353981d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f353981d;
        this.f353981d = i17 + 1;
        if (i17 == 0) {
            return pg0.h2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
