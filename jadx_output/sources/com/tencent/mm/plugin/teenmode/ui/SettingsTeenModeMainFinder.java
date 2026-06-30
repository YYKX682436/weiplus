package com.tencent.mm.plugin.teenmode.ui;

/* loaded from: classes10.dex */
public class SettingsTeenModeMainFinder extends com.tencent.mm.ui.MMActivity {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f172884g = 0;

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f172885d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.ui.widget.imageview.WeImageView f172886e;

    /* renamed from: f, reason: collision with root package name */
    public int f172887f = 2;

    public static void T6(com.tencent.mm.plugin.teenmode.ui.SettingsTeenModeMainFinder settingsTeenModeMainFinder, int i17) {
        if (settingsTeenModeMainFinder.f172887f == i17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SettingsTeenModeMainFinder", "no update, no need data report");
            return;
        }
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        int i18 = settingsTeenModeMainFinder.f172887f;
        java.lang.String str = "Block";
        java.lang.String str2 = i18 != 0 ? i18 != 1 ? i18 != 2 ? "" : "Block" : "Allow" : "Limited";
        if (i17 == 0) {
            str = "Limited";
        } else if (i17 == 1) {
            str = "Allow";
        } else if (i17 != 2) {
            str = "";
        }
        g0Var.d(20917, 3, 1, 1, "Finder", str2, str, "");
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsTeenModeMainFinder", "data report ");
    }

