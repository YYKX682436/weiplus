package com.tencent.mm.plugin.game.ui;

/* loaded from: classes5.dex */
public class f0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.model.u1 f141380d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.g0 f141381e;

    public f0(com.tencent.mm.plugin.game.ui.g0 g0Var, com.tencent.mm.plugin.game.model.u1 u1Var) {
        this.f141381e = g0Var;
        this.f141380d = u1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.game.ui.g0 g0Var = this.f141381e;
        com.tencent.mm.plugin.game.ui.GameCategoryUI gameCategoryUI = g0Var.f141391e;
        boolean z17 = gameCategoryUI.f140690i != 0;
        com.tencent.mm.plugin.game.model.u1 u1Var = this.f141380d;
        gameCategoryUI.f140691m = u1Var.f140484a.f323924e;
        java.util.LinkedList linkedList = u1Var.f140485b;
        if (z17) {
            com.tencent.mm.plugin.game.ui.d4 d4Var = gameCategoryUI.f140686e;
            d4Var.getClass();
            if (linkedList != null) {
                gm0.j1.e().j(new com.tencent.mm.plugin.game.ui.q4(d4Var, linkedList));
            }
        } else {
            com.tencent.mm.plugin.game.ui.d4 d4Var2 = gameCategoryUI.f140686e;
            d4Var2.getClass();
            if (linkedList != null) {
                s75.d.b(new com.tencent.mm.plugin.game.ui.s4(d4Var2, linkedList), "game_get_download_info");
            }
        }
        com.tencent.mm.plugin.game.ui.GameCategoryUI gameCategoryUI2 = g0Var.f141391e;
        gameCategoryUI2.f140689h = false;
        android.view.View view = gameCategoryUI2.f140687f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameCategoryUI$5$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/game/ui/GameCategoryUI$5$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        gameCategoryUI2.f140690i += 15;
        android.app.Dialog dialog = gameCategoryUI2.f140688g;
        if (dialog != null) {
            dialog.dismiss();
        }
    }
}
