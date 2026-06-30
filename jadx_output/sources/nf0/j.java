package nf0;

/* loaded from: classes.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f336623d = 0;

    public j(nf0.k kVar, nf0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f336623d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f336623d;
        this.f336623d = i17 + 1;
        if (i17 == 0) {
            return nf0.v.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
