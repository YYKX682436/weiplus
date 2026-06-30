package j00;

/* loaded from: classes6.dex */
public class s3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f296888d = 0;

    public s3(j00.t3 t3Var, j00.r3 r3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f296888d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f296888d;
        this.f296888d = i17 + 1;
        if (i17 == 0) {
            return j00.g2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
