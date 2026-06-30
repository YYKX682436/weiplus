package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes.dex */
public class i4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain f173032d;

    public i4(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain) {
        this.f173032d = settingsTeenModeMain;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long i17 = c01.z1.i();
        boolean z17 = (4398046511104L & i17) != 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.ConfigStorageLogic", "isCNPayWalletRegion() walletRegion:%s: force:%s", java.lang.Long.valueOf(i17), java.lang.Boolean.valueOf(z17));
        com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain settingsTeenModeMain = this.f173032d;
        if (z17) {
            int i18 = com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain.I;
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(settingsTeenModeMain.getContext());
            u1Var.g(settingsTeenModeMain.getString(com.tencent.mm.R.string.f493329ol1));
            u1Var.m(com.tencent.mm.R.string.f490454vi);
            u1Var.k(settingsTeenModeMain.getContext().getResources().getColor(com.tencent.mm.R.color.Link_100));
            u1Var.q(false);
        } else {
            int i19 = com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMain.I;
            settingsTeenModeMain.getClass();
            settingsTeenModeMain.f172851e = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) settingsTeenModeMain, 1, true);
            android.widget.TextView textView = new android.widget.TextView(settingsTeenModeMain.getContext());
            textView.setGravity(17);
            textView.setHeight(i65.a.b(settingsTeenModeMain.getContext(), 40));
            textView.setTextSize(12.0f);
            textView.setTextColor(settingsTeenModeMain.getResources().getColor(com.tencent.mm.R.color.FG_1));
            textView.setText(settingsTeenModeMain.getString(com.tencent.mm.R.string.jrk));
            settingsTeenModeMain.f172851e.s(textView, false);
            com.tencent.mm.ui.widget.dialog.k0 k0Var = settingsTeenModeMain.f172851e;
            k0Var.f211872n = new com.tencent.mm.plugin.teenmode.ui.p4(settingsTeenModeMain);
            k0Var.f211881s = new com.tencent.mm.plugin.teenmode.ui.s4(settingsTeenModeMain);
            k0Var.T1 = true;
            k0Var.X1 = true;
            k0Var.v();
        }
        yj0.a.h(this, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMain$27", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
