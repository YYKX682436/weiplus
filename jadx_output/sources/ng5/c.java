package ng5;

/* loaded from: classes6.dex */
public class c implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f337062d = 0;

    public c(ng5.d dVar, ng5.b bVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f337062d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f337062d;
        this.f337062d = i17 + 1;
        if (i17 == 0) {
            return ax1.c.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
