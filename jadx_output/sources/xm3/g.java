package xm3;

/* loaded from: classes4.dex */
public final class g extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f455313a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f455314b;

    public g(java.util.List oldList, java.util.List newList) {
        kotlin.jvm.internal.o.g(oldList, "oldList");
        kotlin.jvm.internal.o.g(newList, "newList");
        this.f455313a = oldList;
        this.f455314b = newList;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        java.lang.Object a07 = kz5.n0.a0(this.f455313a, i17);
        java.lang.Object a08 = kz5.n0.a0(this.f455314b, i18);
        if (a07 == null || a08 == null) {
            return false;
        }
        return ((xm3.d) a07).X((xm3.d) a08);
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        java.lang.Object a07 = kz5.n0.a0(this.f455313a, i17);
        java.lang.Object a08 = kz5.n0.a0(this.f455314b, i18);
        if (a07 == null || a08 == null) {
            return false;
        }
        return ((xm3.d) a07).s0((xm3.d) a08);
    }

    @Override // androidx.recyclerview.widget.b0
    public java.lang.Object c(int i17, int i18) {
        return null;
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f455314b.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f455313a.size();
    }
}
