package d34;

/* loaded from: classes.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f226319d = 0;

    public j(d34.k kVar, d34.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f226319d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f226319d;
        this.f226319d = i17 + 1;
        if (i17 == 0) {
            return d34.f0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
