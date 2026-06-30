package wj2;

/* loaded from: classes10.dex */
public abstract class w extends lj2.j implements db5.t4, lj2.u0 {
    public final android.os.Handler A;
    public java.lang.Runnable B;
    public int C;
    public int D;
    public int E;
    public final jz5.g F;
    public final java.util.HashMap G;
    public android.view.View H;
    public boolean I;

    /* renamed from: i, reason: collision with root package name */
    public final lj2.v0 f446719i;

    /* renamed from: m, reason: collision with root package name */
    public final lj2.x0 f446720m;

    /* renamed from: n, reason: collision with root package name */
    public final int f446721n;

    /* renamed from: o, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f446722o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.k0 f446723p;

    /* renamed from: q, reason: collision with root package name */
    public yz5.l f446724q;

    /* renamed from: r, reason: collision with root package name */
    public int f446725r;

    /* renamed from: s, reason: collision with root package name */
    public final wj2.k0 f446726s;

    /* renamed from: t, reason: collision with root package name */
    public final long f446727t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f446728u;

    /* renamed from: v, reason: collision with root package name */
    public android.view.MotionEvent f446729v;

    /* renamed from: w, reason: collision with root package name */
    public android.view.MotionEvent f446730w;

    /* renamed from: x, reason: collision with root package name */
    public int f446731x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f446732y;

