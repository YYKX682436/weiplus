package com.tencent.mm.plugin.setting.ui.setting;

@db5.a(1)
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI;", "Lcom/tencent/mm/ui/MMActivity;", "Lcom/tencent/mm/plugin/setting/ui/setting/gc;", "<init>", "()V", "com/tencent/mm/plugin/setting/ui/setting/me", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes14.dex */
public final class SettingsHearingAidTestUI extends com.tencent.mm.ui.MMActivity implements com.tencent.mm.plugin.setting.ui.setting.gc {
    public static final /* synthetic */ int L = 0;
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public int E;
    public android.widget.TextView F;
    public android.content.BroadcastReceiver H;
    public int I;

    /* renamed from: J, reason: collision with root package name */
    public int f160457J;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f160458d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f160459e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager f160460f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView f160461g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView f160462h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView f160463i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView f160464m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f160465n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f160466o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f160467p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f160468q;

    /* renamed from: r, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f160469r;

    /* renamed from: s, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f160470s;

    /* renamed from: t, reason: collision with root package name */
    public android.widget.FrameLayout f160471t;

    /* renamed from: u, reason: collision with root package name */
    public android.widget.FrameLayout f160472u;

    /* renamed from: v, reason: collision with root package name */
    public android.widget.FrameLayout f160473v;

    /* renamed from: w, reason: collision with root package name */
    public android.widget.LinearLayout f160474w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f160476y;

    /* renamed from: z, reason: collision with root package name */
    public boolean f160477z;

    /* renamed from: x, reason: collision with root package name */
    public final java.lang.Runnable f160475x = new com.tencent.mm.plugin.setting.ui.setting.hf(this);
    public boolean G = true;
    public com.tencent.mm.plugin.setting.ui.setting.me K = com.tencent.mm.plugin.setting.ui.setting.me.f161327d;

