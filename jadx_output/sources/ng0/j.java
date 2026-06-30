package ng0;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f336900d = 0;

    public j(ng0.k kVar, ng0.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f336900d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f336900d;
        this.f336900d = i17 + 1;
        if (i17 == 0) {
            return ng0.r.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
