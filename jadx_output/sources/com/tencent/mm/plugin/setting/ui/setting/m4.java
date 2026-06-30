package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes9.dex */
public final class m4 implements wd0.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI f161312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f161313b;

    public m4(com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI settingManageFindMoreDetailUI, boolean z17) {
        this.f161312a = settingManageFindMoreDetailUI;
        this.f161313b = z17;
    }

    @Override // wd0.o1
    public void a() {
        com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI.U6(this.f161312a, !this.f161313b);
    }

    @Override // wd0.o1
    public void onSuccess() {
        ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Ai();
    }
}
