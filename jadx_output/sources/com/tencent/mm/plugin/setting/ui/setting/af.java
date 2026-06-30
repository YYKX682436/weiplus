package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes14.dex */
public final class af implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI f160831d;

    public af(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI settingsHearingAidTestUI) {
        this.f160831d = settingsHearingAidTestUI;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setContinueBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI.L;
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI settingsHearingAidTestUI = this.f160831d;
        settingsHearingAidTestUI.Z6();
        if (!settingsHearingAidTestUI.G) {
            androidx.appcompat.app.AppCompatActivity context = settingsHearingAidTestUI.getContext();
            int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.p1i);
            e4Var.c();
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setContinueBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        if (settingsHearingAidTestUI.f160476y) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager = settingsHearingAidTestUI.f160460f;
            if (settingsHearingAidAudioCardViewManager == null) {
                kotlin.jvm.internal.o.o("audioCardManager");
                throw null;
            }
            settingsHearingAidAudioCardViewManager.setAutoPlay(true);
            if (settingsHearingAidTestUI.A) {
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView2 = settingsHearingAidTestUI.f160461g;
                if (settingsHearingAidAudioCardView2 == null) {
                    kotlin.jvm.internal.o.o("audioCardView1");
                    throw null;
                }
                settingsHearingAidTestUI.W6("select_mode_result", 0, settingsHearingAidAudioCardView2.getYa.b.SOURCE java.lang.String(), false);
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView3 = settingsHearingAidTestUI.f160463i;
                if (settingsHearingAidAudioCardView3 == null) {
                    kotlin.jvm.internal.o.o("audioCardView3");
                    throw null;
                }
                int i19 = settingsHearingAidTestUI.f160457J;
                com.tencent.mm.plugin.setting.ui.setting.xd xdVar = i19 != 1 ? i19 != 2 ? i19 != 3 ? com.tencent.mm.plugin.setting.ui.setting.xd.f161745r : com.tencent.mm.plugin.setting.ui.setting.xd.f161752y : com.tencent.mm.plugin.setting.ui.setting.xd.f161749v : com.tencent.mm.plugin.setting.ui.setting.xd.f161746s;
                settingsHearingAidAudioCardView3.setModeInfo(xdVar);
                settingsHearingAidAudioCardView3.setSource(xdVar.h());
                java.util.Objects.toString(settingsHearingAidAudioCardView3.getModeInfo());
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager2 = settingsHearingAidTestUI.f160460f;
                if (settingsHearingAidAudioCardViewManager2 == null) {
                    kotlin.jvm.internal.o.o("audioCardManager");
                    throw null;
                }
                settingsHearingAidAudioCardViewManager2.d(true);
                settingsHearingAidTestUI.X6(false);
                settingsHearingAidTestUI.a7(false);
                settingsHearingAidTestUI.E = 1;
                settingsHearingAidTestUI.V6(0);
            } else if (settingsHearingAidTestUI.B) {
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView4 = settingsHearingAidTestUI.f160462h;
                if (settingsHearingAidAudioCardView4 == null) {
                    kotlin.jvm.internal.o.o("audioCardView2");
                    throw null;
                }
                settingsHearingAidTestUI.W6("select_mode_result", 0, settingsHearingAidAudioCardView4.getYa.b.SOURCE java.lang.String(), false);
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView5 = settingsHearingAidTestUI.f160463i;
                if (settingsHearingAidAudioCardView5 == null) {
                    kotlin.jvm.internal.o.o("audioCardView3");
                    throw null;
                }
                int i27 = settingsHearingAidTestUI.f160457J;
                com.tencent.mm.plugin.setting.ui.setting.xd xdVar2 = i27 != 1 ? i27 != 2 ? i27 != 3 ? com.tencent.mm.plugin.setting.ui.setting.xd.f161745r : com.tencent.mm.plugin.setting.ui.setting.xd.f161753z : com.tencent.mm.plugin.setting.ui.setting.xd.f161750w : com.tencent.mm.plugin.setting.ui.setting.xd.f161747t;
                settingsHearingAidAudioCardView5.setModeInfo(xdVar2);
                settingsHearingAidAudioCardView5.setSource(xdVar2.h());
                java.util.Objects.toString(settingsHearingAidAudioCardView5.getModeInfo());
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager3 = settingsHearingAidTestUI.f160460f;
                if (settingsHearingAidAudioCardViewManager3 == null) {
                    kotlin.jvm.internal.o.o("audioCardManager");
                    throw null;
                }
                settingsHearingAidAudioCardViewManager3.d(true);
                settingsHearingAidTestUI.X6(false);
                settingsHearingAidTestUI.E = 2;
                settingsHearingAidTestUI.a7(false);
                settingsHearingAidTestUI.V6(0);
            } else {
                boolean z17 = settingsHearingAidTestUI.C;
                if (z17 || settingsHearingAidTestUI.D) {
                    if (z17) {
                        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView6 = settingsHearingAidTestUI.f160463i;
                        if (settingsHearingAidAudioCardView6 == null) {
                            kotlin.jvm.internal.o.o("audioCardView3");
                            throw null;
                        }
                        settingsHearingAidTestUI.W6("select_mode_result", 1, settingsHearingAidAudioCardView6.getYa.b.SOURCE java.lang.String(), false);
                    } else {
                        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView7 = settingsHearingAidTestUI.f160464m;
                        if (settingsHearingAidAudioCardView7 == null) {
                            kotlin.jvm.internal.o.o("audioCardView4");
                            throw null;
                        }
                        settingsHearingAidTestUI.W6("select_mode_result", 1, settingsHearingAidAudioCardView7.getYa.b.SOURCE java.lang.String(), false);
                    }
                    if (settingsHearingAidTestUI.C) {
                        settingsHearingAidAudioCardView = settingsHearingAidTestUI.f160463i;
                        if (settingsHearingAidAudioCardView == null) {
                            kotlin.jvm.internal.o.o("audioCardView3");
                            throw null;
                        }
                    } else {
                        settingsHearingAidAudioCardView = settingsHearingAidTestUI.f160464m;
                        if (settingsHearingAidAudioCardView == null) {
                            kotlin.jvm.internal.o.o("audioCardView4");
                            throw null;
                        }
                    }
                    com.tencent.mm.plugin.setting.ui.setting.xd modeInfo = settingsHearingAidAudioCardView.getModeInfo();
                    java.util.Objects.toString(modeInfo);
                    com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI.U6(settingsHearingAidTestUI, modeInfo);
                    settingsHearingAidTestUI.E = 0;
                } else {
                    android.widget.TextView textView = settingsHearingAidTestUI.f160459e;
                    if (textView == null) {
                        kotlin.jvm.internal.o.o("tipsInfo");
                        throw null;
                    }
                    textView.removeCallbacks(settingsHearingAidTestUI.f160475x);
                    android.widget.TextView textView2 = settingsHearingAidTestUI.f160459e;
                    if (textView2 == null) {
                        kotlin.jvm.internal.o.o("tipsInfo");
                        throw null;
                    }
                    textView2.setText(settingsHearingAidTestUI.getString(com.tencent.mm.R.string.o5e));
                    android.widget.TextView textView3 = settingsHearingAidTestUI.f160459e;
                    if (textView3 == null) {
                        kotlin.jvm.internal.o.o("tipsInfo");
                        throw null;
                    }
                    textView3.setVisibility(0);
                    android.widget.TextView textView4 = settingsHearingAidTestUI.f160459e;
                    if (textView4 == null) {
                        kotlin.jvm.internal.o.o("tipsInfo");
                        throw null;
                    }
                    textView4.postDelayed(settingsHearingAidTestUI.f160475x, 3000L);
                }
            }
        } else {
            android.widget.TextView textView5 = settingsHearingAidTestUI.f160459e;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("tipsInfo");
                throw null;
            }
            textView5.removeCallbacks(settingsHearingAidTestUI.f160475x);
            android.widget.TextView textView6 = settingsHearingAidTestUI.f160459e;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("tipsInfo");
                throw null;
            }
            textView6.setText(settingsHearingAidTestUI.getString(com.tencent.mm.R.string.o5w));
            android.widget.TextView textView7 = settingsHearingAidTestUI.f160459e;
            if (textView7 == null) {
                kotlin.jvm.internal.o.o("tipsInfo");
                throw null;
            }
            textView7.setVisibility(0);
            android.widget.TextView textView8 = settingsHearingAidTestUI.f160459e;
            if (textView8 == null) {
                kotlin.jvm.internal.o.o("tipsInfo");
                throw null;
            }
            textView8.postDelayed(settingsHearingAidTestUI.f160475x, 3000L);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI$setContinueBtn$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
