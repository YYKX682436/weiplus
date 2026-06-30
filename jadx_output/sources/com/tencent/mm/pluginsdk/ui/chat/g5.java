package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class g5 implements android.text.TextWatcher {

    /* renamed from: d, reason: collision with root package name */
    public final android.text.TextWatcher f190329d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f190330e = false;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190331f;

    public g5(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter, android.text.TextWatcher textWatcher) {
        this.f190331f = chatFooter;
        this.f190329d = textWatcher;
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(android.text.Editable editable) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190331f;
        if (!chatFooter.f190043p3 && chatFooter.X1 && this.f190330e && editable.length() > 0) {
            this.f190330e = false;
            chatFooter.f190021m.setText(editable.subSequence(0, editable.length() - 1));
            if (chatFooter.f190021m.length() > 0) {
                chatFooter.f190027n.performClick();
                com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "enter button, do send");
            }
            java.lang.System.currentTimeMillis();
            return;
        }
        this.f190329d.afterTextChanged(editable);
        if (chatFooter.f190033o != null) {
            if (chatFooter.f190021m.getLineCount() > 1) {
                chatFooter.f190033o.setVisibility(0);
                chatFooter.f190033o.setText("" + editable.length() + "/140");
            } else {
                chatFooter.f190033o.setVisibility(8);
            }
        }
        boolean m17 = com.tencent.mm.pluginsdk.ui.chat.ChatFooter.m(chatFooter, editable);
        if (!com.tencent.mm.pluginsdk.ui.chat.ChatFooter.n(chatFooter, m17)) {
            chatFooter.B(m17);
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = chatFooter.f189981f;
        if (chatFooterPanel != null) {
            chatFooterPanel.setSendButtonEnable(m17);
        }
        java.lang.System.currentTimeMillis();
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        this.f190329d.beforeTextChanged(charSequence, i17, i18, i19);
        java.lang.System.currentTimeMillis();
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(java.lang.CharSequence charSequence, int i17, int i18, int i19) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190331f;
        if (!chatFooter.f190043p3 && chatFooter.X1 && i18 == 0 && i17 == charSequence.length() - 1 && i19 == 1 && charSequence.charAt(charSequence.length() - 1) == '\n') {
            com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "text changed, enter button");
            this.f190330e = true;
            return;
        }
        this.f190329d.onTextChanged(charSequence, i17, i18, i19);
        chatFooter.f190028n2 = true;
        com.tencent.mm.autogen.mmdata.rpt.AndroidChatInputStruct androidChatInputStruct = chatFooter.P2;
        androidChatInputStruct.f55044g++;
        androidChatInputStruct.f55042e = androidChatInputStruct.i();
        com.tencent.mm.autogen.mmdata.rpt.AndroidChatInputStruct androidChatInputStruct2 = chatFooter.P2;
        if (androidChatInputStruct2.f55041d == 0) {
            androidChatInputStruct2.f55041d = androidChatInputStruct2.i();
        }
        com.tencent.mm.pluginsdk.ui.ChatFooterPanel chatFooterPanel = chatFooter.f189981f;
        if (chatFooterPanel != null) {
            chatFooterPanel.setToSendText(chatFooter.f190021m.getText().toString());
        }
    }
}
