package d60;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f226662d = 0;

    public f(d60.g gVar, d60.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f226662d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f226662d;
        this.f226662d = i17 + 1;
        if (i17 == 0) {
            return d60.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
