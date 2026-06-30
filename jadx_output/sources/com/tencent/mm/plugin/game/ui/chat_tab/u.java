package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class u implements l75.q0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView f141316d;

    public u(com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView gameHotMsgView) {
        this.f141316d = gameHotMsgView;
    }

    @Override // l75.q0
    public void onNotifyChange(java.lang.String str, l75.w0 w0Var) {
        if (w0Var.f316976d instanceof z53.i) {
            int i17 = com.tencent.mm.plugin.game.ui.chat_tab.GameHotMsgView.f141122l2;
            this.f141316d.l1();
        }
    }
}
