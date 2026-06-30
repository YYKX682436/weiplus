package ie0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f290961d = 0;

    public j(ie0.k kVar, ie0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f290961d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f290961d;
        this.f290961d = i17 + 1;
        if (i17 == 0) {
            return ie0.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
