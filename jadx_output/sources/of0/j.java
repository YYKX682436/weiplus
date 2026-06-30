package of0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f344868d = 0;

    public j(of0.k kVar, of0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f344868d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f344868d;
        this.f344868d = i17 + 1;
        if (i17 == 0) {
            return of0.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
