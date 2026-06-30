package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class l3 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI f161266d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.setting.api.BindFingerprintCallback f161267e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f161268f;

    public l3(com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI settingFingerprintHomeUI, com.tencent.mm.feature.setting.api.BindFingerprintCallback bindFingerprintCallback, boolean z17) {
        this.f161266d = settingFingerprintHomeUI;
        this.f161267e = bindFingerprintCallback;
        this.f161268f = z17;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.setting.ui.setting.SettingFingerprintHomeUI settingFingerprintHomeUI = this.f161266d;
        com.tencent.mm.ui.widget.dialog.f4 f4Var = settingFingerprintHomeUI.f160213m;
        if (f4Var != null) {
            f4Var.dismiss();
        }
        com.tencent.mm.feature.setting.api.BindFingerprintCallback bindFingerprintCallback = this.f161267e;
        if (bindFingerprintCallback.f67814e == 0) {
            wd0.j1 j1Var = (wd0.j1) i95.n0.c(wd0.j1.class);
            java.lang.String r17 = c01.z1.r();
            kotlin.jvm.internal.o.f(r17, "getUsernameFromUserInfo(...)");
            ((vd0.v1) j1Var).aj(false, "", r17);
            settingFingerprintHomeUI.W6();
            return;
        }
        if ((bindFingerprintCallback.f67815f.length() > 0) && settingFingerprintHomeUI.f160212i) {
            ((en.a) ((en.k) i95.n0.c(en.k.class))).Zi(settingFingerprintHomeUI.getContext(), bindFingerprintCallback.f67813d, bindFingerprintCallback.f67814e, bindFingerprintCallback.f67815f);
            return;
        }
        settingFingerprintHomeUI.f160212i = false;
        if (!this.f161268f) {
            java.lang.String string = settingFingerprintHomeUI.getString(com.tencent.mm.R.string.f493832p94);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            settingFingerprintHomeUI.U6(string);
        } else if (settingFingerprintHomeUI.f160214n) {
            java.lang.String string2 = settingFingerprintHomeUI.getString(com.tencent.mm.R.string.p9j);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            settingFingerprintHomeUI.U6(string2);
        } else {
            java.lang.String string3 = settingFingerprintHomeUI.getString(com.tencent.mm.R.string.p9c);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            settingFingerprintHomeUI.U6(string3);
        }
    }
}