    /* renamed from: z, reason: collision with root package name */
    public final java.lang.Runnable f446733z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service, int i17) {
        super(context);
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(pluginAbility, "pluginAbility");
        kotlin.jvm.internal.o.g(service, "service");
        this.f446719i = pluginAbility;
        this.f446720m = service;
        this.f446721n = i17;
        this.f446725r = 1;
        this.f446727t = 300L;
        this.f446733z = new wj2.r(this);
        this.A = new android.os.Handler(android.os.Looper.getMainLooper());
        this.C = 3;
        this.F = jz5.h.b(new wj2.i(this));
        this.G = new java.util.HashMap();
        if (context instanceof com.tencent.mm.plugin.finder.feed.ui.FinderLiveVisitorWithoutAffinityUI) {
            wj2.k0 k0Var = new wj2.k0();
            this.f446726s = k0Var;
            k0Var.b(this);
        }
    }

    public static void Q(wj2.w wVar, android.view.View view, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setTouchDelegateGroup");
        }
        if ((i18 & 2) != 0) {
            i17 = -1;
        }
        wVar.getClass();
        kotlin.jvm.internal.o.g(view, "view");
        if (i17 < 0) {
            i17 = com.tencent.mm.sdk.platformtools.x2.f193071a.getResources().getDimensionPixelOffset(com.tencent.mm.R.dimen.f479714d7);
        }
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.View view2 = wVar.H;
        if (view2 != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            int i19 = iArr[0];
            int i27 = iArr[1];
            int[] iArr2 = new int[2];
            view2.getLocationOnScreen(iArr2);
            int i28 = iArr2[0];
            int i29 = iArr2[1];
            int i37 = i19 - i28;
            rect.left = i37;
            rect.top = i27 - i29;
            rect.right = i37 + view.getWidth();
            rect.bottom = rect.top + view.getHeight();
        }
        if (rect.width() == 0 || rect.height() == 0) {
            com.tencent.mars.xlog.Log.w(wVar.getTAG(), "setTouchDelegateGroup rect is empty");
            return;
        }
        int i38 = -i17;
        rect.inset(i38, i38);
        long hashCode = view.hashCode();
        java.util.HashMap hashMap = wVar.G;
        com.tencent.mm.ui.yj yjVar = (com.tencent.mm.ui.yj) hashMap.get(java.lang.Long.valueOf(hashCode));
        com.tencent.mm.ui.xj mTouchDelegateGroup = wVar.getMTouchDelegateGroup();
        java.util.ArrayList arrayList = mTouchDelegateGroup.f212566a;
        if (arrayList != null) {
            arrayList.remove(yjVar);
            if (mTouchDelegateGroup.f212566a.isEmpty()) {
                mTouchDelegateGroup.f212566a = null;
            }
        }
        com.tencent.mm.ui.yj yjVar2 = new com.tencent.mm.ui.yj(rect, view);
        hashMap.put(java.lang.Long.valueOf(hashCode), yjVar2);
        wVar.getMTouchDelegateGroup().a(yjVar2);
    }

    public static /* synthetic */ void U(wj2.w wVar, int i17, int i18, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: showOptionBottomSheet");
        }
        if ((i18 & 1) != 0) {
            i17 = 1;
        }
        wVar.T(i17);
    }

    private final com.tencent.mm.ui.xj getMTouchDelegateGroup() {
        return (com.tencent.mm.ui.xj) ((jz5.n) this.F).getValue();
    }

    public static final void v(wj2.w wVar) {
        android.view.MotionEvent motionEvent = wVar.f446729v;
        if (motionEvent != null) {
            super.dispatchTouchEvent(motionEvent);
        }
        android.view.MotionEvent motionEvent2 = wVar.f446730w;
        if (motionEvent2 != null) {
            super.dispatchTouchEvent(motionEvent2);
        }
    }

    public static final void w(wj2.w wVar) {
        wVar.getClass();
        android.os.Bundle bundle = new android.os.Bundle();
        km2.q bindLinkMicUser = wVar.getBindLinkMicUser();
        bundle.putString("PARAM_FINDER_LIVE_MIC_ID", bindLinkMicUser != null ? bindLinkMicUser.f309175f : null);
        qo0.c q17 = wVar.f446719i.q();
        if (q17 != null) {
            q17.statusChange(qo0.b.M3, bundle);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0083, code lost:
    
        if ((kotlin.jvm.internal.o.b(r2, r3 != null ? r3.f309170a : null) && r0.a0().H()) != false) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean A() {
        /*
            r7 = this;
            ae2.in r0 = ae2.in.f3688a
            jz5.g r0 = ae2.in.X2
            jz5.n r0 = (jz5.n) r0
            java.lang.Object r0 = r0.getValue()
            lb2.j r0 = (lb2.j) r0
            java.lang.Object r0 = r0.r()
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != 0) goto L1a
            return r1
        L1a:
            lj2.v0 r0 = r7.f446719i
            lj2.t0 r2 = r0.a0()
            boolean r3 = r2.c()
            r4 = 0
            if (r3 == 0) goto L2f
            boolean r2 = r2.Q()
            if (r2 == 0) goto L2f
            r2 = r1
            goto L30
        L2f:
            r2 = r4
        L30:
            java.lang.String r3 = r7.getTAG()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "isEnableMicMemberPanelClick enableMicPanelOpen: "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.tencent.mars.xlog.Log.i(r3, r5)
            if (r2 != 0) goto L8d
            lj2.t0 r2 = r0.a0()
            java.lang.String r2 = r2.p()
            km2.q r3 = r7.getBindLinkMicUser()
            r5 = 0
            if (r3 == 0) goto L59
            java.lang.String r3 = r3.f309170a
            goto L5a
        L59:
            r3 = r5
        L5a:
            boolean r2 = kotlin.jvm.internal.o.b(r2, r3)
            if (r2 != 0) goto L85
            lj2.t0 r2 = r0.a0()
            java.lang.String r2 = r2.p()
            km2.q r3 = r7.getBindLinkMicUser()
            if (r3 == 0) goto L70
            java.lang.String r5 = r3.f309170a
        L70:
            boolean r2 = kotlin.jvm.internal.o.b(r2, r5)
            if (r2 == 0) goto L82
            lj2.t0 r0 = r0.a0()
            boolean r0 = r0.H()
            if (r0 == 0) goto L82
            r0 = r1
            goto L83
        L82:
            r0 = r4
        L83:
            if (r0 == 0) goto L8c
        L85:
            boolean r0 = r7.G()
            if (r0 == 0) goto L8c
            goto L8d
        L8c:
            r1 = r4
        L8d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: wj2.w.A():boolean");
    }

    public final boolean B() {
        km2.q bindLinkMicUser = getBindLinkMicUser();
        return pm0.v.z(bindLinkMicUser != null ? bindLinkMicUser.f309191v : 0, 16);
    }

    public boolean C() {
        return this instanceof sj2.l;
    }

    public final boolean D() {
        kn0.p pVar;
        tn0.w0 h17 = this.f446719i.h();
        return (h17 == null || (pVar = h17.D) == null || !pVar.f309589i) ? false : true;
    }

    public final boolean E() {
        lj2.v0 v0Var = this.f446719i;
        return kotlin.jvm.internal.o.b(v0Var.a0().p(), v0Var.a0().s());
    }

    public final boolean F() {
        return (E() || this.f446719i.a0().H()) ? false : true;
    }

    public final boolean G() {
        java.lang.String s17 = this.f446719i.a0().s();
        km2.q bindLinkMicUser = getBindLinkMicUser();
        return kotlin.jvm.internal.o.b(s17, bindLinkMicUser != null ? bindLinkMicUser.f309170a : null);
    }

    public final void H() {
        pf5.u uVar = pf5.u.f353936a;
        android.content.Context context = getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        if (((pl2.x) uVar.b(context).a(pl2.x.class)).f356683f) {
            android.content.Context context2 = getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            ((pl2.x) uVar.b(context2).a(pl2.x.class)).f356687m.f356678h = 3;
            android.content.Context context3 = getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            pl2.s sVar = ((pl2.x) uVar.b(context3).a(pl2.x.class)).f356684g;
            if (sVar != null) {
                pl2.s.e(sVar, 0L, null, 3, null);
                return;
            }
            return;
        }
        km2.q bindLinkMicUser = getBindLinkMicUser();
        if (bindLinkMicUser == null || !A()) {
            return;
        }
        if (F()) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0 r0Var = (ml2.r0) c17;
            ml2.b4 b4Var = ml2.b4.f327226e3;
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            jSONObject.put("type", 2);
            jSONObject.put("element", 1);
            ml2.r0.hj(r0Var, b4Var, jSONObject.toString(), 0L, null, null, null, null, null, 252, null);
        }
        this.f446720m.X(bindLinkMicUser);
    }

    public void I(boolean z17) {
    }

    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x014c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void J() {
        /*
            Method dump skipped, instructions count: 629
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj2.w.J():void");
    }

    public void K() {
        lj2.v0 v0Var = this.f446719i;
        v0Var.a0().N(!v0Var.a0().F());
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putBoolean("PARAM_FINDER_LIVE_IS_MUTE_MIC", v0Var.a0().F());
        qo0.c q17 = v0Var.q();
        if (q17 != null) {
            q17.statusChange(qo0.b.f365401p4, bundle);
        }
        if (v0Var.a0().F()) {
            db5.t7.i(getContext(), getContext().getResources().getString(com.tencent.mm.R.string.f491460d52), com.tencent.mm.R.raw.icons_filled_mic_off);
            ml2.n4 n4Var = ml2.n4.f327754u;
            com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 18");
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
        } else {
            db5.t7.i(getContext(), getContext().getResources().getString(com.tencent.mm.R.string.d4e), com.tencent.mm.R.raw.icons_filled_mike);
            ml2.n4 n4Var2 = ml2.n4.f327757x;
            com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: 21");
            i95.m c18 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            ml2.r0.ik((ml2.r0) c18, n4Var2, null, 0, 6, null);
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = this.f446723p;
        if (k0Var != null) {
            k0Var.u();
        }
        km2.q bindLinkMicUser = getBindLinkMicUser();
        if (bindLinkMicUser != null) {
            f(bindLinkMicUser.f309183n, bindLinkMicUser.f309191v, false);
        }
    }

    public final void L() {
        if (zl2.r4.f473950a.w1()) {
            P();
        } else if (B() && G()) {
            db5.t7.i(getContext(), getContext().getResources().getString(com.tencent.mm.R.string.dvk), com.tencent.mm.R.raw.icons_filled_mic_off);
        }
    }

    public final void M() {
        this.D++;
        if (this.B != null) {
            return;
        }
        wj2.s sVar = new wj2.s(this);
        this.B = sVar;
        this.A.post(sVar);
    }

    public final void N(android.view.MotionEvent motionEvent) {
        int i17 = no0.i.f338727a;
        int i18 = no0.i.f338727a;
        android.os.Bundle bundle = new android.os.Bundle();
        int i19 = i18 / 2;
        bundle.putInt("PARAM_LIVE_LIKE_CONFETTI_X", ((int) motionEvent.getRawX()) - i19);
        bundle.putInt("PARAM_LIVE_LIKE_CONFETTI_Y", ((int) motionEvent.getRawY()) - i19);
        qo0.c q17 = this.f446719i.q();
        if (q17 != null) {
            q17.statusChange(qo0.b.A3, bundle);
        }
    }

    public final void O() {
        android.view.MotionEvent motionEvent = this.f446729v;
        if (motionEvent != null) {
            motionEvent.recycle();
        }
        this.f446729v = null;
        android.view.MotionEvent motionEvent2 = this.f446730w;
        if (motionEvent2 != null) {
            motionEvent2.recycle();
        }
        this.f446730w = null;
    }

    public void P() {
        km2.q bindLinkMicUser = getBindLinkMicUser();
        if (bindLinkMicUser != null) {
            km2.q bindLinkMicUser2 = getBindLinkMicUser();
            int i17 = bindLinkMicUser2 != null ? bindLinkMicUser2.f309191v : 0;
            java.util.regex.Pattern pattern = pm0.v.f356802a;
            bindLinkMicUser.f309191v = i17 & (-17);
        }
        db5.t7.i(getContext(), getContext().getResources().getString(com.tencent.mm.R.string.d4e), com.tencent.mm.R.raw.icons_filled_mike);
        ml2.q2 q2Var = ml2.q2.f327834u;
        com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "report21054 op: 22 ");
        ((ml2.j0) i95.n0.c(ml2.j0.class)).Vj(q2Var, "", -1, -1);
    }

    public void R() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x005d, code lost:
    
        if (r2.a0().g().size() == 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x005f, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0105, code lost:
    
        if ((r1 == null || r26.n0.N(r1)) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0114, code lost:
    
        if ((r1 != null || r26.n0.N(r1)) != false) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0098  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v23 */
    /* JADX WARN: Type inference failed for: r0v24 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void S(android.widget.TextView r27) {
        /*
            Method dump skipped, instructions count: 602
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj2.w.S(android.widget.TextView):void");
    }

    public void T(int i17) {
        lj2.v0 v0Var = this.f446719i;
        if (v0Var.k0()) {
            df2.t2 t2Var = (df2.t2) v0Var.o(df2.t2.class);
            if (t2Var != null) {
                t2Var.a7(true);
                return;
            }
            return;
        }
        boolean z17 = false;
        if (this.f446723p == null) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(getContext(), 0, true);
            k0Var.U1 = true;
            k0Var.V1 = true;
            this.f446723p = k0Var;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var2 = this.f446723p;
        if (k0Var2 != null) {
            k0Var2.f211872n = new wj2.g(this);
        }
        if (k0Var2 != null) {
            k0Var2.f211881s = this;
        }
        int I = v0Var.a0().I();
        int k17 = v0Var.a0().k();
        if (I == 2 && k17 == 8) {
            z17 = true;
        }
        if (z17) {
            com.tencent.mm.ui.widget.dialog.k0 k0Var3 = this.f446723p;
            if (k0Var3 != null) {
                k0Var3.f211874o = new wj2.h(this);
            }
            if (k0Var3 != null) {
                k0Var3.f211884v = this;
            }
        }
        this.f446725r = i17;
        com.tencent.mm.ui.widget.dialog.k0 k0Var4 = this.f446723p;
        if (k0Var4 != null) {
            k0Var4.v();
        }
        ml2.n4 n4Var = i17 == 1 ? ml2.n4.f327760y : ml2.n4.f327753t;
        com.tencent.mars.xlog.Log.i("FinderLiveMicReportUtil", "reportLink21084 action: " + n4Var.f327764d);
        i95.m c17 = i95.n0.c(ml2.r0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        ml2.r0.ik((ml2.r0) c17, n4Var, null, 0, 6, null);
    }

    public final void V(android.widget.TextView giftCountText, android.widget.ImageView giftIcon) {
        kotlin.jvm.internal.o.g(giftCountText, "giftCountText");
        kotlin.jvm.internal.o.g(giftIcon, "giftIcon");
        lj2.t0 a07 = this.f446719i.a0();
        dk2.u4 K = a07 != null ? a07.K() : null;
        km2.q bindLinkMicUser = getBindLinkMicUser();
        if (K == null || bindLinkMicUser == null) {
            return;
        }
        zl2.r4.f473950a.b3(giftCountText);
        km2.k d17 = K.d(bindLinkMicUser);
        long j17 = d17 != null ? d17.f309122i : 0L;
        if (j17 > 0) {
            giftCountText.setText("x" + j17);
        } else {
            giftCountText.setText("0");
        }
        giftCountText.setVisibility(0);
        ce2.i e17 = dk2.u7.f234181a.e(K.f234162i);
        if (e17 != null) {
            giftIcon.setVisibility(0);
            ((wo0.b) new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f353936a.e(zy2.b6.class).c(mn2.i4.class))).H).getValue()).a(new mn2.q3(e17.field_thumbnailFileUrl, com.tencent.mm.plugin.finder.storage.y90.f128356f))).c(giftIcon);
        }
    }

    public final void W(android.widget.TextView textView) {
        lj2.t0 a07 = this.f446719i.a0();
        jz5.f0 f0Var = null;
        dk2.u4 K = a07 != null ? a07.K() : null;
        km2.q bindLinkMicUser = getBindLinkMicUser();
        if (K != null && bindLinkMicUser != null) {
            km2.k d17 = K.d(bindLinkMicUser);
            long j17 = d17 != null ? d17.f309122i : 0L;
            if (textView != null) {
                textView.setText(zl2.r4.S(zl2.r4.f473950a, j17, 0, 2, null));
            }
            if (textView != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(textView, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverBaseWidget", "showPkMicBattleValueText", "(Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                textView.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverBaseWidget", "showPkMicBattleValueText", "(Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var != null || textView == null) {
            return;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal2 = zj0.c.f473285a;
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(textView, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverBaseWidget", "showPkMicBattleValueText", "(Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        textView.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(textView, "com/tencent/mm/plugin/finder/live/mic/widget/normal/FinderLiveMicCoverBaseWidget", "showPkMicBattleValueText", "(Landroid/widget/TextView;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c3, code lost:
    
        if (((r1 == null || (r1 = r1.f309189t) == null) ? false : r1.booleanValue()) != false) goto L38;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void X() {
        /*
            r10 = this;
            pf5.u r0 = pf5.u.f353936a
            android.content.Context r1 = r10.getContext()
            java.lang.String r2 = "getContext(...)"
            kotlin.jvm.internal.o.f(r1, r2)
            pf5.v r1 = r0.b(r1)
            java.lang.Class<pl2.x> r3 = pl2.x.class
            androidx.lifecycle.c1 r1 = r1.a(r3)
            pl2.x r1 = (pl2.x) r1
            boolean r1 = r1.f356683f
            if (r1 == 0) goto L50
            android.content.Context r1 = r10.getContext()
            kotlin.jvm.internal.o.f(r1, r2)
            pf5.v r1 = r0.b(r1)
            androidx.lifecycle.c1 r1 = r1.a(r3)
            pl2.x r1 = (pl2.x) r1
            pl2.s r4 = r1.f356684g
            if (r4 == 0) goto L38
            r5 = 0
            r7 = 0
            r8 = 3
            r9 = 0
            pl2.s.e(r4, r5, r7, r8, r9)
        L38:
            android.content.Context r1 = r10.getContext()
            kotlin.jvm.internal.o.f(r1, r2)
            pf5.v r0 = r0.b(r1)
            androidx.lifecycle.c1 r0 = r0.a(r3)
            pl2.x r0 = (pl2.x) r0
            pl2.w r0 = r0.f356687m
            r1 = 3
            r0.f356678h = r1
            goto Ld8
        L50:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            km2.q r1 = r10.getBindLinkMicUser()
            r2 = 0
            if (r1 == 0) goto L65
            r45.xn1 r1 = r1.f309187r
            if (r1 == 0) goto L65
            byte[] r1 = r1.toByteArray()
            goto L66
        L65:
            r1 = r2
        L66:
            java.lang.String r3 = "PARAM_MEMBERS_PROFILE_CONTACT"
            r0.putByteArray(r3, r1)
            java.lang.String r1 = "PARAM_MEMBERS_PROFILE_NEED_NOTIFY_CLOSE"
            r3 = 0
            r0.putBoolean(r1, r3)
            java.lang.String r1 = "PARAM_MEMBERS_PROFILE_SOURCE_TYPE"
            int r4 = r10.getProfileSourceType()
            r0.putInt(r1, r4)
            km2.q r1 = r10.getBindLinkMicUser()
            if (r1 == 0) goto L82
            java.lang.String r2 = r1.f309172c
        L82:
            java.lang.String r1 = "PARAM_MEMBERS_PROFILE_USERNAME"
            r0.putString(r1, r2)
            km2.q r1 = r10.getBindLinkMicUser()
            if (r1 == 0) goto L91
            java.lang.String r1 = r1.f309170a
            if (r1 != 0) goto L93
        L91:
            java.lang.String r1 = ""
        L93:
            java.lang.String r2 = "PARAM_MEMBERS_PROFILE_USER_MIC_ID"
            r0.putString(r2, r1)
            km2.q r1 = r10.getBindLinkMicUser()
            if (r1 == 0) goto La1
            boolean r1 = r1.f309177h
            goto La2
        La1:
            r1 = r3
        La2:
            java.lang.String r2 = "PARAM_MEMBERS_PROFILE_REPLAY_GIFT"
            r0.putBoolean(r2, r1)
            km2.q r1 = r10.getBindLinkMicUser()
            if (r1 == 0) goto Lb0
            boolean r1 = r1.f309177h
            goto Lb1
        Lb0:
            r1 = r3
        Lb1:
            if (r1 != 0) goto Lc5
            km2.q r1 = r10.getBindLinkMicUser()
            if (r1 == 0) goto Lc2
            java.lang.Boolean r1 = r1.f309189t
            if (r1 == 0) goto Lc2
            boolean r1 = r1.booleanValue()
            goto Lc3
        Lc2:
            r1 = r3
        Lc3:
            if (r1 == 0) goto Lc6
        Lc5:
            r3 = 1
        Lc6:
            java.lang.String r1 = "PARAM_MEMBERS_PROFILE_IS_OTHER_ROOM_USER"
            r0.putBoolean(r1, r3)
            lj2.v0 r1 = r10.f446719i
            qo0.c r1 = r1.q()
            if (r1 == 0) goto Ld8
            qo0.b r2 = qo0.b.f365376l1
            r1.statusChange(r2, r0)
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wj2.w.X():void");
    }

    public final void Y() {
        java.lang.Object obj;
        boolean i17 = this.f446719i.a0().i();
        boolean z17 = getBindLinkMicUser() != null;
        boolean u17 = this.f446719i.a0().u();
        km2.q bindLinkMicUser = getBindLinkMicUser();
        boolean b17 = bindLinkMicUser != null ? kotlin.jvm.internal.o.b(bindLinkMicUser.f309189t, java.lang.Boolean.TRUE) : false;
        boolean G = G();
        boolean y17 = y();
        java.util.List g17 = this.f446719i.a0().g();
        synchronized (g17) {
            java.util.Iterator it = g17.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                java.lang.String str = ((km2.q) obj).f309170a;
                km2.q bindLinkMicUser2 = getBindLinkMicUser();
                if (kotlin.jvm.internal.o.b(str, bindLinkMicUser2 != null ? bindLinkMicUser2.f309170a : null)) {
                    break;
                }
            }
        }
        boolean z18 = obj != null;
        boolean z19 = this.f446719i.f() == lj2.w0.f318958d;
        int O = this.f446719i.a0().O();
        boolean z27 = O == 0 || O == 1;
        pm2.a curWidgetMode = getCurWidgetMode();
        kotlin.jvm.internal.o.g(curWidgetMode, "<this>");
        boolean z28 = curWidgetMode == pm2.a.f356862r || curWidgetMode == pm2.a.f356863s || curWidgetMode == pm2.a.f356864t || curWidgetMode == pm2.a.f356865u;
        boolean z29 = getCurWidgetMode() == pm2.a.f356855h;
        boolean z37 = getCurWidgetMode() == pm2.a.f356858n || getCurWidgetMode() == pm2.a.f356859o || getCurWidgetMode() == pm2.a.f356860p;
        this.f446728u = i17 && z17 && u17 && z19 && z27 && !b17 && !G && !z28 && !z29 && !z18;
        boolean z38 = i17 && z17 && u17 && z19 && z27 && y17 && !b17 && !z28 && !z29 && !z37 && !z18;
        boolean z39 = z38 && !G;
        com.tencent.mars.xlog.Log.i(getTAG(), "updateLike,enableLikeMicAudience:" + i17 + " hasBindLinkMicUser: " + z17 + ", isLikeEnable: " + u17 + ", isLiveRoom: " + z19 + ", isLiveOrCharge: " + z27 + ", isOtherRoomUser: " + b17 + ", isSelfMicUser: " + G + ", isAudience: " + y17 + " shouldHandleDoubleClick: " + this.f446728u + ", shouldShowLikeContainer: " + z38 + ", shouldLikeContainerHandleTouch: " + z39 + ", isFocus: " + z29 + ", isPkMode: " + z37 + ", isOtherRoomAnchor: " + z18);
        com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer finderLiveLikeContainer = (com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer) findViewById(com.tencent.mm.R.id.tka);
        if (finderLiveLikeContainer == null) {
            return;
        }
        if (!z38) {
            finderLiveLikeContainer.setVisibility(8);
            finderLiveLikeContainer.C();
            this.I = false;
            return;
        }
        finderLiveLikeContainer.setVisibility(0);
        wj2.t tVar = new wj2.t(this);
        wj2.u uVar = new wj2.u(this);
        wj2.v vVar = new wj2.v(this);
        km2.q bindLinkMicUser3 = getBindLinkMicUser();
        java.lang.String str2 = bindLinkMicUser3 != null ? bindLinkMicUser3.f309175f : null;
        qo0.c q17 = this.f446719i.q();
        boolean B = this.f446719i.a0().B();
        java.lang.String A = this.f446719i.a0().A();
        com.tencent.mm.plugin.finder.live.view.y5 y5Var = new com.tencent.mm.plugin.finder.live.view.y5(tVar, uVar, vVar, str2, q17, z39, B, A);
        finderLiveLikeContainer.C();
        finderLiveLikeContainer.f115995w = tVar;
        finderLiveLikeContainer.f115996x = uVar;
        finderLiveLikeContainer.f115997y = vVar;
        finderLiveLikeContainer.f115998z = str2;
        finderLiveLikeContainer.A = q17;
        finderLiveLikeContainer.C = z39;
        finderLiveLikeContainer.D = B;
        finderLiveLikeContainer.E = A;
        java.lang.String str3 = "FinderLiveLikeContainer:" + finderLiveLikeContainer.f115998z;
        finderLiveLikeContainer.f115994v = str3;
        com.tencent.mars.xlog.Log.i(str3, "bindData: " + y5Var);
        boolean z47 = finderLiveLikeContainer.C;
        com.tencent.mm.ui.widget.imageview.WeImageView weImageView = finderLiveLikeContainer.B;
        if (z47) {
            finderLiveLikeContainer.setBackground(finderLiveLikeContainer.getContext().getResources().getDrawable(com.tencent.mm.R.drawable.a6z, null));
            if (weImageView != null) {
                weImageView.setIconColor(finderLiveLikeContainer.getContext().getResources().getColor(com.tencent.mm.R.color.aaz, null));
            }
        } else {
            finderLiveLikeContainer.setBackground(null);
            if (weImageView != null) {
                weImageView.setIconColor(finderLiveLikeContainer.getContext().getResources().getColor(com.tencent.mm.R.color.agl, null));
            }
        }
        finderLiveLikeContainer.H = new com.tencent.mm.plugin.finder.live.view.v5(finderLiveLikeContainer);
        finderLiveLikeContainer.f115993J = new com.tencent.mm.plugin.finder.live.view.w5(finderLiveLikeContainer);
        android.view.ViewTreeObserver viewTreeObserver = finderLiveLikeContainer.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(finderLiveLikeContainer.f115993J);
        }
        finderLiveLikeContainer.B();
        if (this.I) {
            return;
        }
        this.I = true;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("type", 1);
        jSONObject.put("element", 1);
        java.lang.String jSONObject2 = jSONObject.toString();
        kotlin.jvm.internal.o.f(jSONObject2, "toString(...)");
        if (F()) {
            i95.m c17 = i95.n0.c(ml2.r0.class);
            kotlin.jvm.internal.o.f(c17, "getService(...)");
            ml2.r0.hj((ml2.r0) c17, ml2.b4.f327223d3, jSONObject2, 0L, null, null, null, null, null, 252, null);
        } else {
            i95.m c18 = i95.n0.c(ml2.j0.class);
            kotlin.jvm.internal.o.f(c18, "getService(...)");
            zy2.zb.y6((zy2.zb) c18, ml2.z4.E2, jSONObject2, null, 4, null);
        }
    }

    @Override // android.view.ViewGroup
    public void addView(android.view.View view) {
        super.addView(view);
        android.view.View view2 = this.H;
        if (view2 != null) {
            view2.setTouchDelegate(null);
        }
        this.H = view;
        if (view == null) {
            return;
        }
        view.setTouchDelegate(getMTouchDelegateGroup());
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        wj2.k0 k0Var = this.f446726s;
        if (k0Var != null && k0Var.a(motionEvent)) {
            return true;
        }
        getTAG();
        java.util.Objects.toString(motionEvent);
        if (!this.f446728u) {
            return super.dispatchTouchEvent(motionEvent);
        }
        jz5.f0 f0Var = null;
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        java.lang.Runnable runnable = this.f446733z;
        android.os.Handler handler = this.A;
        if (valueOf != null && valueOf.intValue() == 0) {
            this.f446732y = false;
            O();
            this.f446729v = android.view.MotionEvent.obtain(motionEvent);
            this.f446731x++;
            handler.removeCallbacks(runnable);
            handler.postDelayed(runnable, this.f446727t);
            if (this.f446731x >= 2) {
                android.content.Context context = getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                pf5.z zVar = pf5.z.f353948a;
                if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
                    throw new java.lang.IllegalStateException("Check failed.".toString());
                }
                if (!((pl2.x) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(pl2.x.class)).f356683f) {
                    if (y()) {
                        com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer finderLiveLikeContainer = (com.tencent.mm.plugin.finder.live.view.FinderLiveLikeContainer) findViewById(com.tencent.mm.R.id.tka);
                        if (finderLiveLikeContainer != null) {
                            wj2.l lVar = new wj2.l(this, motionEvent);
                            java.lang.Runnable runnable2 = finderLiveLikeContainer.I;
                            android.os.Handler handler2 = finderLiveLikeContainer.G;
                            if (runnable2 != null) {
                                handler2.removeCallbacks(runnable2);
                            }
                            com.tencent.mm.plugin.finder.live.view.x5 x5Var = new com.tencent.mm.plugin.finder.live.view.x5(finderLiveLikeContainer, lVar);
                            finderLiveLikeContainer.I = x5Var;
                            handler2.postDelayed(x5Var, 20L);
                            f0Var = jz5.f0.f302826a;
                        }
                        if (f0Var == null) {
                            this.E++;
                            M();
                            N(motionEvent);
                        }
                    } else {
                        df2.bh bhVar = (df2.bh) this.f446719i.o(df2.bh.class);
                        if (bhVar != null) {
                            bhVar.Z6((int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                        }
                    }
                }
            }
        } else if (valueOf != null && valueOf.intValue() == 1) {
            if (this.f446732y) {
                super.dispatchTouchEvent(motionEvent);
            } else {
                this.f446730w = android.view.MotionEvent.obtain(motionEvent);
            }
        } else if (valueOf != null && valueOf.intValue() == 3) {
            handler.removeCallbacks(runnable);
            this.f446731x = 0;
            this.f446732y = false;
            O();
            super.dispatchTouchEvent(motionEvent);
        } else if (this.f446732y) {
            super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public void f(boolean z17, int i17, boolean z18) {
        java.lang.String str;
        lj2.v0 v0Var = this.f446719i;
        if (z18 && G() && !zl2.r4.f473950a.w1()) {
            km2.q bindLinkMicUser = getBindLinkMicUser();
            if ((bindLinkMicUser == null || bindLinkMicUser.f309177h) ? false : true) {
                boolean B = B();
                android.os.Bundle bundle = new android.os.Bundle();
                if (!B && !v0Var.a0().F()) {
                    r0 = false;
                }
                bundle.putBoolean("PARAM_FINDER_LIVE_IS_MUTE_MIC", r0);
                bundle.putBoolean("PARAM_FINDER_LIVE_IS_NEED_SET_MUTE_MIC", false);
                qo0.c q17 = v0Var.q();
                if (q17 != null) {
                    q17.statusChange(qo0.b.f365401p4, bundle);
                }
                if (B) {
                    db5.t7.i(getContext(), getContext().getResources().getString(com.tencent.mm.R.string.dvk), com.tencent.mm.R.raw.icons_filled_mic_off);
                } else {
                    db5.t7.i(getContext(), getContext().getResources().getString(com.tencent.mm.R.string.dwy), com.tencent.mm.R.raw.icons_filled_mike);
                }
                r45.t12 t12Var = new r45.t12();
                t12Var.set(3, 10001);
                t12Var.set(2, B ? getContext().getResources().getString(com.tencent.mm.R.string.dvk) : getContext().getResources().getString(com.tencent.mm.R.string.dwy));
                v0Var.a0().L(new dk2.mf(t12Var));
                return;
            }
        }
        if (z18) {
            km2.q bindLinkMicUser2 = getBindLinkMicUser();
            if (!(bindLinkMicUser2 != null && bindLinkMicUser2.f309177h) || zl2.r4.f473950a.w1()) {
                return;
            }
            boolean B2 = B();
            qo0.c q18 = v0Var.q();
            if (q18 != null) {
                qo0.b bVar = qo0.b.f365337c5;
                android.os.Bundle bundle2 = new android.os.Bundle();
                bundle2.putBoolean("PARAM_FINDER_LIVE_PK_ANCHOR_IS_MUTE", B2);
                km2.q bindLinkMicUser3 = getBindLinkMicUser();
                if (bindLinkMicUser3 == null || (str = bindLinkMicUser3.f309172c) == null) {
                    str = "";
                }
                bundle2.putString("PARAM_FINDER_LIVE_MIC_USER_NAME", str);
                q18.statusChange(bVar, bundle2);
            }
            if (B2) {
                db5.t7.i(getContext(), getContext().getResources().getString(com.tencent.mm.R.string.d4n), com.tencent.mm.R.raw.icons_filled_mic_off);
            }
        }
    }

    public /* bridge */ /* synthetic */ android.view.ViewGroup getAnchorAudioModeLayout() {
        return null;
    }

    public /* bridge */ /* synthetic */ android.widget.FrameLayout getAnchorCriticalLayout() {
        return null;
    }

    public /* bridge */ /* synthetic */ ai2.a getBattleResultWidget() {
        return null;
    }

    public /* bridge */ /* synthetic */ qi2.s1 getBattleTipsWidget() {
        return null;
    }

    public /* bridge */ /* synthetic */ android.widget.FrameLayout getCriticalGiftLayout() {
        return null;
    }

    public km2.q getCurBindLinkMicUser() {
        return getBindLinkMicUser();
    }

    public /* bridge */ /* synthetic */ android.animation.ValueAnimator getGiftInAnimator() {
        return null;
    }

    public /* bridge */ /* synthetic */ android.view.ViewGroup getGiftRootView() {
        return null;
    }

    public /* bridge */ /* synthetic */ android.view.ViewGroup getLotteryBubbleRootView() {
        return null;
    }

    public /* bridge */ /* synthetic */ android.view.ViewGroup getLuckyMoneyRootView() {
        return null;
    }

    public sj2.m getMicGiftCallback() {
        return this;
    }

    public final java.lang.Integer getMicType() {
        km2.q bindLinkMicUser = getBindLinkMicUser();
        if (bindLinkMicUser != null) {
            return java.lang.Integer.valueOf(bindLinkMicUser.f309174e);
        }
        return null;
    }

    public final lj2.v0 getPluginAbility() {
        return this.f446719i;
    }

    public int getProfileSourceType() {
        if (zl2.r4.f473950a.x1()) {
            return ((getCurWidgetMode() == pm2.a.f356857m || getCurWidgetMode() == pm2.a.f356861q || getCurWidgetMode() == pm2.a.f356858n) && this.f446719i.a0().w()) ? 9 : 3;
        }
        return 3;
    }

    public final lj2.x0 getService() {
        return this.f446720m;
    }

    @Override // lj2.j
    public java.lang.String getTagText() {
        xh2.a bindMicData = getBindMicData();
        return bindMicData != null ? this.f446719i.a0().G(bindMicData.f454521b.f454553e) : "";
    }

    public /* bridge */ /* synthetic */ android.view.ViewGroup getVoteBubbleRootView() {
        return null;
    }

    public final int getWidgetType() {
        return this.f446721n;
    }

    @Override // lj2.j
    public void l(pm2.a widgetMode, xh2.a data) {
        kotlin.jvm.internal.o.g(widgetMode, "widgetMode");
        kotlin.jvm.internal.o.g(data, "data");
        super.l(widgetMode, data);
        x();
        R();
        Y();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        java.lang.Runnable runnable = this.B;
        android.os.Handler handler = this.A;
        if (runnable != null) {
            handler.removeCallbacks(runnable);
            this.B = null;
        }
        handler.removeCallbacks(this.f446733z);
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0160  */
    @Override // db5.t4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMMMenuItemSelected(android.view.MenuItem r22, int r23) {
        /*
            Method dump skipped, instructions count: 794
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: wj2.w.onMMMenuItemSelected(android.view.MenuItem, int):void");
    }

    public final void setTouchDelegate(android.view.View view) {
        kotlin.jvm.internal.o.g(view, "view");
        view.post(new wj2.q(this, view));
    }

    public void x() {
    }

    public final boolean y() {
        java.lang.Object obj;
        java.util.List l17 = this.f446719i.a0().l();
        synchronized (l17) {
            java.util.Iterator it = l17.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                java.lang.Object next = it.next();
                java.lang.String str = ((km2.q) next).f309170a;
                km2.q bindLinkMicUser = getBindLinkMicUser();
                if (kotlin.jvm.internal.o.b(str, bindLinkMicUser != null ? bindLinkMicUser.f309170a : null)) {
                    obj = next;
                    break;
                }
            }
        }
        return obj != null;
    }

    public boolean z() {
        return !(this instanceof qh2.i);
    }
}
