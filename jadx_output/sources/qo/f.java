package qo;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f365312d = 0;

    public f(qo.g gVar, qo.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f365312d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f365312d;
        this.f365312d = i17 + 1;
        if (i17 == 0) {
            return qo.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
