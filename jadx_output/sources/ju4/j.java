package ju4;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f302051d = 0;

    public j(ju4.k kVar, ju4.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f302051d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f302051d;
        this.f302051d = i17 + 1;
        if (i17 == 0) {
            return ju4.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
