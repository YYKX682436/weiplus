package wl4;

/* loaded from: classes14.dex */
public final class k implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.playapp.custom.TingCustomFlotBallView f447091a;

    public k(com.tencent.mm.plugin.ting.playapp.custom.TingCustomFlotBallView tingCustomFlotBallView) {
        this.f447091a = tingCustomFlotBallView;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        com.tencent.mm.plugin.ting.playapp.custom.TingCustomFlotBallView tingCustomFlotBallView = this.f447091a;
        if (bitmap == null || bitmap.isRecycled()) {
            int i17 = com.tencent.mm.plugin.ting.playapp.custom.TingCustomFlotBallView.f174718i;
            tingCustomFlotBallView.getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.TingRadioChannelFloatBallView", "onLoadCoverFailed");
            pm0.v.X(new wl4.j(tingCustomFlotBallView));
            return;
        }
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = tingCustomFlotBallView.f174719d;
        if (mMRoundCornerImageView == null) {
            return;
        }
        mMRoundCornerImageView.setVisibility(0);
    }
}
