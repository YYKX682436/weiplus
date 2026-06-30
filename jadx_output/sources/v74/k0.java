package v74;

/* loaded from: classes4.dex */
public final class k0 {
    public static final v74.r E = new v74.r(null);
    public final v74.z A;
    public final yz5.a B;
    public final yz5.a C;
    public final yz5.l D;

    /* renamed from: a */
    public final int f433835a;

    /* renamed from: b */
    public com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView f433836b;

    /* renamed from: c */
    public android.app.Activity f433837c;

    /* renamed from: d */
    public com.tencent.mm.plugin.sns.storage.SnsInfo f433838d;

    /* renamed from: e */
    public w64.n f433839e;

    /* renamed from: f */
    public v74.u f433840f;

    /* renamed from: g */
    public final v74.v0 f433841g;

    /* renamed from: h */
    public final v74.z0 f433842h;

    /* renamed from: i */
    public boolean f433843i;

    /* renamed from: j */
    public final android.os.Handler f433844j;

    /* renamed from: k */
    public boolean f433845k;

    /* renamed from: l */
    public final boolean f433846l;

    /* renamed from: m */
    public final jz5.g f433847m;

    /* renamed from: n */
    public final jz5.g f433848n;

    /* renamed from: o */
    public v74.s0 f433849o;

    /* renamed from: p */
    public int f433850p;

    /* renamed from: q */
    public int f433851q;

    /* renamed from: r */
    public v74.t f433852r;

    /* renamed from: s */
    public v74.s f433853s;

    /* renamed from: t */
    public v74.h1 f433854t;

    /* renamed from: u */
    public int f433855u;

    /* renamed from: v */
    public final v74.d0 f433856v;

    /* renamed from: w */
    public final android.graphics.Rect f433857w;

    /* renamed from: x */
    public boolean f433858x;

    /* renamed from: y */
    public final v74.b0 f433859y;

    /* renamed from: z */
    public final v74.y f433860z;

