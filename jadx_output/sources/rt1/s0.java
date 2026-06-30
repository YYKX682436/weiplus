package rt1;

/* loaded from: classes4.dex */
public final class s0 extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f399484a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f399485b;

    public s0(java.util.ArrayList oldList, java.util.ArrayList newList) {
        kotlin.jvm.internal.o.g(oldList, "oldList");
        kotlin.jvm.internal.o.g(newList, "newList");
        this.f399484a = oldList;
        this.f399485b = newList;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        java.lang.String str = (java.lang.String) kz5.n0.a0(this.f399484a, i17);
        return str != null && kotlin.jvm.internal.o.b(str, (java.lang.String) kz5.n0.a0(this.f399485b, i18));
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        return a(i17, i18);
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f399485b.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f399484a.size();
    }
}