    public static final void T6(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI settingsHearingAidTestUI) {
        if (settingsHearingAidTestUI.K == com.tencent.mm.plugin.setting.ui.setting.me.f161327d) {
            settingsHearingAidTestUI.W6("hearing_level_test_result", 21, null, false);
        } else {
            settingsHearingAidTestUI.W6("select_mode_result", 21, null, false);
        }
        android.content.Intent intent = new android.content.Intent(settingsHearingAidTestUI, (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI.class);
        intent.putExtra("result_code", 0);
        intent.putExtra("audio_test_abandon", true);
        intent.addFlags(603979776);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(settingsHearingAidTestUI, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI", "abandonTest", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        settingsHearingAidTestUI.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(settingsHearingAidTestUI, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI", "abandonTest", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    public static final void U6(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI settingsHearingAidTestUI, com.tencent.mm.plugin.setting.ui.setting.xd xdVar) {
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager = settingsHearingAidTestUI.f160460f;
        if (settingsHearingAidAudioCardViewManager == null) {
            kotlin.jvm.internal.o.o("audioCardManager");
            throw null;
        }
        settingsHearingAidAudioCardViewManager.c();
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(settingsHearingAidTestUI, com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI.class);
        xdVar.name();
        intent.putExtra("audio_mode_name", xdVar.name());
        settingsHearingAidTestUI.startActivityForResult(intent, settingsHearingAidTestUI.I);
    }

    public final void V6(int i17) {
        this.A = i17 == 1;
        this.B = i17 == 2;
        this.C = i17 == 3;
        this.D = i17 == 4;
    }

    public final void W6(java.lang.String str, int i17, java.lang.String str2, boolean z17) {
        java.lang.String a17 = com.tencent.mm.plugin.setting.ui.setting.ce.f160909a.a();
        java.util.HashMap hashMap = new java.util.HashMap();
        if (z17) {
            hashMap.put("care_audio_play_scene", java.lang.Integer.valueOf(this.K == com.tencent.mm.plugin.setting.ui.setting.me.f161327d ? 2 : 3));
            hashMap.put("care_session_id", a17);
        } else {
            hashMap.put("aid_process_result", java.lang.Integer.valueOf(i17));
            hashMap.put("care_session_id", a17);
        }
        if (str2 != null) {
            hashMap.put("audio_name", str2);
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(str, hashMap, 35684);
    }

    public final void X6(boolean z17) {
        android.widget.TextView textView = this.f160458d;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleTV");
            throw null;
        }
        sa5.d.d(textView, 0, 0L, new com.tencent.mm.plugin.setting.ui.setting.oe(this, z17), 3, null);
        if (z17) {
            return;
        }
        if (this.K == com.tencent.mm.plugin.setting.ui.setting.me.f161327d) {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_hearing_test_step2_page_in");
        } else {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_hearing_screen_step2_page_in");
        }
    }

    public final void Y6() {
        com.tencent.mm.plugin.setting.ui.setting.me meVar = this.K;
        com.tencent.mm.plugin.setting.ui.setting.me meVar2 = com.tencent.mm.plugin.setting.ui.setting.me.f161327d;
        if (meVar == meVar2) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView = this.f160461g;
            if (settingsHearingAidAudioCardView == null) {
                kotlin.jvm.internal.o.o("audioCardView1");
                throw null;
            }
            settingsHearingAidAudioCardView.b(true);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView2 = this.f160462h;
            if (settingsHearingAidAudioCardView2 == null) {
                kotlin.jvm.internal.o.o("audioCardView2");
                throw null;
            }
            settingsHearingAidAudioCardView2.b(true);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView3 = this.f160461g;
            if (settingsHearingAidAudioCardView3 == null) {
                kotlin.jvm.internal.o.o("audioCardView1");
                throw null;
            }
            settingsHearingAidAudioCardView3.setHasPlayed(false);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView4 = this.f160462h;
            if (settingsHearingAidAudioCardView4 == null) {
                kotlin.jvm.internal.o.o("audioCardView2");
                throw null;
            }
            settingsHearingAidAudioCardView4.setHasPlayed(false);
        } else {
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView5 = this.f160461g;
            if (settingsHearingAidAudioCardView5 == null) {
                kotlin.jvm.internal.o.o("audioCardView1");
                throw null;
            }
            settingsHearingAidAudioCardView5.b(true);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView6 = this.f160462h;
            if (settingsHearingAidAudioCardView6 == null) {
                kotlin.jvm.internal.o.o("audioCardView2");
                throw null;
            }
            settingsHearingAidAudioCardView6.b(true);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView7 = this.f160463i;
            if (settingsHearingAidAudioCardView7 == null) {
                kotlin.jvm.internal.o.o("audioCardView3");
                throw null;
            }
            settingsHearingAidAudioCardView7.b(true);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView8 = this.f160464m;
            if (settingsHearingAidAudioCardView8 == null) {
                kotlin.jvm.internal.o.o("audioCardView4");
                throw null;
            }
            settingsHearingAidAudioCardView8.b(true);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView9 = this.f160463i;
            if (settingsHearingAidAudioCardView9 == null) {
                kotlin.jvm.internal.o.o("audioCardView3");
                throw null;
            }
            settingsHearingAidAudioCardView9.setHasPlayed(false);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView10 = this.f160464m;
            if (settingsHearingAidAudioCardView10 == null) {
                kotlin.jvm.internal.o.o("audioCardView4");
                throw null;
            }
            settingsHearingAidAudioCardView10.setHasPlayed(false);
        }
        java.util.Objects.toString(this.K);
        if (this.f160460f == null) {
            kotlin.jvm.internal.o.o("audioCardManager");
            throw null;
        }
        if (this.K == meVar2) {
            W6("hearing_level_test_result", 31, null, false);
        } else {
            W6("select_mode_result", 31, null, false);
        }
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager = this.f160460f;
        if (settingsHearingAidAudioCardViewManager == null) {
            kotlin.jvm.internal.o.o("audioCardManager");
            throw null;
        }
        if (settingsHearingAidAudioCardViewManager.f160411g == 0) {
            if (this.K == meVar2) {
                ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_hearing_test_step1_page_back");
            } else {
                ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_hearing_screen_step1_page_back");
            }
            setResult(0);
            this.K = meVar2;
            finish();
        } else {
            settingsHearingAidAudioCardViewManager.setAutoPlay(false);
            X6(true);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager2 = this.f160460f;
            if (settingsHearingAidAudioCardViewManager2 == null) {
                kotlin.jvm.internal.o.o("audioCardManager");
                throw null;
            }
            settingsHearingAidAudioCardViewManager2.d(false);
            if (this.K == meVar2) {
                com.tencent.mm.ui.widget.button.WeButton weButton = this.f160466o;
                if (weButton == null) {
                    kotlin.jvm.internal.o.o("positiveBtn");
                    throw null;
                }
                weButton.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.gf(this));
                com.tencent.mm.ui.widget.button.WeButton weButton2 = this.f160465n;
                if (weButton2 == null) {
                    kotlin.jvm.internal.o.o("negativeBtn");
                    throw null;
                }
                weButton2.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.df(this));
                ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_hearing_test_step2_page_back");
                ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_hearing_test_step1_page_in");
            } else {
                com.tencent.mm.ui.widget.button.WeButton weButton3 = this.f160467p;
                if (weButton3 == null) {
                    kotlin.jvm.internal.o.o("continueBtn");
                    throw null;
                }
                weButton3.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.af(this));
                V6(this.E);
                a7(true);
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView11 = this.f160464m;
                if (settingsHearingAidAudioCardView11 == null) {
                    kotlin.jvm.internal.o.o("audioCardView4");
                    throw null;
                }
                android.view.View findViewById = settingsHearingAidAudioCardView11.findViewById(com.tencent.mm.R.id.u0b);
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI", "updateAudioCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI", "updateAudioCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView12 = this.f160463i;
                if (settingsHearingAidAudioCardView12 == null) {
                    kotlin.jvm.internal.o.o("audioCardView3");
                    throw null;
                }
                android.view.View findViewById2 = settingsHearingAidAudioCardView12.findViewById(com.tencent.mm.R.id.u0b);
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI", "updateAudioCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(findViewById2, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestUI", "updateAudioCardView", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_hearing_screen_step2_page_back");
                ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_hearing_screen_step1_page_in");
            }
        }
        Z6();
    }

    public final void Z6() {
        java.lang.String sb6;
        java.lang.String sb7;
        java.lang.String sb8;
        java.lang.String sb9;
        java.lang.Object systemService = com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("accessibility");
        android.view.accessibility.AccessibilityManager accessibilityManager = systemService instanceof android.view.accessibility.AccessibilityManager ? (android.view.accessibility.AccessibilityManager) systemService : null;
        boolean z17 = true;
        if (accessibilityManager != null && accessibilityManager.isTouchExplorationEnabled()) {
            if (this.I != 3) {
                com.tencent.mm.ui.widget.button.WeButton weButton = this.f160466o;
                if (weButton == null) {
                    kotlin.jvm.internal.o.o("positiveBtn");
                    throw null;
                }
                weButton.setEnabled(this.f160476y);
                com.tencent.mm.ui.widget.button.WeButton weButton2 = this.f160466o;
                if (weButton2 == null) {
                    kotlin.jvm.internal.o.o("positiveBtn");
                    throw null;
                }
                weButton2.setContentDescription(!this.f160476y ? getString(com.tencent.mm.R.string.o5c) : getString(com.tencent.mm.R.string.p1e));
                com.tencent.mm.ui.widget.button.WeButton weButton3 = this.f160465n;
                if (weButton3 == null) {
                    kotlin.jvm.internal.o.o("negativeBtn");
                    throw null;
                }
                weButton3.setEnabled(this.f160476y);
                com.tencent.mm.ui.widget.button.WeButton weButton4 = this.f160465n;
                if (weButton4 != null) {
                    weButton4.setContentDescription(!this.f160476y ? getString(com.tencent.mm.R.string.o5c) : getString(com.tencent.mm.R.string.p1d));
                    return;
                } else {
                    kotlin.jvm.internal.o.o("negativeBtn");
                    throw null;
                }
            }
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView = this.f160461g;
            if (settingsHearingAidAudioCardView == null) {
                kotlin.jvm.internal.o.o("audioCardView1");
                throw null;
            }
            if (this.A) {
                java.lang.StringBuilder sb10 = new java.lang.StringBuilder();
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView2 = this.f160461g;
                if (settingsHearingAidAudioCardView2 == null) {
                    kotlin.jvm.internal.o.o("audioCardView1");
                    throw null;
                }
                sb10.append(settingsHearingAidAudioCardView2.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME java.lang.String());
                sb10.append(getString(com.tencent.mm.R.string.p1b));
                sb6 = sb10.toString();
            } else {
                java.lang.StringBuilder sb11 = new java.lang.StringBuilder();
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView3 = this.f160461g;
                if (settingsHearingAidAudioCardView3 == null) {
                    kotlin.jvm.internal.o.o("audioCardView1");
                    throw null;
                }
                sb11.append(settingsHearingAidAudioCardView3.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME java.lang.String());
                sb11.append(getString(com.tencent.mm.R.string.p1c));
                sb6 = sb11.toString();
            }
            settingsHearingAidAudioCardView.setContentDescription(sb6);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView4 = this.f160462h;
            if (settingsHearingAidAudioCardView4 == null) {
                kotlin.jvm.internal.o.o("audioCardView2");
                throw null;
            }
            if (this.B) {
                java.lang.StringBuilder sb12 = new java.lang.StringBuilder();
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView5 = this.f160462h;
                if (settingsHearingAidAudioCardView5 == null) {
                    kotlin.jvm.internal.o.o("audioCardView2");
                    throw null;
                }
                sb12.append(settingsHearingAidAudioCardView5.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME java.lang.String());
                sb12.append(getString(com.tencent.mm.R.string.p1b));
                sb7 = sb12.toString();
            } else {
                java.lang.StringBuilder sb13 = new java.lang.StringBuilder();
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView6 = this.f160462h;
                if (settingsHearingAidAudioCardView6 == null) {
                    kotlin.jvm.internal.o.o("audioCardView2");
                    throw null;
                }
                sb13.append(settingsHearingAidAudioCardView6.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME java.lang.String());
                sb13.append(getString(com.tencent.mm.R.string.p1c));
                sb7 = sb13.toString();
            }
            settingsHearingAidAudioCardView4.setContentDescription(sb7);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView7 = this.f160463i;
            if (settingsHearingAidAudioCardView7 == null) {
                kotlin.jvm.internal.o.o("audioCardView3");
                throw null;
            }
            if (this.C) {
                java.lang.StringBuilder sb14 = new java.lang.StringBuilder();
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView8 = this.f160463i;
                if (settingsHearingAidAudioCardView8 == null) {
                    kotlin.jvm.internal.o.o("audioCardView3");
                    throw null;
                }
                sb14.append(settingsHearingAidAudioCardView8.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME java.lang.String());
                sb14.append(getString(com.tencent.mm.R.string.p1b));
                sb8 = sb14.toString();
            } else {
                java.lang.StringBuilder sb15 = new java.lang.StringBuilder();
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView9 = this.f160463i;
                if (settingsHearingAidAudioCardView9 == null) {
                    kotlin.jvm.internal.o.o("audioCardView3");
                    throw null;
                }
                sb15.append(settingsHearingAidAudioCardView9.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME java.lang.String());
                sb15.append(getString(com.tencent.mm.R.string.p1c));
                sb8 = sb15.toString();
            }
            settingsHearingAidAudioCardView7.setContentDescription(sb8);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView10 = this.f160464m;
            if (settingsHearingAidAudioCardView10 == null) {
                kotlin.jvm.internal.o.o("audioCardView4");
                throw null;
            }
            if (this.D) {
                java.lang.StringBuilder sb16 = new java.lang.StringBuilder();
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView11 = this.f160464m;
                if (settingsHearingAidAudioCardView11 == null) {
                    kotlin.jvm.internal.o.o("audioCardView4");
                    throw null;
                }
                sb16.append(settingsHearingAidAudioCardView11.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME java.lang.String());
                sb16.append(getString(com.tencent.mm.R.string.p1b));
                sb9 = sb16.toString();
            } else {
                java.lang.StringBuilder sb17 = new java.lang.StringBuilder();
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView12 = this.f160464m;
                if (settingsHearingAidAudioCardView12 == null) {
                    kotlin.jvm.internal.o.o("audioCardView4");
                    throw null;
                }
                sb17.append(settingsHearingAidAudioCardView12.getCom.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.PlayerStep.PLAYER_TRACK_NAME java.lang.String());
                sb17.append(getString(com.tencent.mm.R.string.p1c));
                sb9 = sb17.toString();
            }
            settingsHearingAidAudioCardView10.setContentDescription(sb9);
            com.tencent.mm.ui.widget.button.WeButton weButton5 = this.f160467p;
            if (weButton5 == null) {
                kotlin.jvm.internal.o.o("continueBtn");
                throw null;
            }
            if (!this.f160476y || (!this.A && !this.B && !this.C && !this.D)) {
                z17 = false;
            }
            weButton5.setEnabled(z17);
            com.tencent.mm.ui.widget.button.WeButton weButton6 = this.f160467p;
            if (weButton6 != null) {
                weButton6.setContentDescription(!this.f160476y ? getString(com.tencent.mm.R.string.o5w) : (this.A || this.B || this.C || this.D) ? getString(com.tencent.mm.R.string.p0o) : getString(com.tencent.mm.R.string.o5e));
            } else {
                kotlin.jvm.internal.o.o("continueBtn");
                throw null;
            }
        }
    }

    public final void a7(boolean z17) {
        int i17 = this.I;
        if (i17 == 2) {
            if (z17) {
                if (hq.b.a()) {
                    com.tencent.mm.ui.widget.button.WeButton weButton = this.f160466o;
                    if (weButton == null) {
                        kotlin.jvm.internal.o.o("positiveBtn");
                        throw null;
                    }
                    weButton.setBackgroundResource(com.tencent.mm.R.drawable.d8p);
                } else {
                    com.tencent.mm.ui.widget.button.WeButton weButton2 = this.f160466o;
                    if (weButton2 == null) {
                        kotlin.jvm.internal.o.o("positiveBtn");
                        throw null;
                    }
                    weButton2.setBackgroundResource(com.tencent.mm.R.drawable.d8o);
                }
                com.tencent.mm.ui.widget.button.WeButton weButton3 = this.f160465n;
                if (weButton3 == null) {
                    kotlin.jvm.internal.o.o("negativeBtn");
                    throw null;
                }
                weButton3.setBackgroundResource(com.tencent.mm.R.drawable.d8r);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView = this.f160468q;
                if (weImageView == null) {
                    kotlin.jvm.internal.o.o("negativeIcon");
                    throw null;
                }
                weImageView.setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.abw));
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView2 = this.f160469r;
                if (weImageView2 == null) {
                    kotlin.jvm.internal.o.o("positiveIcon");
                    throw null;
                }
                weImageView2.setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.aby));
                this.f160476y = true;
            } else {
                com.tencent.mm.ui.widget.button.WeButton weButton4 = this.f160465n;
                if (weButton4 == null) {
                    kotlin.jvm.internal.o.o("negativeBtn");
                    throw null;
                }
                weButton4.setBackgroundResource(com.tencent.mm.R.drawable.d8n);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView3 = this.f160468q;
                if (weImageView3 == null) {
                    kotlin.jvm.internal.o.o("negativeIcon");
                    throw null;
                }
                weImageView3.setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_4));
                com.tencent.mm.ui.widget.button.WeButton weButton5 = this.f160466o;
                if (weButton5 == null) {
                    kotlin.jvm.internal.o.o("positiveBtn");
                    throw null;
                }
                weButton5.setBackgroundResource(com.tencent.mm.R.drawable.d8n);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView4 = this.f160469r;
                if (weImageView4 == null) {
                    kotlin.jvm.internal.o.o("positiveIcon");
                    throw null;
                }
                weImageView4.setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_4));
                this.f160476y = false;
            }
        } else if (i17 == 3) {
            if (z17) {
                if (this.A || this.B || this.C || this.D) {
                    if (hq.b.a()) {
                        com.tencent.mm.ui.widget.button.WeButton weButton6 = this.f160467p;
                        if (weButton6 == null) {
                            kotlin.jvm.internal.o.o("continueBtn");
                            throw null;
                        }
                        weButton6.setBackgroundResource(com.tencent.mm.R.drawable.d8p);
                    } else {
                        com.tencent.mm.ui.widget.button.WeButton weButton7 = this.f160467p;
                        if (weButton7 == null) {
                            kotlin.jvm.internal.o.o("continueBtn");
                            throw null;
                        }
                        weButton7.setBackgroundResource(com.tencent.mm.R.drawable.d8o);
                    }
                    com.tencent.mm.ui.widget.imageview.WeImageView weImageView5 = this.f160470s;
                    if (weImageView5 == null) {
                        kotlin.jvm.internal.o.o("continueIcon");
                        throw null;
                    }
                    weImageView5.setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.aby));
                    this.f160477z = false;
                } else {
                    this.f160477z = true;
                }
                this.f160476y = true;
            } else {
                com.tencent.mm.ui.widget.button.WeButton weButton8 = this.f160467p;
                if (weButton8 == null) {
                    kotlin.jvm.internal.o.o("continueBtn");
                    throw null;
                }
                weButton8.setBackgroundResource(com.tencent.mm.R.drawable.d8n);
                com.tencent.mm.ui.widget.imageview.WeImageView weImageView6 = this.f160470s;
                if (weImageView6 == null) {
                    kotlin.jvm.internal.o.o("continueIcon");
                    throw null;
                }
                weImageView6.setIconColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_4));
                this.f160476y = false;
            }
        }
        Z6();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.enq;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        if ((intent != null ? intent.getBooleanExtra("audio_reoptimize", false) : false) && this.I != 1) {
            setResult(0, intent);
            finish();
        }
        if (intent != null ? intent.getBooleanExtra("audio_test_abandon", false) : false) {
            setResult(0, intent);
            finish();
        }
        if (i18 == -1) {
            setResult(-1);
            finish();
        } else {
            if (i18 != 0) {
                return;
            }
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager = this.f160460f;
            if (settingsHearingAidAudioCardViewManager != null) {
                settingsHearingAidAudioCardViewManager.b(settingsHearingAidAudioCardViewManager.f160413i.size() - 1);
            } else {
                kotlin.jvm.internal.o.o("audioCardManager");
                throw null;
            }
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.f478489a));
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.ve(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.odf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f160458d = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.vfg);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f160459e = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.sfm);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f160460f = (com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.u8t);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.F = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.uki);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f160465n = (com.tencent.mm.ui.widget.button.WeButton) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.uqy);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f160466o = (com.tencent.mm.ui.widget.button.WeButton) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.szv);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f160467p = (com.tencent.mm.ui.widget.button.WeButton) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.ukk);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f160468q = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById8;
        android.view.View findViewById9 = findViewById(com.tencent.mm.R.id.f486353ur0);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        this.f160469r = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById9;
        android.view.View findViewById10 = findViewById(com.tencent.mm.R.id.szx);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f160470s = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById10;
        android.view.View findViewById11 = findViewById(com.tencent.mm.R.id.uqz);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f160471t = (android.widget.FrameLayout) findViewById11;
        android.view.View findViewById12 = findViewById(com.tencent.mm.R.id.ukj);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f160472u = (android.widget.FrameLayout) findViewById12;
        android.view.View findViewById13 = findViewById(com.tencent.mm.R.id.szw);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.f160473v = (android.widget.FrameLayout) findViewById13;
        android.view.View findViewById14 = findViewById(com.tencent.mm.R.id.snt);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        this.f160474w = (android.widget.LinearLayout) findViewById14;
        this.I = getIntent().getIntExtra("audio_test_type", 0);
        this.f160457J = getIntent().getIntExtra("audio_snr", 0);
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager = this.f160460f;
        if (settingsHearingAidAudioCardViewManager == null) {
            kotlin.jvm.internal.o.o("audioCardManager");
            throw null;
        }
        settingsHearingAidAudioCardViewManager.setAutoPlay(getIntent().getBooleanExtra("audio_auto_play", false));
        android.widget.TextView textView = this.f160458d;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleTV");
            throw null;
        }
        com.tencent.mm.ui.bk.s0(textView.getPaint());
        android.widget.TextView textView2 = this.F;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("lastBtn");
            throw null;
        }
        com.tencent.mm.ui.bk.s0(textView2.getPaint());
        int i17 = this.I;
        if (i17 == 2) {
            this.K = com.tencent.mm.plugin.setting.ui.setting.me.f161327d;
            android.widget.TextView textView3 = this.f160458d;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("titleTV");
                throw null;
            }
            textView3.setText(getString(com.tencent.mm.R.string.o5d));
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView = new com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView(this);
            this.f160461g = settingsHearingAidAudioCardView;
            settingsHearingAidAudioCardView.setChooseType(0);
            settingsHearingAidAudioCardView.setSource(com.tencent.mm.plugin.setting.ui.setting.xd.f161738h.h());
            java.lang.String string = getString(com.tencent.mm.R.string.o5c);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            settingsHearingAidAudioCardView.setToastText(string);
            settingsHearingAidAudioCardView.setBtnEnable(false);
            com.tencent.mm.ui.widget.button.WeButton weButton = this.f160466o;
            if (weButton == null) {
                kotlin.jvm.internal.o.o("positiveBtn");
                throw null;
            }
            weButton.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.gf(this));
            com.tencent.mm.ui.widget.button.WeButton weButton2 = this.f160465n;
            if (weButton2 == null) {
                kotlin.jvm.internal.o.o("negativeBtn");
                throw null;
            }
            weButton2.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.df(this));
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView2 = new com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView(this);
            this.f160462h = settingsHearingAidAudioCardView2;
            settingsHearingAidAudioCardView2.setChooseType(0);
            java.lang.String string2 = getString(com.tencent.mm.R.string.o5c);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            settingsHearingAidAudioCardView2.setToastText(string2);
            settingsHearingAidAudioCardView2.setBtnEnable(false);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView3 = this.f160461g;
            if (settingsHearingAidAudioCardView3 == null) {
                kotlin.jvm.internal.o.o("audioCardView1");
                throw null;
            }
            settingsHearingAidAudioCardView3.setClickable(true);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView4 = this.f160462h;
            if (settingsHearingAidAudioCardView4 == null) {
                kotlin.jvm.internal.o.o("audioCardView2");
                throw null;
            }
            settingsHearingAidAudioCardView4.setClickable(true);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView5 = this.f160461g;
            if (settingsHearingAidAudioCardView5 == null) {
                kotlin.jvm.internal.o.o("audioCardView1");
                throw null;
            }
            settingsHearingAidAudioCardView5.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.pe(this));
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView6 = this.f160462h;
            if (settingsHearingAidAudioCardView6 == null) {
                kotlin.jvm.internal.o.o("audioCardView2");
                throw null;
            }
            settingsHearingAidAudioCardView6.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.qe(this));
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager2 = this.f160460f;
            if (settingsHearingAidAudioCardViewManager2 == null) {
                kotlin.jvm.internal.o.o("audioCardManager");
                throw null;
            }
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView[] settingsHearingAidAudioCardViewArr = new com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView[1];
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView7 = this.f160461g;
            if (settingsHearingAidAudioCardView7 == null) {
                kotlin.jvm.internal.o.o("audioCardView1");
                throw null;
            }
            settingsHearingAidAudioCardViewArr[0] = settingsHearingAidAudioCardView7;
            settingsHearingAidAudioCardViewManager2.a(settingsHearingAidAudioCardViewArr);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager3 = this.f160460f;
            if (settingsHearingAidAudioCardViewManager3 == null) {
                kotlin.jvm.internal.o.o("audioCardManager");
                throw null;
            }
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView[] settingsHearingAidAudioCardViewArr2 = new com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView[1];
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView8 = this.f160462h;
            if (settingsHearingAidAudioCardView8 == null) {
                kotlin.jvm.internal.o.o("audioCardView2");
                throw null;
            }
            settingsHearingAidAudioCardViewArr2[0] = settingsHearingAidAudioCardView8;
            settingsHearingAidAudioCardViewManager3.a(settingsHearingAidAudioCardViewArr2);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager4 = this.f160460f;
            if (settingsHearingAidAudioCardViewManager4 == null) {
                kotlin.jvm.internal.o.o("audioCardManager");
                throw null;
            }
            settingsHearingAidAudioCardViewManager4.setPlayFinishedListener(this);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager5 = this.f160460f;
            if (settingsHearingAidAudioCardViewManager5 == null) {
                kotlin.jvm.internal.o.o("audioCardManager");
                throw null;
            }
            settingsHearingAidAudioCardViewManager5.b(0);
            this.E = 0;
            android.widget.TextView textView4 = this.F;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("lastBtn");
                throw null;
            }
            textView4.setVisibility(0);
            android.widget.TextView textView5 = this.F;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("lastBtn");
                throw null;
            }
            textView5.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.se(this));
        } else if (i17 == 3) {
            this.K = com.tencent.mm.plugin.setting.ui.setting.me.f161328e;
            android.widget.TextView textView6 = this.f160458d;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("titleTV");
                throw null;
            }
            textView6.setText(getString(com.tencent.mm.R.string.o5x));
            this.f160461g = new com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView(this);
            this.f160462h = new com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView(this);
            this.f160463i = new com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView(this);
            this.f160464m = new com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView(this);
            android.widget.FrameLayout frameLayout = this.f160472u;
            if (frameLayout == null) {
                kotlin.jvm.internal.o.o("negativeFrame");
                throw null;
            }
            frameLayout.setVisibility(8);
            android.widget.FrameLayout frameLayout2 = this.f160471t;
            if (frameLayout2 == null) {
                kotlin.jvm.internal.o.o("positiveFrame");
                throw null;
            }
            frameLayout2.setVisibility(8);
            android.widget.FrameLayout frameLayout3 = this.f160473v;
            if (frameLayout3 == null) {
                kotlin.jvm.internal.o.o("continueFrame");
                throw null;
            }
            frameLayout3.setVisibility(0);
            a7(false);
            this.f160477z = false;
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView9 = this.f160461g;
            if (settingsHearingAidAudioCardView9 == null) {
                kotlin.jvm.internal.o.o("audioCardView1");
                throw null;
            }
            java.lang.String string3 = getString(com.tencent.mm.R.string.p17);
            kotlin.jvm.internal.o.f(string3, "getString(...)");
            settingsHearingAidAudioCardView9.setName(string3);
            settingsHearingAidAudioCardView9.setChooseType(0);
            java.lang.String string4 = getString(com.tencent.mm.R.string.o5w);
            kotlin.jvm.internal.o.f(string4, "getString(...)");
            settingsHearingAidAudioCardView9.setToastText(string4);
            int i18 = this.f160457J;
            settingsHearingAidAudioCardView9.setModeInfo(i18 != 1 ? i18 != 2 ? i18 != 3 ? com.tencent.mm.plugin.setting.ui.setting.xd.f161745r : com.tencent.mm.plugin.setting.ui.setting.xd.f161743p : com.tencent.mm.plugin.setting.ui.setting.xd.f161741n : com.tencent.mm.plugin.setting.ui.setting.xd.f161739i);
            settingsHearingAidAudioCardView9.setSource(settingsHearingAidAudioCardView9.getModeInfo().h());
            settingsHearingAidAudioCardView9.setBtnEnable(false);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView10 = this.f160462h;
            if (settingsHearingAidAudioCardView10 == null) {
                kotlin.jvm.internal.o.o("audioCardView2");
                throw null;
            }
            java.lang.String string5 = getString(com.tencent.mm.R.string.p18);
            kotlin.jvm.internal.o.f(string5, "getString(...)");
            settingsHearingAidAudioCardView10.setName(string5);
            settingsHearingAidAudioCardView10.setChooseType(0);
            java.lang.String string6 = getString(com.tencent.mm.R.string.o5w);
            kotlin.jvm.internal.o.f(string6, "getString(...)");
            settingsHearingAidAudioCardView10.setToastText(string6);
            int i19 = this.f160457J;
            settingsHearingAidAudioCardView10.setModeInfo(i19 != 1 ? i19 != 2 ? i19 != 3 ? com.tencent.mm.plugin.setting.ui.setting.xd.f161745r : com.tencent.mm.plugin.setting.ui.setting.xd.f161744q : com.tencent.mm.plugin.setting.ui.setting.xd.f161742o : com.tencent.mm.plugin.setting.ui.setting.xd.f161740m);
            settingsHearingAidAudioCardView10.setSource(settingsHearingAidAudioCardView10.getModeInfo().h());
            settingsHearingAidAudioCardView10.setBtnEnable(false);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView11 = this.f160463i;
            if (settingsHearingAidAudioCardView11 == null) {
                kotlin.jvm.internal.o.o("audioCardView3");
                throw null;
            }
            java.lang.String string7 = getString(com.tencent.mm.R.string.p19);
            kotlin.jvm.internal.o.f(string7, "getString(...)");
            settingsHearingAidAudioCardView11.setName(string7);
            settingsHearingAidAudioCardView11.setChooseType(0);
            java.lang.String string8 = getString(com.tencent.mm.R.string.o5w);
            kotlin.jvm.internal.o.f(string8, "getString(...)");
            settingsHearingAidAudioCardView11.setToastText(string8);
            settingsHearingAidAudioCardView11.setBtnEnable(false);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView12 = this.f160464m;
            if (settingsHearingAidAudioCardView12 == null) {
                kotlin.jvm.internal.o.o("audioCardView4");
                throw null;
            }
            java.lang.String string9 = getString(com.tencent.mm.R.string.p1_);
            kotlin.jvm.internal.o.f(string9, "getString(...)");
            settingsHearingAidAudioCardView12.setName(string9);
            settingsHearingAidAudioCardView12.setChooseType(0);
            java.lang.String string10 = getString(com.tencent.mm.R.string.o5w);
            kotlin.jvm.internal.o.f(string10, "getString(...)");
            settingsHearingAidAudioCardView12.setToastText(string10);
            int i27 = this.f160457J;
            settingsHearingAidAudioCardView12.setModeInfo(i27 != 1 ? i27 != 2 ? i27 != 3 ? com.tencent.mm.plugin.setting.ui.setting.xd.f161745r : com.tencent.mm.plugin.setting.ui.setting.xd.A : com.tencent.mm.plugin.setting.ui.setting.xd.f161751x : com.tencent.mm.plugin.setting.ui.setting.xd.f161748u);
            settingsHearingAidAudioCardView12.setSource(settingsHearingAidAudioCardView12.getModeInfo().h());
            settingsHearingAidAudioCardView12.setBtnEnable(false);
            com.tencent.mm.ui.widget.button.WeButton weButton3 = this.f160467p;
            if (weButton3 == null) {
                kotlin.jvm.internal.o.o("continueBtn");
                throw null;
            }
            weButton3.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.af(this));
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView13 = this.f160461g;
            if (settingsHearingAidAudioCardView13 == null) {
                kotlin.jvm.internal.o.o("audioCardView1");
                throw null;
            }
            settingsHearingAidAudioCardView13.setClickable(true);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView14 = this.f160462h;
            if (settingsHearingAidAudioCardView14 == null) {
                kotlin.jvm.internal.o.o("audioCardView2");
                throw null;
            }
            settingsHearingAidAudioCardView14.setClickable(true);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView15 = this.f160463i;
            if (settingsHearingAidAudioCardView15 == null) {
                kotlin.jvm.internal.o.o("audioCardView3");
                throw null;
            }
            settingsHearingAidAudioCardView15.setClickable(true);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView16 = this.f160464m;
            if (settingsHearingAidAudioCardView16 == null) {
                kotlin.jvm.internal.o.o("audioCardView4");
                throw null;
            }
            settingsHearingAidAudioCardView16.setClickable(true);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView17 = this.f160461g;
            if (settingsHearingAidAudioCardView17 == null) {
                kotlin.jvm.internal.o.o("audioCardView1");
                throw null;
            }
            settingsHearingAidAudioCardView17.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.we(this));
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView18 = this.f160462h;
            if (settingsHearingAidAudioCardView18 == null) {
                kotlin.jvm.internal.o.o("audioCardView2");
                throw null;
            }
            settingsHearingAidAudioCardView18.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.xe(this));
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView19 = this.f160463i;
            if (settingsHearingAidAudioCardView19 == null) {
                kotlin.jvm.internal.o.o("audioCardView3");
                throw null;
            }
            settingsHearingAidAudioCardView19.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.ye(this));
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView20 = this.f160464m;
            if (settingsHearingAidAudioCardView20 == null) {
                kotlin.jvm.internal.o.o("audioCardView4");
                throw null;
            }
            settingsHearingAidAudioCardView20.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.ze(this));
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager6 = this.f160460f;
            if (settingsHearingAidAudioCardViewManager6 == null) {
                kotlin.jvm.internal.o.o("audioCardManager");
                throw null;
            }
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView[] settingsHearingAidAudioCardViewArr3 = new com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView[2];
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView21 = this.f160461g;
            if (settingsHearingAidAudioCardView21 == null) {
                kotlin.jvm.internal.o.o("audioCardView1");
                throw null;
            }
            settingsHearingAidAudioCardViewArr3[0] = settingsHearingAidAudioCardView21;
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView22 = this.f160462h;
            if (settingsHearingAidAudioCardView22 == null) {
                kotlin.jvm.internal.o.o("audioCardView2");
                throw null;
            }
            settingsHearingAidAudioCardViewArr3[1] = settingsHearingAidAudioCardView22;
            settingsHearingAidAudioCardViewManager6.a(settingsHearingAidAudioCardViewArr3);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager7 = this.f160460f;
            if (settingsHearingAidAudioCardViewManager7 == null) {
                kotlin.jvm.internal.o.o("audioCardManager");
                throw null;
            }
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView[] settingsHearingAidAudioCardViewArr4 = new com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView[2];
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView23 = this.f160463i;
            if (settingsHearingAidAudioCardView23 == null) {
                kotlin.jvm.internal.o.o("audioCardView3");
                throw null;
            }
            settingsHearingAidAudioCardViewArr4[0] = settingsHearingAidAudioCardView23;
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView24 = this.f160464m;
            if (settingsHearingAidAudioCardView24 == null) {
                kotlin.jvm.internal.o.o("audioCardView4");
                throw null;
            }
            settingsHearingAidAudioCardViewArr4[1] = settingsHearingAidAudioCardView24;
            settingsHearingAidAudioCardViewManager7.a(settingsHearingAidAudioCardViewArr4);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager8 = this.f160460f;
            if (settingsHearingAidAudioCardViewManager8 == null) {
                kotlin.jvm.internal.o.o("audioCardManager");
                throw null;
            }
            settingsHearingAidAudioCardViewManager8.setPlayFinishedListener(this);
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager9 = this.f160460f;
            if (settingsHearingAidAudioCardViewManager9 == null) {
                kotlin.jvm.internal.o.o("audioCardManager");
                throw null;
            }
            settingsHearingAidAudioCardViewManager9.b(0);
            android.widget.TextView textView7 = this.F;
            if (textView7 == null) {
                kotlin.jvm.internal.o.o("lastBtn");
                throw null;
            }
            textView7.setVisibility(0);
            android.widget.TextView textView8 = this.F;
            if (textView8 == null) {
                kotlin.jvm.internal.o.o("lastBtn");
                throw null;
            }
            textView8.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.ue(this));
        }
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (i65.a.D(context)) {
            android.widget.TextView textView9 = this.f160458d;
            if (textView9 == null) {
                kotlin.jvm.internal.o.o("titleTV");
                throw null;
            }
            com.tencent.mm.ui.kk.f(textView9, (int) (i65.a.f(getContext(), com.tencent.mm.R.dimen.f479724dg) / i65.a.m(getContext())));
            android.widget.TextView textView10 = this.F;
            if (textView10 == null) {
                kotlin.jvm.internal.o.o("lastBtn");
                throw null;
            }
            com.tencent.mm.ui.kk.d(textView10, (int) (i65.a.f(getContext(), com.tencent.mm.R.dimen.f479723df) / i65.a.m(getContext())));
            android.widget.LinearLayout linearLayout = this.f160474w;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("btnArray");
                throw null;
            }
            com.tencent.mm.ui.kk.d(linearLayout, (int) (i65.a.f(getContext(), com.tencent.mm.R.dimen.f479725dh) / i65.a.m(getContext())));
            android.widget.TextView textView11 = this.f160458d;
            if (textView11 == null) {
                kotlin.jvm.internal.o.o("titleTV");
                throw null;
            }
            textView11.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.anm) / i65.a.m(getContext()));
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager10 = this.f160460f;
            if (settingsHearingAidAudioCardViewManager10 == null) {
                kotlin.jvm.internal.o.o("audioCardManager");
                throw null;
            }
            com.tencent.mm.ui.kk.f(settingsHearingAidAudioCardViewManager10, (int) (i65.a.f(getContext(), com.tencent.mm.R.dimen.f479723df) / i65.a.m(getContext())));
            android.widget.TextView textView12 = this.f160459e;
            if (textView12 == null) {
                kotlin.jvm.internal.o.o("tipsInfo");
                throw null;
            }
            com.tencent.mm.ui.kk.f(textView12, (int) (i65.a.f(getContext(), com.tencent.mm.R.dimen.f479704cz) / i65.a.m(getContext())));
        }
        this.H = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI$registerListener$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                boolean booleanExtra = intent != null ? intent.getBooleanExtra("isGetFocus", false) : false;
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI settingsHearingAidTestUI = com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI.this;
                settingsHearingAidTestUI.G = booleanExtra;
                if (settingsHearingAidTestUI.G) {
                    return;
                }
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager11 = settingsHearingAidTestUI.f160460f;
                if (settingsHearingAidAudioCardViewManager11 != null) {
                    settingsHearingAidAudioCardViewManager11.c();
                } else {
                    kotlin.jvm.internal.o.o("audioCardManager");
                    throw null;
                }
            }
        };
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("hearing_aid_message");
        b4.d a17 = b4.d.a(this);
        android.content.BroadcastReceiver broadcastReceiver = this.H;
        if (broadcastReceiver == null) {
            kotlin.jvm.internal.o.o("receiver");
            throw null;
        }
        a17.b(broadcastReceiver, intentFilter);
        Z6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager = this.f160460f;
        if (settingsHearingAidAudioCardViewManager == null) {
            kotlin.jvm.internal.o.o("audioCardManager");
            throw null;
        }
        settingsHearingAidAudioCardViewManager.c();
        b4.d a17 = b4.d.a(this);
        android.content.BroadcastReceiver broadcastReceiver = this.H;
        if (broadcastReceiver != null) {
            a17.d(broadcastReceiver);
        } else {
            kotlin.jvm.internal.o.o("receiver");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (i17 != 4) {
            return super.onKeyDown(i17, event);
        }
        Y6();
        return true;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager = this.f160460f;
        if (settingsHearingAidAudioCardViewManager != null) {
            settingsHearingAidAudioCardViewManager.c();
        } else {
            kotlin.jvm.internal.o.o("audioCardManager");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.K == com.tencent.mm.plugin.setting.ui.setting.me.f161327d) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager = this.f160460f;
            if (settingsHearingAidAudioCardViewManager == null) {
                kotlin.jvm.internal.o.o("audioCardManager");
                throw null;
            }
            if (settingsHearingAidAudioCardViewManager.f160411g == 0) {
                ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_hearing_test_step1_page_in");
                return;
            } else {
                ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_hearing_test_step2_page_in");
                return;
            }
        }
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardViewManager settingsHearingAidAudioCardViewManager2 = this.f160460f;
        if (settingsHearingAidAudioCardViewManager2 == null) {
            kotlin.jvm.internal.o.o("audioCardManager");
            throw null;
        }
        if (settingsHearingAidAudioCardViewManager2.f160411g == 0) {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_hearing_screen_step1_page_in");
        } else {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_hearing_screen_step2_page_in");
        }
    }
}
