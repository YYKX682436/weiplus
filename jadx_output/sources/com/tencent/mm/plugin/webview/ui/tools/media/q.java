package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes3.dex */
public final class q implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView f185811d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ double f185812e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ double f185813f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ double[] f185814g;

    public q(com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView, double d17, double d18, double[] dArr) {
        this.f185811d = mPVideoPlayFullScreenView;
        this.f185812e = d17;
        this.f185813f = d18;
        this.f185814g = dArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar;
        com.tencent.mm.plugin.webview.ui.tools.media.MPVideoPlayFullScreenView mPVideoPlayFullScreenView = this.f185811d;
        com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar2 = mPVideoPlayFullScreenView.f185728z;
        if (redesignVideoPlayerSeekBar2 != null) {
            redesignVideoPlayerSeekBar2.setVideoTotalTime((int) this.f185812e);
        }
        com.tencent.mm.pluginsdk.ui.tools.RedesignVideoPlayerSeekBar redesignVideoPlayerSeekBar3 = mPVideoPlayFullScreenView.f185728z;
        if (redesignVideoPlayerSeekBar3 != null) {
            redesignVideoPlayerSeekBar3.a((int) this.f185813f);
        }
        double[] dArr = this.f185814g;
        if (dArr != null) {
            if (!(!(dArr.length == 0)) || (redesignVideoPlayerSeekBar = mPVideoPlayFullScreenView.f185728z) == null) {
                return;
            }
            redesignVideoPlayerSeekBar.v((int) dArr[dArr.length - 1]);
        }
    }
}
