package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class g3 implements android.widget.TextView.OnEditorActionListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190327d;

    public g3(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190327d = chatFooter;
    }

    @Override // android.widget.TextView.OnEditorActionListener
    public boolean onEditorAction(android.widget.TextView textView, int i17, android.view.KeyEvent keyEvent) {
        if (4 != i17 && 66 != keyEvent.getAction()) {
            return false;
        }
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190327d;
        java.lang.String obj = chatFooter.f189961b4.getText().toString();
        if (chatFooter.f190090x0 == null) {
            return true;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(obj)) {
            chatFooter.f190090x0.d(obj);
        }
        chatFooter.f190090x0.o();
        return true;
    }
}
