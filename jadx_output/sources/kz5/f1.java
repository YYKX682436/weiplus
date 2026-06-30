package kz5;

/* loaded from: classes5.dex */
public final class f1 extends kz5.h implements java.util.RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f313967e;

    /* renamed from: f, reason: collision with root package name */
    public int f313968f;

    /* renamed from: g, reason: collision with root package name */
    public int f313969g;

    public f1(java.util.List list) {
        kotlin.jvm.internal.o.g(list, "list");
        this.f313967e = list;
    }

    @Override // kz5.b
    public int d() {
        return this.f313969g;
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        int i18 = this.f313969g;
        if (i17 >= 0 && i17 < i18) {
            return this.f313967e.get(this.f313968f + i17);
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
    }
}
