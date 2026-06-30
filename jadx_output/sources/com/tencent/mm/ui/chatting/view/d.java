package com.tencent.mm.ui.chatting.view;

/* loaded from: classes5.dex */
public class d implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.view.ChattingAvatarImageView f202899d;

    public d(com.tencent.mm.ui.chatting.view.ChattingAvatarImageView chattingAvatarImageView) {
        this.f202899d = chattingAvatarImageView;
    }

    @Override // java.lang.Runnable
    public void run() {
        int[] iArr = new int[2];
        this.f202899d.getLocationOnScreen(iArr);
        int dimensionPixelSize = com.tencent.mm.sdk.platformtools.x2.f193075e.getDimensionPixelSize(com.tencent.mm.R.dimen.f479738dv);
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-2, -2);
        layoutParams.rightMargin = dimensionPixelSize;
        layoutParams.leftMargin = dimensionPixelSize;
        com.tencent.mm.ui.chatting.view.ChattingAvatarImageView chattingAvatarImageView = this.f202899d;
        int i17 = com.tencent.mm.ui.chatting.view.ChattingAvatarImageView.f202819p;
        android.view.View contentView = chattingAvatarImageView.f152895i.getContentView();
        contentView.measure(0, 0);
        boolean z17 = iArr[0] > com.tencent.mm.ui.zk.e(this.f202899d.getContext(), com.tencent.mm.R.dimen.f479683ci);
        if (iArr[1] < com.tencent.mm.ui.bl.a(this.f202899d.getContext()) + com.tencent.mm.ui.bl.h(this.f202899d.getContext()) + contentView.getMeasuredHeight()) {
            com.tencent.mm.ui.chatting.view.ChattingAvatarImageView chattingAvatarImageView2 = this.f202899d;
            chattingAvatarImageView2.f202821n = true;
            chattingAvatarImageView2.f152895i.a(chattingAvatarImageView2, 0, 2, layoutParams, z17, true, false);
        } else {
            com.tencent.mm.ui.chatting.view.ChattingAvatarImageView chattingAvatarImageView3 = this.f202899d;
            chattingAvatarImageView3.f202821n = false;
            chattingAvatarImageView3.f152895i.a(chattingAvatarImageView3, 0, 1, layoutParams, z17, true, false);
        }
        this.f202899d.post(new com.tencent.mm.ui.chatting.view.c(this, iArr));
    }
}
