package le0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f318120d = 0;

    public j(le0.k kVar, le0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f318120d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f318120d;
        this.f318120d = i17 + 1;
        if (i17 == 0) {
            return ke0.f.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
