package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class o3 implements fl5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190530a;

    public o3(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190530a = chatFooter;
    }

    @Override // fl5.f
    public void a(java.lang.CharSequence charSequence) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190530a;
        chatFooter.f189998h6 = true;
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter.g(chatFooter, charSequence);
    }

    @Override // fl5.f
    public void sendKeyEvent(android.view.KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0 && keyEvent.getKeyCode() == 67) {
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190530a;
            chatFooter.f189998h6 = true;
            int max = java.lang.Math.max(chatFooter.f189961b4.getSelectionStart(), 0);
            int max2 = java.lang.Math.max(chatFooter.f189961b4.getSelectionEnd(), 0);
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter.g(chatFooter, max != max2 ? chatFooter.f189961b4.getText().subSequence(java.lang.Math.min(max, max2), java.lang.Math.max(max, max2)) : max > 0 ? chatFooter.f189961b4.getText().subSequence(max - 1, max) : null);
        }
    }
}
