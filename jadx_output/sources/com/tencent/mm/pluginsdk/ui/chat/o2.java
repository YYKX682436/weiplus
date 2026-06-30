package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class o2 implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190529a;

    public o2(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190529a = chatFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190529a;
        chatFooter.V1 = 1;
        chatFooter.y1(true);
        chatFooter.f190039p.setVisibility(8);
        chatFooter.U0(true);
        chatFooter.Q1(com.tencent.mm.R.drawable.f481237o3);
        try {
            chatFooter.f190021m.n(str);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChatFooter", e17, "", new java.lang.Object[0]);
        }
        chatFooter.P2.f55046i++;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190529a;
        chatFooter.V1 = 1;
        chatFooter.y1(true);
        chatFooter.f190039p.setVisibility(8);
        chatFooter.U0(true);
        chatFooter.Q1(com.tencent.mm.R.drawable.f481237o3);
        android.view.inputmethod.InputConnection inputConnection = chatFooter.f190021m.getInputConnection();
        if (inputConnection != null) {
            inputConnection.sendKeyEvent(new android.view.KeyEvent(0, 67));
            inputConnection.sendKeyEvent(new android.view.KeyEvent(1, 67));
        }
        chatFooter.P2.f55046i--;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "onToSendTextEnable: %s", java.lang.Boolean.valueOf(z17));
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190529a;
        if (chatFooter.f189970d2 == 2) {
            chatFooter.V1 = 1;
            chatFooter.y1(true);
            chatFooter.f190039p.setVisibility(8);
            chatFooter.Q1(com.tencent.mm.R.drawable.f481237o3);
            if (chatFooter.f190021m != null) {
                chatFooter.setToSendTextColor(z17);
            }
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190529a;
        chatFooter.V1 = 1;
        chatFooter.G.setVisibility(0);
        chatFooter.D.setVisibility(0);
        chatFooter.f190039p.setVisibility(8);
        chatFooter.U0(true);
        chatFooter.Q1(com.tencent.mm.R.drawable.f481237o3);
        android.widget.Button button = chatFooter.f190027n;
        if (button != null) {
            button.performClick();
        }
    }
}
