package mv;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f331508d = 0;

    public g(mv.h hVar, mv.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f331508d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f331508d;
        this.f331508d = i17 + 1;
        if (i17 == 0) {
            return yn1.j4.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
