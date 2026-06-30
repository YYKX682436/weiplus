package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes3.dex */
public final class d0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView f185754d;

    public d0(com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        this.f185754d = mPVideoPlayFullScreenView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.ProgressBar progressBar;
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185754d;
        android.widget.ProgressBar progressBar2 = mPVideoPlayFullScreenView.B;
        if ((progressBar2 != null && progressBar2.getVisibility() == 0) || (progressBar = mPVideoPlayFullScreenView.B) == null) {
            return;
        }
        progressBar.setVisibility(0);
    }
}
