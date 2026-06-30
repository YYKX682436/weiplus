package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class a4 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI f160797d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a4(com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI settingManageFindMoreDetailUI) {
        super(1);
        this.f160797d = settingManageFindMoreDetailUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.setting.ui.setting.x3 x3Var = com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI.f160220x;
        com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI settingManageFindMoreDetailUI = this.f160797d;
        settingManageFindMoreDetailUI.getClass();
        if (com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryNearbyLiveFriendsPerson.k(settingManageFindMoreDetailUI, null)) {
            settingManageFindMoreDetailUI.b7(booleanValue, 512);
            long j17 = booleanValue ? 1L : 0L;
            com.tencent.mm.autogen.mmdata.rpt.DiscoverViewEntranceSettingStruct discoverViewEntranceSettingStruct = new com.tencent.mm.autogen.mmdata.rpt.DiscoverViewEntranceSettingStruct();
            discoverViewEntranceSettingStruct.f55837d = 12L;
            discoverViewEntranceSettingStruct.f55838e = j17;
            discoverViewEntranceSettingStruct.f55839f = 1L;
            discoverViewEntranceSettingStruct.k();
            com.tencent.mars.xlog.Log.i("FindMoreSettingReport", "reportSwitch " + discoverViewEntranceSettingStruct.n());
        }
        settingManageFindMoreDetailUI.f160223f = booleanValue;
        l14.b.f314994a.c(booleanValue, settingManageFindMoreDetailUI.f160236v, 3L, settingManageFindMoreDetailUI.f160224g);
        return jz5.f0.f302826a;
    }
}
