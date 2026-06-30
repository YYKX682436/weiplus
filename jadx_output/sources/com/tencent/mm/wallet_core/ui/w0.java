package com.tencent.mm.wallet_core.ui;

/* loaded from: classes9.dex */
public class w0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.wallet_core.ui.x0 f214260d;

    public w0(com.tencent.mm.wallet_core.ui.x0 x0Var) {
        this.f214260d = x0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.wallet_core.ui.x0 x0Var = this.f214260d;
        x0Var.f214268i.hideTenpayKB();
        if (x0Var.f214263d) {
            ((android.view.inputmethod.InputMethodManager) x0Var.f214268i.getContext().getSystemService("input_method")).showSoftInput(x0Var.f214265f, 0);
        }
    }
}
