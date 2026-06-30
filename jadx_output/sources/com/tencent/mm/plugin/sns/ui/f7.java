package com.tencent.mm.plugin.sns.ui;

/* loaded from: classes4.dex */
public class f7 implements com.tencent.mm.pluginsdk.ui.tools.e4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.sns.ui.OfflineVideoView f168310d;

    public f7(com.tencent.mm.plugin.sns.ui.OfflineVideoView offlineVideoView) {
        this.f168310d = offlineVideoView;
    }

    @Override // com.tencent.mm.pluginsdk.ui.tools.e4
    public void v() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onTextureUpdate", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$7");
        com.tencent.mm.plugin.sns.ui.OfflineVideoView offlineVideoView = this.f168310d;
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflineVideoView", "%d on texture update.", java.lang.Integer.valueOf(offlineVideoView.hashCode()));
        try {
            offlineVideoView.o(true, 1.0f);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OfflineVideoView", "texture view update. error " + e17.toString());
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onTextureUpdate", "com.tencent.mm.plugin.sns.ui.OfflineVideoView$7");
    }
}
