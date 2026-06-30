package com.tencent.mm.ui.chatting.component;

@yn.c(exportInterface = sb5.o0.class)
/* loaded from: classes9.dex */
public class da extends com.tencent.mm.ui.chatting.component.a implements sb5.o0 {

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f198932e = new com.tencent.mm.ui.chatting.component.EmojiComponent$1(this, com.tencent.mm.app.a0.f53288d);

    /* renamed from: f, reason: collision with root package name */
    public a85.b f198933f;

    public static com.tencent.mm.storage.emotion.EmojiInfo m0(com.tencent.mm.storage.f9 f9Var) {
        if (f9Var.C2()) {
            return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).M(f9Var);
        }
        com.tencent.mm.storage.y4 y4Var = new com.tencent.mm.storage.y4(f9Var.j());
        ot0.q v17 = ot0.q.v(f9Var.U1());
        if (v17 == null) {
            v17 = new ot0.q();
            v17.f348698q = y4Var.f196356d;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(v17.f348698q) || v17.f348698q.equals("-1")) {
            return null;
        }
        return ((y12.h) ((g30.h) ((k12.s) i95.n0.c(k12.s.class))).wi()).N(v17.f348698q);
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void E() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.EmojiComponent", "[onChattingEnterAnimEnd]");
        this.f198932e.alive();
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.ui.chatting.component.z9(this));
    }

    @Override // com.tencent.mm.ui.chatting.component.a, com.tencent.mm.ui.chatting.component.hg
    public void I() {
        super.I();
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.EmojiComponent", "[onComponentUnInstall]");
        this.f198932e.dead();
    }

    @Override // com.tencent.mm.ui.chatting.component.a, yn.l
    public void K() {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.EmojiComponent", "[onChattingExitAnimStart]");
        this.f198932e.dead();
    }

    @Override // yn.d
    public void R(android.content.res.Configuration configuration) {
        a85.b bVar = this.f198933f;
        if (bVar == null || !bVar.isShowing()) {
            return;
        }
        this.f198933f.dismiss();
        this.f198933f = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean n0(android.view.MenuItem r26, yb5.d r27, com.tencent.mm.storage.f9 r28) {
        /*
            Method dump skipped, instructions count: 1502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.component.da.n0(android.view.MenuItem, yb5.d, com.tencent.mm.storage.f9):boolean");
    }

    public boolean o0(com.tencent.mm.storage.f9 f9Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.ChattingUI.EmojiComponent", "[resendEmoji] %d", java.lang.Long.valueOf(f9Var.getMsgId()));
        if (f9Var.C2()) {
            if (c01.d9.b().E()) {
                if (!this.f198580d.x().equals("medianote")) {
                    ((e21.z0) c01.d9.b().w()).c(new e21.n(f9Var.Q0(), f9Var.I0()));
                }
                com.tencent.mm.ui.chatting.ic.c(f9Var);
            } else {
                db5.t7.k(this.f198580d.g(), this.f198580d.f460717l.getContentView());
            }
            return true;
        }
        if (!f9Var.m2()) {
            return false;
        }
        if (!this.f198580d.x().equals("medianote")) {
            ((e21.z0) c01.d9.b().w()).c(new e21.n(f9Var.Q0(), f9Var.I0()));
        }
        com.tencent.mm.ui.chatting.ic.a(f9Var);
        this.f198580d.L(true);
        return true;
    }
}
