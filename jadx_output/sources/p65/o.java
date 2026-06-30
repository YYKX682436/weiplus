package p65;

/* loaded from: classes12.dex */
public class o extends p65.a {
    @Override // p65.a
    public void d() {
        float f17;
        super.d();
        android.app.Application a17 = com.tencent.mm.sdk.platformtools.i.a();
        com.tencent.mm.app.v5 a18 = com.tencent.mm.app.v5.a(a17);
        if ((a18 == com.tencent.mm.app.v5.f53851h || a18 == com.tencent.mm.app.v5.f53853m) && com.tencent.mm.ui.fj.h()) {
            androidx.window.embedding.SplitController.initialize(a17.getApplicationContext(), com.tencent.mm.R.xml.f494901b2);
            android.content.ComponentName componentName = new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.ui.LauncherUI");
            android.content.ComponentName componentName2 = new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.*");
            android.content.ComponentName componentName3 = new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.ui.chatting.ChattingUI");
            android.content.ComponentName componentName4 = new android.content.ComponentName(com.tencent.mm.sdk.platformtools.x2.f193072b, "com.tencent.mm.ui.EmptyActivity");
            int i17 = (int) (com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().density * 600.0f);
            int i18 = (int) (com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().density * 600.0f);
            com.tencent.mm.ui.ah a19 = com.tencent.mm.ui.bh.a(com.tencent.mm.sdk.platformtools.x2.f193071a);
            int min = java.lang.Math.min(a19.f197135a, a19.f197136b);
            if (com.tencent.mm.ui.bk.A()) {
                i17 = min > 0 ? min + 5 : (int) (com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDisplayMetrics().density * 701.0f);
                f17 = 0.3f;
            } else {
                f17 = 0.5f;
            }
            float f18 = f17;
            if (com.tencent.mm.ui.bk.a0()) {
                i17 = min;
                i18 = i17;
            }
            java.util.HashSet hashSet = new java.util.HashSet();
            hashSet.add(new androidx.window.embedding.SplitPairFilter(componentName, componentName2, null));
            int i19 = i17;
            int i27 = i18;
            androidx.window.embedding.SplitController.getInstance().registerRule(new androidx.window.embedding.SplitPairRule(hashSet, false, true, false, i19, i27, f18, 3));
            java.util.HashSet hashSet2 = new java.util.HashSet();
            hashSet2.add(new androidx.window.embedding.SplitPairFilter(componentName, componentName3, null));
            androidx.window.embedding.SplitController.getInstance().registerRule(new androidx.window.embedding.SplitPairRule(hashSet2, false, true, true, i19, i27, f18, 3));
            android.content.Intent intent = new android.content.Intent();
            intent.setComponent(componentName4);
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet(1);
            linkedHashSet.add(new androidx.window.embedding.ActivityFilter(componentName, null));
            androidx.window.embedding.SplitController.getInstance().registerRule(new androidx.window.embedding.SplitPlaceholderRule(linkedHashSet, intent, i17, i18, f18, 3));
        }
        com.tencent.mm.legacy.app.WeChatSplash.a();
    }

    @Override // p65.a
    public void e(android.app.Application application) {
        com.tencent.mm.vfs.z7 z7Var;
        java.util.ArrayList f17 = f(application);
        nm.i iVar = (nm.i) nm.i.f338436g.b();
        android.app.Application a17 = com.tencent.mm.sdk.platformtools.i.a();
        android.app.Application[] applicationArr = iVar.f338439c;
        if (applicationArr[0] == null) {
            synchronized (applicationArr) {
                android.app.Application[] applicationArr2 = iVar.f338439c;
                if (applicationArr2[0] == null) {
                    applicationArr2[0] = a17;
                    iVar.f338437a.a(a17);
                    com.tencent.mars.xlog.Log.i("MicroMsg.FirstScreenArrangement2", "[+] installed.");
                }
            }
        }
        android.app.Application a18 = com.tencent.mm.sdk.platformtools.i.a();
        if (com.tencent.mm.app.c6.MATCH_NOT_PLAIN_NOT_ISOLATED_PROCESSES.matches(a18)) {
            p65.l lVar = new p65.l(this, a18);
            com.tencent.mm.ipcinvoker.h0[] h0VarArr = com.tencent.mm.ipcinvoker.i0.f68356a;
            synchronized (h0VarArr) {
                h0VarArr[0] = lVar;
            }
        }
        android.app.Application a19 = com.tencent.mm.sdk.platformtools.i.a();
        com.tencent.mm.sdk.platformtools.x2.f193075e = j65.j.e(a19.getResources(), a19, false);
        if (com.tencent.mm.app.v5.a(a19).f53869f) {
            java.lang.String a27 = lp0.h.f320266b.a("login_user_name", "");
            java.lang.String e17 = lp0.b.e();
            com.tencent.mm.vfs.z7 a28 = e17 == null ? null : com.tencent.mm.vfs.z7.a(e17);
            if (a28 == null) {
                z7Var = new com.tencent.mm.vfs.z7(null, null, com.tencent.mm.vfs.e8.l("version_history.cfg", false, false), null, null);
            } else {
                z7Var = new com.tencent.mm.vfs.z7(a28.f213277d, a28.f213278e, com.tencent.mm.vfs.e8.l(a28.f213279f + "/version_history.cfg", false, false), a28.f213280g, a28.f213281h);
            }
            if (com.tencent.mm.sdk.platformtools.t8.K0(a27)) {
                com.tencent.mm.vfs.z2 m17 = com.tencent.mm.vfs.a3.f212781a.m(z7Var, null);
                if (!(m17.a() ? m17.f213266a.F(m17.f213267b) : false)) {
                    j65.c.i();
                }
            }
            j65.f.f297946j = new p65.m(this);
            j62.e g17 = j62.e.g();
            e42.c0 c0Var = e42.c0.clicfg_mb_reward_ad_log_max_length_android;
            boolean z17 = !g17.l("clicfg_dont_manually_notify_res_changed_on_appbrand", true, true, true);
            if (!com.tencent.mm.app.c6.MATCH_APPBRAND.matches(a19) || z17) {
                j65.j jVar = (j65.j) com.tencent.mm.sdk.platformtools.x2.f193075e;
                jVar.i(jVar.getConfiguration());
            }
            com.tencent.mm.app.e6.f53408a = null;
            com.tencent.mm.app.e6.f53409b = "com.tencent.mm.boot";
            android.content.res.Resources resources = a19.getResources();
            m95.k.e(a19, com.tencent.mm.app.e6.f53409b);
            com.tencent.mm.app.e6.f53410c = a19;
            com.tencent.mm.app.e6.f53411d = resources;
        }
        g(f17);
        com.tencent.mm.legacy.app.WeChatSplash.b(this.f352440b, new com.tencent.mm.legacy.app.WeChatSplashStartup());
        if (com.tencent.mm.sdk.platformtools.x2.n()) {
            gm0.j1.i().m(new p65.n(this));
        }
    }
}
