package re4;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f394532d = 0;

    public f(re4.g gVar, re4.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f394532d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f394532d;
        this.f394532d = i17 + 1;
        if (i17 == 0) {
            return re4.t.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
