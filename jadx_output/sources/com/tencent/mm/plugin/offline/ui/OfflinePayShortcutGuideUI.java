package com.tencent.mm.plugin.offline.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/tencent/mm/plugin/offline/ui/OfflinePayShortcutGuideUI;", "Lcom/tencent/mm/ui/MMActivity;", "<init>", "()V", "plugin-wxpay_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class OfflinePayShortcutGuideUI extends com.tencent.mm.ui.MMActivity {

    /* renamed from: q, reason: collision with root package name */
    public static java.lang.ref.WeakReference f152485q;

    /* renamed from: r, reason: collision with root package name */
    public static java.lang.ref.WeakReference f152486r;

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.ref.WeakReference f152487s;

    /* renamed from: d, reason: collision with root package name */
    public int f152488d = 1;

    /* renamed from: e, reason: collision with root package name */
    public boolean f152489e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f152490f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.View f152491g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.View f152492h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f152493i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f152494m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f152495n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f152496o;

    /* renamed from: p, reason: collision with root package name */
    public android.widget.TextView f152497p;

    public static final void T6(com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI offlinePayShortcutGuideUI) {
        int i17 = offlinePayShortcutGuideUI.f152488d;
        boolean z17 = true;
        if (i17 != 1) {
            if (i17 != 2) {
                yo3.b.b("offlinePayShortcutGuideStep3ConfirmClick", 1);
                offlinePayShortcutGuideUI.finish();
                return;
            }
            yo3.b.b("offlinePayShortcutGuideStep2AddClick", 1);
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflinePayShortcutGuideUI", "addShortcut: requesting system to pin shortcut");
            f152487s = new java.lang.ref.WeakReference(offlinePayShortcutGuideUI);
            yo3.b.f464143a = new java.lang.ref.WeakReference(offlinePayShortcutGuideUI);
            yo3.b.a(offlinePayShortcutGuideUI);
            return;
        }
        yo3.b.b("offlinePayShortcutGuideStep1SettingClick", 1);
        com.tencent.mars.xlog.Log.i("MicroMsg.OfflinePayShortcutGuideUI", "jumpToAppSettings");
        offlinePayShortcutGuideUI.f152489e = true;
        try {
            ((zd0.e) ((ae0.h) i95.n0.c(ae0.h.class))).getClass();
            l34.i iVar = l34.i.f315436b;
            if (iVar.b()) {
                com.tencent.mars.xlog.Log.i("MicroMsg.ShortcutService", "jumpToShortcutPermissionSettingPage: vendor page");
                iVar.c(offlinePayShortcutGuideUI);
            } else {
                z17 = false;
            }
            if (z17) {
                return;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.OfflinePayShortcutGuideUI", "jumpToAppSettings: fallback to ACTION_APPLICATION_DETAILS_SETTINGS");
            android.content.Intent intent = new android.content.Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.setData(android.net.Uri.parse("package:" + offlinePayShortcutGuideUI.getPackageName()));
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(offlinePayShortcutGuideUI, arrayList.toArray(), "com/tencent/mm/plugin/offline/ui/OfflinePayShortcutGuideUI", "jumpToAppSettings", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            offlinePayShortcutGuideUI.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(offlinePayShortcutGuideUI, "com/tencent/mm/plugin/offline/ui/OfflinePayShortcutGuideUI", "jumpToAppSettings", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.OfflinePayShortcutGuideUI", "jumpToAppSettings failed: %s", e17.getMessage());
            offlinePayShortcutGuideUI.U6();
        }
    }

    public final void U6() {
        this.f152488d = 2;
        android.view.View view = this.f152490f;
        if (view == null) {
            kotlin.jvm.internal.o.o("mStep1Dot");
            throw null;
        }
        V6(view, 16);
        android.view.View view2 = this.f152490f;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("mStep1Dot");
            throw null;
        }
        view2.setBackgroundResource(com.tencent.mm.R.drawable.d7g);
        android.view.View view3 = this.f152491g;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("mStep2Dot");
            throw null;
        }
        view3.setBackgroundResource(com.tencent.mm.R.drawable.d7f);
        android.view.View view4 = this.f152492h;
        if (view4 == null) {
            kotlin.jvm.internal.o.o("mStepLine");
            throw null;
        }
        view4.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.f478502m));
        android.widget.TextView textView = this.f152493i;
        if (textView == null) {
            kotlin.jvm.internal.o.o("mStep1Text");
            throw null;
        }
        textView.setText(com.tencent.mm.R.string.pg6);
        android.widget.TextView textView2 = this.f152493i;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("mStep1Text");
            throw null;
        }
        textView2.setTextColor(getResources().getColor(com.tencent.mm.R.color.f478502m));
        android.widget.TextView textView3 = this.f152495n;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("mGuideTitle");
            throw null;
        }
        textView3.setText(com.tencent.mm.R.string.f493871pg1);
        android.widget.Button button = this.f152496o;
        if (button == null) {
            kotlin.jvm.internal.o.o("mGuideBtn");
            throw null;
        }
        button.setText(com.tencent.mm.R.string.f493870pg0);
        yo3.b.b("offlinePayShortcutGuideStep2Show", 2);
    }

    public final void V6(android.view.View view, int i17) {
        int i18 = (int) ((i17 * getResources().getDisplayMetrics().density) + 0.5f);
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.width = i18;
        layoutParams.height = i18;
        view.setLayoutParams(layoutParams);
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.elg;
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int color = getResources().getColor(com.tencent.mm.R.color.aaw);
        setActionbarColor(color);
        getWindow().setStatusBarColor(color);
        setMMTitle("");
        ((android.widget.ImageView) findViewById(com.tencent.mm.R.id.aa8)).setOnClickListener(new com.tencent.mm.plugin.offline.ui.g1(this));
        android.view.View findViewById = findViewById(com.tencent.mm.R.id.v_z);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f152490f = findViewById;
        android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.f487105va1);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        this.f152491g = findViewById2;
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.f487108va4);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        this.f152492h = findViewById3;
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.f487104va0);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f152493i = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = findViewById(com.tencent.mm.R.id.f487106va2);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        this.f152494m = (android.widget.TextView) findViewById5;
        android.view.View findViewById6 = findViewById(com.tencent.mm.R.id.r__);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        this.f152495n = (android.widget.TextView) findViewById6;
        android.view.View findViewById7 = findViewById(com.tencent.mm.R.id.u0n);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f152496o = (android.widget.Button) findViewById7;
        android.view.View findViewById8 = findViewById(com.tencent.mm.R.id.f485199u14);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        this.f152497p = (android.widget.TextView) findViewById8;
        android.widget.Button button = this.f152496o;
        if (button == null) {
            kotlin.jvm.internal.o.o("mGuideBtn");
            throw null;
        }
        button.setOnClickListener(new com.tencent.mm.plugin.offline.ui.h1(this));
        android.widget.TextView textView = this.f152497p;
        if (textView == null) {
            kotlin.jvm.internal.o.o("mGuideFaq");
            throw null;
        }
        textView.setOnClickListener(new com.tencent.mm.plugin.offline.ui.i1(this));
        this.f152488d = 1;
        android.view.View view = this.f152490f;
        if (view == null) {
            kotlin.jvm.internal.o.o("mStep1Dot");
            throw null;
        }
        view.setBackgroundResource(com.tencent.mm.R.drawable.d7f);
        android.view.View view2 = this.f152491g;
        if (view2 == null) {
            kotlin.jvm.internal.o.o("mStep2Dot");
            throw null;
        }
        view2.setBackgroundResource(com.tencent.mm.R.drawable.d7h);
        android.view.View view3 = this.f152492h;
        if (view3 == null) {
            kotlin.jvm.internal.o.o("mStepLine");
            throw null;
        }
        view3.setBackgroundColor(getResources().getColor(com.tencent.mm.R.color.BW_0_Alpha_0_1));
        android.widget.TextView textView2 = this.f152493i;
        if (textView2 == null) {
            kotlin.jvm.internal.o.o("mStep1Text");
            throw null;
        }
        textView2.setText(com.tencent.mm.R.string.pg7);
        android.widget.TextView textView3 = this.f152495n;
        if (textView3 == null) {
            kotlin.jvm.internal.o.o("mGuideTitle");
            throw null;
        }
        textView3.setText(com.tencent.mm.R.string.f493875pg5);
        android.widget.Button button2 = this.f152496o;
        if (button2 == null) {
            kotlin.jvm.internal.o.o("mGuideBtn");
            throw null;
        }
        button2.setText(com.tencent.mm.R.string.f493874pg4);
        yo3.b.b("offlinePayShortcutGuideStep1Show", 2);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        java.lang.ref.WeakReference weakReference = f152487s;
        if ((weakReference != null ? (com.tencent.mm.plugin.offline.ui.OfflinePayShortcutGuideUI) weakReference.get() : null) == this) {
            f152487s = null;
        }
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.f152489e && this.f152488d == 1) {
            ae0.h hVar = (ae0.h) i95.n0.c(ae0.h.class);
            ae0.e eVar = ae0.e.OTHER;
            ((zd0.e) hVar).getClass();
            int i17 = xp1.d.i(this, null, true, eVar, new zd0.e$$a()).f3379a;
            if (i17 == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflinePayShortcutGuideUI", "checkPermissionAndProceed: permission denied, stay at step 1");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.OfflinePayShortcutGuideUI", "checkPermissionAndProceed: permission status=%d, go to step 2", java.lang.Integer.valueOf(i17));
                U6();
            }
        }
    }
}
