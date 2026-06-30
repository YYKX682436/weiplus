package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class dp implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsUI f160957d;

    public dp(com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI) {
        this.f160957d = settingsUI;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI = this.f160957d;
        if (itemId != 1) {
            if (itemId != 2) {
                return;
            }
            int i18 = com.tencent.mm.plugin.setting.ui.setting.SettingsUI.I;
            settingsUI.f7();
            return;
        }
        int i19 = com.tencent.mm.plugin.setting.ui.setting.SettingsUI.I;
        settingsUI.getClass();
        java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, wo.w0.k()), new java.util.AbstractMap.SimpleEntry("login_ui_version", 1)};
        java.util.HashMap hashMap = new java.util.HashMap(2);
        for (int i27 = 0; i27 < 2; i27++) {
            java.util.Map.Entry entry = entryArr[i27];
            java.lang.Object key = entry.getKey();
            java.util.Objects.requireNonNull(key);
            java.lang.Object value = entry.getValue();
            java.util.Objects.requireNonNull(value);
            if (hashMap.put(key, value) != null) {
                throw new java.lang.IllegalArgumentException("duplicate key: " + key);
            }
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("logout_ack_btn", "view_clk", java.util.Collections.unmodifiableMap(hashMap), 34575);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        if (c01.z1.r().startsWith("wxid") && com.tencent.mm.sdk.platformtools.t8.K0(c01.z1.c()) && com.tencent.mm.sdk.platformtools.t8.K0(str) && !c01.z1.x() && ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0) {
            settingsUI.j7();
            return;
        }
        if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0 && c01.z1.t() && com.tencent.mm.sdk.platformtools.t8.K0(c01.z1.c()) && com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            settingsUI.i7();
        } else {
            settingsUI.h7();
        }
    }
}
