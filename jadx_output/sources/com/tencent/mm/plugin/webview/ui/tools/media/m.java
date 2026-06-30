package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes3.dex */
public final class m implements android.view.ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f185802d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView f185803e;

    public m(android.view.View view, com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        this.f185802d = view;
        this.f185803e = mPVideoPlayFullScreenView;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        this.f185802d.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView.b(this.f185803e);
    }
}
