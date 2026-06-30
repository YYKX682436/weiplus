package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class l1 implements fl5.g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190458a;

    public l1(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190458a = chatFooter;
    }

    @Override // fl5.g
    public boolean a(fl5.i iVar, int i17, android.view.KeyEvent keyEvent) {
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = this.f190458a;
        if (i17 != 4 && (i17 != 0 || !chatFooter.X1)) {
            return false;
        }
        chatFooter.f190027n.performClick();
        return true;
    }
}
