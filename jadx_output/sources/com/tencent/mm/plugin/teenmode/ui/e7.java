package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class e7 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI f172984d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f172985e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f172986f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tenpay.android.wechat.TempSecureEditText f172987g;

    public e7(com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI, boolean z17, int i17, com.tenpay.android.wechat.TempSecureEditText tempSecureEditText) {
        this.f172984d = teenModePrivatePwdUI;
        this.f172985e = z17;
        this.f172986f = i17;
        this.f172987g = tempSecureEditText;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$setEditFocusListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI = this.f172984d;
        android.view.View view2 = teenModePrivatePwdUI.f172910q;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("mKBLayout");
            throw null;
        }
        boolean isShown = view2.isShown();
        boolean z17 = this.f172985e;
        if (!isShown && !z17) {
            teenModePrivatePwdUI.showTenpayKB();
            com.tenpay.android.wechat.MyKeyboardWindow myKeyboardWindow = teenModePrivatePwdUI.f172909p;
            if (myKeyboardWindow == null) {
                kotlin.jvm.internal.o.o("mKeyboard");
                throw null;
            }
            myKeyboardWindow.setXMode(this.f172986f);
        } else if (z17) {
            teenModePrivatePwdUI.hideTenpayKB();
            java.lang.Object systemService = teenModePrivatePwdUI.getContext().getSystemService("input_method");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(this.f172987g, 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/TeenModePrivatePwdUI$setEditFocusListener$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
