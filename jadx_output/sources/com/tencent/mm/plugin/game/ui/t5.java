package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class t5 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.GameRegionSelectUI f141765d;

    public t5(com.tencent.mm.plugin.game.ui.GameRegionSelectUI gameRegionSelectUI) {
        this.f141765d = gameRegionSelectUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.game.ui.GameRegionSelectUI gameRegionSelectUI = this.f141765d;
        if (gameRegionSelectUI.getSharedPreferences("game_center_pref", 0).getInt("game_region_confirm_mark", 0) != 1) {
            com.tencent.mm.plugin.game.ui.GameRegionSelectUI gameRegionSelectUI2 = this.f141765d;
            db5.e1.K(gameRegionSelectUI2, true, gameRegionSelectUI2.getString(com.tencent.mm.R.string.f492225fp0), "", gameRegionSelectUI.getString(com.tencent.mm.R.string.f492226fp1), gameRegionSelectUI.getString(com.tencent.mm.R.string.foz), new com.tencent.mm.plugin.game.ui.r5(this), new com.tencent.mm.plugin.game.ui.s5(this));
        } else {
            com.tencent.mm.plugin.game.ui.GameRegionSelectUI.V6(gameRegionSelectUI);
            android.content.Intent intent = new android.content.Intent();
            com.tencent.mm.plugin.game.ui.p5 g17 = com.tencent.mm.plugin.game.model.f.g(gameRegionSelectUI);
            if (g17 != null) {
                intent.putExtra("gameRegionName", com.tencent.mm.plugin.game.model.f.i(g17));
                gameRegionSelectUI.setResult(-1, intent);
            } else {
                gameRegionSelectUI.setResult(1);
            }
            gameRegionSelectUI.finish();
        }
        return true;
    }
}
