package com.tencent.mm.plugin.textstatus.ui;

/* loaded from: classes11.dex */
public final class y implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.textstatus.ui.LongTextView f174440d;

    public y(com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView) {
        this.f174440d = longTextView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.textstatus.ui.LongTextView longTextView = this.f174440d;
        android.view.ViewGroup rootView = longTextView.getRootView();
        if (rootView != null) {
            rootView.requestLayout();
        }
        android.widget.TextView tvLongText = longTextView.getTvLongText();
        if (tvLongText != null) {
            tvLongText.requestLayout();
        }
    }
}
