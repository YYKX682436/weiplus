package fe0;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f261374d = 0;

    public c(fe0.d dVar, fe0.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f261374d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f261374d;
        this.f261374d = i17 + 1;
        if (i17 == 0) {
            return ee0.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
