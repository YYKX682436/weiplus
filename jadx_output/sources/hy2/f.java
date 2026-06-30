package hy2;

/* loaded from: classes10.dex */
public final class f extends com.tencent.mm.ui.component.UIComponent implements iz2.b {

    /* renamed from: d, reason: collision with root package name */
    public boolean f286055d;

    /* renamed from: e, reason: collision with root package name */
    public final hy2.e f286056e;

    /* renamed from: f, reason: collision with root package name */
    public int f286057f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f286056e = new hy2.e(this);
        this.f286057f = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void O6(int r14, yz5.a r15) {
        /*
            r13 = this;
            java.lang.String r0 = "callback"
            kotlin.jvm.internal.o.g(r15, r0)
            pf5.u r0 = pf5.u.f353936a
            java.lang.Class<zy2.b6> r1 = zy2.b6.class
            pf5.v r0 = r0.e(r1)
            java.lang.Class<iz2.c> r1 = iz2.c.class
            pf5.c r0 = r0.c(r1)
            iz2.c r0 = (iz2.c) r0
            com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM r0 = (com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM) r0
            boolean r1 = r0.Q6()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto Lb9
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r4 = com.tencent.mm.storage.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_TIME_LONG_SYNC
            r5 = 0
            long r4 = r1.t(r4, r5)
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            com.tencent.mm.storage.u3 r6 = com.tencent.mm.storage.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_IS_CURFEW_CLOSE_BOOLEAN_SYNC
            boolean r1 = r1.o(r6, r2)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "checkTeemModeLimit: currentEnjoyFinderMs="
            r7.<init>(r8)
            r7.append(r4)
            java.lang.String r8 = " , hasCurFewClose="
            r7.append(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "FinderTeenModeLimitVM"
            com.tencent.mars.xlog.Log.i(r8, r7)
            boolean r7 = r0.R6()
            if (r7 == 0) goto L98
            long r6 = c01.id.c()
            gm0.b0 r9 = gm0.j1.u()
            com.tencent.mm.storage.n3 r9 = r9.c()
            com.tencent.mm.storage.u3 r10 = com.tencent.mm.storage.u3.USERINFO_FINDER_TEEN_MODE_ENJOY_CURFEW_CLOSE_TIME_LONG_SYNC
            long r9 = r9.t(r10, r6)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "checkTeemModeLimit: isInLimitTimeRange, currentTime="
            r11.<init>(r12)
            r11.append(r6)
            java.lang.String r12 = ", lastTime="
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.tencent.mars.xlog.Log.i(r8, r11)
            if (r1 == 0) goto L93
            long r6 = r6 - r9
            r8 = 57600000(0x36ee800, double:2.8458181E-316)
            int r1 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r1 < 0) goto La7
        L93:
            r0.S6(r3)
            r0 = r3
            goto Lba
        L98:
            if (r1 == 0) goto La7
            gm0.b0 r1 = gm0.j1.u()
            com.tencent.mm.storage.n3 r1 = r1.c()
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            r1.x(r6, r7)
        La7:
            hy2.g r1 = hy2.g.f286058a
            int r1 = r1.c()
            int r1 = r1 * 1000
            long r6 = (long) r1
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 < 0) goto Lb9
            r0.S6(r2)
            r0 = 2
            goto Lba
        Lb9:
            r0 = r2
        Lba:
            if (r0 == 0) goto Lfd
            r13.f286057f = r14
            android.content.Intent r14 = new android.content.Intent
            r14.<init>()
            if (r0 != r3) goto Lc6
            r2 = r3
        Lc6:
            java.lang.String r0 = "key_is_curfew"
            r14.putExtra(r0, r2)
            java.lang.String r0 = "key_finder_teen_mode_scene"
            int r1 = r13.f286057f
            r14.putExtra(r0, r1)
            androidx.appcompat.app.AppCompatActivity r0 = r13.getActivity()
            java.lang.Class<com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI> r1 = com.tencent.mm.plugin.finder.feed.ui.FinderTeenModeLimitUI.class
            r14.setClass(r0, r1)
            androidx.appcompat.app.AppCompatActivity r0 = r13.getActivity()
            java.lang.String r1 = "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity"
            kotlin.jvm.internal.o.e(r0, r1)
            androidx.activity.result.h r0 = r0.getActivityResultRegistry()
            h.f r1 = new h.f
            r1.<init>()
            hy2.d r2 = new hy2.d
            r2.<init>(r15)
            java.lang.String r15 = "FinderTeenModeFloatPageUIC"
            androidx.activity.result.c r15 = r0.e(r15, r1, r2)
            r0 = 0
            r15.a(r14, r0)
            goto L100
        Lfd:
            r15.invoke()
        L100:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: hy2.f.O6(int, yz5.a):void");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onActivityResult(int i17, int i18, android.content.Intent intent) {
        super.onActivityResult(i17, i18, intent);
        com.tencent.mars.xlog.Log.i("FinderTeenModeFloatPageUIC", "onActivityResult： requestCode=" + i17 + ", resultCode=" + i18 + ", activity=" + getActivity().getClass().getSimpleName());
        if (i17 == 11111) {
            if (i18 == -1) {
                jz2.x0.f302754a.b(getActivity());
                return;
            }
            if (i18 != 11112) {
                return;
            }
            if (this.f286057f != 7) {
                boolean z17 = getActivity().getIntent().getIntExtra("FROM_SCENE_KEY", 2) == 6;
                jz2.x0.f302754a.b(getActivity());
                if (!z17 && !(getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderShareFeedRelUI)) {
                    android.content.Intent intent2 = new android.content.Intent();
                    intent2.addFlags(67108864);
                    intent2.addFlags(268435456);
                    intent2.putExtra("preferred_tab", 2);
                    j45.l.u(getActivity(), ".ui.LauncherUI", intent2, null);
                }
            }
            if (!getActivity().isFinishing() && !getActivity().isDestroyed()) {
                if (getActivity() instanceof com.tencent.mm.plugin.finder.ui.FinderHomeAffinityUI) {
                    getActivity().finishAndRemoveTask();
                } else {
                    getActivity().finish();
                }
            }
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onPause() {
        super.onPause();
        this.f286055d = true;
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        this.f286055d = false;
        if (!((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode()) {
            android.view.View findViewById = findViewById(com.tencent.mm.R.id.nzs);
            if (findViewById != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(findViewById, arrayList.toArray(), "com/tencent/mm/plugin/finder/viewmodel/teenmode/FinderTeenModeFloatPageUIC", "checkTeenModeIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                findViewById.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(findViewById, "com/tencent/mm/plugin/finder/viewmodel/teenmode/FinderTeenModeFloatPageUIC", "checkTeenModeIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            android.view.View findViewById2 = findViewById(com.tencent.mm.R.id.kw8);
            if (findViewById2 == null) {
                return;
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/viewmodel/teenmode/FinderTeenModeFloatPageUIC", "checkTeenModeIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/viewmodel/teenmode/FinderTeenModeFloatPageUIC", "checkTeenModeIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            return;
        }
        android.view.View findViewById3 = findViewById(com.tencent.mm.R.id.nzs);
        if (findViewById3 != null) {
            java.util.ArrayList arrayList3 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal3 = zj0.c.f473285a;
            arrayList3.add(0);
            java.util.Collections.reverse(arrayList3);
            yj0.a.d(findViewById3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/viewmodel/teenmode/FinderTeenModeFloatPageUIC", "checkTeenModeIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
            yj0.a.f(findViewById3, "com/tencent/mm/plugin/finder/viewmodel/teenmode/FinderTeenModeFloatPageUIC", "checkTeenModeIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById3.setOnClickListener(new hy2.b(this));
            cy1.a aVar = (cy1.a) ((dy1.r) i95.n0.c(dy1.r.class));
            aVar.pk(findViewById3, "teen_mode_umbrella");
            ((cy1.a) aVar.ik(findViewById3, 8, 25496)).Ai(findViewById3, new hy2.c(this));
        }
        android.view.View findViewById4 = findViewById(com.tencent.mm.R.id.kw8);
        if (findViewById4 == null) {
            return;
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal4 = zj0.c.f473285a;
        arrayList4.add(0);
        java.util.Collections.reverse(arrayList4);
        yj0.a.d(findViewById4, arrayList4.toArray(), "com/tencent/mm/plugin/finder/viewmodel/teenmode/FinderTeenModeFloatPageUIC", "checkTeenModeIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        findViewById4.setVisibility(((java.lang.Integer) arrayList4.get(0)).intValue());
        yj0.a.f(findViewById4, "com/tencent/mm/plugin/finder/viewmodel/teenmode/FinderTeenModeFloatPageUIC", "checkTeenModeIcon", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStart() {
        super.onStart();
        com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM finderTeenModeLimitVM = (com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM.class);
        hy2.e listener = this.f286056e;
        finderTeenModeLimitVM.getClass();
        kotlin.jvm.internal.o.g(listener, "listener");
        synchronized (finderTeenModeLimitVM.f136732f) {
            finderTeenModeLimitVM.f136732f.add(listener);
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onStop() {
        super.onStop();
        com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM finderTeenModeLimitVM = (com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM) pf5.u.f353936a.e(c61.l7.class).a(com.tencent.mm.plugin.finder.viewmodel.teenmode.FinderTeenModeLimitVM.class);
        hy2.e listener = this.f286056e;
        finderTeenModeLimitVM.getClass();
        kotlin.jvm.internal.o.g(listener, "listener");
        synchronized (finderTeenModeLimitVM.f136732f) {
            finderTeenModeLimitVM.f136732f.remove(listener);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.fragment.app.Fragment fragment) {
        super(fragment);
        kotlin.jvm.internal.o.g(fragment, "fragment");
        this.f286056e = new hy2.e(this);
        this.f286057f = -1;
    }
}
