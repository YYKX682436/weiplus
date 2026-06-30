package xl4;

/* loaded from: classes14.dex */
public final class h implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.playapp.finderaudio.FinderAudioFloatBallView f455130a;

    public h(com.tencent.mm.plugin.ting.playapp.finderaudio.FinderAudioFloatBallView finderAudioFloatBallView) {
        this.f455130a = finderAudioFloatBallView;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        com.tencent.mm.plugin.ting.playapp.finderaudio.FinderAudioFloatBallView finderAudioFloatBallView = this.f455130a;
        if (bitmap == null || bitmap.isRecycled()) {
            int i17 = com.tencent.mm.plugin.ting.playapp.finderaudio.FinderAudioFloatBallView.f174724i;
            finderAudioFloatBallView.getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.TingRadioChannelFloatBallView", "onLoadCoverFailed");
            pm0.v.X(new xl4.g(finderAudioFloatBallView));
            return;
        }
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = finderAudioFloatBallView.f174725d;
        if (mMRoundCornerImageView == null) {
            return;
        }
        mMRoundCornerImageView.setVisibility(0);
    }
}
