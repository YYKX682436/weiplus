package wf0;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f445506d = 0;

    public f(wf0.g gVar, wf0.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f445506d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f445506d;
        this.f445506d = i17 + 1;
        if (i17 == 0) {
            return vf0.i1.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
