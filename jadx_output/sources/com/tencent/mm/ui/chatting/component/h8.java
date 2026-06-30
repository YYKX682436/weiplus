package com.tencent.mm.ui.chatting.component;

/* loaded from: classes5.dex */
public final class h8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.chatting.component.y8 f199155d;

    public h8(com.tencent.mm.ui.chatting.component.y8 y8Var) {
        this.f199155d = y8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String lastText;
        com.tencent.mm.ui.chatting.component.y8 y8Var = this.f199155d;
        if (y8Var.f200303x && !y8Var.A0().getBoolean("hide_btn_bubble_guide", false)) {
            y8Var.M0(true);
            return;
        }
        if (y8Var.f200303x) {
            if (y8Var.t0()) {
                com.tencent.mm.pluginsdk.ui.chat.ChatFooter v07 = y8Var.v0();
                lastText = v07 != null ? v07.getLastText() : null;
                if (lastText == null || r26.n0.N(lastText)) {
                    y8Var.L0(true);
                    return;
                }
                return;
            }
            return;
        }
        if (!y8Var.A0().i("show_btn_guide", false)) {
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter v08 = y8Var.v0();
            java.lang.String lastText2 = v08 != null ? v08.getLastText() : null;
            if (lastText2 == null || r26.n0.N(lastText2)) {
                y8Var.N0(true);
                return;
            }
        }
        if (y8Var.t0()) {
            com.tencent.mm.pluginsdk.ui.chat.ChatFooter v09 = y8Var.v0();
            lastText = v09 != null ? v09.getLastText() : null;
            if (lastText == null || r26.n0.N(lastText)) {
                y8Var.L0(true);
                return;
            }
        }
        y8Var.N0(false);
    }
}
