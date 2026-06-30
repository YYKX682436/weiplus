package com.tencent.mm.plugin.mmsight.segment;

/* loaded from: classes10.dex */
public class o implements com.tencent.mm.pluginsdk.ui.tools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.mmsight.segment.MMSightEditUI f149062d;

    public o(com.tencent.mm.plugin.mmsight.segment.MMSightEditUI mMSightEditUI) {
        this.f149062d = mMSightEditUI;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void T4(int i17, int i18) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onCompletion() {
        this.f149062d.f148859e.a(0.0d, true);
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onError(int i17, int i18) {
        com.tencent.mars.xlog.Log.e("MicroMsg.MMSightEditUI", "%d on error what %d extra %d", java.lang.Integer.valueOf(this.f149062d.hashCode()), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public void onPrepared() {
        com.tencent.mm.plugin.mmsight.segment.MMSightEditUI mMSightEditUI = this.f149062d;
        com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView videoPlayerTextureView = mMSightEditUI.f148859e;
        if (videoPlayerTextureView != null) {
            videoPlayerTextureView.start();
            mMSightEditUI.f148859e.setLoop(true);
            mMSightEditUI.f148859e.setAlpha(1.0f);
            com.tencent.mm.sdk.platformtools.u3.i(new com.tencent.mm.plugin.mmsight.segment.n(this), 300L);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.a4
    public int q(int i17, int i18) {
        return 0;
    }
}
