package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class o4 extends com.tencent.mm.sdk.platformtools.n3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190531a;

    public o4(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190531a = chatFooter;
    }

    @Override // com.tencent.mm.sdk.platformtools.n3
    public void handleMessage(android.os.Message message) {
        if (message.what != 4097) {
            return;
        }
        hv4.l lVar = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.f189950x6;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190531a;
        chatFooter.getClass();
        android.view.ViewGroup.LayoutParams layoutParams = chatFooter.f190089x.getLayoutParams();
        int bottom = chatFooter.f190089x.getBottom() - chatFooter.f190089x.getTop();
        if (chatFooter.K0()) {
            com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = chatFooter.f189981f;
            if (chatFooterPanel != null) {
                chatFooterPanel.setVisibility(8);
            }
            chatFooter.setAppPanelVisible(8);
            chatFooter.f190089x.setVisibility(4);
        }
        if (bottom <= 3) {
            chatFooter.getClass();
            chatFooter.f190089x.setVisibility(4);
            chatFooter.X0(chatFooter.getKeyBordHeightPX());
            return;
        }
        layoutParams.height = java.lang.Math.max(bottom - 60, 1);
        com.tencent.mars.xlog.Log.e("MicroMsg.ChatFooter", "mBottomPanelAnim:bottomPanel height:" + layoutParams.height);
        chatFooter.f190089x.setLayoutParams(layoutParams);
        com.tencent.mm.sdk.platformtools.n3 n3Var = chatFooter.K5;
        n3Var.removeMessages(4097);
        n3Var.sendEmptyMessageDelayed(4097, 1);
    }
}
