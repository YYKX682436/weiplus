package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class x7 implements com.tencent.mm.plugin.sight.decode.model.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoSightView f192001a;

    public x7(com.tencent.mm.pluginsdk.ui.tools.VideoSightView videoSightView) {
        this.f192001a = videoSightView;
    }

    @Override // com.tencent.mm.plugin.sight.decode.model.l
    public void a(com.tencent.mm.plugin.sight.decode.model.s sVar, long j17) {
        com.tencent.mm.pluginsdk.ui.tools.VideoSightView videoSightView = this.f192001a;
        if (videoSightView.T == 0) {
            videoSightView.T = videoSightView.getDuration();
        }
        if (videoSightView.L != null) {
            int i17 = videoSightView.T;
            videoSightView.L.q((int) j17, videoSightView.T);
        }
    }
}
