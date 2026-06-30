package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes11.dex */
public final class d1 implements lr3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.k1 f153894a;

    public d1(com.tencent.mm.plugin.profile.ui.mod.components.k1 k1Var) {
        this.f153894a = k1Var;
    }

    @Override // lr3.a
    public void a() {
        com.tencent.mm.plugin.profile.ui.mod.components.k1 k1Var = this.f153894a;
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) k1Var.f311393h;
        if (mMLimitedClearEditText == null) {
            return;
        }
        com.tencent.mm.storage.z3 U6 = k1Var.U6();
        java.lang.String w07 = U6 != null ? U6.w0() : null;
        if (w07 == null || r26.n0.N(w07)) {
            com.tencent.mm.ui.base.NestedScrollEditText editText = mMLimitedClearEditText.getEditText();
            editText.post(new com.tencent.mm.plugin.profile.ui.mod.components.c1(editText, k1Var));
        }
    }

    @Override // lr3.a
    public void b() {
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) this.f153894a.f311393h;
        if (mMLimitedClearEditText == null) {
            return;
        }
        sa5.d.e(mMLimitedClearEditText, i65.a.h(r0.getActivity(), com.tencent.mm.R.dimen.f479738dv), (r14 & 2) != 0 ? 1 : 0, (r14 & 4) != 0 ? 1000L : 0L, (r14 & 8) != 0 ? 300L : 0L, (r14 & 16) != 0 ? null : null);
    }
}
