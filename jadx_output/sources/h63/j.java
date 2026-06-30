package h63;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f279248d = 0;

    public j(h63.k kVar, h63.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f279248d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f279248d;
        this.f279248d = i17 + 1;
        if (i17 == 0) {
            return h63.y0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
