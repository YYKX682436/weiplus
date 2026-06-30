package lg0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f318541d = 0;

    public j(lg0.k kVar, lg0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f318541d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f318541d;
        this.f318541d = i17 + 1;
        if (i17 == 0) {
            return p05.m2.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
