package zl4;

/* loaded from: classes14.dex */
public final class h implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.playapp.radio_channel.floatball.TingRadioChannelFloatBallView f474081a;

    public h(com.tencent.mm.plugin.ting.playapp.radio_channel.floatball.TingRadioChannelFloatBallView tingRadioChannelFloatBallView) {
        this.f474081a = tingRadioChannelFloatBallView;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        com.tencent.mm.plugin.ting.playapp.radio_channel.floatball.TingRadioChannelFloatBallView tingRadioChannelFloatBallView = this.f474081a;
        if (bitmap == null || bitmap.isRecycled()) {
            int i17 = com.tencent.mm.plugin.ting.playapp.radio_channel.floatball.TingRadioChannelFloatBallView.f174730i;
            tingRadioChannelFloatBallView.getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.TingRadioChannelFloatBallView", "onLoadCoverFailed");
            pm0.v.X(new zl4.g(tingRadioChannelFloatBallView));
            return;
        }
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = tingRadioChannelFloatBallView.f174731d;
        if (mMRoundCornerImageView == null) {
            return;
        }
        mMRoundCornerImageView.setVisibility(0);
    }
}
