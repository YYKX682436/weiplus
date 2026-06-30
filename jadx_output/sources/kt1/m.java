package kt1;

/* loaded from: classes6.dex */
public class m implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f311950d = 0;

    public m(kt1.n nVar, kt1.l lVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f311950d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f311950d;
        this.f311950d = i17 + 1;
        if (i17 == 0) {
            return kt1.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
