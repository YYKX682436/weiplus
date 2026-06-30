package jq3;

/* loaded from: classes6.dex */
public class f implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f301107d = 0;

    public f(jq3.g gVar, jq3.e eVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f301107d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f301107d;
        this.f301107d = i17 + 1;
        if (i17 == 0) {
            return jq3.m.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
