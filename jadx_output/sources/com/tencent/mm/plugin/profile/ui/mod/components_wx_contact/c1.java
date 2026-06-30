package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes11.dex */
public final class c1 implements lr3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1 f154036a;

    public c1(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1 j1Var) {
        this.f154036a = j1Var;
    }

    @Override // lr3.a
    public void a() {
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1 j1Var = this.f154036a;
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) j1Var.f311480h;
        if (mMLimitedClearEditText == null) {
            return;
        }
        com.tencent.mm.contact.o U6 = j1Var.U6();
        java.lang.String c17 = U6 != null ? ((yq3.v) U6).c() : null;
        if (c17 == null || r26.n0.N(c17)) {
            com.tencent.mm.ui.base.NestedScrollEditText editText = mMLimitedClearEditText.getEditText();
            editText.post(new com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.b1(editText, j1Var));
        }
    }

    @Override // lr3.a
    public void b() {
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f154036a.f311480h;
        if (mMLimitedClearEditText == null) {
            return;
        }
        sa5.d.e(mMLimitedClearEditText, i65.a.h(r0.getActivity(), com.tencent.mm.R.dimen.f479738dv), (r14 & 2) != 0 ? 1 : 0, (r14 & 4) != 0 ? 1000L : 0L, (r14 & 8) != 0 ? 300L : 0L, (r14 & 16) != 0 ? null : null);
    }
}
