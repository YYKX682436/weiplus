package fk5;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f263665d = 0;

    public j(fk5.k kVar, fk5.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f263665d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f263665d;
        this.f263665d = i17 + 1;
        if (i17 == 0) {
            return fk5.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
