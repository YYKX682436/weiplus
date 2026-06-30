package df2;

/* loaded from: classes3.dex */
public final class l4 extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public int f230629m;

    /* renamed from: n, reason: collision with root package name */
    public int f230630n;

    /* renamed from: o, reason: collision with root package name */
    public int f230631o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f230632p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.b4 f230633q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f230634r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l4(com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore store) {
        super(store);
        kotlin.jvm.internal.o.g(store, "store");
        this.f230629m = -1;
        this.f230630n = -1;
        this.f230631o = -1;
    }

    @Override // androidx.lifecycle.c1
    public void onCleared() {
        super.onCleared();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveSlideToCloseGuideController", "onCleared");
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveDeactivate() {
        super.onLiveDeactivate();
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveSlideToCloseGuideController", "onLiveDeactivate!");
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLivePause() {
        super.onLivePause();
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f230632p;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f230633q;
        if (b4Var2 != null) {
            b4Var2.d();
        }
        pm0.v.X(new df2.e4(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onLiveStart(r45.hc1 hc1Var) {
        r45.ic1 ic1Var;
        super.onLiveStart(hc1Var);
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f230632p;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f230633q;
        if (b4Var2 != null) {
            b4Var2.d();
        }
        com.tencent.mm.ui.MMActivity N6 = N6();
        if (N6 == null) {
            com.tencent.mars.xlog.Log.e("Finder.FinderLiveSlideToCloseGuideController", "hostActivity is null");
            return;
        }
        boolean z17 = true;
        boolean booleanExtra = N6.getIntent().getBooleanExtra("KEY_ENTER_LIVE_BACK_NEED_MINI_WINDOW", true);
        com.tencent.mars.xlog.Log.i("SlideToCloseLiveHelper", "curLiveRoomSwipeToClosed backNeedMiniWindow=" + booleanExtra);
        boolean z18 = booleanExtra ^ true;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveSlideToCloseGuideController", "onLiveStart swipeToClosed=" + z18);
        if (z18) {
            java.lang.String str = null;
            r45.s94 s94Var = (hc1Var == null || (ic1Var = (r45.ic1) hc1Var.getCustom(85)) == null) ? null : (r45.s94) ic1Var.getCustom(16);
            boolean o17 = gm0.j1.u().c().o(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_SLIDE_TO_CLOSE_FUN_USED_BOOLEAN_SYNC, false);
            ae2.in inVar = ae2.in.f3688a;
            boolean z19 = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.in.C7).getValue()).r()).intValue() == 1;
            boolean g86 = ((mm2.c1) business(mm2.c1.class)).g8();
            boolean O6 = ((mm2.h7) business(mm2.h7.class)).O6();
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onLiveStart usedSwipeFun=");
            sb6.append(o17);
            sb6.append(" slideToCloseFunEnable=");
            sb6.append(z19);
            sb6.append(" isMultiStream=");
            sb6.append(O6);
            sb6.append(" isVrLive=");
            sb6.append(g86);
            sb6.append(' ');
            if (s94Var != null) {
                str = "tipTimes=" + s94Var.getInteger(1) + " enterLiveTimeSecond=" + s94Var.getInteger(0) + " days_between_tip=" + s94Var.getInteger(2);
            }
            sb6.append(str);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveSlideToCloseGuideController", sb6.toString());
            if (!z19 || o17 || g86 || O6) {
                return;
            }
            com.tencent.mm.storage.n3 c17 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_SLIDE_TO_CLOSE_TIP_LIMIT_TIMES_INT_SYNC;
            this.f230629m = c17.r(u3Var, -1);
            com.tencent.mm.storage.n3 c18 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var2 = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_SLIDE_TO_CLOSE_TIP_ENTER_LIVE_SECOND_INT_SYNC;
            this.f230630n = c18.r(u3Var2, -1);
            com.tencent.mm.storage.n3 c19 = gm0.j1.u().c();
            com.tencent.mm.storage.u3 u3Var3 = com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_SLIDE_TO_CLOSE_TIP_INTERVAL_DAYS_BETWEEN_TIP_INT_SYNC;
            this.f230631o = c19.r(u3Var3, -1);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveSlideToCloseGuideController", "tryToUpdateConfig old maxLimitTimes=" + this.f230629m + " enterLiveSecondCanTip=" + this.f230630n + " tipIntervalDays=" + this.f230631o);
            if (!(s94Var != null && s94Var.getInteger(1) == this.f230629m)) {
                this.f230629m = s94Var != null ? s94Var.getInteger(1) : -1;
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveSlideToCloseGuideController", "Update maxLimitTimes=" + this.f230629m);
                gm0.j1.u().c().x(u3Var, java.lang.Integer.valueOf(this.f230629m));
            }
            if (!(s94Var != null && s94Var.getInteger(0) == this.f230630n)) {
                this.f230630n = s94Var != null ? s94Var.getInteger(0) : -1;
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveSlideToCloseGuideController", "Update enterLiveSecondCanTip=" + this.f230630n);
                gm0.j1.u().c().x(u3Var2, java.lang.Integer.valueOf(this.f230630n));
            }
            if (!(s94Var != null && s94Var.getInteger(2) == this.f230631o)) {
                this.f230631o = s94Var != null ? s94Var.getInteger(2) : -1;
                com.tencent.mars.xlog.Log.i("Finder.FinderLiveSlideToCloseGuideController", "Update tipIntervalDays=" + this.f230631o);
                gm0.j1.u().c().x(u3Var3, java.lang.Integer.valueOf(this.f230631o));
            }
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveSlideToCloseGuideController", "tryToUpdateConfig new maxLimitTimes=" + this.f230629m + " enterLiveSecondCanTip=" + this.f230630n + " tipIntervalDays=" + this.f230631o);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveSlideToCloseGuideController", "tryToStartGuideTimer");
            if (this.f230629m <= 0 || this.f230630n <= 0 || this.f230631o <= 0) {
                com.tencent.mars.xlog.Log.w("Finder.FinderLiveSlideToCloseGuideController", "tryToStartGuideTimer configParamsInvalid");
                return;
            }
            int r17 = gm0.j1.u().c().r(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_SLIDE_TO_CLOSE_TIP_SHOWN_TIMES_INT_SYNC, 0);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveSlideToCloseGuideController", "limitOfTimes shownTimes=" + r17 + " maxLimitTimes=" + this.f230629m);
            if (r17 >= this.f230629m) {
                com.tencent.mars.xlog.Log.w("Finder.FinderLiveSlideToCloseGuideController", "tryToStartGuideTimer limitOfTimes");
                return;
            }
            long currentTimeMillis = java.lang.System.currentTimeMillis() - gm0.j1.u().c().t(com.tencent.mm.storage.u3.USERINFO_FINDER_LIVE_SLIDE_TO_CLOSE_TIP_LAST_SHOWN_MS_LONG_SYNC, 0L);
            if (currentTimeMillis > this.f230631o * 86400000 && currentTimeMillis >= 1800000) {
                z17 = false;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.w("Finder.FinderLiveSlideToCloseGuideController", "tryToStartGuideTimer tipIntervalNotMet");
                return;
            }
            com.tencent.mm.sdk.platformtools.b4 b4Var3 = this.f230632p;
            if (b4Var3 != null) {
                b4Var3.d();
            }
            int i17 = this.f230630n;
            df2.k4 k4Var = new df2.k4(this);
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveSlideToCloseGuideController", "startShowGuideTimer delaySecond=" + i17);
            com.tencent.mm.sdk.platformtools.b4 b4Var4 = new com.tencent.mm.sdk.platformtools.b4("ShownSlideToClose::Timer", (com.tencent.mm.sdk.platformtools.a4) new df2.j4(k4Var), false);
            long j17 = ((long) i17) * 1000;
            b4Var4.c(j17, j17);
            this.f230632p = b4Var4;
        }
    }

    @Override // com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewMount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        super.onViewMount(pluginLayout);
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveSlideToCloseGuideController", "onViewMount");
    }

    @Override // if2.b, com.tencent.mm.plugin.finder.live.controller.base.LiveRoomController
    public void onViewUnmount(android.view.ViewGroup pluginLayout) {
        kotlin.jvm.internal.o.g(pluginLayout, "pluginLayout");
        this.f291103i = null;
        com.tencent.mm.sdk.platformtools.b4 b4Var = this.f230632p;
        if (b4Var != null) {
            b4Var.d();
        }
        com.tencent.mm.sdk.platformtools.b4 b4Var2 = this.f230633q;
        if (b4Var2 != null) {
            b4Var2.d();
        }
        pm0.v.X(new df2.e4(this));
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveSlideToCloseGuideController", "onViewUnmount");
    }
}
