package vl4;

/* loaded from: classes14.dex */
public final class o implements ff0.v {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.ting.playapp.chatroom.TingChatRoomFloatBallView f437897a;

    public o(com.tencent.mm.plugin.ting.playapp.chatroom.TingChatRoomFloatBallView tingChatRoomFloatBallView) {
        this.f437897a = tingChatRoomFloatBallView;
    }

    @Override // ff0.v
    public void a(java.lang.String str, android.view.View view, android.graphics.Bitmap bitmap, boolean z17) {
        com.tencent.mm.plugin.ting.playapp.chatroom.TingChatRoomFloatBallView tingChatRoomFloatBallView = this.f437897a;
        if (bitmap == null || bitmap.isRecycled()) {
            int i17 = com.tencent.mm.plugin.ting.playapp.chatroom.TingChatRoomFloatBallView.f174712i;
            tingChatRoomFloatBallView.getClass();
            com.tencent.mars.xlog.Log.e("MicroMsg.TingChatRoomFloatBallView", "onLoadCoverFailed");
            pm0.v.X(new vl4.n(tingChatRoomFloatBallView));
            return;
        }
        com.tencent.mm.ui.widget.MMRoundCornerImageView mMRoundCornerImageView = tingChatRoomFloatBallView.f174713d;
        if (mMRoundCornerImageView == null) {
            return;
        }
        mMRoundCornerImageView.setVisibility(0);
    }
}
