package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes11.dex */
public final class j0 implements lr3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.n0 f154082a;

    public j0(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.n0 n0Var) {
        this.f154082a = n0Var;
    }

    @Override // lr3.a
    public void a() {
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.n0 n0Var = this.f154082a;
        com.tencent.mm.plugin.profile.ui.widget.SayHiItemView sayHiItemView = (com.tencent.mm.plugin.profile.ui.widget.SayHiItemView) n0Var.f311480h;
        if (sayHiItemView != null && n0Var.f154100r.isEmpty()) {
            sayHiItemView.getUi().a().performClick();
        }
    }

    @Override // lr3.a
    public void b() {
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.n0 n0Var = this.f154082a;
        com.tencent.mm.plugin.profile.ui.widget.SayHiItemView sayHiItemView = (com.tencent.mm.plugin.profile.ui.widget.SayHiItemView) n0Var.f311480h;
        if (sayHiItemView == null) {
            return;
        }
        float h17 = i65.a.h(n0Var.getActivity(), com.tencent.mm.R.dimen.f479738dv);
        em.t3 ui6 = sayHiItemView.getUi();
        if (ui6.f254821e == null) {
            ui6.f254821e = (android.widget.LinearLayout) ui6.f254817a.findViewById(com.tencent.mm.R.id.cd7);
        }
        android.widget.LinearLayout linearLayout = ui6.f254821e;
        kotlin.jvm.internal.o.f(linearLayout, "getContactInfoModDecCon(...)");
        sa5.d.e(linearLayout, h17, (r14 & 2) != 0 ? 1 : 0, (r14 & 4) != 0 ? 1000L : 0L, (r14 & 8) != 0 ? 300L : 0L, (r14 & 16) != 0 ? null : null);
    }
}
