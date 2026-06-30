package ll3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f319164d = 0;

    public f(ll3.g gVar, ll3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f319164d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f319164d;
        this.f319164d = i17 + 1;
        if (i17 == 0) {
            return ll3.u0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
