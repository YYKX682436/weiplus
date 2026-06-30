package com.tencent.mm.plugin.game.chatroom.ui;

/* loaded from: classes12.dex */
public class j implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.chatroom.ui.GameImagePreviewUI f138845d;

    public j(com.tencent.mm.plugin.game.chatroom.ui.GameImagePreviewUI gameImagePreviewUI) {
        this.f138845d = gameImagePreviewUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (menuItem.getItemId() != 1) {
            return;
        }
        int i18 = com.tencent.mm.plugin.game.chatroom.ui.GameImagePreviewUI.f138818q;
        com.tencent.mm.plugin.game.chatroom.ui.GameImagePreviewUI gameImagePreviewUI = this.f138845d;
        gameImagePreviewUI.getClass();
        if (!gm0.j1.u().l()) {
            db5.t7.k(gameImagePreviewUI, null);
            return;
        }
        vb0.o oVar = (vb0.o) i95.n0.c(vb0.o.class);
        java.lang.String str = gameImagePreviewUI.f138827o;
        ((ub0.r) oVar).getClass();
        com.tencent.mm.pluginsdk.ui.tools.l7.a(str, gameImagePreviewUI, null);
    }
}
