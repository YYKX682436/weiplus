package com.tencent.mm.plugin.game.ui.chat_tab;

/* loaded from: classes8.dex */
public class b implements oa.c {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.chat_tab.ChatCustomTabActionBar f141237d;

    public b(com.tencent.mm.plugin.game.ui.chat_tab.ChatCustomTabActionBar chatCustomTabActionBar) {
        this.f141237d = chatCustomTabActionBar;
    }

    @Override // oa.c
    public void h0(oa.i iVar) {
    }

    @Override // oa.c
    public void l4(oa.i iVar) {
        int i17 = com.tencent.mm.plugin.game.ui.chat_tab.ChatCustomTabActionBar.f141088g;
        this.f141237d.b(iVar, 0);
    }

    @Override // oa.c
    public void u1(oa.i iVar) {
        if (iVar.f343782e == 0) {
            if (iVar.f343783f == null) {
                return;
            }
            com.tencent.mm.plugin.game.model.i1 Ai = ((com.tencent.mm.plugin.game.n1) ((m33.r1) i95.n0.c(m33.r1.class))).Ai();
            com.tencent.mm.plugin.game.model.e1 j17 = Ai.j();
            if (j17 != null && j17.field_showType == 1) {
                Ai.e();
            }
            ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Di().X1(1);
            ik1.h0.b(new com.tencent.mm.plugin.game.ui.chat_tab.a(this, iVar, ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).Bi(2)));
        }
        int i17 = com.tencent.mm.plugin.game.ui.chat_tab.ChatCustomTabActionBar.f141088g;
        this.f141237d.b(iVar, 1);
        rk0.c.c("MicroMsg.ChatCustomTabActionBar", "gamelog.chat, chatRoomTab, click, switch tab to %s", iVar.f343780c);
    }
}
