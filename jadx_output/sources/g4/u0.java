package g4;

/* loaded from: classes5.dex */
public final class u0 extends kz5.h {

    /* renamed from: e, reason: collision with root package name */
    public final int f268576e;

    /* renamed from: f, reason: collision with root package name */
    public final int f268577f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f268578g;

    public u0(int i17, int i18, java.util.List items) {
        kotlin.jvm.internal.o.g(items, "items");
        this.f268576e = i17;
        this.f268577f = i18;
        this.f268578g = items;
    }

    @Override // kz5.b
    public int d() {
        return this.f268576e + this.f268578g.size() + this.f268577f;
    }

    @Override // java.util.List
    public java.lang.Object get(int i17) {
        int i18 = this.f268576e;
        if (i17 >= 0 && i18 > i17) {
            return null;
        }
        java.util.List list = this.f268578g;
        int size = list.size() + i18;
        if (i18 <= i17 && size > i17) {
            return list.get(i17 - i18);
        }
        int size2 = i18 + list.size();
        int d17 = d();
        if (size2 <= i17 && d17 > i17) {
            return null;
        }
        throw new java.lang.IndexOutOfBoundsException("Illegal attempt to access index " + i17 + " in ItemSnapshotList of size " + d());
    }
}
