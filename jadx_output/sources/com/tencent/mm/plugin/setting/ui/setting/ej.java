package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes12.dex */
public class ej implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI f161001d;

    public ej(com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI settingsNetStatUI) {
        this.f161001d = settingsNetStatUI;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI.f160586f;
        com.tencent.mm.plugin.setting.ui.setting.SettingsNetStatUI settingsNetStatUI = this.f161001d;
        androidx.appcompat.app.AppCompatActivity context = settingsNetStatUI.getContext();
        db5.e1.v(context, j65.q.b(context, com.tencent.mm.R.string.f493096j02), j65.q.b(context, com.tencent.mm.R.string.f493097j03), new com.tencent.mm.plugin.setting.ui.setting.fj(settingsNetStatUI), new com.tencent.mm.plugin.setting.ui.setting.gj(settingsNetStatUI), com.tencent.mm.R.color.f478622ch);
        return true;
    }
}
