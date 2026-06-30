package qo;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f365315d = 0;

    public j(qo.k kVar, qo.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f365315d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f365315d;
        this.f365315d = i17 + 1;
        if (i17 == 0) {
            return qo.d.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
