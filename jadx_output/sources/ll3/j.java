package ll3;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f319183d = 0;

    public j(ll3.k kVar, ll3.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f319183d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f319183d;
        this.f319183d = i17 + 1;
        if (i17 == 0) {
            return ll3.w0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
