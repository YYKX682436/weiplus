package com.tencent.mm.plugin.finder.ui;

/* loaded from: classes8.dex */
public final class xh implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.ui.FinderSettingProtectUI f130026d;

    public xh(com.tencent.mm.plugin.finder.ui.FinderSettingProtectUI finderSettingProtectUI) {
        this.f130026d = finderSettingProtectUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/ui/FinderSettingProtectUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean g17 = hc2.s.g();
        com.tencent.mm.plugin.finder.ui.FinderSettingProtectUI finderSettingProtectUI = this.f130026d;
        if (g17) {
            int i17 = com.tencent.mm.plugin.finder.ui.FinderSettingProtectUI.f128749w;
            finderSettingProtectUI.getClass();
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) finderSettingProtectUI, 1, true);
            k0Var.q(finderSettingProtectUI.getString(com.tencent.mm.R.string.nzy), 17);
            k0Var.f211872n = new com.tencent.mm.plugin.finder.ui.zh(finderSettingProtectUI);
            k0Var.f211881s = new com.tencent.mm.plugin.finder.ui.ai(finderSettingProtectUI);
            k0Var.v();
        } else {
            int i18 = com.tencent.mm.plugin.finder.ui.FinderSettingProtectUI.f128749w;
            finderSettingProtectUI.getClass();
            com.tencent.mars.xlog.Log.i("FinderSettingProtectUI", "modUserProtect open");
            finderSettingProtectUI.d7();
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            hb2.s0.f280090e.n(true, finderSettingProtectUI.f128752v, finderSettingProtectUI.f128751u);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/ui/FinderSettingProtectUI$onCreate$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
