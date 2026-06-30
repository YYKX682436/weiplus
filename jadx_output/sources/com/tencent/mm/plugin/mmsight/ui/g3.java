package com.tencent.mm.plugin.mmsight.ui;

/* loaded from: classes10.dex */
public class g3 implements com.tencent.mm.pluginsdk.ui.tools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.ui.SightCaptureUI f149335d;

    public g3(com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI) {
        this.f149335d = sightCaptureUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        this.f149335d.H.a(0.0d, true);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.SightCaptureUI", "%d on error what %d extra %d", java.lang.Integer.valueOf(this.f149335d.hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        com.tencent.mm.plugin.mmsight.ui.SightCaptureUI sightCaptureUI = this.f149335d;
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = sightCaptureUI.H;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.start();
            sightCaptureUI.H.setLoop(true);
        }
        com.tencent.mm.sdk.platformtools.u3.l(sightCaptureUI.L1);
        sightCaptureUI.H.setOneTimeVideoTextureUpdateCallback(new com.tencent.mm.plugin.mmsight.ui.f3(this));
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        return 0;
    }
}
