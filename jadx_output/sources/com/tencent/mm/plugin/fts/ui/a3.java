package com.tencent.mm.plugin.fts.ui;

/* loaded from: classes7.dex */
public final class a3 implements android.widget.PopupWindow.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f138015d;

    public a3(android.view.View view) {
        this.f138015d = view;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        android.view.View overlayView = this.f138015d;
        kotlin.jvm.internal.o.f(overlayView, "$overlayView");
        com.tencent.mm.ui.kk.c(overlayView);
    }
}
