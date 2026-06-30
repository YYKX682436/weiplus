package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class m3 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190483d;

    public m3(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190483d = chatFooter;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190483d;
        if (chatFooter.f189968c6 != com.tencent.mm.pluginsdk.ui.chat.b5.MODE_TRANS) {
            return true;
        }
        java.lang.String str = (java.lang.String) ((java.util.HashMap) chatFooter.f189980e6).get(java.lang.Integer.valueOf(chatFooter.f190082v6));
        if (str == null) {
            str = "";
        }
        if (chatFooter.V4.getVisibility() == 0) {
            return true;
        }
        chatFooter.f189961b4.setText(pg5.d.a(chatFooter.getContext(), str));
        com.tencent.mm.ui.widget.MMEditText mMEditText = chatFooter.f189961b4;
        mMEditText.setSelection(mMEditText.getText().length());
        return true;
    }
}
