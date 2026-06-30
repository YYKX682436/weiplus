package q62;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f360275d = 0;

    public f(q62.g gVar, q62.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f360275d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f360275d;
        this.f360275d = i17 + 1;
        if (i17 == 0) {
            return q62.b.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
