package com.tencent.mm.plugin.setting.ui.setting;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidTestEnvironmentUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes14.dex */
public final class SettingsHearingAidTestEnvironmentUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: z, reason: collision with root package name */
    public static final /* synthetic */ int f160436z = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f160437d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f160438e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f160439f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.transvoice.ui.SoundWaveView f160440g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f160441h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f160442i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f160443m = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f160444n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f160445o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f160446p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f160447q;

    /* renamed from: r, reason: collision with root package name */
    public final float f160448r;

    /* renamed from: s, reason: collision with root package name */
    public android.content.BroadcastReceiver f160449s;

    /* renamed from: t, reason: collision with root package name */
    public final java.util.List f160450t;

    /* renamed from: u, reason: collision with root package name */
    public long f160451u;

    /* renamed from: v, reason: collision with root package name */
    public tl.w f160452v;

    /* renamed from: w, reason: collision with root package name */
    public long f160453w;

    /* renamed from: x, reason: collision with root package name */
    public long f160454x;

    /* renamed from: y, reason: collision with root package name */
    public final android.os.Handler f160455y;

    public SettingsHearingAidTestEnvironmentUI() {
        jz5.h.b(com.tencent.mm.plugin.setting.ui.setting.le.f161294d);
        this.f160448r = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).hj(new com.tencent.mm.repairer.config.haid.RepairerConfigHAidThreshDb());
        this.f160450t = new java.util.ArrayList();
        this.f160451u = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).wi();
        this.f160452v = new tl.w(16000, 1, 10);
        this.f160453w = java.lang.System.currentTimeMillis();
        this.f160454x = -1L;
        this.f160455y = new android.os.Handler(android.os.Looper.getMainLooper(), new com.tencent.mm.plugin.setting.ui.setting.fe(this));
    }

    public static final void T6(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI settingsHearingAidTestEnvironmentUI) {
        if (!settingsHearingAidTestEnvironmentUI.f160443m) {
            androidx.appcompat.app.AppCompatActivity context = settingsHearingAidTestEnvironmentUI.getContext();
            int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
            com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
            e4Var.d(com.tencent.mm.R.string.p1j);
            e4Var.c();
            return;
        }
        if (settingsHearingAidTestEnvironmentUI.f160445o) {
            return;
        }
        if (k14.t.f303377a.b()) {
            settingsHearingAidTestEnvironmentUI.X6();
            return;
        }
        settingsHearingAidTestEnvironmentUI.f160445o = true;
        androidx.appcompat.app.AppCompatActivity context2 = settingsHearingAidTestEnvironmentUI.getContext();
        int i18 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var2 = new com.tencent.mm.ui.widget.dialog.e4(context2);
        e4Var2.f211776c = settingsHearingAidTestEnvironmentUI.getString(com.tencent.mm.R.string.o5q);
        e4Var2.f211780g = 2;
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.tencent.mm.plugin.setting.ui.setting.ee(e4Var2.c(), settingsHearingAidTestEnvironmentUI), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
    }

    public final void V6(java.lang.String str, int i17) {
        java.lang.String a17 = com.tencent.mm.plugin.setting.ui.setting.ce.f160909a.a();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(str, kz5.c1.k(new jz5.l("aid_process_result", java.lang.Integer.valueOf(i17)), new jz5.l("care_session_id", a17)), 35684);
    }

    public final void W6() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidTestEnvironmentUI", "audioDetectInitEnvironment");
        android.widget.TextView textView = this.f160439f;
        if (textView == null) {
            kotlin.jvm.internal.o.o("titleTV");
            throw null;
        }
        textView.setText(getString(com.tencent.mm.R.string.p1f));
        android.widget.TextView textView2 = this.f160439f;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("titleTV");
            throw null;
        }
        textView2.setTextColor(getResources().getColor(com.tencent.mm.R.color.adg));
        com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView = this.f160440g;
        if (soundWaveView == null) {
            kotlin.jvm.internal.o.o("newVoice2txtTxtReactWave");
            throw null;
        }
        soundWaveView.setWaveColor(getResources().getColor(com.tencent.mm.R.color.f478520a84));
        this.f160452v.g(20);
        tl.w wVar = this.f160452v;
        wVar.f420160m = -19;
        wVar.f420172y = new com.tencent.mm.plugin.setting.ui.setting.ge(this);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidTestEnvironmentUI", "audioDetect start");
        if (this.f160452v.k()) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SettingsHearingAidTestEnvironmentUI", "audioDetect startRecord failed");
        this.f160452v.l();
        ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Bi(this.f160451u);
    }

    public final void X6() {
        java.util.List C0;
        java.util.List C02;
        java.util.ArrayList arrayList;
        java.util.ArrayList arrayList2;
        java.util.ArrayList arrayList3;
        if (this.f160446p) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidTestEnvironmentUI", "audioDetect end");
        this.f160446p = true;
        this.f160452v.l();
        if (!this.f160447q) {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Bi(this.f160451u);
            this.f160447q = true;
        }
        com.tencent.mm.plugin.setting.ui.setting.ae aeVar = com.tencent.mm.plugin.setting.ui.setting.ae.f160812a;
        java.io.File[] d17 = aeVar.d(3);
        java.io.File[] d18 = aeVar.d(1);
        java.io.File[] d19 = aeVar.d(5);
        if (!(d17.length == 0)) {
            if (!(d18.length == 0)) {
                if (!(d19.length == 0)) {
                    c06.d dVar = c06.e.f37716d;
                    java.lang.String name = d17[dVar.d(d17.length)].getName();
                    kotlin.jvm.internal.o.f(name, "getName(...)");
                    com.tencent.mm.plugin.setting.ui.setting.ae.f160813b = name;
                    java.lang.String name2 = d18[dVar.d(d18.length)].getName();
                    kotlin.jvm.internal.o.f(name2, "getName(...)");
                    com.tencent.mm.plugin.setting.ui.setting.ae.f160814c = name2;
                    java.lang.String name3 = d19[dVar.d(d19.length)].getName();
                    kotlin.jvm.internal.o.f(name3, "getName(...)");
                    com.tencent.mm.plugin.setting.ui.setting.ae.f160815d = name3;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidResourceManager", "setDisableTestFiles: ysFileRandomChooseOrigin is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160813b + ", ysFileRandomChooseClearly is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160814c + ", ysFileRandomChooseUnClearly is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160815d);
                    java.util.List C03 = kz5.z.C0(aeVar.c("DJ", 2, false));
                    java.util.List C04 = kz5.z.C0(aeVar.c("PS", 2, false));
                    java.util.List C05 = kz5.z.C0(aeVar.c("PX", 2, false));
                    C0 = kz5.z.C0(aeVar.c("DJ", 4, false));
                    java.util.List C06 = kz5.z.C0(aeVar.c("PS", 4, false));
                    java.util.List C07 = kz5.z.C0(aeVar.c("PX", 4, false));
                    C02 = kz5.z.C0(aeVar.c("DJ", 0, true));
                    java.util.List C08 = kz5.z.C0(aeVar.c("PS", 0, true));
                    java.util.List C09 = kz5.z.C0(aeVar.c("PX", 0, true));
                    arrayList = (java.util.ArrayList) C03;
                    if (!arrayList.isEmpty() && !((java.util.ArrayList) C04).isEmpty() && !((java.util.ArrayList) C05).isEmpty()) {
                        arrayList2 = (java.util.ArrayList) C0;
                        if (!arrayList2.isEmpty() && !((java.util.ArrayList) C06).isEmpty() && !((java.util.ArrayList) C07).isEmpty()) {
                            arrayList3 = (java.util.ArrayList) C02;
                            if (!arrayList3.isEmpty() && !((java.util.ArrayList) C08).isEmpty() && !((java.util.ArrayList) C09).isEmpty()) {
                                c06.d dVar2 = c06.e.f37716d;
                                java.io.File file = (java.io.File) arrayList.get(dVar2.d(arrayList.size()));
                                java.lang.String name4 = file.getName();
                                kotlin.jvm.internal.o.f(name4, "getName(...)");
                                com.tencent.mm.plugin.setting.ui.setting.ae.f160816e = name4;
                                arrayList.remove(file);
                                java.lang.String name5 = ((java.io.File) arrayList.get(dVar2.d(arrayList.size()))).getName();
                                kotlin.jvm.internal.o.f(name5, "getName(...)");
                                com.tencent.mm.plugin.setting.ui.setting.ae.f160822k = name5;
                                com.tencent.mm.plugin.setting.ui.setting.ae.f160819h = "HearingModelSelector_PS_SNR_L2_AUD" + aeVar.b(com.tencent.mm.plugin.setting.ui.setting.ae.f160816e, aeVar.a("DJ", 2, false)) + ".wav";
                                java.lang.Integer b17 = aeVar.b(com.tencent.mm.plugin.setting.ui.setting.ae.f160822k, aeVar.a("DJ", 2, false));
                                com.tencent.mm.plugin.setting.ui.setting.ae.f160825n = "HearingModelSelector_PS_SNR_L2_AUD" + b17 + ".wav";
                                com.tencent.mm.plugin.setting.ui.setting.ae.f160828q = "HearingModelSelector_PX_SNR_L2_AUD" + b17 + ".wav";
                                java.io.File file2 = (java.io.File) arrayList2.get(dVar2.d(arrayList2.size()));
                                java.lang.String name6 = file2.getName();
                                kotlin.jvm.internal.o.f(name6, "getName(...)");
                                com.tencent.mm.plugin.setting.ui.setting.ae.f160817f = name6;
                                arrayList2.remove(file2);
                                java.lang.String name7 = ((java.io.File) arrayList2.get(dVar2.d(arrayList2.size()))).getName();
                                kotlin.jvm.internal.o.f(name7, "getName(...)");
                                com.tencent.mm.plugin.setting.ui.setting.ae.f160823l = name7;
                                com.tencent.mm.plugin.setting.ui.setting.ae.f160820i = "HearingModelSelector_PS_SNR_L4_AUD" + aeVar.b(com.tencent.mm.plugin.setting.ui.setting.ae.f160817f, aeVar.a("DJ", 4, false)) + ".wav";
                                java.lang.Integer b18 = aeVar.b(com.tencent.mm.plugin.setting.ui.setting.ae.f160823l, aeVar.a("DJ", 4, false));
                                com.tencent.mm.plugin.setting.ui.setting.ae.f160826o = "HearingModelSelector_PS_SNR_L4_AUD" + b18 + ".wav";
                                com.tencent.mm.plugin.setting.ui.setting.ae.f160829r = "HearingModelSelector_PX_SNR_L4_AUD" + b18 + ".wav";
                                java.io.File file3 = (java.io.File) arrayList3.get(dVar2.d(arrayList3.size()));
                                java.lang.String name8 = file3.getName();
                                kotlin.jvm.internal.o.f(name8, "getName(...)");
                                com.tencent.mm.plugin.setting.ui.setting.ae.f160818g = name8;
                                arrayList3.remove(file3);
                                java.lang.String name9 = ((java.io.File) arrayList3.get(dVar2.d(arrayList3.size()))).getName();
                                kotlin.jvm.internal.o.f(name9, "getName(...)");
                                com.tencent.mm.plugin.setting.ui.setting.ae.f160824m = name9;
                                com.tencent.mm.plugin.setting.ui.setting.ae.f160821j = "HearingModelSelector_PS_SNR_NA_AUD" + aeVar.b(com.tencent.mm.plugin.setting.ui.setting.ae.f160818g, aeVar.a("DJ", 0, true)) + ".wav";
                                java.lang.Integer b19 = aeVar.b(com.tencent.mm.plugin.setting.ui.setting.ae.f160824m, aeVar.a("DJ", 0, true));
                                com.tencent.mm.plugin.setting.ui.setting.ae.f160827p = "HearingModelSelector_PS_SNR_NA_AUD" + b19 + ".wav";
                                com.tencent.mm.plugin.setting.ui.setting.ae.f160830s = "HearingModelSelector_PX_SNR_NA_AUD" + b19 + ".wav";
                                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidResourceManager", "setDifferentHearingAidModelMap: test1DjL2 is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160816e + ", test1PsL2 is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160819h + ", test1DjL4 is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160817f + ", test1PsL4 is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160820i + ", test1DjNA is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160818g + ", test1PsNA is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160821j);
                                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidResourceManager", "setDifferentHearingAidModelMap: test2DjL2 is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160822k + ", test2PsL2 is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160825n + ", test2DjL4 is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160823l + ", test2PsL4 is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160826o + ", test2DjNA is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160824m + ", test2PsNA is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160827p);
                                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setDifferentHearingAidModelMap: test2PxL2 is ");
                                sb6.append(com.tencent.mm.plugin.setting.ui.setting.ae.f160828q);
                                sb6.append(", test2PxL4 is ");
                                sb6.append(com.tencent.mm.plugin.setting.ui.setting.ae.f160829r);
                                sb6.append(", test2PxNA is ");
                                sb6.append(com.tencent.mm.plugin.setting.ui.setting.ae.f160830s);
                                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidResourceManager", sb6.toString());
                                android.content.Intent intent = new android.content.Intent();
                                intent.setClass(this, com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI.class);
                                V6("noise_detect_end", 1);
                                V6("download_materials", 1);
                                intent.putExtra("audio_auto_play", this.f160442i);
                                intent.putExtra("audio_test_type", 2);
                                startActivityForResult(intent);
                            }
                        }
                    }
                    com.tencent.mars.xlog.Log.e("MicroMsg.SettingsHearingAidResourceManager", "setDifferentHearingAidModelMap: files is empty");
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.setClass(this, com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI.class);
                    V6("noise_detect_end", 1);
                    V6("download_materials", 1);
                    intent2.putExtra("audio_auto_play", this.f160442i);
                    intent2.putExtra("audio_test_type", 2);
                    startActivityForResult(intent2);
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SettingsHearingAidResourceManager", "setDisableTestFiles: files is empty");
        java.util.List C032 = kz5.z.C0(aeVar.c("DJ", 2, false));
        java.util.List C042 = kz5.z.C0(aeVar.c("PS", 2, false));
        java.util.List C052 = kz5.z.C0(aeVar.c("PX", 2, false));
        C0 = kz5.z.C0(aeVar.c("DJ", 4, false));
        java.util.List C062 = kz5.z.C0(aeVar.c("PS", 4, false));
        java.util.List C072 = kz5.z.C0(aeVar.c("PX", 4, false));
        C02 = kz5.z.C0(aeVar.c("DJ", 0, true));
        java.util.List C082 = kz5.z.C0(aeVar.c("PS", 0, true));
        java.util.List C092 = kz5.z.C0(aeVar.c("PX", 0, true));
        arrayList = (java.util.ArrayList) C032;
        if (!arrayList.isEmpty()) {
            arrayList2 = (java.util.ArrayList) C0;
            if (!arrayList2.isEmpty()) {
                arrayList3 = (java.util.ArrayList) C02;
                if (!arrayList3.isEmpty()) {
                    c06.d dVar22 = c06.e.f37716d;
                    java.io.File file4 = (java.io.File) arrayList.get(dVar22.d(arrayList.size()));
                    java.lang.String name42 = file4.getName();
                    kotlin.jvm.internal.o.f(name42, "getName(...)");
                    com.tencent.mm.plugin.setting.ui.setting.ae.f160816e = name42;
                    arrayList.remove(file4);
                    java.lang.String name52 = ((java.io.File) arrayList.get(dVar22.d(arrayList.size()))).getName();
                    kotlin.jvm.internal.o.f(name52, "getName(...)");
                    com.tencent.mm.plugin.setting.ui.setting.ae.f160822k = name52;
                    com.tencent.mm.plugin.setting.ui.setting.ae.f160819h = "HearingModelSelector_PS_SNR_L2_AUD" + aeVar.b(com.tencent.mm.plugin.setting.ui.setting.ae.f160816e, aeVar.a("DJ", 2, false)) + ".wav";
                    java.lang.Integer b172 = aeVar.b(com.tencent.mm.plugin.setting.ui.setting.ae.f160822k, aeVar.a("DJ", 2, false));
                    com.tencent.mm.plugin.setting.ui.setting.ae.f160825n = "HearingModelSelector_PS_SNR_L2_AUD" + b172 + ".wav";
                    com.tencent.mm.plugin.setting.ui.setting.ae.f160828q = "HearingModelSelector_PX_SNR_L2_AUD" + b172 + ".wav";
                    java.io.File file22 = (java.io.File) arrayList2.get(dVar22.d(arrayList2.size()));
                    java.lang.String name62 = file22.getName();
                    kotlin.jvm.internal.o.f(name62, "getName(...)");
                    com.tencent.mm.plugin.setting.ui.setting.ae.f160817f = name62;
                    arrayList2.remove(file22);
                    java.lang.String name72 = ((java.io.File) arrayList2.get(dVar22.d(arrayList2.size()))).getName();
                    kotlin.jvm.internal.o.f(name72, "getName(...)");
                    com.tencent.mm.plugin.setting.ui.setting.ae.f160823l = name72;
                    com.tencent.mm.plugin.setting.ui.setting.ae.f160820i = "HearingModelSelector_PS_SNR_L4_AUD" + aeVar.b(com.tencent.mm.plugin.setting.ui.setting.ae.f160817f, aeVar.a("DJ", 4, false)) + ".wav";
                    java.lang.Integer b182 = aeVar.b(com.tencent.mm.plugin.setting.ui.setting.ae.f160823l, aeVar.a("DJ", 4, false));
                    com.tencent.mm.plugin.setting.ui.setting.ae.f160826o = "HearingModelSelector_PS_SNR_L4_AUD" + b182 + ".wav";
                    com.tencent.mm.plugin.setting.ui.setting.ae.f160829r = "HearingModelSelector_PX_SNR_L4_AUD" + b182 + ".wav";
                    java.io.File file32 = (java.io.File) arrayList3.get(dVar22.d(arrayList3.size()));
                    java.lang.String name82 = file32.getName();
                    kotlin.jvm.internal.o.f(name82, "getName(...)");
                    com.tencent.mm.plugin.setting.ui.setting.ae.f160818g = name82;
                    arrayList3.remove(file32);
                    java.lang.String name92 = ((java.io.File) arrayList3.get(dVar22.d(arrayList3.size()))).getName();
                    kotlin.jvm.internal.o.f(name92, "getName(...)");
                    com.tencent.mm.plugin.setting.ui.setting.ae.f160824m = name92;
                    com.tencent.mm.plugin.setting.ui.setting.ae.f160821j = "HearingModelSelector_PS_SNR_NA_AUD" + aeVar.b(com.tencent.mm.plugin.setting.ui.setting.ae.f160818g, aeVar.a("DJ", 0, true)) + ".wav";
                    java.lang.Integer b192 = aeVar.b(com.tencent.mm.plugin.setting.ui.setting.ae.f160824m, aeVar.a("DJ", 0, true));
                    com.tencent.mm.plugin.setting.ui.setting.ae.f160827p = "HearingModelSelector_PS_SNR_NA_AUD" + b192 + ".wav";
                    com.tencent.mm.plugin.setting.ui.setting.ae.f160830s = "HearingModelSelector_PX_SNR_NA_AUD" + b192 + ".wav";
                    com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidResourceManager", "setDifferentHearingAidModelMap: test1DjL2 is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160816e + ", test1PsL2 is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160819h + ", test1DjL4 is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160817f + ", test1PsL4 is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160820i + ", test1DjNA is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160818g + ", test1PsNA is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160821j);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidResourceManager", "setDifferentHearingAidModelMap: test2DjL2 is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160822k + ", test2PsL2 is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160825n + ", test2DjL4 is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160823l + ", test2PsL4 is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160826o + ", test2DjNA is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160824m + ", test2PsNA is " + com.tencent.mm.plugin.setting.ui.setting.ae.f160827p);
                    java.lang.StringBuilder sb62 = new java.lang.StringBuilder("setDifferentHearingAidModelMap: test2PxL2 is ");
                    sb62.append(com.tencent.mm.plugin.setting.ui.setting.ae.f160828q);
                    sb62.append(", test2PxL4 is ");
                    sb62.append(com.tencent.mm.plugin.setting.ui.setting.ae.f160829r);
                    sb62.append(", test2PxNA is ");
                    sb62.append(com.tencent.mm.plugin.setting.ui.setting.ae.f160830s);
                    com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidResourceManager", sb62.toString());
                    android.content.Intent intent22 = new android.content.Intent();
                    intent22.setClass(this, com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI.class);
                    V6("noise_detect_end", 1);
                    V6("download_materials", 1);
                    intent22.putExtra("audio_auto_play", this.f160442i);
                    intent22.putExtra("audio_test_type", 2);
                    startActivityForResult(intent22);
                }
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.SettingsHearingAidResourceManager", "setDifferentHearingAidModelMap: files is empty");
        android.content.Intent intent222 = new android.content.Intent();
        intent222.setClass(this, com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestUI.class);
        V6("noise_detect_end", 1);
        V6("download_materials", 1);
        intent222.putExtra("audio_auto_play", this.f160442i);
        intent222.putExtra("audio_test_type", 2);
        startActivityForResult(intent222);
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x001d, code lost:
    
        if (r2.isTouchExplorationEnabled() == true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void Y6(boolean r22) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI.Y6(boolean):void");
    }

    public final void Z6() {
        this.f160452v.l();
        if (this.f160447q) {
            return;
        }
        ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Bi(this.f160451u);
        this.f160447q = true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.enp;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidTestEnvironmentUI", "audioDetect onActivityResult: " + i17 + ", " + i18);
        if (intent != null ? intent.getBooleanExtra("audio_test_abandon", false) : false) {
            setResult(0, intent);
            finish();
        }
        if (intent != null ? intent.getBooleanExtra("audio_reoptimize", false) : false) {
            setResult(0, intent);
            finish();
        }
        if (i18 == -1) {
            setResult(i18);
            finish();
        } else {
            if (i18 != 0) {
                return;
            }
            setResult(i18);
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.he(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.odf);
        if (textView != null) {
            com.tencent.mm.ui.bk.s0(textView.getPaint());
        }
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.cut);
        if (textView2 != null) {
            com.tencent.mm.ui.bk.s0(textView2.getPaint());
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.odf);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f160439f = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.ngc);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        com.tencent.mm.ui.widget.button.WeButton weButton = (com.tencent.mm.ui.widget.button.WeButton) findViewById2;
        this.f160437d = weButton;
        weButton.setVisibility(4);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.v_o);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f160438e = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.cut);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f160441h = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.k_m);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f160440g = (com.tencent.mm.transvoice.ui.SoundWaveView) findViewById5;
        getIntent().getIntExtra("audio_test_type", 1);
        this.f160442i = getIntent().getBooleanExtra("audio_auto_play", true);
        com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView = this.f160440g;
        if (soundWaveView == null) {
            kotlin.jvm.internal.o.o("newVoice2txtTxtReactWave");
            throw null;
        }
        soundWaveView.setWaveColor(getContext().getResources().getColor(com.tencent.mm.R.color.f478520a84));
        com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView2 = this.f160440g;
        if (soundWaveView2 == null) {
            kotlin.jvm.internal.o.o("newVoice2txtTxtReactWave");
            throw null;
        }
        soundWaveView2.f196445y = true;
        float[] fArr = ca5.j.f40095a;
        soundWaveView2.f196436p = com.tencent.mm.ui.zk.a(soundWaveView2.getContext(), 5);
        soundWaveView2.f196437q = com.tencent.mm.ui.zk.a(soundWaveView2.getContext(), 3);
        soundWaveView2.f196440t = com.tencent.mm.ui.zk.a(soundWaveView2.getContext(), 70);
        soundWaveView2.f196442v = com.tencent.mm.ui.zk.a(soundWaveView2.getContext(), 37);
        soundWaveView2.f196438r = com.tencent.mm.ui.zk.a(soundWaveView2.getContext(), 2);
        soundWaveView2.f196446z = 197;
        soundWaveView2.f196443w = com.tencent.mm.ui.zk.a(soundWaveView2.getContext(), soundWaveView2.f196446z);
        soundWaveView2.f196444x = com.tencent.mm.ui.zk.a(soundWaveView2.getContext(), 70);
        com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView3 = this.f160440g;
        if (soundWaveView3 == null) {
            kotlin.jvm.internal.o.o("newVoice2txtTxtReactWave");
            throw null;
        }
        soundWaveView3.setVolumeChange(0.005d);
        com.tencent.mm.ui.widget.button.WeButton weButton2 = this.f160437d;
        if (weButton2 == null) {
            kotlin.jvm.internal.o.o("mBtnStart");
            throw null;
        }
        weButton2.post(new com.tencent.mm.plugin.setting.ui.setting.ie(this));
        k14.t.f303377a.e();
        Y6(true);
        android.view.View view = this.f160438e;
        if (view == null) {
            kotlin.jvm.internal.o.o("mBtnStartView");
            throw null;
        }
        view.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.je(this));
        com.tencent.mm.ui.widget.button.WeButton weButton3 = this.f160437d;
        if (weButton3 == null) {
            kotlin.jvm.internal.o.o("mBtnStart");
            throw null;
        }
        weButton3.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.ke(this));
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (i65.a.D(context)) {
            android.widget.TextView textView3 = this.f160441h;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("descTv");
                throw null;
            }
            textView3.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.anm) / i65.a.m(getContext()));
        }
        W6();
        this.f160449s = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI$onCreate$7
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context2, android.content.Intent intent) {
                boolean booleanExtra = intent != null ? intent.getBooleanExtra("isGetFocus", false) : false;
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI settingsHearingAidTestEnvironmentUI = com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI.this;
                settingsHearingAidTestEnvironmentUI.f160443m = booleanExtra;
                com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidTestEnvironmentUI", "receive AudioFocus Change,current state is " + settingsHearingAidTestEnvironmentUI.f160443m);
                if (settingsHearingAidTestEnvironmentUI.f160443m) {
                    if (settingsHearingAidTestEnvironmentUI.f160444n) {
                        settingsHearingAidTestEnvironmentUI.onRestart();
                        return;
                    }
                    return;
                }
                settingsHearingAidTestEnvironmentUI.Z6();
                com.tencent.mm.transvoice.ui.SoundWaveView soundWaveView4 = settingsHearingAidTestEnvironmentUI.f160440g;
                if (soundWaveView4 == null) {
                    kotlin.jvm.internal.o.o("newVoice2txtTxtReactWave");
                    throw null;
                }
                soundWaveView4.i(0);
                settingsHearingAidTestEnvironmentUI.Y6(true);
            }
        };
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("hearing_aid_message");
        b4.d a17 = b4.d.a(this);
        android.content.BroadcastReceiver broadcastReceiver = this.f160449s;
        if (broadcastReceiver != null) {
            a17.b(broadcastReceiver, intentFilter);
        } else {
            kotlin.jvm.internal.o.o("receiver");
            throw null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        Z6();
        b4.d a17 = b4.d.a(this);
        android.content.BroadcastReceiver broadcastReceiver = this.f160449s;
        if (broadcastReceiver == null) {
            kotlin.jvm.internal.o.o("receiver");
            throw null;
        }
        a17.d(broadcastReceiver);
        this.f160455y.removeCallbacksAndMessages(null);
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidTestEnvironmentUI", "audioDetect destroy");
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i17, android.view.KeyEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        if (i17 == 4) {
            V6("noise_detect_end", 21);
        }
        return super.onKeyDown(i17, event);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        Z6();
        this.f160444n = false;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidTestEnvironmentUI", "audioDetectRestart onResume");
        ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_noise_detect_page_in");
        this.f160444n = true;
        if (!this.f160443m || !this.f160447q) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidTestEnvironmentUI", "audioDetectRestart ignore");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidTestEnvironmentUI", "audioDetectRestart");
        this.f160453w = java.lang.System.currentTimeMillis();
        this.f160454x = -1L;
        this.f160446p = false;
        this.f160451u = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).wi();
        this.f160447q = false;
        this.f160452v = new tl.w(16000, 1, 10);
        W6();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(com.tencent.mm.plugin.setting.ui.setting.p8.class);
    }
}
