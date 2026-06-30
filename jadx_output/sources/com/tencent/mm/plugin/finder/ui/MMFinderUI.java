package com.tencent.mm.plugin.finder.ui;

@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/ui/MMFinderUI;", "Lcom/tencent/mm/plugin/mvvmbase/BaseMvvmActivity;", "<init>", "()V", "com/tencent/mm/plugin/finder/ui/gl", "plugin-finder-base_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes10.dex */
public abstract class MMFinderUI extends com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f128804s = 0;

    /* renamed from: d, reason: collision with root package name */
    public boolean f128805d;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Runnable f128807f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f128808g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f128809h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.ui.gl f128810i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f128811m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f128812n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f128813o;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f128806e = jz5.h.b(com.tencent.mm.plugin.finder.ui.hl.f129335d);

    /* renamed from: p, reason: collision with root package name */
    public boolean f128814p = true;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.ui.ml f128815q = new com.tencent.mm.plugin.finder.ui.ml(this);

    /* renamed from: r, reason: collision with root package name */
    public volatile int f128816r = -1;

    public final void U6() {
        java.io.Serializable serializableExtra;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Nj(this);
        if (getIntent() == null || (serializableExtra = getIntent().getSerializableExtra("key_yreportsdk_reddot_info")) == null || !(serializableExtra instanceof java.util.HashMap)) {
            return;
        }
        java.util.HashMap hashMap = (java.util.HashMap) serializableExtra;
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).mk(this, hashMap);
        hashMap.size();
    }

    public boolean V6() {
        return true;
    }

    /* renamed from: W6 */
    public int getD() {
        return 0;
    }

    /* renamed from: X6 */
    public java.lang.String getF109420v() {
        return getClass().getSimpleName();
    }

    public int Y6() {
        return 0;
    }

    public void Z6(int i17, int i18, int i19, int i27, float f17) {
    }

    public void a7(int i17) {
    }

    public final void b7(boolean z17) {
        com.tencent.mars.xlog.Log.i("Finder.MMFinderUI", "[LiveOrientation] needChangeOrientation set " + z17);
        this.f128805d = z17;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean convertActivityFromTranslucent() {
        com.tencent.mm.plugin.finder.viewmodel.component.g1 g1Var = (com.tencent.mm.plugin.finder.viewmodel.component.g1) pf5.z.f353948a.a(this).e(com.tencent.mm.plugin.finder.viewmodel.component.g1.class);
        boolean z17 = false;
        if (g1Var != null && g1Var.O6()) {
            z17 = true;
        }
        return !z17;
    }

    @Override // com.tencent.mm.ui.MMFragmentActivity
    public boolean enableActivityAnimation() {
        com.tencent.mm.plugin.finder.viewmodel.component.g1 g1Var = (com.tencent.mm.plugin.finder.viewmodel.component.g1) pf5.z.f353948a.a(this).e(com.tencent.mm.plugin.finder.viewmodel.component.g1.class);
        boolean z17 = false;
        if (g1Var != null && g1Var.O6()) {
            z17 = true;
        }
        return !z17;
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void finish() {
        super.finish();
        com.tencent.mars.xlog.Log.i("Finder.MMFinderUI", "finish " + getClass().getSimpleName() + ", " + hashCode() + ", " + getTaskId() + ", " + isPaused());
        if (!isPaused()) {
            this.f128807f = new com.tencent.mm.plugin.finder.ui.il(this);
        }
        this.f128808g = true;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return 0;
    }

    @Override // android.app.Activity
    public int getTaskId() {
        if (!this.f128813o) {
            return super.getTaskId();
        }
        if (this.f128816r == -1) {
            this.f128816r = super.getTaskId();
        }
        return this.f128816r;
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x034c  */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onCreate(android.os.Bundle r29) {
        /*
            Method dump skipped, instructions count: 1468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.MMFinderUI.onCreate(android.os.Bundle):void");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void onCreateBeforeSetContentView() {
        super.onCreateBeforeSetContentView();
        com.tencent.mm.plugin.finder.viewmodel.component.g1 g1Var = (com.tencent.mm.plugin.finder.viewmodel.component.g1) pf5.z.f353948a.a(this).e(com.tencent.mm.plugin.finder.viewmodel.component.g1.class);
        boolean z17 = false;
        if (g1Var != null && g1Var.O6()) {
            z17 = true;
        }
        if (z17) {
            if (com.tencent.mm.ui.bk.C()) {
                setTheme(com.tencent.mm.R.style.f494380li);
            } else {
                setTheme(com.tencent.mm.R.style.f494381lj);
            }
        }
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        com.tencent.mm.plugin.finder.ui.gl glVar = this.f128810i;
        if (glVar != null) {
            ((com.tencent.mm.plugin.finder.report.a2) glVar).a("onDestroy");
        }
        com.tencent.mars.xlog.Log.i("Finder.MMFinderUI", "onDestroy " + getClass().getSimpleName() + ", " + hashCode() + ", " + getTaskId() + ", " + this.f128808g);
        if (!this.f128808g && !this.f128809h) {
            this.f128809h = true;
        }
        com.tencent.mm.plugin.finder.report.j0.f125083a.d(hashCode(), this);
        c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
        if (ybVar != null) {
            ((c61.p2) ybVar).f39217g.remove(this);
            c61.l7 l7Var = (c61.l7) i95.n0.c(c61.l7.class);
            l7Var.getClass();
            com.tencent.mars.xlog.Log.i("Finder.FinderCommonFeatureService", "onExitFinder finder:" + this);
            int i17 = com.tencent.mm.plugin.finder.assist.v2.f102618d + (-1);
            com.tencent.mm.plugin.finder.assist.v2.f102618d = i17;
            if (i17 < 0) {
                com.tencent.mm.plugin.finder.assist.v2.f102618d = 0;
            }
            wo2.k kVar = (wo2.k) ((ws5.g) i95.n0.c(ws5.g.class));
            kVar.getClass();
            kVar.f448089i.remove(this);
            kVar.f448088h.remove(this);
            ((b92.v1) ((zy2.z7) i95.n0.c(zy2.z7.class))).Ui(false);
            if (!((c61.p2) l7Var.f39134x0).tj()) {
                ((com.tencent.mm.feature.performance.t1) ((ob0.z2) i95.n0.c(ob0.z2.class))).getClass();
                com.tencent.mm.matrix.o.k();
                ((c61.p7) ((m40.k0) i95.n0.c(m40.k0.class))).pj(false);
                ((c61.p2) l7Var.f39134x0).getClass();
                com.tencent.mars.xlog.Log.e("FinderCommonService", "abandonAudioFocus not support!");
                com.tencent.mm.plugin.finder.report.s0.f125339a = "";
                com.tencent.mm.plugin.finder.report.s0.f125340b = "";
                ey2.f fVar = (ey2.f) pf5.u.f353936a.e(c61.l7.class).a(ey2.f.class);
                fVar.getClass();
                ((ku5.t0) ku5.t0.f312615d).h(new ey2.e(fVar), "Finder.18054CacheVM");
                if (!pr2.a.f357949a.a()) {
                    ((ku5.t0) ku5.t0.f312615d).B(c61.s6.f39290d);
                }
                ms5.f.f331158a.a("onExitFinder");
                ((c61.d8) ((zy2.c8) i95.n0.c(zy2.c8.class))).getClass();
                ig2.m.f291393a.d();
                com.tencent.mm.plugin.finder.playlist.c cVar = com.tencent.mm.plugin.finder.playlist.c.f122265a;
                com.tencent.mars.xlog.Log.i("Finder.FinderPlayListCache", "clearCache all");
                synchronized (cVar) {
                    ((java.util.LinkedHashMap) com.tencent.mm.plugin.finder.playlist.c.f122266b).clear();
                    ((java.util.LinkedHashMap) com.tencent.mm.plugin.finder.playlist.c.f122267c).clear();
                }
                cu2.u.f222442b.clear();
                cu2.u.f222443c.clear();
                cu2.u.f222444d.clear();
                n54.i.e(null);
                com.tencent.mm.plugin.finder.video.FinderAudioVolumeController finderAudioVolumeController = (com.tencent.mm.plugin.finder.video.FinderAudioVolumeController) ((jz5.n) l7Var.Z).getValue();
                finderAudioVolumeController.getClass();
                try {
                    android.content.BroadcastReceiver broadcastReceiver = finderAudioVolumeController.f130495f;
                    if (broadcastReceiver != null) {
                        com.tencent.mm.sdk.platformtools.x2.f193071a.unregisterReceiver(broadcastReceiver);
                    }
                    finderAudioVolumeController.f130495f = null;
                } catch (java.lang.Throwable unused) {
                }
                if (finderAudioVolumeController.P6()) {
                    finderAudioVolumeController.f130501o.dead();
                    if (finderAudioVolumeController.Q6() && finderAudioVolumeController.f130507u) {
                        android.view.WindowManager windowManager = finderAudioVolumeController.f130508v;
                        if (windowManager != null) {
                            windowManager.removeView(finderAudioVolumeController.f130509w);
                        }
                        finderAudioVolumeController.f130509w = null;
                        finderAudioVolumeController.f130507u = false;
                    }
                    com.tencent.mars.xlog.Log.i("FinderAudioVolumeController", "onExitFinder");
                }
                me2.c cVar2 = me2.c.f325921a;
                com.tencent.mars.xlog.Log.i("FinderLiveFeedDataCnl", "clear all data");
                me2.c.f325922b.clear();
                me2.c.f325923c.clear();
                me2.c.f325924d.clear();
                me2.c.f325925e.clear();
            }
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = l7Var.ek().W;
            if (concurrentHashMap.size() >= 3000) {
                concurrentHashMap.clear();
            }
            if (gm0.j1.a()) {
                com.tencent.mm.plugin.finder.service.l3 l3Var = (com.tencent.mm.plugin.finder.service.l3) ((zy2.c9) i95.n0.c(zy2.c9.class));
                l3Var.getClass();
                l3Var.f126133s.remove(this);
                l3Var.f126134t.remove(this);
                if (l3Var.f126133s.size() == 0) {
                    i95.m c17 = i95.n0.c(au2.q.class);
                    kotlin.jvm.internal.o.f(c17, "getService(...)");
                    ((au2.q) c17).f14090h = -1;
                }
            }
        }
        this.f128810i = null;
    }

    @Override // com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onNewIntent(android.content.Intent intent) {
        com.tencent.mm.plugin.finder.ui.gl glVar = this.f128810i;
        if (glVar != null) {
            ((com.tencent.mm.plugin.finder.report.a2) glVar).a("onNewIntent");
        }
        com.tencent.mars.xlog.Log.i("Finder.MMFinderUI", "onNewIntent " + getClass().getSimpleName() + ", " + hashCode() + ", " + getTaskId() + ", " + this.f128808g);
        super.onNewIntent(intent);
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onPause() {
        ic2.l0 l0Var;
        super.onPause();
        com.tencent.mars.xlog.Log.i("Finder.FinderContextManager", "remove top activity:" + this);
        com.tencent.mm.plugin.finder.assist.v1.f102612b = null;
        java.lang.ref.WeakReference weakReference = com.tencent.mm.plugin.finder.assist.v1.f102614d;
        if (kotlin.jvm.internal.o.b(this, weakReference != null ? (android.app.Activity) weakReference.get() : null)) {
            java.lang.String localClassName = getLocalClassName();
            kotlin.jvm.internal.o.f(localClassName, "getLocalClassName(...)");
            if (!r26.n0.B(localClassName, "FinderFinderSysMsgUI", false)) {
                com.tencent.mm.plugin.finder.assist.v1.f102614d = null;
            }
        }
        com.tencent.mm.plugin.finder.ui.gl glVar = this.f128810i;
        if (glVar != null) {
            ((com.tencent.mm.plugin.finder.report.a2) glVar).a("onPause");
        }
        if (((c61.yb) i95.n0.c(c61.yb.class)) != null && (l0Var = ((c61.l7) i95.n0.c(c61.l7.class)).P) != null) {
            java.util.HashSet hashSet = ic2.l0.f290339s;
            hashSet.remove(java.lang.Integer.valueOf(hashCode()));
            com.tencent.mars.xlog.Log.i("Finder.SyncExtension", "unregister Looper " + com.tencent.mm.plugin.finder.storage.t70.f128011x + " size: " + hashSet.size() + ' ' + l0Var.f290344h);
        }
        com.tencent.mars.xlog.Log.i("Finder.MMFinderUI", "onPause " + getClass().getSimpleName() + ", " + hashCode() + ", " + getTaskId() + ", " + this.f128807f);
        if (this.f128811m) {
            com.tencent.mm.plugin.finder.storage.t70 t70Var = com.tencent.mm.plugin.finder.storage.t70.f127590a;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.tencent.mm.plugin.finder.storage.t70.H1).getValue()).r()).intValue() == 1) {
                com.tencent.mars.xlog.Log.i("Finder.MMFinderUI", "REPORT_WHEN_SCREEN_SHOT remove");
                ((com.tencent.mm.ui.feature.api.screenshot.t) ((ct.d3) i95.n0.c(ct.d3.class))).Bi(this, this.f128815q);
            }
        }
        java.lang.Runnable runnable = this.f128807f;
        if (runnable != null) {
            ((com.tencent.mm.plugin.finder.ui.il) runnable).run();
        }
        this.f128807f = null;
        if (isFinishing()) {
            com.tencent.mm.plugin.finder.report.j0.f125083a.d(hashCode(), this);
            return;
        }
        com.tencent.mm.plugin.finder.report.j0 j0Var = com.tencent.mm.plugin.finder.report.j0.f125083a;
        int hashCode = hashCode();
        com.tencent.mm.plugin.finder.report.g0 c17 = j0Var.c(hashCode, false);
        if (c17 != null && c17.f125039e == 0 && c17.f125040f == 0) {
            com.tencent.mars.xlog.Log.i("FinderEnterCostReporter", "notifyOnPause: abandon useless data " + c17);
            com.tencent.mm.plugin.finder.report.j0.f125084b.remove(java.lang.Integer.valueOf(hashCode));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if ((r0.f125038d == 0) != false) goto L11;
     */
    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onResume() {
        /*
            Method dump skipped, instructions count: 420
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.finder.ui.MMFinderUI.onResume():void");
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        getIntent().putExtra("key_mmfinder_is_resume", 1);
        com.tencent.mars.xlog.Log.i("Finder.MMFinderUI", "onStart " + getClass().getSimpleName() + ", " + hashCode() + ", " + getTaskId() + ", " + this.f128808g);
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).zj(this);
        com.tencent.mm.plugin.finder.ui.gl glVar = this.f128810i;
        if (glVar != null) {
            ((com.tencent.mm.plugin.finder.report.a2) glVar).a("onStart");
        }
        super.onStart();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        com.tencent.mm.plugin.finder.ui.gl glVar = this.f128810i;
        if (glVar != null) {
            ((com.tencent.mm.plugin.finder.report.a2) glVar).a("onStop");
        }
        com.tencent.mars.xlog.Log.i("Finder.MMFinderUI", "onStop " + getClass().getSimpleName() + ", " + hashCode() + ", " + getTaskId() + ", " + this.f128808g);
        super.onStop();
        ((c61.p2) ((c61.yb) i95.n0.c(c61.yb.class))).yj(this);
    }

    @Override // com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        com.tencent.mm.plugin.finder.viewmodel.component.g1 g1Var = (com.tencent.mm.plugin.finder.viewmodel.component.g1) pf5.z.f353948a.a(this).e(com.tencent.mm.plugin.finder.viewmodel.component.g1.class);
        if (g1Var != null) {
            g1Var.f134457f = true;
        }
        super.onSwipeBack();
    }

    @Override // com.tencent.mm.ui.MMActivity
    public void setMMOrientation() {
        if (this.f128805d) {
            return;
        }
        super.setMMOrientation();
    }

    @Override // com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMFragmentActivity, android.app.Activity
    public void setRequestedOrientation(int i17) {
        com.tencent.mars.xlog.Log.i("Finder.MMFinderUI", "setRequestedOrientation: requestedOrientation = " + i17 + ", needChangeOrientation = " + this.f128805d + ", this=" + getF109420v());
        if (this.f128805d) {
            super.setRequestedOrientation(i17);
        } else {
            super.setRequestedOrientation(1);
        }
    }

    @Override // com.tencent.mm.plugin.mvvmbase.BaseMvvmActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.component.UIComponentActivity
    public void superImportUIComponents(java.util.HashSet set) {
        kotlin.jvm.internal.o.g(set, "set");
        super.superImportUIComponents(set);
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.ra.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.k9.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(zy2.vb.class)));
        ((nd0.e) i95.n0.c(nd0.e.class)).getClass();
        set.add(t04.a.class);
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(d92.l2.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(d92.k2.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(d92.j2.class)));
        set.add(pf5.a0.a(kotlin.jvm.internal.i0.a(d92.m2.class)));
        set.add(com.tencent.mm.plugin.finder.viewmodel.component.g1.class);
    }
}
