package com.tencent.mm.plugin.location.ui.impl;

/* loaded from: classes15.dex */
public class l1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.location.ui.impl.x1 f144845d;

    public l1(com.tencent.mm.plugin.location.ui.impl.x1 x1Var) {
        this.f144845d = x1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View currentFocus;
        com.tencent.mm.plugin.location.ui.impl.x1 x1Var = this.f144845d;
        x1Var.S1 = true;
        x1Var.D1.requestFocus();
        android.app.Activity activity = x1Var.f144909d;
        android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) activity.getSystemService("input_method");
        if (inputMethodManager != null && (currentFocus = activity.getCurrentFocus()) != null && currentFocus.getWindowToken() != null) {
            inputMethodManager.toggleSoftInput(0, 2);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMPoiMapUI", "showSoftInputMethod");
    }
}
