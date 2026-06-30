package com.tencent.mm.plugin.setting.ui.setting;

/* loaded from: classes12.dex */
public class e5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public long f160977d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMMHeaderPreference f160978e;

    public e5(com.tencent.mm.plugin.setting.ui.setting.SettingsAboutMMHeaderPreference settingsAboutMMHeaderPreference) {
        this.f160978e = settingsAboutMMHeaderPreference;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMMHeaderPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j17 = this.f160977d;
        if (j17 > currentTimeMillis || currentTimeMillis - j17 > 300) {
            this.f160977d = currentTimeMillis;
            yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMMHeaderPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        this.f160977d = currentTimeMillis;
        android.content.Context context = this.f160978e.f197770d;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = o45.wf.f343029g;
        sb6.append(java.lang.String.format("[ver  ] %s %08X\n", com.tencent.mm.sdk.platformtools.a0.b(context, i17, true), java.lang.Integer.valueOf(i17)));
        sb6.append(com.tencent.mm.sdk.platformtools.z.a());
        sb6.append(java.lang.String.format("[storage] %s|%s\n", lp0.b.e0(), java.lang.Integer.valueOf(com.tencent.mm.sdcard_migrate.h.a(lp0.b.c()) ? 1 : 0)));
        sb6.append(java.lang.String.format("[cid  ] %d\n", java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.a0.f192439b)));
        sb6.append(java.lang.String.format("[target.ver] %d\n", java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.x2.f193071a.getApplicationInfo().targetSdkVersion)));
        sb6.append(java.lang.String.format("[s.ver] %d\n", java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(0))));
        sb6.append(java.lang.String.format("[t.ver] %d\n", java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(6))));
        java.lang.Integer valueOf = java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(1));
        ((om4.m) ((pm4.r) i95.n0.c(pm4.r.class))).getClass();
        com.tencent.xweb.f1 f1Var = com.tencent.xweb.WebView.f220189m;
        sb6.append(java.lang.String.format("[l.ver] %d %s\n", valueOf, com.tencent.xweb.f1.WV_KIND_PINUS));
        sb6.append(java.lang.String.format("[w.ver] %d\n", java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(3))));
        sb6.append(java.lang.String.format("[box.ver] %d\n", java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(2))));
        sb6.append(java.lang.String.format("[pardus.ver] %d\n", java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(5))));
        ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
        sb6.append(java.lang.String.format("[ts.ver] %d\n", java.lang.Long.valueOf(bk4.i.a().o())));
        sb6.append(java.lang.String.format("[r.ver] %s\n", com.tencent.mm.sdk.platformtools.z.f193125u));
        this.f160978e.getClass();
        ((k30.a) ((l30.h) i95.n0.c(l30.h.class))).getClass();
        byte[] bArr = com.tencent.mm.plugin.expansions.i0.f99751a;
        sb6.append(java.lang.String.format("[exp.ver] %s\n", "disabled"));
        sb6.append(java.lang.String.format("[app.usrid] %s\n", java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.c7.b())));
        sb6.append(java.lang.String.format("[app.usrinfo] %s\n", com.tencent.mm.sdk.platformtools.c7.c(com.tencent.mm.sdk.platformtools.x2.f193071a)));
        sb6.append(java.lang.String.format("[app.profile] %s\n", com.tencent.mm.sdk.platformtools.c7.a(com.tencent.mm.sdk.platformtools.x2.f193071a)));
        sb6.append(java.lang.String.format("[app.source] %s\n", pj.e.e(com.tencent.mm.sdk.platformtools.x2.f193071a)));
        sb6.append(java.lang.String.format("[application] %s\n", this.f160978e.f197770d.getPackageName()));
        sb6.append(java.lang.String.format("[brand] %d %s\n", java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.n9.f192884a), com.tencent.mm.sdk.platformtools.a9.f192463a));
        sb6.append(java.lang.String.format("[xweb] %s %s %s\n", java.lang.Integer.valueOf(com.tencent.xwebsdk.BuildConfig.SDK_VERSION_CODE), java.lang.Integer.valueOf(com.tencent.xweb.a3.f(com.tencent.mm.sdk.platformtools.x2.f193071a)), java.lang.Integer.valueOf(com.tencent.xweb.a3.i().ordinal())));
        if (com.tencent.mm.sdk.platformtools.s9.f192975c) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) sh.c.n(view.getContext())).iterator();
            while (it.hasNext()) {
                java.lang.String g17 = ri.i.g((java.lang.String) ((m3.d) it.next()).f323093b);
                if (g17.length() > 10) {
                    g17 = g17.substring(g17.length() - 10);
                }
                arrayList2.add(g17);
            }
            sb6.append(java.lang.String.format("[proc] %s\n", u46.l.h(arrayList2, " ")));
        }
        java.lang.String Bi = ((com.tencent.mm.feature.performance.r4) ((uq3.h) i95.n0.c(uq3.h.class))).Bi();
        if (android.text.TextUtils.isEmpty(Bi)) {
            Bi = "";
        }
        sb6.append(Bi);
        android.widget.TextView textView = new android.widget.TextView(context);
        textView.setText(sb6);
        textView.setGravity(19);
        textView.setTextSize(1, 10.0f);
        textView.setLayoutParams(new android.view.ViewGroup.LayoutParams(-1, -2));
        textView.setTextColor(this.f160978e.f197770d.getResources().getColor(com.tencent.mm.R.color.FG_0));
        textView.setTypeface(android.graphics.Typeface.MONOSPACE);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(com.tencent.mm.R.dimen.f479866hf);
        textView.setPadding(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
        db5.e1.q(context, null, textView, null);
        final long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        ku5.u0 u0Var = ku5.t0.f312615d;
        java.util.concurrent.Callable callable = new java.util.concurrent.Callable() { // from class: com.tencent.mm.plugin.setting.ui.setting.e5$$a
            @Override // java.util.concurrent.Callable
            public final java.lang.Object call() {
                long j18 = currentTimeMillis2;
                com.tencent.mm.plugin.setting.ui.setting.f5 f5Var = com.tencent.mm.plugin.setting.ui.setting.f5.f161024a;
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.SettingsAboutMMHeaderReporter", "do report: time = " + j18);
                    com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                    ((we0.j1) ((xe0.l0) i95.n0.c(xe0.l0.class))).getClass();
                    g0Var.d(28255, java.lang.Long.valueOf(j18), com.tencent.mm.sdk.platformtools.z.f193105a, com.tencent.mm.sdk.platformtools.z.f193109e, java.lang.Integer.valueOf(com.tencent.xwebsdk.BuildConfig.SDK_VERSION_CODE), java.lang.Integer.valueOf(org.xwalk.core.XWalkEnvironment.d()), ri.l0.b(f5Var.a(com.tencent.matrix.util.MemInfo.f53095p.a())), java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(0)), java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(6)), java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(1)), java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(3)), java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(2)), java.lang.Integer.valueOf(com.tencent.mm.plugin.websearch.l2.a(5)), java.lang.Long.valueOf(bk4.i.a().o()));
                } catch (java.lang.Throwable th6) {
                    oj.j.d("MicroMsg.SettingsAboutMMHeaderReporter", th6, "", new java.lang.Object[0]);
                }
                return f5Var;
            }
        };
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.u(callable, 0L, "SettingsAboutHeader");
        yj0.a.h(this, "com/tencent/mm/plugin/setting/ui/setting/SettingsAboutMMHeaderPreference$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
