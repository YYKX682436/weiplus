package wf0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445512d = 0;

    public j(wf0.k kVar, wf0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445512d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445512d;
        this.f445512d = i17 + 1;
        if (i17 == 0) {
            return vf0.m1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
