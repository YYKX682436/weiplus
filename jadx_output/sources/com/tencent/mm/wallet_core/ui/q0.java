package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f214214d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.s0 f214215e;

    public q0(com.tencent.mm.wallet_core.ui.s0 s0Var, android.view.View view) {
        this.f214215e = s0Var;
        this.f214214d = view;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.wallet_core.ui.s0 s0Var = this.f214215e;
        boolean isShown = s0Var.f214229h.mWcKeyboard.isShown();
        android.view.View view = this.f214214d;
        if (!isShown && view.isShown()) {
            if (s0Var.f214226e || !s0Var.f214225d) {
                s0Var.f214229h.showNormalStWcKb();
            }
            s0Var.f214225d = false;
        }
        s0Var.f214229h.mWcKeyboard.setInputEditText(s0Var.f214227f);
        ((android.view.inputmethod.InputMethodManager) s0Var.f214229h.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
