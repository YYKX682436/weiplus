package k53;

/* loaded from: classes8.dex */
public class q implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p33.l f304382d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI f304383e;

    public q(com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI gameVideoPreviewUI, p33.l lVar) {
        this.f304383e = gameVideoPreviewUI;
        this.f304382d = lVar;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        p33.l lVar = this.f304382d;
        com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI gameVideoPreviewUI = this.f304383e;
        if (itemId == 0) {
            android.content.Context context = gameVideoPreviewUI.f140114d;
            int i18 = gameVideoPreviewUI.f140124q + 1;
            com.tencent.mm.game.report.l.c(context, 87, 8768, i18 > 100 ? 100 : i18, 15, gameVideoPreviewUI.f140129v, lj0.a.a(gameVideoPreviewUI.f140125r, gameVideoPreviewUI.X6(lVar)));
            k53.u0 u0Var = gameVideoPreviewUI.f140126s;
            u0Var.getClass();
            u0Var.a(lVar, new k53.l0(u0Var, 19081));
            return;
        }
        if (menuItem.getItemId() == 1) {
            android.content.Context context2 = gameVideoPreviewUI.f140114d;
            int i19 = gameVideoPreviewUI.f140124q + 1;
            com.tencent.mm.game.report.l.c(context2, 87, 8768, i19 > 100 ? 100 : i19, 14, gameVideoPreviewUI.f140129v, lj0.a.a(gameVideoPreviewUI.f140125r, gameVideoPreviewUI.X6(lVar)));
            k53.u0 u0Var2 = gameVideoPreviewUI.f140126s;
            u0Var2.getClass();
            u0Var2.a(lVar, new k53.m0(u0Var2, 19081));
            return;
        }
        if (menuItem.getItemId() == 2) {
            android.content.Context context3 = gameVideoPreviewUI.f140114d;
            int i27 = gameVideoPreviewUI.f140124q + 1;
            com.tencent.mm.game.report.l.c(context3, 87, 8768, i27 > 100 ? 100 : i27, 88, gameVideoPreviewUI.f140129v, lj0.a.a(gameVideoPreviewUI.f140125r, gameVideoPreviewUI.X6(lVar)));
            android.os.Bundle V6 = com.tencent.mm.plugin.game.media.preview.GameVideoPreviewUI.V6(gameVideoPreviewUI, gameVideoPreviewUI.f140124q);
            V6.putBoolean("game_straight_to_publish", gameVideoPreviewUI.f140128u);
            if (com.tencent.mm.vfs.w6.j(lVar.f351617v)) {
                ((i53.x3) ((m33.v1) i95.n0.c(m33.v1.class))).Ai(gameVideoPreviewUI.f140114d, gameVideoPreviewUI.f140125r, lVar.f351614s, lVar.f351617v, null, null, 19722, V6, gameVideoPreviewUI.f140129v);
            } else {
                ((i53.x3) ((m33.v1) i95.n0.c(m33.v1.class))).Ai(gameVideoPreviewUI.f140114d, gameVideoPreviewUI.f140125r, lVar.f351614s, null, lVar.f351607i, lVar.f351606h, 19722, V6, gameVideoPreviewUI.f140129v);
            }
        }
    }
}
