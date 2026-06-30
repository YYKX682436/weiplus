package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes8.dex */
public final class z3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI f161806d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z3(com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI settingManageFindMoreDetailUI) {
        super(1);
        this.f161806d = settingManageFindMoreDetailUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        int i17;
        int i18;
        java.lang.String str;
        java.lang.String str2;
        int i19;
        int i27;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI settingManageFindMoreDetailUI = this.f161806d;
        settingManageFindMoreDetailUI.f160221d = booleanValue;
        java.lang.String str3 = settingManageFindMoreDetailUI.f160236v;
        boolean z17 = false;
        if (kotlin.jvm.internal.o.b(str3, "settings_sns_switch")) {
            settingManageFindMoreDetailUI.b7(booleanValue, 32768);
            i17 = 0;
        } else {
            boolean z18 = true;
            if (!kotlin.jvm.internal.o.b(str3, "settings_scan_switch")) {
                if (kotlin.jvm.internal.o.b(str3, "settings_search_switch")) {
                    boolean z19 = settingManageFindMoreDetailUI.f160232r;
                    if (z19 && settingManageFindMoreDetailUI.f160235u && booleanValue) {
                        v24.o0.i(settingManageFindMoreDetailUI, 2097152L, new com.tencent.mm.plugin.setting.ui.setting.g4(settingManageFindMoreDetailUI, booleanValue), new com.tencent.mm.plugin.setting.ui.setting.h4(booleanValue, settingManageFindMoreDetailUI), 2);
                        i17 = -1;
                    } else {
                        i19 = 3;
                        if (z19 && settingManageFindMoreDetailUI.f160235u && !booleanValue) {
                            java.lang.String string = settingManageFindMoreDetailUI.getContext().getResources().getString(com.tencent.mm.R.string.ijy);
                            kotlin.jvm.internal.o.f(string, "getString(...)");
                            java.lang.String string2 = settingManageFindMoreDetailUI.getContext().getResources().getString(com.tencent.mm.R.string.ijx);
                            kotlin.jvm.internal.o.f(string2, "getString(...)");
                            settingManageFindMoreDetailUI.X6(booleanValue, 3, string, string2, null, "");
                            i27 = i19;
                            i17 = i27;
                            z17 = z18;
                        } else {
                            if (booleanValue) {
                                settingManageFindMoreDetailUI.a7(booleanValue, 2097152L, 50);
                            } else {
                                ((com.tencent.mm.plugin.websearch.p2) ((su4.g1) i95.n0.c(su4.g1.class))).wi();
                                settingManageFindMoreDetailUI.a7(booleanValue, 2097152L, 50);
                            }
                            i17 = i19;
                        }
                    }
                } else if (kotlin.jvm.internal.o.b(str3, "settings_shopping_switch")) {
                    settingManageFindMoreDetailUI.a7(booleanValue, 4194304L, 51);
                    i17 = 6;
                } else {
                    if (kotlin.jvm.internal.o.b(str3, "settings_game_switch")) {
                        i18 = 7;
                        boolean z27 = settingManageFindMoreDetailUI.f160232r;
                        if (z27 && settingManageFindMoreDetailUI.f160235u && booleanValue) {
                            v24.o0.i(settingManageFindMoreDetailUI, 8388608L, new com.tencent.mm.plugin.setting.ui.setting.i4(settingManageFindMoreDetailUI, booleanValue), new com.tencent.mm.plugin.setting.ui.setting.j4(booleanValue, settingManageFindMoreDetailUI), 2);
                            z18 = z17;
                            i27 = i18;
                        } else if (z27 && settingManageFindMoreDetailUI.f160235u && !booleanValue) {
                            java.lang.String string3 = settingManageFindMoreDetailUI.getContext().getResources().getString(com.tencent.mm.R.string.lxr);
                            kotlin.jvm.internal.o.f(string3, "getString(...)");
                            java.lang.String string4 = settingManageFindMoreDetailUI.getContext().getResources().getString(com.tencent.mm.R.string.lxq);
                            kotlin.jvm.internal.o.f(string4, "getString(...)");
                            java.lang.String string5 = settingManageFindMoreDetailUI.getString(com.tencent.mm.R.string.f490356so);
                            kotlin.jvm.internal.o.d(string5);
                            settingManageFindMoreDetailUI.X6(booleanValue, 7, string3, string4, null, string5);
                            i27 = i18;
                        } else {
                            settingManageFindMoreDetailUI.a7(booleanValue, 8388608L, 52);
                            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(848L, booleanValue ? 0L : 1L, 1L, false);
                            i17 = 7;
                        }
                    } else if (kotlin.jvm.internal.o.b(str3, "settings_miniprogram_switch")) {
                        boolean z28 = settingManageFindMoreDetailUI.f160232r;
                        if (z28 && settingManageFindMoreDetailUI.f160235u && booleanValue) {
                            v24.o0.i(settingManageFindMoreDetailUI, 16777216L, new com.tencent.mm.plugin.setting.ui.setting.k4(settingManageFindMoreDetailUI, booleanValue), new com.tencent.mm.plugin.setting.ui.setting.l4(booleanValue, settingManageFindMoreDetailUI), 2);
                            i17 = -1;
                        } else if (z28 && settingManageFindMoreDetailUI.f160235u && !booleanValue) {
                            i19 = 8;
                            java.lang.String string6 = settingManageFindMoreDetailUI.getContext().getResources().getString(com.tencent.mm.R.string.iju);
                            kotlin.jvm.internal.o.f(string6, "getString(...)");
                            java.lang.String string7 = settingManageFindMoreDetailUI.getContext().getResources().getString(com.tencent.mm.R.string.ijt);
                            kotlin.jvm.internal.o.f(string7, "getString(...)");
                            settingManageFindMoreDetailUI.X6(booleanValue, 8, string6, string7, new com.tencent.mm.plugin.setting.ui.setting.m4(settingManageFindMoreDetailUI, booleanValue), "");
                            z17 = true;
                            i17 = i19;
                        } else {
                            settingManageFindMoreDetailUI.a7(booleanValue, 16777216L, 53);
                            if (!booleanValue) {
                                ((com.tencent.mm.plugin.appbrand.launching.xc) ((com.tencent.mm.plugin.appbrand.service.h6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.h6.class))).Ai();
                            }
                            i17 = 8;
                        }
                    } else if (kotlin.jvm.internal.o.b(str3, "settings_wechatout_switch")) {
                        settingManageFindMoreDetailUI.a7(booleanValue, 33554432L, 54);
                        i17 = 9;
                    } else if (kotlin.jvm.internal.o.b(str3, "settings_shake_switch")) {
                        settingManageFindMoreDetailUI.b7(booleanValue, 256);
                        i17 = 2;
                    } else if (kotlin.jvm.internal.o.b(str3, "settings_nearby_switch")) {
                        settingManageFindMoreDetailUI.b7(booleanValue, 512);
                        i17 = 4;
                    } else if (kotlin.jvm.internal.o.b(str3, "settings_nearby_live_friend_switch")) {
                        settingManageFindMoreDetailUI.a7(booleanValue, 70368744177664L, 61);
                        long j17 = booleanValue ? 1L : 0L;
                        com.tencent.mm.autogen.mmdata.rpt.DiscoverViewEntranceSettingStruct discoverViewEntranceSettingStruct = new com.tencent.mm.autogen.mmdata.rpt.DiscoverViewEntranceSettingStruct();
                        discoverViewEntranceSettingStruct.f55837d = 12L;
                        discoverViewEntranceSettingStruct.f55838e = j17;
                        discoverViewEntranceSettingStruct.f55839f = 1L;
                        discoverViewEntranceSettingStruct.k();
                        com.tencent.mars.xlog.Log.i("FindMoreSettingReport", "reportSwitch " + discoverViewEntranceSettingStruct.n());
                        i17 = 12;
                    } else if (kotlin.jvm.internal.o.b(str3, "settings_look_switch")) {
                        boolean z29 = settingManageFindMoreDetailUI.f160232r;
                        i19 = 10;
                        if (z29 && settingManageFindMoreDetailUI.f160235u && booleanValue) {
                            v24.o0.i(settingManageFindMoreDetailUI, 67108864L, new com.tencent.mm.plugin.setting.ui.setting.n4(settingManageFindMoreDetailUI, booleanValue), new com.tencent.mm.plugin.setting.ui.setting.o4(booleanValue, settingManageFindMoreDetailUI), 2);
                        } else if (settingManageFindMoreDetailUI.f160233s || !z29 || !settingManageFindMoreDetailUI.f160235u || booleanValue) {
                            settingManageFindMoreDetailUI.Y6(booleanValue);
                        } else {
                            java.lang.String string8 = settingManageFindMoreDetailUI.getContext().getResources().getString(com.tencent.mm.R.string.f492984ik0);
                            kotlin.jvm.internal.o.f(string8, "getString(...)");
                            java.lang.String string9 = settingManageFindMoreDetailUI.getContext().getResources().getString(com.tencent.mm.R.string.ijz);
                            kotlin.jvm.internal.o.f(string9, "getString(...)");
                            settingManageFindMoreDetailUI.X6(booleanValue, 10, string8, string9, null, "");
                            i27 = i19;
                        }
                        i17 = i19;
                    } else if (kotlin.jvm.internal.o.b(str3, "settings_finder_switch")) {
                        boolean z37 = settingManageFindMoreDetailUI.f160232r;
                        i19 = 11;
                        if (z37 && settingManageFindMoreDetailUI.f160235u && booleanValue) {
                            v24.o0.i(settingManageFindMoreDetailUI, 34359738368L, new com.tencent.mm.plugin.setting.ui.setting.c4(settingManageFindMoreDetailUI, booleanValue), new com.tencent.mm.plugin.setting.ui.setting.d4(booleanValue, settingManageFindMoreDetailUI), 2);
                        } else if (z37 && settingManageFindMoreDetailUI.f160235u && !booleanValue) {
                            java.lang.String string10 = settingManageFindMoreDetailUI.getContext().getResources().getString(com.tencent.mm.R.string.ijw);
                            kotlin.jvm.internal.o.f(string10, "getString(...)");
                            java.lang.String string11 = settingManageFindMoreDetailUI.getContext().getResources().getString(com.tencent.mm.R.string.ijv);
                            kotlin.jvm.internal.o.f(string11, "getString(...)");
                            settingManageFindMoreDetailUI.X6(booleanValue, 11, string10, string11, null, "");
                            i27 = i19;
                        } else {
                            settingManageFindMoreDetailUI.a7(booleanValue, 34359738368L, 57);
                        }
                        i17 = i19;
                    } else if (kotlin.jvm.internal.o.b(str3, ((c92.h) ((yy2.e) i95.n0.c(yy2.e.class))).wi())) {
                        i18 = 13;
                        if (com.tencent.mm.sdk.platformtools.f9.MeSetDiscoveryFinderLive.k(settingManageFindMoreDetailUI, null)) {
                            boolean z38 = settingManageFindMoreDetailUI.f160232r;
                            if (z38 && settingManageFindMoreDetailUI.f160235u && booleanValue) {
                                str = "reportSwitch ";
                                str2 = "FindMoreSettingReport";
                                v24.o0.i(settingManageFindMoreDetailUI, 9007199254740992L, new com.tencent.mm.plugin.setting.ui.setting.e4(settingManageFindMoreDetailUI, booleanValue), new com.tencent.mm.plugin.setting.ui.setting.f4(booleanValue, settingManageFindMoreDetailUI), 2);
                            } else {
                                str = "reportSwitch ";
                                str2 = "FindMoreSettingReport";
                                if (z38 && settingManageFindMoreDetailUI.f160235u && !booleanValue) {
                                    java.lang.String string12 = settingManageFindMoreDetailUI.getContext().getResources().getString(com.tencent.mm.R.string.phh);
                                    kotlin.jvm.internal.o.f(string12, "getString(...)");
                                    java.lang.String string13 = settingManageFindMoreDetailUI.getContext().getResources().getString(com.tencent.mm.R.string.phg);
                                    kotlin.jvm.internal.o.f(string13, "getString(...)");
                                    java.lang.String string14 = settingManageFindMoreDetailUI.getContext().getResources().getString(com.tencent.mm.R.string.ohr);
                                    kotlin.jvm.internal.o.f(string14, "getString(...)");
                                    settingManageFindMoreDetailUI.X6(booleanValue, 13, string12, string13, null, string14);
                                    z17 = true;
                                } else {
                                    settingManageFindMoreDetailUI.a7(booleanValue, 9007199254740992L, 65);
                                }
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.SettingManageFindMoreDetailUI", "switch finderlive 65");
                            long j18 = booleanValue ? 1L : 0L;
                            com.tencent.mm.autogen.mmdata.rpt.DiscoverViewEntranceSettingStruct discoverViewEntranceSettingStruct2 = new com.tencent.mm.autogen.mmdata.rpt.DiscoverViewEntranceSettingStruct();
                            discoverViewEntranceSettingStruct2.f55837d = 13L;
                            discoverViewEntranceSettingStruct2.f55838e = j18;
                            discoverViewEntranceSettingStruct2.f55839f = 1L;
                            discoverViewEntranceSettingStruct2.k();
                            com.tencent.mars.xlog.Log.i(str2, str + discoverViewEntranceSettingStruct2.n());
                            z18 = z17;
                            i27 = i18;
                        }
                    } else {
                        if (kotlin.jvm.internal.o.b(str3, "settings_ting_switch")) {
                            com.tencent.mars.xlog.Log.i("MicroMsg.SettingManageFindMoreDetailUI", "switch ting isShow: %s", java.lang.Boolean.valueOf(booleanValue));
                            settingManageFindMoreDetailUI.Z6(booleanValue, 32768L);
                            i17 = 14;
                        }
                        i17 = -1;
                    }
                    i17 = i27;
                    z17 = z18;
                }
                com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI.U6(settingManageFindMoreDetailUI, booleanValue);
                l14.b.f314994a.c(booleanValue, settingManageFindMoreDetailUI.f160236v, 1L, settingManageFindMoreDetailUI.f160224g);
                return jz5.f0.f302826a;
            }
            settingManageFindMoreDetailUI.a7(booleanValue, 1048576L, 49);
            i17 = 1;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SettingManageFindMoreDetailUI", "needShowCloseSwitchDilaogTips = %s", java.lang.Boolean.valueOf(z17));
        if (!z17 && i17 >= 0) {
            settingManageFindMoreDetailUI.f160230p.put(java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(booleanValue ? 1 : 0));
        }
        com.tencent.mm.plugin.setting.ui.setting.SettingManageFindMoreDetailUI.U6(settingManageFindMoreDetailUI, booleanValue);
        l14.b.f314994a.c(booleanValue, settingManageFindMoreDetailUI.f160236v, 1L, settingManageFindMoreDetailUI.f160224g);
        return jz5.f0.f302826a;
    }
}
