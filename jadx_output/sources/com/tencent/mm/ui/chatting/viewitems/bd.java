package com.tencent.mm.ui.chatting.viewitems;

/* loaded from: classes9.dex */
public abstract class bd {
    public static void a(android.content.Context context, java.lang.String str) {
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("sender_name", str);
        intent.putExtra("rawUrl", "https://payapp.weixin.qq.com/transfertochange/jumpclienterrpage/jumppage#wechat_pay");
        j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingItemAppMsgRemittance", "remittance data lose, jump to h5 page, url = %s", "https://payapp.weixin.qq.com/transfertochange/jumpclienterrpage/jumppage#wechat_pay");
    }

    public static com.tencent.mm.storage.a9 b(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgRemittance", "[createExtInfoImpl] msg == null");
            return null;
        }
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.ChattingItemAppMsgRemittance", "[createExtInfoImpl] content == null");
            return null;
        }
        com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent walletQueryRemittanceStatusEvent = new com.tencent.mm.autogen.events.WalletQueryRemittanceStatusEvent();
        walletQueryRemittanceStatusEvent.f54971g.f8421a = v17.L0;
        walletQueryRemittanceStatusEvent.e();
        return new com.tencent.mm.ui.chatting.viewitems.ad(walletQueryRemittanceStatusEvent);
    }

    public static void c(com.tencent.mm.ui.chatting.viewitems.wc wcVar, int i17) {
        wcVar.f205919c.setVisibility(8);
        wcVar.resetChatBubbleWidthWithNewStyle(wcVar.clickArea, wcVar.f205924h);
        wcVar.clickArea.setBackgroundResource(i17);
        wcVar.clickArea.setPadding(0, 0, 0, 0);
        wcVar.f205920d.setText(com.tencent.mm.R.string.f490861b53);
        wcVar.f205918b.setImageResource(com.tencent.mm.R.raw.c2c_remittance_icon);
    }
}
