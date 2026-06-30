package com.tencent.mm.ui.tools;

/* loaded from: classes12.dex */
public class o8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.fragment.app.FragmentActivity f210620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.tools.c9 f210621e;

    public o8(com.tencent.mm.ui.tools.c9 c9Var, androidx.fragment.app.FragmentActivity fragmentActivity) {
        this.f210621e = c9Var;
        this.f210620d = fragmentActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View findViewById;
        android.view.View currentFocus;
        android.os.IBinder windowToken;
        com.tencent.mm.ui.tools.c9 c9Var = this.f210621e;
        if (c9Var.f210321f == null) {
            com.tencent.mars.xlog.Log.w(c9Var.f210316a, "want to collapse search view, but search menu item is null");
            return;
        }
        androidx.fragment.app.FragmentActivity fragmentActivity = this.f210620d;
        if (fragmentActivity != null && !fragmentActivity.isFinishing()) {
            c9Var.getClass();
            android.view.inputmethod.InputMethodManager inputMethodManager = (android.view.inputmethod.InputMethodManager) fragmentActivity.getSystemService("input_method");
            if (inputMethodManager != null && (currentFocus = fragmentActivity.getCurrentFocus()) != null && (windowToken = currentFocus.getWindowToken()) != null) {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            }
        }
        android.view.View actionView = c9Var.f210321f.getActionView();
        if (actionView == null || (findViewById = actionView.findViewById(com.tencent.mm.R.id.d98)) == null) {
            return;
        }
        findViewById.clearFocus();
    }
}
