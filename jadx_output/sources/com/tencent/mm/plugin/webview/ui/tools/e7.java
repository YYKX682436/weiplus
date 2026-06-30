package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class e7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f184139d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ bw5.lp0 f184140e;

    public e7(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var, android.app.Activity activity, bw5.lp0 lp0Var) {
        this.f184139d = activity;
        this.f184140e = lp0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.app.Activity activity = this.f184139d;
        com.tencent.mm.ui.widget.snackbar.j.c(activity.getResources().getString(com.tencent.mm.R.string.jyw), activity.getResources().getString(com.tencent.mm.R.string.f490599zl), activity, new com.tencent.mm.plugin.webview.ui.tools.d7(this), null);
    }
}
