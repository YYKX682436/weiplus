package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes3.dex */
public final class k3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.m3 f117187d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.appcompat.app.AppCompatActivity f117188e;

    public k3(com.tencent.mm.plugin.finder.live.viewmodel.m3 m3Var, androidx.appcompat.app.AppCompatActivity appCompatActivity) {
        this.f117187d = m3Var;
        this.f117188e = appCompatActivity;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveBasePhoneNumberAuthUIC$sendButton$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.finder.live.viewmodel.m3 m3Var = this.f117187d;
        android.widget.EditText editText = m3Var.f117246m;
        if (editText == null) {
            kotlin.jvm.internal.o.o("smsCodeView");
            throw null;
        }
        editText.requestFocus();
        androidx.appcompat.app.AppCompatActivity appCompatActivity = this.f117188e;
        java.lang.Object systemService = appCompatActivity.getSystemService("input_method");
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        if (inputMethodManager != null) {
            android.widget.EditText editText2 = m3Var.f117246m;
            if (editText2 == null) {
                kotlin.jvm.internal.o.o("smsCodeView");
                throw null;
            }
            inputMethodManager.showSoftInput(editText2, 0);
        }
        kotlinx.coroutines.l.d(m3Var.getMainScope(), null, null, new com.tencent.mm.plugin.finder.live.viewmodel.i3(m3Var, kotlinx.coroutines.l.d(m3Var.getMainScope(), null, null, new com.tencent.mm.plugin.finder.live.viewmodel.j3(m3Var, null), 3, null), appCompatActivity, null), 3, null);
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/viewmodel/FinderLiveBasePhoneNumberAuthUIC$sendButton$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