    public k0(int i17) {
        this.f433835a = i17;
        v74.v0 v0Var = new v74.v0(i17);
        this.f433841g = v0Var;
        this.f433842h = new v74.z0(v0Var);
        boolean z17 = true;
        this.f433843i = true;
        this.f433844j = new android.os.Handler(android.os.Looper.getMainLooper());
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isSmoothMode", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        boolean z18 = false;
        try {
            if (((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ad_lookbook_smooth_mode, 1) <= 0) {
                z17 = false;
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSmoothMode", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            z18 = z17;
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.e("AdLookbookLogic", "isSmoothMode, exp=" + th6);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isSmoothMode", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        }
        this.f433846l = z18;
        this.f433847m = jz5.h.b(new v74.x(this));
        this.f433848n = jz5.h.b(new v74.w(this));
        this.f433851q = 3;
        this.f433856v = new v74.d0(this);
        this.f433857w = new android.graphics.Rect();
        this.f433859y = new v74.b0(this);
        this.f433860z = new v74.y(this);
        this.A = new v74.z(this);
        this.B = new v74.e0(this);
        this.C = new v74.g0(this);
        this.D = new v74.h0(this);
    }

    public static final /* synthetic */ v74.v0 a(v74.k0 k0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMAdLookbookStatistic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        v74.v0 v0Var = k0Var.f433841g;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMAdLookbookStatistic$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        return v0Var;
    }

    public static final /* synthetic */ boolean b(v74.k0 k0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMIsPausedVideoPlay$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        boolean z17 = k0Var.f433843i;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMIsPausedVideoPlay$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        return z17;
    }

    public static final int c(v74.k0 k0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMMinTriggerDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        k0Var.getClass();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMMinTriggerDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        int intValue = ((java.lang.Number) ((jz5.n) k0Var.f433847m).getValue()).intValue();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMMinTriggerDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMMinTriggerDistance", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        return intValue;
    }

    public static final /* synthetic */ com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView d(v74.k0 k0Var) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("access$getMRecyclerView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView overScrollRecyclerView = k0Var.f433836b;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("access$getMRecyclerView$p", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        return overScrollRecyclerView;
    }

    public final boolean e() {
        com.tencent.mm.plugin.sns.storage.ADXml adXml;
        v74.m mVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("isShowCharmImage", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = this.f433838d;
        java.lang.String b17 = (snsInfo == null || (adXml = snsInfo.getAdXml()) == null || (mVar = adXml.adLookbookInfo) == null) ? null : mVar.b();
        boolean z17 = !(b17 == null || b17.length() == 0);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("isShowCharmImage", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        return z17;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0269  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0129 A[Catch: Exception -> 0x012f, TRY_LEAVE, TryCatch #0 {Exception -> 0x012f, blocks: (B:21:0x00ac, B:23:0x00b0, B:24:0x00b6, B:26:0x00ba, B:29:0x00c1, B:31:0x00c9, B:32:0x00cf, B:35:0x00ea, B:37:0x00ed, B:39:0x00f1, B:40:0x00f7, B:42:0x00fb, B:44:0x0101, B:45:0x0107, B:48:0x0112, B:49:0x0118, B:51:0x011c, B:56:0x0129, B:59:0x0122), top: B:20:0x00ac }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.k0.f():void");
    }

    public final void g(v74.t lookbookContext, w64.n nVar, v74.u uVar) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        kotlin.jvm.internal.o.g(lookbookContext, "lookbookContext");
        if (lookbookContext.b() == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            return;
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        android.app.Activity activity = lookbookContext.f433912a;
        if (activity == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            return;
        }
        this.f433852r = lookbookContext;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getActivity", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic$LookbookContext");
        this.f433837c = activity;
        this.f433836b = lookbookContext.b();
        this.f433839e = nVar;
        this.f433840f = uVar;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("initPlayNumConfig", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.c0.clicfg_ad_lookbook_max_play_video_num, 3);
            this.f433851q = java.lang.Math.max(Ni, 1);
            com.tencent.mars.xlog.Log.i("AdLookbookLogic", "initPlayNumConfig, cfg=" + Ni + ", maxPlayVideoNum=" + this.f433851q);
            kotlin.Result.m521constructorimpl(jz5.f0.f302826a);
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("initPlayNumConfig", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView overScrollRecyclerView = this.f433836b;
        if (overScrollRecyclerView != null) {
            overScrollRecyclerView.setOverScrollMode(2);
            overScrollRecyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(this.f433837c, 0, false));
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("getMItemSpace", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            int intValue = ((java.lang.Number) ((jz5.n) this.f433848n).getValue()).intValue();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("getMItemSpace", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            overScrollRecyclerView.N(new v74.a(intValue));
            overScrollRecyclerView.i(this.f433856v);
            overScrollRecyclerView.O(this.f433860z);
            overScrollRecyclerView.setHasFixedSize(true);
            overScrollRecyclerView.setMaxOverScrollDistance(i65.a.b(this.f433837c, 64) * 2);
            overScrollRecyclerView.setOnOverScrollActionListener(this.f433859y);
            if (this.f433846l) {
                overScrollRecyclerView.setItemViewCacheSize(7);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onCreate", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
    }

    public final boolean h(android.view.View view, int i17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView overScrollRecyclerView = this.f433836b;
        androidx.recyclerview.widget.f2 adapter = overScrollRecyclerView != null ? overScrollRecyclerView.getAdapter() : null;
        v74.g gVar = adapter instanceof v74.g ? (v74.g) adapter : null;
        int i18 = i17 == -1 ? 0 : i17;
        v74.q x17 = gVar != null ? gVar.x(i18) : null;
        w64.n nVar = this.f433839e;
        if ((x17 != null ? x17.a() : null) == null || this.f433838d == null || nVar == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            return false;
        }
        com.tencent.mars.xlog.Log.i("AdLookbookLogic", "onItemClick, handleClick, pos=" + i17 + ", realPos=" + i18);
        v74.f0 f0Var = new v74.f0(this, view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setCardAnimPrepareListener", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        nVar.f443319l = f0Var;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setCardAnimPrepareListener", "com.tencent.mm.plugin.sns.ad.timeline.clicker.actionbutton.AdClickActionHandler");
        int i19 = ca4.m0.Y(this.f433838d) ? 1 : 2;
        com.tencent.mm.plugin.sns.ad.adxml.AdClickActionInfo a17 = x17.a();
        if (a17 != null) {
            if (i17 == -1) {
                a17.f162569a = 27;
            } else {
                a17.f162569a = 19;
            }
        }
        nVar.p(new w64.c(x17.a(), this.f433838d, i18, null, false, i19, false, null, 216, null));
        nVar.k(view);
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemClick", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0338  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void i(com.tencent.mm.plugin.sns.storage.SnsInfo r24, v74.s r25, int r26, boolean r27) {
        /*
            Method dump skipped, instructions count: 947
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.k0.i(com.tencent.mm.plugin.sns.storage.SnsInfo, v74.s, int, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.k0.j():void");
    }

    public final void k() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        com.tencent.mars.xlog.Log.i("AdLookbookLogic", "onUIDestroy");
        this.f433845k = true;
        this.f433843i = true;
        this.f433844j.removeCallbacksAndMessages(null);
        this.f433842h.c();
        v74.s0 s0Var = this.f433849o;
        if (s0Var != null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
            com.tencent.mars.xlog.Log.i("AdLookbookPagAnimLogic", "onUIDestroy");
            s0Var.f433903m.removeCallbacksAndMessages(null);
            s0Var.b();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookPagAnimLogic");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onUIDestroy", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0063, code lost:
    
        if (r8.c() == true) goto L67;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(boolean r11) {
        /*
            r10 = this;
            java.lang.String r0 = "pauseAllPlay"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            android.os.Handler r2 = r10.f433844j
            r3 = 0
            r2.removeCallbacksAndMessages(r3)
            com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView r2 = r10.f433836b
            if (r2 == 0) goto L17
            androidx.recyclerview.widget.f2 r2 = r2.getAdapter()
            goto L18
        L17:
            r2 = r3
        L18:
            boolean r4 = r2 instanceof v74.g
            if (r4 == 0) goto L1f
            v74.g r2 = (v74.g) r2
            goto L20
        L1f:
            r2 = r3
        L20:
            if (r2 == 0) goto L7a
            int r4 = r2.getItemCount()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "pauseAllPlay, count="
            r5.<init>(r6)
            r5.append(r4)
            java.lang.String r6 = ", showIcon="
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "AdLookbookLogic"
            com.tencent.mars.xlog.Log.i(r6, r5)
            r5 = 0
            r6 = r5
        L44:
            if (r6 >= r4) goto L6f
            com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView r7 = r10.f433836b
            if (r7 == 0) goto L4f
            androidx.recyclerview.widget.k3 r7 = r7.p0(r6)
            goto L50
        L4f:
            r7 = r3
        L50:
            boolean r8 = r7 instanceof v74.b
            if (r8 == 0) goto L57
            v74.b r7 = (v74.b) r7
            goto L58
        L57:
            r7 = r3
        L58:
            v74.q r8 = r2.x(r6)
            if (r8 == 0) goto L66
            boolean r8 = r8.c()
            r9 = 1
            if (r8 != r9) goto L66
            goto L67
        L66:
            r9 = r5
        L67:
            if (r9 == 0) goto L6c
            r10.m(r6, r7, r11)
        L6c:
            int r6 = r6 + 1
            goto L44
        L6f:
            v74.h1 r11 = r10.f433854t
            if (r11 == 0) goto L76
            r11.c()
        L76:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        L7a:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.k0.l(boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(int r8, v74.b r9, boolean r10) {
        /*
            r7 = this;
            java.lang.String r0 = "pauseVideo"
            java.lang.String r1 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r0, r1)
            r2 = 0
            if (r9 == 0) goto L10
            android.widget.FrameLayout r3 = r9.i()
            goto L11
        L10:
            r3 = r2
        L11:
            java.lang.String r4 = "getVideoViewInContainer"
            java.lang.String r5 = "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookVideoManager$Companion"
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs(r4, r5)
            boolean r6 = a84.y0.e(r3)
            if (r6 == 0) goto L31
            if (r3 == 0) goto L26
            r6 = 0
            android.view.View r3 = r3.getChildAt(r6)
            goto L27
        L26:
            r3 = r2
        L27:
            boolean r6 = r3 instanceof com.tencent.mm.plugin.sns.ui.OnlineVideoView
            if (r6 == 0) goto L31
            com.tencent.mm.plugin.sns.ui.OnlineVideoView r3 = (com.tencent.mm.plugin.sns.ui.OnlineVideoView) r3
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            goto L35
        L31:
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r4, r5)
            r3 = r2
        L35:
            if (r3 == 0) goto L3a
            r3.F()
        L3a:
            if (r9 == 0) goto L41
            android.widget.ImageView r9 = r9.j()
            goto L42
        L41:
            r9 = r2
        L42:
            r7.n(r9, r10)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r4 = "pauseVideo, pos="
            r9.<init>(r4)
            r9.append(r8)
            java.lang.String r8 = ", isPlaying="
            r9.append(r8)
            if (r3 == 0) goto L5f
            boolean r8 = r3.w()
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r8)
        L5f:
            r9.append(r2)
            java.lang.String r8 = ", showPauseIcon="
            r9.append(r8)
            r9.append(r10)
            java.lang.String r8 = r9.toString()
            java.lang.String r9 = "AdLookbookLogic"
            com.tencent.mars.xlog.Log.i(r9, r8)
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: v74.k0.m(int, v74.b, boolean):void");
    }

    public final void n(android.view.View view, boolean z17) {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("setVideoStatusIconVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        if (view == null) {
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoStatusIconVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            return;
        }
        if (z17) {
            if (view.getVisibility() != 0) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookLogic", "setVideoStatusIconVisibility", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookLogic", "setVideoStatusIconVisibility", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (view.getVisibility() == 0) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
            arrayList2.add(4);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookLogic", "setVideoStatusIconVisibility", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/item/lookbookcard/AdLookbookLogic", "setVideoStatusIconVisibility", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("setVideoStatusIconVisibility", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
    }

    public final void o() {
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        this.f433843i = false;
        v74.h1 h1Var = this.f433854t;
        if (h1Var != null && h1Var.b()) {
            v74.h1 h1Var2 = this.f433854t;
            if (h1Var2 != null) {
                com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                v74.l lVar = h1Var2.f433815o;
                if (lVar == null) {
                    com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                } else {
                    com.tencent.mm.plugin.sns.storage.SnsInfo snsInfo = h1Var2.f433814n;
                    if (snsInfo == null) {
                        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                    } else {
                        android.view.ViewGroup viewGroup = h1Var2.f433805e;
                        if (viewGroup == null) {
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                        } else {
                            com.tencent.mars.xlog.Log.i("SplashCardLogic", "startPlay");
                            l44.c0.b(snsInfo, lVar.a());
                            v74.z0 z0Var = h1Var2.f433802b;
                            if (z0Var != null) {
                                z0Var.a(-1, viewGroup, snsInfo, lVar.a(), true);
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("startVideoUpdateTimer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                            com.tencent.mars.xlog.Log.i("SplashCardLogic", "startVideoUpdateTimer");
                            h1Var2.f433818r.c(200L, 200L);
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startVideoUpdateTimer", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                            android.widget.ImageView imageView = h1Var2.f433807g;
                            if (imageView != null) {
                                imageView.setVisibility(4);
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.SplashCardLogic");
                        }
                    }
                }
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("hideVideoStatusIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            try {
                com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView overScrollRecyclerView = this.f433836b;
                androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = overScrollRecyclerView != null ? overScrollRecyclerView.getLayoutManager() : null;
                androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
                int w17 = linearLayoutManager != null ? linearLayoutManager.w() : -1;
                int y17 = linearLayoutManager != null ? linearLayoutManager.y() : -1;
                com.tencent.mars.xlog.Log.i("AdLookbookLogic", "hideVideoStatusIcon, firstPos=" + w17 + ", lastPos=" + y17);
                if (w17 != -1 && y17 != -1) {
                    int i17 = y17 + 1;
                    while (w17 < i17) {
                        com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView overScrollRecyclerView2 = this.f433836b;
                        androidx.recyclerview.widget.k3 p07 = overScrollRecyclerView2 != null ? overScrollRecyclerView2.p0(w17) : null;
                        v74.b bVar = p07 instanceof v74.b ? (v74.b) p07 : null;
                        n(bVar != null ? bVar.j() : null, false);
                        w17++;
                    }
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("AdLookbookLogic", "hideVideoStatusIcon, exp=" + e17);
            }
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("hideVideoStatusIcon", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        } else {
            p();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerPlayThemePag", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            this.f433844j.postDelayed(new v74.i0(this), 150L);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerPlayThemePag", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView overScrollRecyclerView3 = this.f433836b;
            if (overScrollRecyclerView3 != null) {
                overScrollRecyclerView3.setActive(true);
            }
        }
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("startPlayByTimeline", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
    }

    public final void p() {
        java.util.Set set;
        android.graphics.Rect rect;
        int i17;
        int i18;
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("triggerVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
        android.app.Activity activity = this.f433837c;
        if (activity != null && activity.isFinishing()) {
            com.tencent.mars.xlog.Log.e("AdLookbookLogic", "play video when activity destroyed");
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
            return;
        }
        java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView overScrollRecyclerView = this.f433836b;
        androidx.recyclerview.widget.RecyclerView.LayoutManager layoutManager = overScrollRecyclerView != null ? overScrollRecyclerView.getLayoutManager() : null;
        androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager = layoutManager instanceof androidx.recyclerview.widget.LinearLayoutManager ? (androidx.recyclerview.widget.LinearLayoutManager) layoutManager : null;
        int w17 = linearLayoutManager != null ? linearLayoutManager.w() : -1;
        int y17 = linearLayoutManager != null ? linearLayoutManager.y() : -1;
        com.tencent.mars.xlog.Log.i("AdLookbookLogic", "triggerVideoPlay, firstPos=" + w17 + ", lastPos=" + y17);
        if (w17 != -1 && y17 != -1) {
            android.graphics.Rect rect2 = new android.graphics.Rect();
            java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            int i19 = y17 + 1;
            while (w17 < i19) {
                com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView overScrollRecyclerView2 = this.f433836b;
                androidx.recyclerview.widget.k3 p07 = overScrollRecyclerView2 != null ? overScrollRecyclerView2.p0(w17) : null;
                v74.b bVar = p07 instanceof v74.b ? (v74.b) p07 : null;
                com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView overScrollRecyclerView3 = this.f433836b;
                androidx.recyclerview.widget.f2 adapter = overScrollRecyclerView3 != null ? overScrollRecyclerView3.getAdapter() : null;
                v74.g gVar = adapter instanceof v74.g ? (v74.g) adapter : null;
                v74.q x17 = gVar != null ? gVar.x(w17) : null;
                if (x17 != null) {
                    linkedHashSet.add(java.lang.Integer.valueOf(w17));
                }
                if (x17 != null && x17.c()) {
                    if ((bVar != null ? bVar.i() : null) != null) {
                        bVar.itemView.getLocalVisibleRect(rect2);
                        float width = (bVar.itemView.getWidth() <= 0 || (i17 = rect2.left) < 0 || (i18 = rect2.right) < 0) ? 0.0f : (i18 - i17) / bVar.itemView.getWidth();
                        com.tencent.mars.xlog.Log.i("AdLookbookLogic", "checkPlayVideo, pos=" + w17 + ", isPausedVideoPlay=" + this.f433843i + ", visibleRatio=" + width + ", rect=" + rect2);
                        boolean z17 = this.f433843i;
                        rect = rect2;
                        if (z17 || width < 0.5d) {
                            m(w17, bVar, z17);
                        } else {
                            arrayList.add(new jz5.l(java.lang.Integer.valueOf(w17), java.lang.Float.valueOf(width)));
                        }
                        w17++;
                        rect2 = rect;
                    }
                }
                rect = rect2;
                w17++;
                rect2 = rect;
            }
            if (arrayList.size() > 1) {
                kz5.g0.t(arrayList, new v74.j0());
            }
            java.util.Iterator it = arrayList.iterator();
            int i27 = 0;
            while (it.hasNext()) {
                int intValue = ((java.lang.Number) ((jz5.l) it.next()).f302833d).intValue();
                com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView overScrollRecyclerView4 = this.f433836b;
                androidx.recyclerview.widget.k3 p08 = overScrollRecyclerView4 != null ? overScrollRecyclerView4.p0(intValue) : null;
                v74.b bVar2 = p08 instanceof v74.b ? (v74.b) p08 : null;
                if ((bVar2 != null ? bVar2.i() : null) != null) {
                    com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.OverScrollRecyclerView overScrollRecyclerView5 = this.f433836b;
                    androidx.recyclerview.widget.f2 adapter2 = overScrollRecyclerView5 != null ? overScrollRecyclerView5.getAdapter() : null;
                    v74.g gVar2 = adapter2 instanceof v74.g ? (v74.g) adapter2 : null;
                    v74.q x18 = gVar2 != null ? gVar2.x(intValue) : null;
                    if (x18 != null && x18.c()) {
                        if (i27 < this.f433851q) {
                            java.lang.System.currentTimeMillis();
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("playVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
                            if ((x18 != null ? x18.b() : null) != null) {
                                com.tencent.mars.xlog.Log.i("AdLookbookLogic", "playVideo, pos=" + intValue);
                                l44.c0.b(this.f433838d, x18.b());
                                v74.z0 z0Var = this.f433842h;
                                if (z0Var != null) {
                                    z0Var.a(intValue, bVar2.i(), this.f433838d, x18.b(), true);
                                }
                                n(bVar2 != null ? bVar2.j() : null, false);
                                if (this.f433846l) {
                                    E.f(bVar2);
                                }
                            } else {
                                com.tencent.mars.xlog.Log.e("AdLookbookLogic", "playVideo, media==null, pos=" + intValue);
                            }
                            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("playVideo", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
                            i27++;
                            java.lang.System.currentTimeMillis();
                        } else {
                            m(intValue, bVar2, this.f433843i);
                        }
                    }
                }
            }
            v74.v0 v0Var = this.f433841g;
            v0Var.getClass();
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markStartTimeMs("onItemVisibleCheck", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
            java.util.Iterator it6 = linkedHashSet.iterator();
            while (true) {
                boolean hasNext = it6.hasNext();
                set = v0Var.f433934d;
                if (!hasNext) {
                    break;
                }
                int intValue2 = ((java.lang.Number) it6.next()).intValue();
                if (!set.contains(java.lang.Integer.valueOf(intValue2))) {
                    v0Var.h(intValue2);
                    set.add(java.lang.Integer.valueOf(intValue2));
                }
            }
            set.retainAll(linkedHashSet);
            com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("onItemVisibleCheck", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookStatistic");
        }
        java.lang.System.currentTimeMillis();
        com.tencent.mm.plugin.sns.ui.monitor.SnsMethodCalculate.markEndTimeMs("triggerVideoPlay", "com.tencent.mm.plugin.sns.ad.timeline.item.lookbookcard.AdLookbookLogic");
    }
}
