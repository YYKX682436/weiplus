package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class bp implements db5.o4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsUI f160882d;

    public bp(com.tencent.mm.plugin.setting.ui.setting.SettingsUI settingsUI) {
        this.f160882d = settingsUI;
    }

    @Override // db5.o4
    public void onCreateMMMenu(db5.g4 g4Var) {
        if (g4Var.z()) {
            g4Var.b(1, com.tencent.mm.R.string.git, com.tencent.mm.R.raw.menu_logout_single);
            g4Var.b(2, com.tencent.mm.R.string.gis, com.tencent.mm.R.raw.menu_close_wechat);
        }
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsUI.I;
        this.f160882d.getClass();
        java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, wo.w0.k())};
        java.util.HashMap hashMap = new java.util.HashMap(1);
        java.util.Map.Entry entry = entryArr[0];
        java.lang.Object key = entry.getKey();
        java.util.Objects.requireNonNull(key);
        java.lang.Object value = entry.getValue();
        java.util.Objects.requireNonNull(value);
        if (hashMap.put(key, value) == null) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("log_out_float", "view_exp", java.util.Collections.unmodifiableMap(hashMap), 34575);
        } else {
            throw new java.lang.IllegalArgumentException("duplicate key: " + key);
        }
    }
}
