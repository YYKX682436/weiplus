package m40;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f323407d = 0;

    public j(m40.k kVar, m40.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f323407d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f323407d;
        this.f323407d = i17 + 1;
        if (i17 == 0) {
            return b92.z0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
