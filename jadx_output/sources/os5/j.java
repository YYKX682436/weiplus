package os5;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f348286d = 0;

    public j(os5.k kVar, os5.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f348286d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f348286d;
        this.f348286d = i17 + 1;
        if (i17 == 0) {
            return d03.l.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
