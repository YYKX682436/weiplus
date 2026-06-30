package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class j1 implements android.view.View.OnFocusChangeListener {
    public j1(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
    }

    @Override // android.view.View.OnFocusChangeListener
    public void onFocusChange(android.view.View view, boolean z17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "onFocusChange: %s", java.lang.Boolean.valueOf(z17));
    }
}
