package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class s7 implements com.tencent.mm.plugin.sight.decode.model.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoSightCenterView f191899a;

    public s7(com.tencent.mm.pluginsdk.ui.tools.VideoSightCenterView videoSightCenterView) {
        this.f191899a = videoSightCenterView;
    }

    @Override // com.tencent.mm.plugin.sight.decode.model.l
    public void a(com.tencent.mm.plugin.sight.decode.model.s sVar, long j17) {
        com.tencent.mm.pluginsdk.ui.tools.VideoSightCenterView videoSightCenterView = this.f191899a;
        if (videoSightCenterView.T == 0) {
            videoSightCenterView.T = videoSightCenterView.getDuration();
        }
        if (videoSightCenterView.L != null) {
            int i17 = videoSightCenterView.T;
            videoSightCenterView.f191465x0 = (int) (1000 * j17);
            videoSightCenterView.L.q((int) j17, videoSightCenterView.T);
        }
    }
}
