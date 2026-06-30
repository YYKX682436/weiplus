package kv;

/* loaded from: classes6.dex */
public class v implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f312645d = 0;

    public v(kv.w wVar, kv.u uVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f312645d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f312645d;
        this.f312645d = i17 + 1;
        if (i17 == 0) {
            return com.tencent.mm.feature.avatar.l0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
