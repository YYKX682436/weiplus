package rf0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f394613d = 0;

    public j(rf0.k kVar, rf0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f394613d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f394613d;
        this.f394613d = i17 + 1;
        if (i17 == 0) {
            return qf0.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
