package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes8.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView f185744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup.LayoutParams f185745e;

    public b0(com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView, android.view.ViewGroup.LayoutParams layoutParams) {
        this.f185744d = mPVideoPlayFullScreenView;
        this.f185745e = layoutParams;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185744d;
        android.content.Context context = mPVideoPlayFullScreenView.getContext();
        if ((context instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) && ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context).f183815f != null) {
            android.content.Context context2 = mPVideoPlayFullScreenView.getContext();
            kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
            ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) context2).f183815f.m();
        }
        mPVideoPlayFullScreenView.f185708e.setLayoutParams(this.f185745e);
    }
}
