package com.tencent.mm.plugin.setting.ui.setting;

@db5.a(1)
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/setting/ui/setting/SettingsHearingAidFinishUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-setting_release"}, k = 1, mv = {1, 9, 0})
@ul5.d(0)
/* loaded from: classes5.dex */
public final class SettingsHearingAidFinishUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: d, reason: collision with root package name */
    public wd0.g1 f160414d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView f160415e;

    /* renamed from: f, reason: collision with root package name */
    public android.content.BroadcastReceiver f160416f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f160417g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.widget.button.WeButton f160418h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f160419i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f160420m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f160421n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f160422o = true;

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.enn;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        setResult(i18, intent);
        finish();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        this.f160420m = getIntent().getBooleanExtra("process_is_from_init", false);
        this.f160421n = getIntent().getBooleanExtra("audio_auto_play", true);
        setMMTitle("");
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.Brand_BG_110));
        setNavigationbarColor(getResources().getColor(com.tencent.mm.R.color.Brand_BG_110));
        hideActionbarLine();
        if (this.f160420m) {
            setBackBtnVisible(true);
            setBackBtn(new com.tencent.mm.plugin.setting.ui.setting.nc(this), com.tencent.mm.R.raw.actionbar_icon_dark_back);
        } else {
            setBackBtnVisible(false);
        }
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.sfr);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f160419i = (android.widget.TextView) findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.uqy);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f160417g = (com.tencent.mm.ui.widget.button.WeButton) findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.uki);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f160418h = (com.tencent.mm.ui.widget.button.WeButton) findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.sfn);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f160415e = (com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView) findViewById4;
        if (this.f160420m) {
            java.lang.String stringExtra = getIntent().getStringExtra("audio_mode");
            if (stringExtra == null) {
                stringExtra = com.tencent.mm.plugin.setting.ui.setting.xd.f161745r.f161755e.name();
            }
            kotlin.jvm.internal.o.d(stringExtra);
            this.f160414d = wd0.g1.valueOf(stringExtra);
            getIntent().getStringExtra("audio_mode");
            android.widget.TextView textView = this.f160419i;
            if (textView == null) {
                kotlin.jvm.internal.o.o("titleTv");
                throw null;
            }
            textView.setText(getString(com.tencent.mm.R.string.o5i));
            com.tencent.mm.ui.widget.button.WeButton weButton = this.f160417g;
            if (weButton == null) {
                kotlin.jvm.internal.o.o("finishBtn");
                throw null;
            }
            weButton.setContentDescription(getString(com.tencent.mm.R.string.o5h));
            com.tencent.mm.ui.widget.button.WeButton weButton2 = this.f160418h;
            if (weButton2 == null) {
                kotlin.jvm.internal.o.o("retestBtn");
                throw null;
            }
            weButton2.setContentDescription(getString(com.tencent.mm.R.string.f492276o60));
        } else {
            java.lang.String stringExtra2 = getIntent().getStringExtra("audio_mode_name");
            if (stringExtra2 == null) {
                stringExtra2 = "TEST2_NONE";
            }
            com.tencent.mm.plugin.setting.ui.setting.xd valueOf = com.tencent.mm.plugin.setting.ui.setting.xd.valueOf(stringExtra2);
            java.util.Objects.toString(valueOf.f161755e);
            this.f160414d = valueOf.f161755e;
            ((u14.w) ((wd0.a2) i95.n0.c(wd0.a2.class))).getClass();
        }
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView = this.f160415e;
        if (settingsHearingAidAudioCardView == null) {
            kotlin.jvm.internal.o.o("audioCardView");
            throw null;
        }
        if (this.f160420m) {
            java.lang.String string = getString(com.tencent.mm.R.string.p0q);
            kotlin.jvm.internal.o.f(string, "getString(...)");
            settingsHearingAidAudioCardView.setName(string);
            wd0.g1 g1Var = this.f160414d;
            if (g1Var == null) {
                kotlin.jvm.internal.o.o("finalMode");
                throw null;
            }
            settingsHearingAidAudioCardView.setSource(wd0.h1.valueOf(g1Var.name()).f444725d);
        } else {
            java.lang.String string2 = getString(com.tencent.mm.R.string.o5f);
            kotlin.jvm.internal.o.f(string2, "getString(...)");
            settingsHearingAidAudioCardView.setName(string2);
            wd0.g1 g1Var2 = this.f160414d;
            if (g1Var2 == null) {
                kotlin.jvm.internal.o.o("finalMode");
                throw null;
            }
            settingsHearingAidAudioCardView.setSource(g1Var2.f444720d);
        }
        if (com.tencent.mm.ui.bk.C()) {
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView2 = this.f160415e;
            if (settingsHearingAidAudioCardView2 == null) {
                kotlin.jvm.internal.o.o("audioCardView");
                throw null;
            }
            androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) settingsHearingAidAudioCardView2.findViewById(com.tencent.mm.R.id.sfl);
            constraintLayout.setBackgroundResource(com.tencent.mm.R.drawable.cs6);
            ((android.widget.TextView) constraintLayout.findViewById(com.tencent.mm.R.id.a76)).setTextColor(android.graphics.Color.parseColor("#8C000000"));
        }
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView3 = this.f160415e;
        if (settingsHearingAidAudioCardView3 == null) {
            kotlin.jvm.internal.o.o("audioCardView");
            throw null;
        }
        settingsHearingAidAudioCardView3.setClickable(true);
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView4 = this.f160415e;
        if (settingsHearingAidAudioCardView4 == null) {
            kotlin.jvm.internal.o.o("audioCardView");
            throw null;
        }
        settingsHearingAidAudioCardView4.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.oc(this));
        com.tencent.mm.ui.widget.button.WeButton weButton3 = this.f160417g;
        if (weButton3 == null) {
            kotlin.jvm.internal.o.o("finishBtn");
            throw null;
        }
        weButton3.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.pc(this));
        com.tencent.mm.ui.widget.button.WeButton weButton4 = this.f160418h;
        if (weButton4 == null) {
            kotlin.jvm.internal.o.o("retestBtn");
            throw null;
        }
        weButton4.setOnClickListener(new com.tencent.mm.plugin.setting.ui.setting.qc(this));
        android.widget.TextView textView2 = this.f160419i;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("titleTv");
            throw null;
        }
        com.tencent.mm.ui.bk.s0(textView2.getPaint());
        android.widget.TextView textView3 = this.f160419i;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("titleTv");
            throw null;
        }
        textView3.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.anm) * i65.a.m(getContext()));
        com.tencent.mm.ui.widget.button.WeButton weButton5 = this.f160417g;
        if (weButton5 == null) {
            kotlin.jvm.internal.o.o("finishBtn");
            throw null;
        }
        weButton5.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479575r) * i65.a.m(getContext()));
        com.tencent.mm.ui.widget.button.WeButton weButton6 = this.f160418h;
        if (weButton6 == null) {
            kotlin.jvm.internal.o.o("retestBtn");
            throw null;
        }
        weButton6.setTextSize(0, i65.a.f(getContext(), com.tencent.mm.R.dimen.f479575r) * i65.a.m(getContext()));
        if (((android.media.AudioManager) ((jz5.n) ((u14.w) ((wd0.a2) i95.n0.c(wd0.a2.class))).f423797d).getValue()).getStreamVolume(3) == 0) {
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.setting.ui.setting.rc(this));
        } else {
            com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView5 = this.f160415e;
            if (settingsHearingAidAudioCardView5 == null) {
                kotlin.jvm.internal.o.o("audioCardView");
                throw null;
            }
            settingsHearingAidAudioCardView5.a(false);
        }
        if (this.f160420m) {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_result_confirm_reuse_page_in");
            return;
        }
        wd0.g1 g1Var3 = this.f160414d;
        if (g1Var3 == null) {
            kotlin.jvm.internal.o.o("finalMode");
            throw null;
        }
        if (g1Var3 == wd0.g1.f444714f) {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_result_confirm_normal_page_in");
        } else {
            ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ai("vocal_result_confirm_mode_page_in");
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        b4.d a17 = b4.d.a(this);
        android.content.BroadcastReceiver broadcastReceiver = this.f160416f;
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
        if (i17 == 4) {
            return false;
        }
        return super.onKeyDown(i17, event);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
        com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView = this.f160415e;
        if (settingsHearingAidAudioCardView == null) {
            kotlin.jvm.internal.o.o("audioCardView");
            throw null;
        }
        int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView.f160392v;
        settingsHearingAidAudioCardView.b(false);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f160416f = new android.content.BroadcastReceiver() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI$onResume$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(android.content.Context context, android.content.Intent intent) {
                boolean booleanExtra = intent != null ? intent.getBooleanExtra("isGetFocus", false) : false;
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI settingsHearingAidFinishUI = com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidFinishUI.this;
                settingsHearingAidFinishUI.f160422o = booleanExtra;
                if (settingsHearingAidFinishUI.f160422o) {
                    return;
                }
                com.tencent.mm.plugin.setting.ui.setting.SettingsHearingAidAudioCardView settingsHearingAidAudioCardView = settingsHearingAidFinishUI.f160415e;
                if (settingsHearingAidAudioCardView == null) {
                    kotlin.jvm.internal.o.o("audioCardView");
                    throw null;
                }
                if (settingsHearingAidAudioCardView.isPlaying) {
                    if (settingsHearingAidAudioCardView != null) {
                        settingsHearingAidAudioCardView.b(true);
                    } else {
                        kotlin.jvm.internal.o.o("audioCardView");
                        throw null;
                    }
                }
            }
        };
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("hearing_aid_message");
        b4.d a17 = b4.d.a(this);
        android.content.BroadcastReceiver broadcastReceiver = this.f160416f;
        if (broadcastReceiver != null) {
            a17.b(broadcastReceiver, intentFilter);
        } else {
            kotlin.jvm.internal.o.o("receiver");
            throw null;
        }
    }
}
