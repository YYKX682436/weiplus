package com.tencent.mm.plugin.game.ui;

/* loaded from: classes3.dex */
public class f4 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameLibraryUI f141386d;

    public f4(com.tencent.mm.plugin.game.ui.GameLibraryUI gameLibraryUI) {
        this.f141386d = gameLibraryUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        android.content.Intent intent = new android.content.Intent(this.f141386d, (java.lang.Class<?>) com.tencent.mm.plugin.game.ui.GameSearchUI.class);
        intent.putExtra("game_report_from_scene", 1109);
        com.tencent.mm.plugin.game.ui.GameLibraryUI gameLibraryUI = this.f141386d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gameLibraryUI, arrayList.toArray(), "com/tencent/mm/plugin/game/ui/GameLibraryUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        gameLibraryUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(gameLibraryUI, "com/tencent/mm/plugin/game/ui/GameLibraryUI$2", "onMenuItemClick", "(Landroid/view/MenuItem;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
