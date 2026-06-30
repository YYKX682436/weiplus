package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class d7 implements android.view.View.OnFocusChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI f172969d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f172970e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View.OnFocusChangeListener f172971f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f172972g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.tenpay.android.wechat.TempSecureEditText f172973h;

    public d7(com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI, boolean z17, android.view.View.OnFocusChangeListener onFocusChangeListener, int i17, com.tenpay.android.wechat.TempSecureEditText tempSecureEditText) {
        this.f172969d = teenModePrivatePwdUI;
        this.f172970e = z17;
        this.f172971f = onFocusChangeListener;
        this.f172972g = i17;
        this.f172973h = tempSecureEditText;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI = this.f172969d;
        teenModePrivatePwdUI.hideVKB();
        boolean isFocused = view.isFocused();
        boolean z18 = this.f172970e;
        if (!isFocused || z18) {
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.teenmode.ui.c7(teenModePrivatePwdUI, z18, this.f172973h), 200L);
        } else {
            java.lang.Object systemService = teenModePrivatePwdUI.getContext().getSystemService("input_method");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((android.view.inputmethod.InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
            new com.tencent.mm.sdk.platformtools.n3().postDelayed(new com.tencent.mm.plugin.teenmode.ui.b7(teenModePrivatePwdUI, view, this.f172972g), 300L);
        }
        android.view.View.OnFocusChangeListener onFocusChangeListener = this.f172971f;
        if (onFocusChangeListener != null) {
            onFocusChangeListener.onFocusChange(view, z17);
        }
    }
}
