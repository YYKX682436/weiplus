package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes8.dex */
public final class k implements android.view.View.OnSystemUiVisibilityChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView f185790a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f185791b;

    public k(com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView, android.view.ViewGroup viewGroup) {
        this.f185790a = mPVideoPlayFullScreenView;
        this.f185791b = viewGroup;
    }

    @Override // android.view.View.OnSystemUiVisibilityChangeListener
    public final void onSystemUiVisibilityChange(int i17) {
        if ((i17 & 4) == 0) {
            if (this.f185790a.getVisibility() == 0) {
                this.f185791b.setSystemUiVisibility(5894);
            }
        }
    }
}
