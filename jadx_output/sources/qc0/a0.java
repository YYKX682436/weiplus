package qc0;

/* loaded from: classes6.dex */
public class a0 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f361356d = 0;

    public a0(qc0.b0 b0Var, qc0.z zVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f361356d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f361356d;
        this.f361356d = i17 + 1;
        if (i17 == 0) {
            return pc0.h2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
