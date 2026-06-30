package th0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f419291d = 0;

    public j(th0.k kVar, th0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f419291d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f419291d;
        this.f419291d = i17 + 1;
        if (i17 == 0) {
            return th0.z.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
