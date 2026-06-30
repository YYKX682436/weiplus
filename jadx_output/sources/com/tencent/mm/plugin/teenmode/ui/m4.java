package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class m4 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.n4 f173072d;

    public m4(com.tencent.mm.plugin.teenmode.ui.n4 n4Var) {
        this.f173072d = n4Var;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.teenmode.ui.n4 n4Var = this.f173072d;
        if (itemId == 0) {
            android.content.Intent intent = new android.content.Intent(n4Var.f173081d, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI.class);
            intent.putExtra("intent_process", 1);
            intent.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 3);
            android.content.Intent intent2 = new android.content.Intent(n4Var.f173081d, (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI.class);
            intent2.putExtra("intent_process", 2);
            intent2.putExtra("WizardRootClass", "com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain");
            com.tencent.mm.ui.MMWizardActivity.Y6(n4Var.f173081d, intent, intent2);
            return;
        }
        if (itemId == 1) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(n4Var.f173081d.getContext());
            u1Var.u(n4Var.f173081d.getString(com.tencent.mm.R.string.jt6));
            u1Var.g(n4Var.f173081d.getString(com.tencent.mm.R.string.f493343jt4));
            u1Var.m(com.tencent.mm.R.string.f493344jt5);
            u1Var.k(n4Var.f173081d.getContext().getResources().getColor(com.tencent.mm.R.color.f479482a31));
            u1Var.b(new com.tencent.mm.plugin.teenmode.ui.l4(this));
            u1Var.q(false);
            return;
        }
        if (itemId != 2) {
            return;
        }
        android.content.Intent intent3 = new android.content.Intent(n4Var.f173081d.getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.teenmode.ui.TeenModePrivatePwdUI.class);
        intent3.putExtra("intent_process", 3);
        intent3.putExtra(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_BUFFERING_SCENE, 1);
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain = n4Var.f173081d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent3);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(settingsTeenModeMain, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$29$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        settingsTeenModeMain.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(settingsTeenModeMain, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$29$2", "onMMMenuItemSelected", "(Landroid/view/MenuItem;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        ((vh4.t1) i95.n0.c(vh4.t1.class)).T(18);
    }
}
