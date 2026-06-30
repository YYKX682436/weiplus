package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class b1 implements com.tencent.mm.pluginsdk.ui.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190184a;

    public b1(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190184a = chatFooter;
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void a(java.lang.String str) {
        try {
            com.tencent.mm.ui.widget.MMEditText mMEditText = this.f190184a.f189961b4;
            if (mMEditText != null) {
                mMEditText.n(str);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.ChatFooter", e17, "v2tSmileyPanel append", new java.lang.Object[0]);
        }
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void b() {
        android.view.inputmethod.InputConnection inputConnection;
        com.tencent.mm.ui.widget.MMEditText mMEditText = this.f190184a.f189961b4;
        if (mMEditText == null || (inputConnection = mMEditText.getInputConnection()) == null) {
            return;
        }
        inputConnection.sendKeyEvent(new android.view.KeyEvent(0, 67));
        inputConnection.sendKeyEvent(new android.view.KeyEvent(1, 67));
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void c(boolean z17) {
    }

    @Override // com.tencent.mm.pluginsdk.ui.k0
    public void d() {
    }
}
