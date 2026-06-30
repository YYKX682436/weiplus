package qo3;

/* loaded from: classes6.dex */
public class t implements java.util.Iterator {

    /* renamed from: d, reason: collision with root package name */
    public int f365642d = 0;

    public t(qo3.u uVar, qo3.s sVar) {
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f365642d < 1;
    }

    @Override // java.util.Iterator
    public java.lang.Object next() {
        int i17 = this.f365642d;
        this.f365642d = i17 + 1;
        if (i17 == 0) {
            return qo3.z0.INSTANCE;
        }
        throw new java.lang.IndexOutOfBoundsException("No more elements, total count: 1");
    }
}
