package com.tencent.mm.plugin.setting.ui.fixtools;

@db5.a(3)
/* loaded from: classes12.dex */
public class FixToolsUplogUI extends com.tencent.mm.ui.MMWizardActivity {

    /* renamed from: s, reason: collision with root package name */
    public static java.lang.String f160076s = null;

    /* renamed from: t, reason: collision with root package name */
    public static java.lang.String f160077t = "00:00";

    /* renamed from: u, reason: collision with root package name */
    public static java.lang.String f160078u = "24:00";

    /* renamed from: e, reason: collision with root package name */
    public android.widget.Button f160079e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.LinearLayout f160080f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.LinearLayout f160081g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.LinearLayout f160082h;

    /* renamed from: i, reason: collision with root package name */
    public android.widget.TextView f160083i;

    /* renamed from: m, reason: collision with root package name */
    public android.widget.TextView f160084m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f160085n;

    /* renamed from: o, reason: collision with root package name */
    public final java.text.SimpleDateFormat f160086o = new java.text.SimpleDateFormat("yyyy.MM.dd");

    /* renamed from: p, reason: collision with root package name */
    public final java.text.SimpleDateFormat f160087p = new java.text.SimpleDateFormat("yyyyMMdd");

    /* renamed from: q, reason: collision with root package name */
    public final java.util.ArrayList f160088q = new java.util.ArrayList();

    /* renamed from: r, reason: collision with root package name */
    public final java.util.ArrayList f160089r = new java.util.ArrayList();

    public FixToolsUplogUI() {
        for (int i17 = 0; i17 <= 24; i17++) {
            java.lang.String format = java.lang.String.format("%02d:00", java.lang.Integer.valueOf(i17));
            this.f160088q.add(format);
            this.f160089r.add(format);
        }
        this.f160088q.remove(24);
        this.f160089r.remove(0);
    }

    public static void Z6(com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI fixToolsUplogUI, boolean z17) {
        androidx.appcompat.app.AppCompatActivity context = fixToolsUplogUI.getContext();
        java.util.ArrayList arrayList = fixToolsUplogUI.f160088q;
        java.util.ArrayList arrayList2 = fixToolsUplogUI.f160089r;
        com.tencent.mm.ui.widget.picker.c0 c0Var = new com.tencent.mm.ui.widget.picker.c0(context, z17 ? arrayList : arrayList2);
        c0Var.f212259t = new o14.b0(fixToolsUplogUI, z17, c0Var);
        if (z17) {
            int indexOf = arrayList.indexOf(f160077t);
            com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew = c0Var.f212256q;
            if (customOptionPickNew != null) {
                customOptionPickNew.setValue(indexOf);
                c0Var.f212256q.c(indexOf);
            }
        } else {
            int indexOf2 = arrayList2.indexOf(f160078u);
            com.tencent.mm.ui.widget.picker.CustomOptionPickNew customOptionPickNew2 = c0Var.f212256q;
            if (customOptionPickNew2 != null) {
                customOptionPickNew2.setValue(indexOf2);
                c0Var.f212256q.c(indexOf2);
            }
        }
        c0Var.l();
    }

    public final void a7(java.lang.Throwable th6) {
        java.io.StringWriter stringWriter = new java.io.StringWriter();
        java.io.PrintWriter printWriter = new java.io.PrintWriter(stringWriter);
        th6.printStackTrace(printWriter);
        printWriter.flush();
        java.lang.String stringWriter2 = stringWriter.toString();
        android.widget.TextView textView = new android.widget.TextView(this);
        textView.setText(stringWriter2);
        textView.setGravity(8388627);
        textView.setTextSize(1, 10.0f);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(getContext().getResources().getColor(com.tencent.mm.R.color.FG_0, getContext().getTheme()));
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        int dimensionPixelSize = getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        com.tencent.mm.ui.widget.dialog.a aVar = new com.tencent.mm.ui.widget.dialog.a();
        aVar.L = textView;
        aVar.f211732v = of5.b.a(this).getString(com.tencent.mm.R.string.f490507x1);
        com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(this, com.tencent.mm.R.style.f494791wd);
        j0Var.e(aVar);
        com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar.f211723m;
        if (d0Var != null) {
            d0Var.a(j0Var.f211837r);
        }
        j0Var.show();
    }

