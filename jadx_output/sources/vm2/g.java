package vm2;

/* loaded from: classes10.dex */
public final class g extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f438090a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f438091b;

    public g(java.util.List oldList, java.util.List newList) {
        kotlin.jvm.internal.o.g(oldList, "oldList");
        kotlin.jvm.internal.o.g(newList, "newList");
        this.f438090a = oldList;
        this.f438091b = newList;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        in5.c cVar = (in5.c) this.f438090a.get(i17);
        boolean z17 = cVar instanceof vm2.k;
        java.util.List list = this.f438091b;
        if (z17) {
            vm2.k kVar = (vm2.k) cVar;
            in5.c other = (in5.c) list.get(i18);
            kVar.getClass();
            kotlin.jvm.internal.o.g(other, "other");
            if (kVar == other) {
                return true;
            }
            if (kotlin.jvm.internal.o.b(vm2.k.class, other.getClass()) && (other instanceof vm2.k)) {
                if (kVar.f438094d == ((vm2.k) other).f438094d) {
                    return true;
                }
            }
            return false;
        }
        if (!(cVar instanceof vm2.n)) {
            return false;
        }
        vm2.n nVar = (vm2.n) cVar;
        in5.c other2 = (in5.c) list.get(i18);
        nVar.getClass();
        kotlin.jvm.internal.o.g(other2, "other");
        if (nVar == other2) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(vm2.n.class, other2.getClass()) || !(other2 instanceof vm2.n)) {
            return false;
        }
        return kotlin.jvm.internal.o.b(nVar.f438099d, ((vm2.n) other2).f438099d);
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        java.util.List list = this.f438090a;
        int h17 = ((in5.c) list.get(i17)).h();
        java.util.List list2 = this.f438091b;
        return h17 == ((in5.c) list2.get(i18)).h() && ((in5.c) list.get(i17)).getItemId() == ((in5.c) list2.get(i18)).getItemId();
    }

    @Override // androidx.recyclerview.widget.b0
    public java.lang.Object c(int i17, int i18) {
        return new android.os.Bundle();
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f438091b.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f438090a.size();
    }
}
