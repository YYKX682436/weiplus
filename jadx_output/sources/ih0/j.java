package ih0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f291478d = 0;

    public j(ih0.k kVar, ih0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f291478d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f291478d;
        this.f291478d = i17 + 1;
        if (i17 == 0) {
            return dz4.u1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
