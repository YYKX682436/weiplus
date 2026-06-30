package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes5.dex */
public final class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.CustomStatusView f173798d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f173799e;

    public d(com.tencent.mm.plugin.textstatus.ui.CustomStatusView customStatusView, android.content.Context context) {
        this.f173798d = customStatusView;
        this.f173799e = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = com.tencent.mm.plugin.textstatus.ui.CustomStatusView.I;
        com.tencent.mm.plugin.textstatus.ui.CustomStatusView customStatusView = this.f173798d;
        customStatusView.getClass();
        java.lang.Object systemService = this.f173799e.getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(customStatusView.f173408g, 0);
    }
}
