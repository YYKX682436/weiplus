package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class f3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.m3 f117088d;

    public f3(com.tencent.mm.plugin.finder.live.viewmodel.m3 m3Var) {
        this.f117088d = m3Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveBasePhoneNumberAuthUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.viewmodel.m3 m3Var = this.f117088d;
        android.widget.EditText editText = m3Var.f117245i;
        if (editText == null) {
            kotlin.jvm.internal.o.o("phoneNumberView");
            throw null;
        }
        editText.clearFocus();
        android.widget.EditText editText2 = m3Var.f117246m;
        if (editText2 == null) {
            kotlin.jvm.internal.o.o("smsCodeView");
            throw null;
        }
        editText2.clearFocus();
        java.lang.Object systemService = m3Var.getActivity().getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(m3Var.getRootView().getWindowToken(), 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveBasePhoneNumberAuthUIC$onCreate$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
