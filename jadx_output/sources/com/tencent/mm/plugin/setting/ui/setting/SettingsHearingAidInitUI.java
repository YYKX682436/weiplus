package com.tencent.mm.plugin.setting.ui.setting;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(1)
/* loaded from: classes5.dex */
public final class SettingsHearingAidInitUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ int f160424r = 0;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f160425d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f160426e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.TextView f160427f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f160428g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f160429h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.Button f160430i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.Button f160431m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f160432n;

    /* renamed from: o, reason: collision with root package name */
    public f25.m0 f160433o;

    /* renamed from: p, reason: collision with root package name */
    public final com.tencent.mm.plugin.setting.ui.setting.vc f160434p = new com.tencent.mm.plugin.setting.ui.setting.vc(this);

    /* renamed from: q, reason: collision with root package name */
    public final boolean f160435q = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_SETTING_CARE_MODE_HEARING_AID_AUTO_PLAY_SWITCH_BOOLEAN, true);

    public static final void T6(com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidInitUI settingsHearingAidInitUI) {
        wd0.g1 g1Var;
        settingsHearingAidInitUI.getClass();
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        com.tencent.mm.plugin.setting.ui.setting.ce ceVar = com.tencent.mm.plugin.setting.ui.setting.ce.f160909a;
        ((cy1.a) rVar).Hj("vocals_start_detection", "view_clk", kz5.b1.e(new jz5.l("care_session_id", ceVar.a())), 35684);
        wd0.g1 Ui = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ui();
        wd0.g1 Vi = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Vi();
        wd0.g1 Zi = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Zi();
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidInitUI", "current select mode is " + Ui + ", " + Vi + ", " + Zi);
        if (settingsHearingAidInitUI.f160432n || (Vi == (g1Var = wd0.g1.f444713e) && Zi == g1Var)) {
            ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("enter_detection_process", kz5.c1.k(new jz5.l("enter_method_detection", 1), new jz5.l("care_session_id", ceVar.a())), 35684);
            android.content.Intent intent = new android.content.Intent();
            intent.setClass(settingsHearingAidInitUI, com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidTestEnvironmentUI.class);
            intent.putExtra("audio_test_type", 1);
            intent.putExtra("audio_auto_play", settingsHearingAidInitUI.f160435q);
            settingsHearingAidInitUI.startActivityForResult(intent);
            return;
        }
        if (k14.t.f303377a.b()) {
            settingsHearingAidInitUI.V6(Vi, Zi);
            return;
        }
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("download_materials", kz5.c1.k(new jz5.l("aid_process_result", 2), new jz5.l("care_session_id", ceVar.a())), 35684);
        androidx.appcompat.app.AppCompatActivity context = settingsHearingAidInitUI.getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = settingsHearingAidInitUI.getString(com.tencent.mm.R.string.o5q);
        e4Var.f211780g = 2;
        new android.os.Handler(android.os.Looper.getMainLooper()).postDelayed(new com.tencent.mm.plugin.setting.ui.setting.uc(e4Var.c(), settingsHearingAidInitUI, Vi, Zi), com.tencent.tav.decoder.EncoderWriter.HANDLE_FRAME_OPERATE_TIMEOUT);
    }

    public final void U6() {
        wd0.g1 Ui = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ui();
        android.widget.Button button = this.f160430i;
        if (button == null) {
            kotlin.jvm.internal.o.o("startBtn");
            throw null;
        }
        button.setText(getString(com.tencent.mm.R.string.o5t));
        if (Ui != wd0.g1.f444713e) {
            X6(false);
            android.widget.Button button2 = this.f160430i;
            if (button2 == null) {
                kotlin.jvm.internal.o.o("startBtn");
                throw null;
            }
            button2.setVisibility(8);
            android.widget.Button button3 = this.f160431m;
            if (button3 == null) {
                kotlin.jvm.internal.o.o("cancelBtn");
                throw null;
            }
            button3.setVisibility(0);
            android.widget.TextView textView = this.f160425d;
            if (textView != null) {
                textView.setText(getString(com.tencent.mm.R.string.p0y));
                return;
            } else {
                kotlin.jvm.internal.o.o("titleTV");
                throw null;
            }
        }
        X6(true);
        android.widget.TextView textView2 = this.f160425d;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("titleTV");
            throw null;
        }
        textView2.setText(getString(com.tencent.mm.R.string.f493778p13));
        android.widget.Button button4 = this.f160430i;
        if (button4 == null) {
            kotlin.jvm.internal.o.o("startBtn");
            throw null;
        }
        button4.setVisibility(0);
        android.widget.Button button5 = this.f160431m;
        if (button5 != null) {
            button5.setVisibility(8);
        } else {
            kotlin.jvm.internal.o.o("cancelBtn");
            throw null;
        }
    }

    public final void V6(wd0.g1 g1Var, wd0.g1 g1Var2) {
        android.content.Intent intent = new android.content.Intent();
        intent.setClass(this, com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI.class);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("current select mode is ");
        wd0.g1 g1Var3 = wd0.g1.f444713e;
        sb6.append(g1Var != g1Var3 ? g1Var.name() : g1Var2.name());
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidInitUI", sb6.toString());
        intent.putExtra("audio_mode", g1Var != g1Var3 ? g1Var.name() : g1Var2.name());
        intent.putExtra("process_is_from_init", true);
        startActivityForResult(intent);
    }

    public final void W6(boolean z17, int i17) {
        if (z17) {
            android.widget.LinearLayout linearLayout = this.f160429h;
            if (linearLayout == null) {
                kotlin.jvm.internal.o.o("BtnContainer");
                throw null;
            }
            linearLayout.setVisibility(0);
        }
        if (i17 == -1) {
            setResult(-1);
            finish();
        } else {
            if (i17 != 0) {
                return;
            }
            android.widget.LinearLayout linearLayout2 = this.f160429h;
            if (linearLayout2 != null) {
                linearLayout2.setVisibility(0);
            } else {
                kotlin.jvm.internal.o.o("BtnContainer");
                throw null;
            }
        }
    }

    public final void X6(boolean z17) {
        if (z17) {
            android.widget.TextView textView = this.f160426e;
            if (textView == null) {
                kotlin.jvm.internal.o.o("descTV");
                throw null;
            }
            textView.setVisibility(8);
            android.widget.TextView textView2 = this.f160427f;
            if (textView2 == null) {
                kotlin.jvm.internal.o.o("descTV_1");
                throw null;
            }
            textView2.setVisibility(0);
            android.widget.TextView textView3 = this.f160428g;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("descTV_2");
                throw null;
            }
            textView3.setVisibility(0);
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.t39);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI", "updateDesc", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI", "updateDesc", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.t3_);
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI", "updateDesc", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI", "updateDesc", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.widget.TextView textView4 = this.f160426e;
        if (textView4 == null) {
            kotlin.jvm.internal.o.o("descTV");
            throw null;
        }
        textView4.setVisibility(0);
        android.widget.TextView textView5 = this.f160427f;
        if (textView5 == null) {
            kotlin.jvm.internal.o.o("descTV_1");
            throw null;
        }
        textView5.setVisibility(8);
        android.widget.TextView textView6 = this.f160428g;
        if (textView6 == null) {
            kotlin.jvm.internal.o.o("descTV_2");
            throw null;
        }
        textView6.setVisibility(8);
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.t39);
        if (findViewById3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(8);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI", "updateDesc", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI", "updateDesc", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.t3_);
        if (findViewById4 == null) {
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList4.add(8);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI", "updateDesc", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidInitUI", "updateDesc", "(Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.eno;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        this.f160432n = intent != null ? intent.getBooleanExtra("audio_is_reoptimize", false) : false;
        W6(intent != null ? intent.getBooleanExtra("audio_test_abandon", false) : false, i18);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        java.lang.String str;
        super.onCreate(bundle);
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.wc(this));
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.odf);
        if (textView != null) {
            com.tencent.mm.ui.bk.s0(textView.getPaint());
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.h6y);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.odf);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f160425d = (android.widget.TextView) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.cut);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById3;
        this.f160426e = textView2;
        textView2.setVisibility(8);
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.t3d);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f160427f = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.t3e);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f160428g = (android.widget.TextView) findViewById5;
        androidx.appcompat.app.AppCompatActivity context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (i65.a.D(context)) {
            android.widget.TextView textView3 = this.f160427f;
            if (textView3 == null) {
                kotlin.jvm.internal.o.o("descTV_1");
                throw null;
            }
            textView3.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479575r) * i65.a.m(getContext()));
            android.widget.TextView textView4 = this.f160428g;
            if (textView4 == null) {
                kotlin.jvm.internal.o.o("descTV_2");
                throw null;
            }
            textView4.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479575r) * i65.a.m(getContext()));
            android.widget.TextView textView5 = this.f160426e;
            if (textView5 == null) {
                kotlin.jvm.internal.o.o("descTV");
                throw null;
            }
            textView5.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479575r) * i65.a.m(getContext()));
            android.widget.TextView textView6 = this.f160425d;
            if (textView6 == null) {
                kotlin.jvm.internal.o.o("titleTV");
                throw null;
            }
            textView6.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479856h5) / i65.a.m(getContext()));
            android.widget.TextView textView7 = this.f160425d;
            if (textView7 == null) {
                kotlin.jvm.internal.o.o("titleTV");
                throw null;
            }
            com.tencent.mm.ui.kk.f(textView7, (int) (i65.a.f(getContext(), com.tencent.mm.R.dimen.f479738dv) * i65.a.m(getContext())));
            android.widget.TextView textView8 = this.f160425d;
            if (textView8 == null) {
                kotlin.jvm.internal.o.o("titleTV");
                throw null;
            }
            com.tencent.mm.ui.kk.b(textView8);
            android.widget.TextView textView9 = this.f160426e;
            if (textView9 == null) {
                kotlin.jvm.internal.o.o("descTV");
                throw null;
            }
            com.tencent.mm.ui.kk.f(textView9, (int) (i65.a.f(getContext(), com.tencent.mm.R.dimen.f479644bj) * i65.a.m(getContext())));
            android.widget.TextView textView10 = this.f160426e;
            if (textView10 == null) {
                kotlin.jvm.internal.o.o("descTV");
                throw null;
            }
            com.tencent.mm.ui.kk.b(textView10);
        }
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.b09);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f160429h = (android.widget.LinearLayout) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.ngc);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f160430i = (android.widget.Button) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.b5i);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f160431m = (android.widget.Button) findViewById8;
        U6();
        android.widget.Button button = this.f160430i;
        if (button == null) {
            kotlin.jvm.internal.o.o("startBtn");
            throw null;
        }
        button.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.yc(this));
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsHearingAidInitUI", "current select mode is " + ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ui() + ", " + ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Vi() + ", " + ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Zi());
        android.widget.Button button2 = this.f160431m;
        if (button2 == null) {
            kotlin.jvm.internal.o.o("cancelBtn");
            throw null;
        }
        button2.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.ad(this));
        k14.t tVar = k14.t.f303377a;
        tVar.e();
        tVar.a(v65.m.b(this));
        com.tencent.mm.plugin.setting.ui.setting.ce ceVar = com.tencent.mm.plugin.setting.ui.setting.ce.f160909a;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        long n17 = j62.e.g().n();
        if (n17 == 0) {
            str = "0";
        } else if (n17 > 0) {
            str = java.lang.Long.toString(n17, 10);
        } else {
            char[] cArr = new char[64];
            long j17 = (n17 >>> 1) / 5;
            long j18 = 10;
            int i17 = 63;
            cArr[63] = java.lang.Character.forDigit((int) (n17 - (j17 * j18)), 10);
            while (j17 > 0) {
                i17--;
                cArr[i17] = java.lang.Character.forDigit((int) (j17 % j18), 10);
                j17 /= j18;
            }
            str = new java.lang.String(cArr, i17, 64 - i17);
        }
        sb6.append(str);
        sb6.append('_');
        sb6.append(java.lang.System.currentTimeMillis());
        java.lang.String value = sb6.toString();
        kotlin.jvm.internal.o.g(value, "value");
        com.tencent.mm.plugin.setting.ui.setting.ce.f160911c = value;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        f25.m0 m0Var = this.f160433o;
        if (m0Var != null) {
            ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
        java.util.Objects.toString(intent);
        this.f160432n = intent != null ? intent.getBooleanExtra("audio_is_reoptimize", false) : false;
        W6(intent != null ? intent.getBooleanExtra("audio_test_abandon", false) : false, intent != null ? intent.getIntExtra("result_code", 0) : 0);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        U6();
        if (((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ui() == wd0.g1.f444713e) {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_enhance_off_page_in");
        } else {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_enhance_on_page_in");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(com.tencent.mm.plugin.setting.ui.setting.p8.class);
    }
}
