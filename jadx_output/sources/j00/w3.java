package j00;

/* loaded from: classes6.dex */
public class w3 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f296932d = 0;

    public w3(j00.x3 x3Var, j00.v3 v3Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f296932d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f296932d;
        this.f296932d = i17 + 1;
        if (i17 == 0) {
            return j00.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
