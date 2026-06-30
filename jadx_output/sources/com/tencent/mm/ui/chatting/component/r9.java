package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.l0.class)
/* loaded from: classes9.dex */
public class r9 extends com.tencent.mm.ui.chatting.component.a implements sb5.l0 {
    public static boolean m0(com.tencent.mm.ui.chatting.component.r9 r9Var, com.tencent.mm.pluginsdk.ui.tools.m7 m7Var) {
        r9Var.getClass();
        java.lang.String str = m7Var.f191776a;
        if (str != null) {
            dk5.w.f234966a.c(new ut.s0(r9Var.f198580d.x(), str));
            return true;
        }
        android.app.Activity g17 = r9Var.f198580d.g();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(g17);
        e4Var.f211776c = r9Var.f198580d.g().getString(com.tencent.mm.R.string.dbd);
        e4Var.c();
        return false;
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        n0();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void a() {
        o0();
    }

    public void n0() {
        if (this.f198580d.p() != null) {
            this.f198580d.p().setOnDragListener(null);
        }
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) this.f198580d.f460708c.a(sb5.s0.class))).f199263e;
        if (chatFooter != null) {
            chatFooter.setOnDragListener(null);
            chatFooter.setEditTextOnDragListener(null);
        }
    }

    public void o0() {
        boolean z17 = ((com.tencent.mm.ui.chatting.component.jk) ((sb5.u1) this.f198580d.f460708c.a(sb5.u1.class))).f199295f;
        ((sb5.u1) this.f198580d.f460708c.a(sb5.u1.class)).getClass();
        if (z17) {
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).B(new com.tencent.mm.ui.chatting.component.q9(this));
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void z() {
    }
}
