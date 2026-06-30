package com.tencent.mm.plugin.finder.ui.fav;

/* loaded from: classes2.dex */
public final class j0 extends zx2.y {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f129179a;

    public j0(java.lang.ref.WeakReference rTabUIc) {
        kotlin.jvm.internal.o.g(rTabUIc, "rTabUIc");
        this.f129179a = rTabUIc;
    }

    @Override // zx2.y, zx2.z
    public void a(android.content.Context context, zx2.i tab) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(tab, "tab");
        super.a(context, tab);
        com.tencent.mm.plugin.finder.ui.fav.m0 m0Var = (com.tencent.mm.plugin.finder.ui.fav.m0) this.f129179a.get();
        if (m0Var != null) {
            yz5.l lVar = m0Var.f129190x;
            if (lVar != null) {
                lVar.invoke(java.lang.Integer.valueOf(tab.f477040a));
            }
            m0Var.f129189w = tab.f477040a;
        }
    }
}
