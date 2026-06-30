package ja0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f298578d = 0;

    public j(ja0.k kVar, ja0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f298578d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f298578d;
        this.f298578d = i17 + 1;
        if (i17 == 0) {
            return ja0.h0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
