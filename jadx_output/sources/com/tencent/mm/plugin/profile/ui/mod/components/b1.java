package com.tencent.mm.plugin.profile.ui.mod.components;

/* loaded from: classes9.dex */
public final class b1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.base.NestedScrollEditText f153883d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.profile.ui.mod.components.k1 f153884e;

    public b1(com.tencent.mm.ui.base.NestedScrollEditText nestedScrollEditText, com.tencent.mm.plugin.profile.ui.mod.components.k1 k1Var) {
        this.f153883d = nestedScrollEditText;
        this.f153884e = k1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.base.NestedScrollEditText nestedScrollEditText = this.f153883d;
        android.text.Editable text = nestedScrollEditText.getText();
        nestedScrollEditText.setSelection(text != null ? text.length() : 0);
        java.lang.Object systemService = this.f153884e.getActivity().getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(nestedScrollEditText, 0);
    }
}
