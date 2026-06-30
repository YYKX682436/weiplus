package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes11.dex */
public final class k0 implements lr3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.o0 f153941a;

    public k0(com.tencent.mm.plugin.profile.ui.mod.components.o0 o0Var) {
        this.f153941a = o0Var;
    }

    @Override // lr3.a
    public void a() {
        com.tencent.mm.plugin.profile.ui.mod.components.o0 o0Var = this.f153941a;
        com.tencent.mm.plugin.profile.ui.widget.SayHiItemView sayHiItemView = (com.tencent.mm.plugin.profile.ui.widget.SayHiItemView) o0Var.f311393h;
        if (sayHiItemView != null && o0Var.f153959r.isEmpty()) {
            sayHiItemView.getUi().a().performClick();
        }
    }

    @Override // lr3.a
    public void b() {
        com.tencent.mm.plugin.profile.ui.mod.components.o0 o0Var = this.f153941a;
        com.tencent.mm.plugin.profile.ui.widget.SayHiItemView sayHiItemView = (com.tencent.mm.plugin.profile.ui.widget.SayHiItemView) o0Var.f311393h;
        if (sayHiItemView == null) {
            return;
        }
        float h17 = i65.a.h(o0Var.getActivity(), com.tencent.mm.R.dimen.f479738dv);
        em.t3 ui6 = sayHiItemView.getUi();
        if (ui6.f254821e == null) {
            ui6.f254821e = (android.widget.LinearLayout) ui6.f254817a.findViewById(com.tencent.mm.R.id.cd7);
        }
        android.widget.LinearLayout linearLayout = ui6.f254821e;
        kotlin.jvm.internal.o.f(linearLayout, "getContactInfoModDecCon(...)");
        sa5.d.e(linearLayout, h17, (r14 & 2) != 0 ? 1 : 0, (r14 & 4) != 0 ? 1000L : 0L, (r14 & 8) != 0 ? 300L : 0L, (r14 & 16) != 0 ? null : null);
    }
}
