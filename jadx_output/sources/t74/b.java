package t74;

/* loaded from: classes4.dex */
public final class b implements com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewFirstFrameRenderCallback {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t74.w1 f416103a;

    public b(t74.w1 w1Var) {
        this.f416103a = w1Var;
    }

    @Override // com.tencent.mm.plugin.sns.ui.OnlineVideoView.IVideoViewFirstFrameRenderCallback
    public final void a() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("readerFirstFrame", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1$2");
        t74.w1 w1Var = this.f416103a;
        com.tencent.mars.xlog.Log.i(w1Var.j(), "backOnlineVideoView firstFrameRender callback");
        android.widget.ImageView J2 = t74.w1.J(w1Var);
        if (J2 != null) {
            J2.setVisibility(4);
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("readerFirstFrame", "com.tencent.mm.plugin.sns.ad.timeline.item.flipcard.AdFlipCardComponent$bindComponentModel$1$2");
    }
}
