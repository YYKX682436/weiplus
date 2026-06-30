package t85;

/* loaded from: classes10.dex */
public final class c extends androidx.recyclerview.widget.b0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.util.List f416454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.util.List f416455b;

    public c(java.util.List list, java.util.List list2) {
        this.f416454a = list;
        this.f416455b = list2;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean a(int i17, int i18) {
        r45.p64 oldItem = ((t85.d) this.f416454a.get(i17)).f416456a;
        r45.p64 newItem = ((t85.d) this.f416455b.get(i18)).f416456a;
        kotlin.jvm.internal.o.g(oldItem, "oldItem");
        kotlin.jvm.internal.o.g(newItem, "newItem");
        if (com.tencent.mm.sdk.platformtools.t8.K0(oldItem.f382792d)) {
            return kotlin.jvm.internal.o.b(oldItem, newItem);
        }
        if (com.tencent.mm.sdk.platformtools.t8.D0(oldItem.f382792d, newItem.f382792d)) {
            r45.o64 o64Var = oldItem.f382793e;
            java.lang.String str = o64Var != null ? o64Var.f381983d : null;
            r45.o64 o64Var2 = newItem.f382793e;
            if (com.tencent.mm.sdk.platformtools.t8.D0(str, o64Var2 != null ? o64Var2.f381983d : null)) {
                r45.r64 r64Var = oldItem.f382796h;
                java.lang.String str2 = r64Var != null ? r64Var.f384570d : null;
                r45.r64 r64Var2 = newItem.f382796h;
                if (com.tencent.mm.sdk.platformtools.t8.D0(str2, r64Var2 != null ? r64Var2.f384570d : null)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.recyclerview.widget.b0
    public boolean b(int i17, int i18) {
        return kotlin.jvm.internal.o.b(((t85.d) this.f416454a.get(i17)).f416456a.f382792d, ((t85.d) this.f416455b.get(i18)).f416456a.f382792d);
    }

    @Override // androidx.recyclerview.widget.b0
    public int d() {
        return this.f416455b.size();
    }

    @Override // androidx.recyclerview.widget.b0
    public int e() {
        return this.f416454a.size();
    }
}
