package com.tencent.mm.plugin.sns.ui.listener;

/* loaded from: classes.dex */
public final class b implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f169748d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f169749e;

    public b(android.content.Context context, android.view.View view) {
        this.f169748d = context;
        this.f169749e = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.SnsAutoShowVKBOnUICreate$launch$1");
        android.content.Context context = this.f169748d;
        java.lang.Object systemService = context != null ? context.getSystemService("input_method") : null;
        android.view.inputmethod.InputMethodManager inputMethodManager = systemService instanceof android.view.inputmethod.InputMethodManager ? (android.view.inputmethod.InputMethodManager) systemService : null;
        java.lang.Boolean valueOf = inputMethodManager != null ? java.lang.Boolean.valueOf(inputMethodManager.showSoftInput(this.f169749e, 0)) : null;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.listener.SnsAutoShowVKBOnUICreate");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getTAG$p", "com.tencent.mm.plugin.sns.ui.listener.SnsAutoShowVKBOnUICreate");
        com.tencent.mars.xlog.Log.i("MicroMsg.SnsAutoShowVKBOnUICreate", "launch: result:" + valueOf + ", from:" + context);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("run", "com.tencent.mm.plugin.sns.ui.listener.SnsAutoShowVKBOnUICreate$launch$1");
    }
}
