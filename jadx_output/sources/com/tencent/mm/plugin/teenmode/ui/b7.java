package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class b7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI f172939d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f172940e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f172941f;

    public b7(com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI, android.view.View view, int i17) {
        this.f172939d = teenModePrivatePwdUI;
        this.f172940e = view;
        this.f172941f = i17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI = this.f172939d;
        android.view.View view = teenModePrivatePwdUI.f172910q;
        if (view == null) {
            kotlin.jvm.internal.o.o("mKBLayout");
            throw null;
        }
        boolean isShown = view.isShown();
        android.view.View view2 = this.f172940e;
        if (!isShown && view2.isShown()) {
            teenModePrivatePwdUI.showTenpayKB();
        }
        com.tenpay.android.wechat.MyKeyboardWindow myKeyboardWindow = teenModePrivatePwdUI.f172909p;
        if (myKeyboardWindow == null) {
            kotlin.jvm.internal.o.o("mKeyboard");
            throw null;
        }
        myKeyboardWindow.setXMode(this.f172941f);
        com.tenpay.android.wechat.MyKeyboardWindow myKeyboardWindow2 = teenModePrivatePwdUI.f172909p;
        if (myKeyboardWindow2 == null) {
            kotlin.jvm.internal.o.o("mKeyboard");
            throw null;
        }
        kotlin.jvm.internal.o.e(view2, "null cannot be cast to non-null type android.widget.EditText");
        myKeyboardWindow2.setInputEditText((android.widget.EditText) view2);
        java.lang.Object systemService = teenModePrivatePwdUI.getContext().getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(view2.getWindowToken(), 0);
    }
}
