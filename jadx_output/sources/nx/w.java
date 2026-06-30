package nx;

/* loaded from: classes6.dex */
public class w implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f341057d = 0;

    public w(nx.x xVar, nx.v vVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f341057d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f341057d;
        this.f341057d = i17 + 1;
        if (i17 == 0) {
            return nx.b0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
