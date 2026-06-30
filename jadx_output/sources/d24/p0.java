package d24;

/* loaded from: classes5.dex */
public final class p0 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount f225956d;

    public p0(com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount) {
        this.f225956d = settingButtonLogoutAccount;
    }

    @Override // db5.t4
    public void onMMMenuItemSelected(android.view.MenuItem menuItem, int i17) {
        kotlin.jvm.internal.o.g(menuItem, "menuItem");
        int itemId = menuItem.getItemId();
        com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount settingButtonLogoutAccount = this.f225956d;
        if (itemId != settingButtonLogoutAccount.f161855n) {
            if (itemId == settingButtonLogoutAccount.f161856o) {
                settingButtonLogoutAccount.getClass();
                com.tencent.mm.plugin.report.service.g0.INSTANCE.d(11545, java.lang.Integer.valueOf(settingButtonLogoutAccount.f161859r));
                com.tencent.mars.xlog.Log.i("MicroMsg.BaseSettingItem", "reprot: MM_LightPushCloseWechat == OP_CloseWeChat");
                if (settingButtonLogoutAccount.f161865x == null) {
                    android.view.View inflate = android.view.View.inflate(settingButtonLogoutAccount.getContext(), com.tencent.mm.R.layout.cl9, null);
                    settingButtonLogoutAccount.f161865x = inflate;
                    android.widget.CheckBox checkBox = (android.widget.CheckBox) (inflate != null ? inflate.findViewById(com.tencent.mm.R.id.f486873mq3) : null);
                    settingButtonLogoutAccount.f161866y = checkBox;
                    if (checkBox != null) {
                        checkBox.setChecked(true);
                    }
                }
                com.tencent.mm.ui.widget.dialog.j0 j0Var = settingButtonLogoutAccount.f161864w;
                if (j0Var == null) {
                    settingButtonLogoutAccount.f161864w = db5.e1.r(settingButtonLogoutAccount.getContext(), null, settingButtonLogoutAccount.f161865x, settingButtonLogoutAccount.getString(com.tencent.mm.R.string.gis), settingButtonLogoutAccount.getString(com.tencent.mm.R.string.f490347sg), new d24.y(settingButtonLogoutAccount), new d24.z(settingButtonLogoutAccount));
                    return;
                } else {
                    j0Var.show();
                    return;
                }
            }
            return;
        }
        settingButtonLogoutAccount.getClass();
        java.util.Map.Entry[] entryArr = {new java.util.AbstractMap.SimpleEntry(com.tencent.thumbplayer.core.downloadproxy.api.TPDownloadProxyEnum.USER_DEVICE_ID, wo.w0.k())};
        java.util.HashMap hashMap = new java.util.HashMap(1);
        java.util.Map.Entry entry = entryArr[0];
        java.lang.Object key = entry.getKey();
        java.util.Objects.requireNonNull(key);
        java.lang.Object value = entry.getValue();
        java.util.Objects.requireNonNull(value);
        if (hashMap.put(key, value) != null) {
            throw new java.lang.IllegalArgumentException("duplicate key: " + key);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Hj("log_out_ack", "view_clk", java.util.Collections.unmodifiableMap(hashMap), 34575);
        java.lang.String str = (java.lang.String) gm0.j1.u().c().l(6, null);
        java.lang.String r17 = c01.z1.r();
        kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
        if (r26.i0.y(r17, "wxid", false) && com.tencent.mm.sdk.platformtools.t8.K0(c01.z1.c()) && com.tencent.mm.sdk.platformtools.t8.K0(str) && !c01.z1.x() && ((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0) {
            com.tencent.mm.ui.widget.dialog.u1 u1Var = new com.tencent.mm.ui.widget.dialog.u1(settingButtonLogoutAccount.getContext());
            u1Var.g(settingButtonLogoutAccount.getString(com.tencent.mm.R.string.f493045is3));
            u1Var.n(settingButtonLogoutAccount.getString(com.tencent.mm.R.string.f493044is2));
            u1Var.l(new d24.b0(settingButtonLogoutAccount));
            u1Var.a(true);
            u1Var.q(false);
            return;
        }
        if (((com.tencent.mm.plugin.zero.a) ((c25.e) gm0.j1.s(c25.e.class))).b().b("EnableModAlias", 0) != 0 && c01.z1.t() && com.tencent.mm.sdk.platformtools.t8.K0(c01.z1.c()) && com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            db5.e1.C(settingButtonLogoutAccount.getContext(), settingButtonLogoutAccount.getString(com.tencent.mm.R.string.giw), null, settingButtonLogoutAccount.getString(com.tencent.mm.R.string.bln), settingButtonLogoutAccount.getString(com.tencent.mm.R.string.f490347sg), true, new d24.a0(settingButtonLogoutAccount), null);
        } else {
            com.tencent.mm.plugin.setting.ui.setting_new.settings.SettingButtonLogoutAccount.x7(settingButtonLogoutAccount);
        }
    }
}
