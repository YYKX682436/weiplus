package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class li implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f161296d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI f161297e;

    public li(com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI settingsModifyNameUI, int i17) {
        this.f161297e = settingsModifyNameUI;
        this.f161296d = i17;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsModifyNameUI settingsModifyNameUI = this.f161297e;
        java.lang.String obj = settingsModifyNameUI.f160546d.getText().toString();
        java.lang.String f17 = ip.c.f();
        if (!com.tencent.mm.sdk.platformtools.t8.K0(f17)) {
            if (obj.matches(".*[" + f17 + "].*")) {
                db5.e1.s(settingsModifyNameUI.getContext(), settingsModifyNameUI.getString(com.tencent.mm.R.string.g1m, f17), settingsModifyNameUI.getString(com.tencent.mm.R.string.f490573yv));
                return false;
            }
        }
        ck5.f b17 = ck5.f.b(settingsModifyNameUI.f160546d);
        b17.f42561f = this.f161296d;
        b17.f42560e = 32;
        b17.d(settingsModifyNameUI);
        return true;
    }
}
