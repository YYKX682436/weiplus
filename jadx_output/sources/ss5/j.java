package ss5;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f412166d = 0;

    public j(ss5.k kVar, ss5.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f412166d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f412166d;
        this.f412166d = i17 + 1;
        if (i17 == 0) {
            return vd2.q2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
