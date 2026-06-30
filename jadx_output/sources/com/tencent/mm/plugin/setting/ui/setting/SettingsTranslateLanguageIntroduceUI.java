package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes5.dex */
public class SettingsTranslateLanguageIntroduceUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: i, reason: collision with root package name */
    public static final /* synthetic */ int f160705i = 0;

    /* renamed from: d, reason: collision with root package name */
    public androidx.constraintlayout.widget.ConstraintLayout f160706d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.WeSwitch f160707e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f160708f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f160709g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.sdk.event.IListener f160710h = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent>(com.tencent.mm.app.a0.f53288d) { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI.1
        {
            this.__eventId = -348375692;
        }

        @Override // com.tencent.mm.sdk.event.IListener
        public boolean callback(com.tencent.mm.autogen.events.ChangeTranslateLanguageEvent changeTranslateLanguageEvent) {
            am.z1 z1Var = changeTranslateLanguageEvent.f54035g;
            if (z1Var == null) {
                return false;
            }
            java.lang.String str = z1Var.f8504c;
            int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI.f160705i;
            com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI.this.T6(str);
            return false;
        }
    };

    public final void T6(java.lang.String str) {
        if (this.f160709g == null) {
            return;
        }
        if (str == null) {
            str = com.tencent.mm.sdk.platformtools.m2.d();
        }
        java.lang.String string = getString(com.tencent.mm.R.string.f490579bs1);
        java.lang.String b17 = com.tencent.mm.sdk.platformtools.m2.b(this, str, com.tencent.mm.R.array.f478007v, string);
        if (b17 != null) {
            string = b17;
        }
        this.f160709g.setText(string);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.djl;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        setMMTitle("");
        setActionbarColor(getColor(com.tencent.mm.R.color.f478491c));
        setNavigationbarColor(getColor(com.tencent.mm.R.color.f478491c));
        setBackBtn(new android.view.MenuItem.OnMenuItemClickListener() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI$$a
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI.f160705i;
                com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI settingsTranslateLanguageIntroduceUI = com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI.this;
                settingsTranslateLanguageIntroduceUI.hideVKB();
                settingsTranslateLanguageIntroduceUI.finish();
                return true;
            }
        });
        androidx.constraintlayout.widget.ConstraintLayout constraintLayout = (androidx.constraintlayout.widget.ConstraintLayout) findViewById(com.tencent.mm.R.id.qho);
        if (constraintLayout != null) {
            constraintLayout.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI$$b
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    int i17 = com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI.f160705i;
                    com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI settingsTranslateLanguageIntroduceUI = com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI.this;
                    settingsTranslateLanguageIntroduceUI.getClass();
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(view);
                    java.lang.Object[] array = arrayList.toArray();
                    arrayList.clear();
                    yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsTranslateLanguageIntroduceUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", settingsTranslateLanguageIntroduceUI, array);
                    com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest settingsTranslateLanguageRequest = new com.tencent.mm.feature.setting.api.SettingsTranslateLanguageRequest();
                    settingsTranslateLanguageRequest.f67821d = wd0.k2.SETTINGS_TRANSLATE_LANGUAGE;
                    settingsTranslateLanguageRequest.f67824g = 1;
                    ((vd0.o3) ((wd0.z1) i95.n0.c(wd0.z1.class))).fj(settingsTranslateLanguageIntroduceUI, settingsTranslateLanguageRequest);
                    yj0.a.h(settingsTranslateLanguageIntroduceUI, "com/tencent/mm/plugin/setting/ui/setting/SettingsTranslateLanguageIntroduceUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
                }
            });
        }
        this.f160706d = (androidx.constraintlayout.widget.ConstraintLayout) findViewById(com.tencent.mm.R.id.ssb);
        this.f160708f = findViewById(com.tencent.mm.R.id.u2m);
        this.f160707e = (com.tencent.mm.ui.widget.WeSwitch) findViewById(com.tencent.mm.R.id.vbc);
        boolean booleanExtra = getIntent().getBooleanExtra("highlight_auto_translation", false);
        ((go.s) ((n13.w) i95.n0.c(n13.w.class))).getClass();
        boolean i17 = go.d.f273696a.e().i("enable_globally", false);
        if (booleanExtra) {
            android.view.View view = this.f160708f;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsTranslateLanguageIntroduceUI", "initAutoTranslationSwitch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/setting/ui/setting/SettingsTranslateLanguageIntroduceUI", "initAutoTranslationSwitch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.view.View view2 = this.f160708f;
            kotlin.jvm.internal.o.g(view2, "view");
            sa5.d.c(view2, 0.0f, 750L, new com.tencent.mm.plugin.setting.ui.setting.in(view2), 1, null);
        } else {
            android.view.View view3 = this.f160708f;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/setting/ui/setting/SettingsTranslateLanguageIntroduceUI", "initAutoTranslationSwitch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view3.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view3, "com/tencent/mm/plugin/setting/ui/setting/SettingsTranslateLanguageIntroduceUI", "initAutoTranslationSwitch", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f160707e.setCheck(i17);
        this.f160707e.setSwitchListener(new com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI$$c());
        this.f160706d.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI$$d
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view4) {
                int i18 = com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI.f160705i;
                com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI settingsTranslateLanguageIntroduceUI = com.tencent.mm.plugin.setting.ui.setting.SettingsTranslateLanguageIntroduceUI.this;
                settingsTranslateLanguageIntroduceUI.getClass();
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(view4);
                java.lang.Object[] array = arrayList3.toArray();
                arrayList3.clear();
                yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsTranslateLanguageIntroduceUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", settingsTranslateLanguageIntroduceUI, array);
                settingsTranslateLanguageIntroduceUI.f160707e.performClick();
                yj0.a.h(settingsTranslateLanguageIntroduceUI, "com/tencent/mm/plugin/setting/ui/setting/SettingsTranslateLanguageIntroduceUI", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            }
        });
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(com.tencent.mm.R.id.ql9);
        if (imageView != null) {
            imageView.setColorFilter(getColor(com.tencent.mm.R.color.f478520a84), android.graphics.PorterDuff.Mode.SRC_IN);
        }
        this.f160709g = (android.widget.TextView) findViewById(com.tencent.mm.R.id.qqu);
        T6(com.tencent.mm.sdk.platformtools.m2.c(this));
        this.f160710h.alive();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f160710h.dead();
        boolean booleanExtra = getIntent().getBooleanExtra("highlight_auto_translation", false);
        java.lang.String talker = getIntent().getStringExtra("from_talker");
        if (booleanExtra && this.f160707e.f211515x && !com.tencent.mm.sdk.platformtools.t8.K0(talker)) {
            ((go.s) ((n13.w) i95.n0.c(n13.w.class))).getClass();
            kotlin.jvm.internal.o.g(talker, "talker");
            go.d dVar = go.d.f273696a;
            if (dVar.e().i("enable_globally_sys_tip", false)) {
                return;
            }
            dVar.e().G("enable_globally_sys_tip", true);
            com.tencent.mars.xlog.Log.i("MicroMsg.AutoTranslationSysTipHelper", "insertSysTip talkerMap:".concat(talker));
            pm0.v.K(null, new go.e(new com.tencent.mm.storage.f9(), talker));
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(n14.p.class);
    }
}
