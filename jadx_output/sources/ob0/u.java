package ob0;

/* loaded from: classes6.dex */
public class u implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343970d = 0;

    public u(ob0.v vVar, ob0.t tVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343970d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343970d;
        this.f343970d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.performance.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
