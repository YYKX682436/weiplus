package com.tencent.mm.plugin.game.ui;

/* loaded from: classes8.dex */
public class r5 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.game.ui.t5 f141738d;

    public r5(com.tencent.mm.plugin.game.ui.t5 t5Var) {
        this.f141738d = t5Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.game.ui.t5 t5Var = this.f141738d;
        t5Var.f141765d.getSharedPreferences("game_center_pref", 0).edit().putInt("game_region_confirm_mark", 1).commit();
        com.tencent.mm.plugin.game.ui.GameRegionSelectUI.V6(t5Var.f141765d);
        android.content.Intent intent = new android.content.Intent();
        com.tencent.mm.plugin.game.ui.p5 g17 = com.tencent.mm.plugin.game.model.f.g(t5Var.f141765d);
        if (g17 != null) {
            intent.putExtra("gameRegionName", com.tencent.mm.plugin.game.model.f.i(g17));
            t5Var.f141765d.setResult(-1, intent);
        } else {
            t5Var.f141765d.setResult(1);
        }
        t5Var.f141765d.finish();
    }
}
