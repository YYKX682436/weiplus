package x90;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f452616d = 0;

    public j(x90.k kVar, x90.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f452616d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f452616d;
        this.f452616d = i17 + 1;
        if (i17 == 0) {
            return x90.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
