package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public final class c7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI f172956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f172957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tenpay.android.wechat.TempSecureEditText f172958f;

    public c7(com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI, boolean z17, com.tenpay.android.wechat.TempSecureEditText tempSecureEditText) {
        this.f172956d = teenModePrivatePwdUI;
        this.f172957e = z17;
        this.f172958f = tempSecureEditText;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI teenModePrivatePwdUI = this.f172956d;
        teenModePrivatePwdUI.hideTenpayKB();
        if (this.f172957e) {
            java.lang.Object systemService = teenModePrivatePwdUI.getContext().getSystemService("input_method");
            kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(this.f172958f, 0);
        }
    }
}