    public final void b7() {
        androidx.appcompat.app.AppCompatActivity context = getContext();
        int i17 = al5.u4.f6058t;
        al5.t4 t4Var = new al5.t4(context);
        t4Var.f6042e = getString(com.tencent.mm.R.string.f492121o36);
        t4Var.f(true);
        t4Var.b(true);
        final al5.u4 g17 = t4Var.g();
        ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: o14.u$$a
            @Override // java.lang.Runnable
            public final void run() {
                com.tencent.mm.vfs.r6 j17;
                final com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI fixToolsUplogUI = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.this;
                final al5.u4 u4Var = g17;
                java.lang.String str = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160076s;
                fixToolsUplogUI.getClass();
                java.io.File file = null;
                try {
                    com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
                    file = p55.b.a(new java.io.File(lp0.b.h0("packed-logs").o()));
                    if (file != null) {
                        fp.r.a(fixToolsUplogUI.getContext(), file, "wechat-logs.zip", "application/zip");
                    }
                    ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: o14.u$$g
                        @Override // java.lang.Runnable
                        public final void run() {
                            java.lang.String str2 = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160076s;
                            com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI fixToolsUplogUI2 = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.this;
                            fixToolsUplogUI2.getClass();
                            al5.t4 t4Var2 = u4Var.f6059d;
                            t4Var2.f6042e = fixToolsUplogUI2.getString(com.tencent.mm.R.string.f492123fa1);
                            t4Var2.f(false);
                            t4Var2.b(false);
                            t4Var2.e(com.tencent.mm.R.raw.check_mark_regular);
                            t4Var2.i();
                        }
                    });
                } catch (java.lang.Throwable th6) {
                    try {
                        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: o14.u$$h
                            @Override // java.lang.Runnable
                            public final void run() {
                                java.lang.String str2 = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160076s;
                                final com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI fixToolsUplogUI2 = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.this;
                                fixToolsUplogUI2.getClass();
                                al5.t4 t4Var2 = u4Var.f6059d;
                                t4Var2.f6042e = fixToolsUplogUI2.getString(com.tencent.mm.R.string.f492120o35);
                                t4Var2.f(false);
                                t4Var2.b(false);
                                t4Var2.e(com.tencent.mm.R.raw.xmark_regular);
                                t4Var2.a(fixToolsUplogUI2.getString(com.tencent.mm.R.string.o3c));
                                final java.lang.Throwable th7 = th6;
                                t4Var2.f6038a.f6014b = new com.tencent.mm.ui.widget.snackbar.g() { // from class: o14.u$$i
                                    @Override // com.tencent.mm.ui.widget.snackbar.g
                                    public final void a() {
                                        java.lang.String str3 = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160076s;
                                        com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.this.a7(th7);
                                    }
                                };
                                t4Var2.i();
                            }
                        });
                        if (file == null) {
                            return;
                        }
                        j17 = com.tencent.mm.vfs.r6.j(file);
                        if (!j17.m()) {
                            return;
                        }
                    } catch (java.lang.Throwable th7) {
                        if (file != null) {
                            com.tencent.mm.vfs.r6 j18 = com.tencent.mm.vfs.r6.j(file);
                            if (j18.m()) {
                                j18.l();
                            }
                        }
                        throw th7;
                    }
                }
                if (file != null) {
                    j17 = com.tencent.mm.vfs.r6.j(file);
                    if (!j17.m()) {
                        return;
                    }
                    j17.l();
                }
            }
        });
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return com.tencent.mm.R.layout.bam;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void initView() {
        setMMTitle(com.tencent.mm.R.string.fa9);
        this.f160079e = (android.widget.Button) findViewById(com.tencent.mm.R.id.g7d);
        this.f160080f = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.bup);
        this.f160081g = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.bu8);
        this.f160082h = (android.widget.LinearLayout) findViewById(com.tencent.mm.R.id.bu_);
        this.f160083i = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485002g74);
        this.f160084m = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485000g72);
        this.f160085n = (android.widget.TextView) findViewById(com.tencent.mm.R.id.f485001g73);
        this.f160083i.setText(this.f160086o.format(new java.util.Date()));
        this.f160084m.setText(f160077t);
        this.f160085n.setText(f160078u);
        f160076s = this.f160087p.format(new java.util.Date());
        this.f160079e.setOnClickListener(new o14.v(this));
        this.f160080f.setOnClickListener(new o14.w(this));
        this.f160081g.setOnClickListener(new o14.x(this));
        this.f160082h.setOnClickListener(new o14.y(this));
        setBackBtn(new o14.z(this));
        addIconOptionMenu(0, com.tencent.mm.R.string.jzq, com.tencent.mm.R.raw.actionbar_icon_dark_more, new android.view.MenuItem.OnMenuItemClickListener() { // from class: o14.u$$d
            @Override // android.view.MenuItem.OnMenuItemClickListener
            public final boolean onMenuItemClick(android.view.MenuItem menuItem) {
                java.lang.String str = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160076s;
                final com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI fixToolsUplogUI = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.this;
                fixToolsUplogUI.getClass();
                com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0((android.content.Context) fixToolsUplogUI, 1, false);
                k0Var.f211872n = new o14.u$$e();
                k0Var.f211881s = new db5.t4() { // from class: o14.u$$f
                    @Override // db5.t4
                    public final void onMMMenuItemSelected(android.view.MenuItem menuItem2, int i17) {
                        final com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI fixToolsUplogUI2 = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.this;
                        java.lang.String str2 = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160076s;
                        fixToolsUplogUI2.getClass();
                        boolean z17 = true;
                        if (menuItem2.getItemId() == 0) {
                            androidx.appcompat.app.AppCompatActivity context = fixToolsUplogUI2.getContext();
                            int i18 = al5.u4.f6058t;
                            al5.t4 t4Var = new al5.t4(context);
                            t4Var.f6042e = fixToolsUplogUI2.getString(com.tencent.mm.R.string.f492121o36);
                            t4Var.f(true);
                            t4Var.b(true);
                            final al5.u4 g17 = t4Var.g();
                            ((ku5.t0) ku5.t0.f312615d).q(new java.lang.Runnable() { // from class: o14.u$$j
                                @Override // java.lang.Runnable
                                public final void run() {
                                    final com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI fixToolsUplogUI3 = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.this;
                                    final al5.u4 u4Var = g17;
                                    java.lang.String str3 = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160076s;
                                    fixToolsUplogUI3.getClass();
                                    try {
                                        com.tencent.mm.vfs.r7 r7Var = com.tencent.mm.vfs.q7.f213141a;
                                        java.io.File a17 = p55.b.a(new java.io.File(lp0.b.h0("packed-logs").o()));
                                        if (a17 != null) {
                                            final com.tencent.mm.vfs.r6 j17 = com.tencent.mm.vfs.r6.j(a17);
                                            ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: o14.u$$k
                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    java.lang.String str4 = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160076s;
                                                    com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI fixToolsUplogUI4 = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.this;
                                                    android.net.Uri b17 = com.tencent.mm.sdk.platformtools.i1.b(fixToolsUplogUI4.getContext(), j17);
                                                    android.content.Intent intent = new android.content.Intent("android.intent.action.SEND");
                                                    intent.setType("application/zip");
                                                    intent.addFlags(1);
                                                    intent.putExtra("android.intent.extra.STREAM", b17);
                                                    android.content.Intent createChooser = android.content.Intent.createChooser(intent, fixToolsUplogUI4.getString(com.tencent.mm.R.string.o3_));
                                                    java.util.ArrayList arrayList = new java.util.ArrayList();
                                                    arrayList.add(createChooser);
                                                    java.util.Collections.reverse(arrayList);
                                                    yj0.a.d(fixToolsUplogUI4, arrayList.toArray(), "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUplogUI", "lambda$forwardLogs$3", "(Lcom/tencent/mm/vfs/VFSFile;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                                    fixToolsUplogUI4.startActivity((android.content.Intent) arrayList.get(0));
                                                    yj0.a.f(fixToolsUplogUI4, "com/tencent/mm/plugin/setting/ui/fixtools/FixToolsUplogUI", "lambda$forwardLogs$3", "(Lcom/tencent/mm/vfs/VFSFile;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                                                }
                                            });
                                        }
                                        ku5.u0 u0Var = ku5.t0.f312615d;
                                        java.util.Objects.requireNonNull(u4Var);
                                        ((ku5.t0) u0Var).B(new java.lang.Runnable() { // from class: o14.u$$l
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                al5.u4.this.dismiss();
                                            }
                                        });
                                    } catch (java.lang.Throwable th6) {
                                        ((ku5.t0) ku5.t0.f312615d).B(new java.lang.Runnable() { // from class: o14.u$$b
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                java.lang.String str4 = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160076s;
                                                final com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI fixToolsUplogUI4 = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.this;
                                                fixToolsUplogUI4.getClass();
                                                al5.t4 t4Var2 = u4Var.f6059d;
                                                t4Var2.f6042e = fixToolsUplogUI4.getString(com.tencent.mm.R.string.f492120o35);
                                                t4Var2.f(false);
                                                t4Var2.b(false);
                                                t4Var2.e(com.tencent.mm.R.raw.xmark_regular);
                                                t4Var2.a(fixToolsUplogUI4.getString(com.tencent.mm.R.string.o3c));
                                                final java.lang.Throwable th7 = th6;
                                                t4Var2.f6038a.f6014b = new com.tencent.mm.ui.widget.snackbar.g() { // from class: o14.u$$c
                                                    @Override // com.tencent.mm.ui.widget.snackbar.g
                                                    public final void a() {
                                                        java.lang.String str5 = com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.f160076s;
                                                        com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUplogUI.this.a7(th7);
                                                    }
                                                };
                                                t4Var2.i();
                                            }
                                        });
                                    }
                                }
                            });
                            return;
                        }
                        if (menuItem2.getItemId() == 1) {
                            if (android.os.Build.VERSION.SDK_INT < 29) {
                                ((sb0.f) ((tb0.j) i95.n0.c(tb0.j.class))).getClass();
                                if (!j35.u.d(fixToolsUplogUI2, "android.permission.WRITE_EXTERNAL_STORAGE", true)) {
                                    j35.u.i(fixToolsUplogUI2, "android.permission.WRITE_EXTERNAL_STORAGE", 32);
                                    z17 = false;
                                }
                            }
                            if (z17) {
                                fixToolsUplogUI2.b7();
                            }
                        }
                    }
                };
                k0Var.v();
                return true;
            }
        });
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        setResult(i18);
        finish();
    }

    @Override // com.tencent.mm.ui.MMWizardActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (getIntent().getExtras() == null || !getIntent().getExtras().getBoolean("MMWizardActivity.WIZARD_ROOT_KILLSELF", false)) {
            int intExtra = getIntent().getIntExtra("entry_fix_tools_uplog", 5);
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(873L, intExtra, 1L, false);
            g0Var.idkeyStat(873L, 8L, 1L, false);
            initView();
            if (k14.n.a().f303361a) {
                startActivityForResult(new android.content.Intent(getContext(), (java.lang.Class<?>) com.tencent.mm.plugin.setting.ui.fixtools.FixToolsUpLogUploadingUI.class));
            }
        }
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int i17, java.lang.String[] strArr, int[] iArr) {
        if (i17 != 32) {
            super.onRequestPermissionsResult(i17, strArr, iArr);
            return;
        }
        if (iArr.length > 0 && iArr[0] == 0) {
            b7();
            return;
        }
        androidx.appcompat.app.AppCompatActivity context = getContext();
        int i18 = al5.u4.f6058t;
        al5.t4 t4Var = new al5.t4(context);
        t4Var.f6042e = getString(com.tencent.mm.R.string.o3b);
        t4Var.b(false);
        t4Var.e(com.tencent.mm.R.raw.xmark_regular);
        t4Var.g();
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        if (k14.n.a().f303361a) {
            finish();
        }
    }
}
