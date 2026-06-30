package kz5;

/* loaded from: classes5.dex */
public final class g extends kz5.h implements java.util.RandomAccess {

    /* renamed from: e, reason: collision with root package name */
    public final kz5.h f313970e;

    /* renamed from: f, reason: collision with root package name */
    public final int f313971f;

    /* renamed from: g, reason: collision with root package name */
    public final int f313972g;

    public g(kz5.h list, int i17, int i18) {
        kotlin.jvm.internal.o.g(list, "list");
        this.f313970e = list;
        this.f313971f = i17;
        kz5.h.f313973d.a(i17, i18, list.d());
        this.f313972g = i18 - i17;
    }

    @Override // kz5.b
    public int d() {
        return this.f313972g;
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        int i18 = this.f313972g;
        if (i17 >= 0 && i17 < i18) {
            return this.f313970e.get(this.f313971f + i17);
        }
        throw new java.lang.IndexOutOfBoundsException("index: " + i17 + ", size: " + i18);
    }
}
