package com.tencent.mm.plugin.game.ui;

/* loaded from: classes3.dex */
public class c0 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameCategoryUI f141068d;

    public c0(com.tencent.mm.plugin.game.ui.GameCategoryUI gameCategoryUI) {
        this.f141068d = gameCategoryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.game.ui.GameCategoryUI gameCategoryUI = this.f141068d;
        android.content.Intent intent = new android.content.Intent(gameCategoryUI, (java.lang.Class<?>) com.tencent.mm.plugin.game.ui.GameSearchUI.class);
        int i17 = gameCategoryUI.f140692n;
        if (i17 == 1) {
            intent.putExtra("game_report_from_scene", 1602);
        } else if (i17 == 2) {
            intent.putExtra("game_report_from_scene", 1502);
        }
        com.tencent.mm.plugin.game.ui.GameCategoryUI gameCategoryUI2 = this.f141068d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gameCategoryUI2, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameCategoryUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        gameCategoryUI2.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(gameCategoryUI2, "com/tencent/mm/plugin/game/ui/GameCategoryUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
