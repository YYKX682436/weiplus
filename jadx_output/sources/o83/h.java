package o83;

/* loaded from: classes6.dex */
public class h implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f343658d = 0;

    public h(o83.i iVar, o83.g gVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f343658d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f343658d;
        this.f343658d = i17 + 1;
        if (i17 == 0) {
            return o83.p.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
