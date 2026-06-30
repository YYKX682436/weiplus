package t74;

/* loaded from: classes4.dex */
public final class c implements com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewFirstFrameRenderCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416117a;

    public c(t74.w1 w1Var) {
        this.f416117a = w1Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewFirstFrameRenderCallback
    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readerFirstFrame", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1$3");
        t74.w1 w1Var = this.f416117a;
        com.tencent.mars.xlog.Log.i(w1Var.j(), "frontOnlineVideoView firstFrameRender callback");
        android.widget.ImageView V = t74.w1.V(w1Var);
        if (V != null) {
            V.setVisibility(4);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readerFirstFrame", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1$3");
    }
}
