package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes11.dex */
public final class c implements lr3.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.g f154032a;

    public c(com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.g gVar) {
        this.f154032a = gVar;
    }

    @Override // lr3.a
    public void a() {
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.g gVar = this.f154032a;
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) gVar.f311480h;
        if (mMLimitedClearEditText == null) {
            return;
        }
        java.lang.String str = gVar.f154059r;
        if (str == null || r26.n0.N(str)) {
            com.tencent.mm.ui.base.NestedScrollEditText editText = mMLimitedClearEditText.getEditText();
            editText.requestFocus();
            android.text.Editable text = editText.getText();
            editText.setSelection(text != null ? text.length() : 0);
            java.lang.Object systemService = gVar.getActivity().getSystemService("input_method");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(editText, 0);
        }
    }

    @Override // lr3.a
    public void b() {
        com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.g gVar = this.f154032a;
        float h17 = i65.a.h(gVar.getActivity(), com.tencent.mm.R.dimen.f479738dv);
        com.tencent.mm.ui.base.MMLimitedClearEditText mMLimitedClearEditText = (com.tencent.mm.ui.base.MMLimitedClearEditText) gVar.f311480h;
        if (mMLimitedClearEditText != null) {
            sa5.d.e(mMLimitedClearEditText, h17, (r14 & 2) != 0 ? 1 : 0, (r14 & 4) != 0 ? 1000L : 0L, (r14 & 8) != 0 ? 300L : 0L, (r14 & 16) != 0 ? null : null);
        }
    }
}
