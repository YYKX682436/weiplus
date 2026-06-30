package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes8.dex */
public final class p implements m34.e {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView f185809d;

    public p(com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView) {
        this.f185809d = mPVideoPlayFullScreenView;
    }

    @Override // m34.e
    public void a(int i17) {
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185809d;
        com.tencent.mars.xlog.Log.i(mPVideoPlayFullScreenView.f185707d, "initSeekBar onSeekTo " + i17);
        com.tencent.xweb.o0 o0Var = mPVideoPlayFullScreenView.f185727y;
        if (o0Var != null) {
            o0Var.a(i17);
        }
    }

    @Override // m34.e
    public void b() {
    }

    @Override // m34.e
    public void d(int i17) {
    }
}
