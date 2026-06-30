package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class v6 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f161633d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.x6 f161634e;

    public v6(com.tencent.mm.plugin.setting.ui.setting.x6 x6Var, java.lang.String str) {
        this.f161634e = x6Var;
        this.f161633d = str;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        if (i17 == 0) {
            com.tencent.mm.sdk.platformtools.b0.e(this.f161633d);
            com.tencent.mm.plugin.setting.ui.setting.SettingsAliasUI settingsAliasUI = this.f161634e.f161729d;
            db5.e1.W(settingsAliasUI, settingsAliasUI.getString(com.tencent.mm.R.string.f490361st));
        }
    }
}
