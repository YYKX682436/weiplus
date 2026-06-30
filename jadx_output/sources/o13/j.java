package o13;

/* loaded from: classes6.dex */
public class j implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f342238d = 0;

    public j(o13.k kVar, o13.i iVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f342238d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f342238d;
        this.f342238d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.fts.ui.u3.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