    public static java.lang.String U6() {
        return com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.jsv);
    }

    public final void V6() {
        int i17;
        android.widget.TextView textView = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o0e);
        android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.o0g);
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.nzv);
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.nzq);
        textView.setContentDescription(U6());
        textView.setText(U6());
        textView2.setContentDescription(getString(com.tencent.mm.R.string.jsy));
        textView2.setText(com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.jsy));
        this.f172885d.setVisibility(8);
        this.f172886e.setVisibility(8);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(findViewById, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        int i18 = this.f172887f;
        if (i18 == 1) {
            this.f172885d.setVisibility(0);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(0);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            androidx.appcompat.app.AppCompatActivity activity = getContext();
            kotlin.jvm.internal.o.g(activity, "activity");
            if (((com.tencent.mm.plugin.teenmode.ui.w2) pf5.z.f353948a.a(activity).a(com.tencent.mm.plugin.teenmode.ui.w2.class)).f173174h.getList(2).isEmpty()) {
                i17 = com.tencent.mm.R.string.f493334js0;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                arrayList3.add(8);
                java.util.Collections.reverse(arrayList3);
                yj0.a.d(findViewById, arrayList3.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            } else {
                java.util.ArrayList arrayList4 = new java.util.ArrayList();
                arrayList4.add(0);
                java.util.Collections.reverse(arrayList4);
                java.lang.Object[] array = arrayList4.toArray();
                i17 = com.tencent.mm.R.string.f493334js0;
                yj0.a.d(findViewById, array, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            textView.setContentDescription(getString(i17) + U6());
        } else if (i18 == 2) {
            this.f172886e.setVisibility(0);
            java.util.ArrayList arrayList5 = new java.util.ArrayList();
            arrayList5.add(8);
            java.util.Collections.reverse(arrayList5);
            yj0.a.d(findViewById, arrayList5.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById.setVisibility(((java.lang.Integer) arrayList5.get(0)).intValue());
            yj0.a.f(findViewById, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            java.util.ArrayList arrayList6 = new java.util.ArrayList();
            arrayList6.add(8);
            java.util.Collections.reverse(arrayList6);
            yj0.a.d(findViewById2, arrayList6.toArray(), "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList6.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/teenmode/ui/SettingsTeenModeMainFinder", "updateStatus", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            textView2.setContentDescription(getString(com.tencent.mm.R.string.f493334js0) + com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getString(com.tencent.mm.R.string.jsy));
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SettingsTeenModeMainFinder", "doSaveConfig: write teenMode range %s", java.lang.Integer.valueOf(this.f172887f));
        gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_SETTING_TEEN_MODE_FINDER_RANGE_INT_SYNC, java.lang.Integer.valueOf(this.f172887f));
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getForceOrientation() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.cm_;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        java.lang.String str = "";
        setMMTitle("");
        hideActionbarLine();
        setActionbarColor(getResources().getColor(com.tencent.mm.R.color.aaw));
        pf5.u uVar = pf5.u.f353936a;
        com.tencent.mm.plugin.teenmode.ui.w2 w2Var = (com.tencent.mm.plugin.teenmode.ui.w2) uVar.c(getContext()).a(com.tencent.mm.plugin.teenmode.ui.w2.class);
        w2Var.getClass();
        r45.kz2 O6 = ((com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM) ((iz2.c) uVar.e(zy2.b6.class).c(iz2.c.class))).O6();
        w2Var.f173174h = O6;
        w2Var.f173171e = O6.getInteger(1);
        int i17 = 0;
        w2Var.f173170d = w2Var.f173174h.getInteger(0);
        w2Var.f173172f = w2Var.f173174h.getLong(3);
        com.tencent.mars.xlog.Log.i("FinderTeenModeContentManageUIC", "initSelectedContent: origin teenagerInfo selectedBirthMon=" + w2Var.f173171e + ", selectedBirthYear=" + w2Var.f173170d + ", selectContentFlag=" + w2Var.f173172f);
        if (w2Var.f173174h.getList(2).size() == 0) {
            com.tencent.mars.xlog.Log.e("FinderTeenModeContentManageUIC", "initSelectedContent: teenagerInfo is null");
        } else {
            w2Var.O6();
            if (((uh4.c0) i95.n0.c(uh4.c0.class)).T2()) {
                android.widget.TextView textView = (android.widget.TextView) w2Var.getActivity().findViewById(com.tencent.mm.R.id.nzn);
                android.app.Activity context = w2Var.getContext();
                kotlin.jvm.internal.o.g(context, "context");
                try {
                    if (android.provider.Settings.Secure.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "minors_mode", 0) == 1) {
                        i17 = android.provider.Settings.Secure.getInt(context.getContentResolver(), "minors_mode_age_range", 0);
                    }
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.TeenModeUtil", "Setting not found: " + e17.getMessage());
                }
                if (i17 == 1) {
                    str = "0~2 岁";
                } else if (i17 == 2) {
                    str = "3~7 岁";
                } else if (i17 == 3) {
                    str = "8~11 岁";
                } else if (i17 == 4) {
                    str = "12~15 岁";
                } else if (i17 == 5) {
                    str = "16~17 岁";
                }
                textView.setText(str);
            }
        }
        this.f172885d = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.o0d);
        this.f172886e = (com.tencent.mm.ui.widget.imageview.WeImageView) findViewById(com.tencent.mm.R.id.o0f);
        this.f172887f = ((uh4.c0) i95.n0.c(uh4.c0.class)).G8();
        V6();
        ((android.view.View) this.f172885d.getParent()).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.f5(this));
        ((android.view.View) this.f172886e.getParent()).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.g5(this));
        findViewById(com.tencent.mm.R.id.o0j).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.h5(this));
        findViewById(com.tencent.mm.R.id.o0k).setOnClickListener(new com.tencent.mm.plugin.teenmode.ui.i5(this));
        setBackBtn(new com.tencent.mm.plugin.teenmode.ui.j5(this));
        java.lang.String string = getString(com.tencent.mm.R.string.ol9);
        android.text.SpannableString spannableString = new android.text.SpannableString(string);
        int length = string.length() - 2;
        int length2 = string.length();
        if (length > 0) {
            spannableString.setSpan(new com.tencent.mm.plugin.teenmode.ui.k5(this), length, length2, 33);
            android.widget.TextView textView2 = (android.widget.TextView) findViewById(com.tencent.mm.R.id.nzq);
            textView2.setText(spannableString);
            textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        r45.al6 al6Var = new r45.al6();
        al6Var.f370110d = this.f172887f;
        if (((vh4.t1) i95.n0.c(vh4.t1.class)).f437138h != null) {
            r45.cu5 cu5Var = new r45.cu5();
            al6Var.f370111e = cu5Var;
            cu5Var.d(((vh4.t1) i95.n0.c(vh4.t1.class)).f437138h.getBytes());
        }
        al6Var.f370112f = ((vh4.t1) i95.n0.c(vh4.t1.class)).f437139i;
        ((e21.f) ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).aj()).b(new xg3.p0(223, al6Var));
        ((uh4.c0) i95.n0.c(uh4.c0.class)).b8();
        com.tencent.mm.autogen.events.FinderTeenModeChangeEvent finderTeenModeChangeEvent = new com.tencent.mm.autogen.events.FinderTeenModeChangeEvent();
        finderTeenModeChangeEvent.f54331g.f7139a = 2;
        finderTeenModeChangeEvent.e();
        super.onDestroy();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet hashSet) {
        super.superImportUIComponents(hashSet);
        hashSet.add(com.tencent.mm.plugin.teenmode.ui.w2.class);
    }
}
