package zy2;

/* loaded from: classes6.dex */
public class g4 implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f477390d = 0;

    public g4(zy2.h4 h4Var, zy2.f4 f4Var) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f477390d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f477390d;
        this.f477390d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.finder.storage.nj0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
