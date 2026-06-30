package ir;

/* loaded from: classes15.dex */
public final class p0 extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f293888a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f293889b;

    public p0(java.util.List list, java.util.List list2) {
        this.f293888a = list;
        this.f293889b = list2;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        java.util.List list = this.f293888a;
        if (i17 >= list.size()) {
            return false;
        }
        java.util.List list2 = this.f293889b;
        if (i18 < list2.size()) {
            return ((ir.u0) list.get(i17)).a(list2.get(i18));
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        java.util.List list = this.f293888a;
        if (i17 >= list.size()) {
            return false;
        }
        java.util.List list2 = this.f293889b;
        if (i18 < list2.size()) {
            return kotlin.jvm.internal.o.b(list.get(i17), list2.get(i18));
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f293889b.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f293888a.size();
    }
}
