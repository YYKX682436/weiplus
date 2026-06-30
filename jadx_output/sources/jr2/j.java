package jr2;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f301376d = 0;

    public j(jr2.k kVar, jr2.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f301376d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f301376d;
        this.f301376d = i17 + 1;
        if (i17 == 0) {
            return jr2.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
