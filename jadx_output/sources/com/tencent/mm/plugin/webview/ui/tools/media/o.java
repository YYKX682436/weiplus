package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes8.dex */
public final class o implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView f185808d;

    public o(com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        this.f185808d = mPVideoPlayFullScreenView;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public final boolean onTimerExpired() {
        int i17 = com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView.f185705y0;
        this.f185808d.p();
        return false;
    }
}
