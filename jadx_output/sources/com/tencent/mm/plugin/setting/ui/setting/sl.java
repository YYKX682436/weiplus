package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public class sl implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI f161546d;

    public sl(com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI settingsSelectBgUI) {
        this.f161546d = settingsSelectBgUI;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI settingsSelectBgUI = this.f161546d;
        if (settingsSelectBgUI.findViewById(com.tencent.mm.R.id.mq9).getWidth() <= 0) {
            return true;
        }
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsSelectBgUI.f160653o;
        settingsSelectBgUI.getClass();
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        ((android.view.WindowManager) settingsSelectBgUI.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i18 = displayMetrics.widthPixels;
        int i19 = displayMetrics.heightPixels;
        if (i18 >= i19) {
            i18 = i19;
        }
        settingsSelectBgUI.f160655e = new com.tencent.mm.plugin.setting.ui.setting.wl(settingsSelectBgUI, settingsSelectBgUI, (i18 - 60) / 3);
        settingsSelectBgUI.f160656f = (android.widget.GridView) settingsSelectBgUI.findViewById(com.tencent.mm.R.id.mq9);
        ((qz.c) ((rz.n) i95.n0.c(rz.n.class))).getClass();
        f21.r0.Bi().add(settingsSelectBgUI.f160655e);
        settingsSelectBgUI.f160656f.setAdapter((android.widget.ListAdapter) settingsSelectBgUI.f160655e);
        settingsSelectBgUI.f160656f.setOnItemClickListener(new com.tencent.mm.plugin.setting.ui.setting.vl(settingsSelectBgUI));
        return false;
    }
}
