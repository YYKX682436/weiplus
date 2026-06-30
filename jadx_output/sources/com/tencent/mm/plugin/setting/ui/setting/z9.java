package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes.dex */
public class z9 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.aa f161819d;

    public z9(com.tencent.mm.plugin.setting.ui.setting.aa aaVar) {
        this.f161819d = aaVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsCreateAliasUI settingsCreateAliasUI = this.f161819d.f160808d;
        if (settingsCreateAliasUI.f160374g.equals(c01.z1.r())) {
            db5.e1.i(settingsCreateAliasUI.getContext(), com.tencent.mm.R.string.gyd, com.tencent.mm.R.string.gyb);
            return;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.X0(settingsCreateAliasUI.f160374g)) {
            db5.e1.i(settingsCreateAliasUI.getContext(), com.tencent.mm.R.string.f493435k61, com.tencent.mm.R.string.hv7);
            return;
        }
        settingsCreateAliasUI.f160372e = db5.e1.Q(settingsCreateAliasUI.getContext(), settingsCreateAliasUI.getString(com.tencent.mm.R.string.gyb), settingsCreateAliasUI.getString(com.tencent.mm.R.string.gy7), false, true, new com.tencent.mm.plugin.setting.ui.setting.ba(settingsCreateAliasUI));
        if (settingsCreateAliasUI.f160373f != null) {
            gm0.j1.d().d(settingsCreateAliasUI.f160373f);
        }
        settingsCreateAliasUI.f160373f = new k14.y(1, settingsCreateAliasUI.f160374g, null);
        gm0.j1.d().g(settingsCreateAliasUI.f160373f);
    }
}
