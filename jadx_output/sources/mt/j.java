package mt;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f331170d = 0;

    public j(mt.k kVar, mt.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f331170d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f331170d;
        this.f331170d = i17 + 1;
        if (i17 == 0) {
            return mt.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
