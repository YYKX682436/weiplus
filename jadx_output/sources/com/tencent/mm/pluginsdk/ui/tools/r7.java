package com.tencent.mm.pluginsdk.ui.tools;

/* loaded from: classes15.dex */
public class r7 implements com.tencent.mm.plugin.sight.decode.model.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.tools.VideoSightCenterView f191880a;

    public r7(com.tencent.mm.pluginsdk.ui.tools.VideoSightCenterView videoSightCenterView) {
        this.f191880a = videoSightCenterView;
    }

    @Override // com.tencent.mm.plugin.sight.decode.model.k
    public void a(com.tencent.mm.plugin.sight.decode.model.s sVar, int i17) {
        if (-1 == i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoSightCenterView", "error stop, isCompletion: %s", java.lang.Boolean.valueOf(this.f191880a.W));
            com.tencent.mm.pluginsdk.ui.tools.VideoSightCenterView videoSightCenterView = this.f191880a;
            if (videoSightCenterView.L == null || videoSightCenterView.W) {
                return;
            }
            this.f191880a.L.onError(0, 0);
            return;
        }
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.VideoSightCenterView", "normal stop");
            this.f191880a.W = true;
            com.tencent.mm.pluginsdk.ui.tools.a4 a4Var = this.f191880a.L;
            if (a4Var != null) {
                a4Var.onCompletion();
            }
        }
    }
}
