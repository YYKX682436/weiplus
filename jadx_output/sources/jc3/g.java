package jc3;

/* loaded from: classes6.dex */
public class g implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f298961d = 0;

    public g(jc3.h hVar, jc3.f fVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f298961d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f298961d;
        this.f298961d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.plugin.magicbrush.k5.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
