package com.tencent.mm.pluginsdk.ui.chat;

/* loaded from: classes5.dex */
public class w1 implements al5.q1 {

    /* renamed from: a, reason: collision with root package name */
    public long f190702a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.chat.ChatFooter f190703b;

    public w1(com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter) {
        this.f190703b = chatFooter;
    }

    public boolean a(int i17, android.view.KeyEvent keyEvent) {
        if (i17 != 66 || c01.id.c() - this.f190702a <= 1000 || !com.tencent.mm.ui.bk.v0() || !com.tencent.mm.ui.bk.y() || keyEvent.isAltPressed() || keyEvent.isCtrlPressed()) {
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.ChatFooter", "KeyCode Enter");
        this.f190702a = c01.id.c();
        this.f190703b.f190027n.performClick();
        return true;
    }
}
