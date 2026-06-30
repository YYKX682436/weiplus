package df0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f229632d = 0;

    public j(df0.k kVar, df0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f229632d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f229632d;
        this.f229632d = i17 + 1;
        if (i17 == 0) {
            return cf0.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
