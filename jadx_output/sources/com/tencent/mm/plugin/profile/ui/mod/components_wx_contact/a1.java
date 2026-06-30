package com.tencent.mm.plugin.profile.ui.mod.components_wx_contact;

/* loaded from: classes9.dex */
public final class a1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.NestedScrollEditText f154025d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1 f154026e;

    public a1(com.tencent.mm.ui.base.NestedScrollEditText nestedScrollEditText, com.tencent.mm.plugin.profile.ui.mod.components_wx_contact.j1 j1Var) {
        this.f154025d = nestedScrollEditText;
        this.f154026e = j1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.base.NestedScrollEditText nestedScrollEditText = this.f154025d;
        android.text.Editable text = nestedScrollEditText.getText();
        nestedScrollEditText.setSelection(text != null ? text.length() : 0);
        java.lang.Object systemService = this.f154026e.getActivity().getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(nestedScrollEditText, 0);
    }
}
