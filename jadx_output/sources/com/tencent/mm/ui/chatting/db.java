package com.tencent.mm.ui.chatting;

/* loaded from: classes11.dex */
public class db extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f200424d;

    /* renamed from: e, reason: collision with root package name */
    public final ah5.a f200425e;

    /* renamed from: f, reason: collision with root package name */
    public int f200426f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.l9 f200427g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.ui.chatting.ChattingUIFragment f200428h;

    /* renamed from: i, reason: collision with root package name */
    public final jz5.g f200429i;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f200430m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f200431n;

    /* renamed from: o, reason: collision with root package name */
    public final jz5.g f200432o;

    /* renamed from: p, reason: collision with root package name */
    public final jz5.g f200433p;

    /* renamed from: q, reason: collision with root package name */
    public final jz5.g f200434q;

    /* renamed from: r, reason: collision with root package name */
    public final jz5.g f200435r;

    /* renamed from: s, reason: collision with root package name */
    public final jz5.g f200436s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.Integer f200437t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f200438u;

    /* renamed from: v, reason: collision with root package name */
    public final com.tencent.mm.ui.chatting.cb f200439v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f200440w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f200441x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f200442y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public db(androidx.appcompat.app.AppCompatActivity activity) {
        super(activity);
        kotlin.jvm.internal.o.g(activity, "activity");
        this.f200424d = jz5.h.b(new com.tencent.mm.ui.chatting.ab(this));
        this.f200425e = new com.tencent.mm.ui.chatting.ta(this);
        this.f200429i = jz5.h.b(new com.tencent.mm.ui.chatting.za(this));
        this.f200430m = jz5.h.b(new com.tencent.mm.ui.chatting.sa(this));
        this.f200431n = jz5.h.b(new com.tencent.mm.ui.chatting.qa(this));
        this.f200432o = jz5.h.b(new com.tencent.mm.ui.chatting.pa(this));
        this.f200433p = jz5.h.b(new com.tencent.mm.ui.chatting.oa(this));
        this.f200434q = jz5.h.b(new com.tencent.mm.ui.chatting.na(this));
        this.f200435r = jz5.h.b(com.tencent.mm.ui.chatting.va.f202800d);
        this.f200436s = jz5.h.b(new com.tencent.mm.ui.chatting.ma(this));
        this.f200439v = new com.tencent.mm.ui.chatting.cb(this);
    }

    public boolean T6() {
        return true;
    }

    public final boolean U6(android.view.MotionEvent event) {
        kotlin.jvm.internal.o.g(event, "event");
        com.tencent.mm.pluginsdk.ui.chat.ChatFooter chatFooter = ((com.tencent.mm.ui.chatting.component.jb) ((sb5.s0) W6().f198152f.f460708c.a(sb5.s0.class))).f199263e;
        if (chatFooter == null) {
            return true;
        }
        android.widget.LinearLayout smileyPanel = chatFooter.getSmileyPanel();
        if ((smileyPanel != null && smileyPanel.getVisibility() == 0 && l7(smileyPanel, (int) event.getRawX(), (int) event.getRawY())) ? false : true) {
            if (((android.widget.LinearLayout) chatFooter.findViewById(com.tencent.mm.R.id.d9e)) == null ? true : !l7(r2, (int) event.getRawX(), (int) event.getRawY())) {
                if (!(chatFooter.f189993h.f189940r.f197347i != 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void V6(android.view.View view) {
    }

    public final com.tencent.mm.ui.chatting.ChattingUIFragment W6() {
        com.tencent.mm.ui.chatting.ChattingUIFragment chattingUIFragment = this.f200428h;
        if (chattingUIFragment != null) {
            return chattingUIFragment;
        }
        kotlin.jvm.internal.o.o("currentFragment");
        throw null;
    }

    public int X6() {
        return ((java.lang.Number) ((jz5.n) this.f200436s).getValue()).intValue();
    }

    public float Y6() {
        return 0.5f;
    }

    public final ah5.a Z6() {
        return (ah5.a) ((jz5.n) this.f200424d).getValue();
    }

    public void a7() {
    }

    public void b7() {
        getActivity().overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477855dd);
    }

    public void c7() {
        getActivity().overridePendingTransition(com.tencent.mm.R.anim.f477857df, com.tencent.mm.R.anim.f477855dd);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0040 A[Catch: Exception -> 0x0069, TryCatch #0 {Exception -> 0x0069, blocks: (B:3:0x0007, B:5:0x000d, B:7:0x0017, B:9:0x001d, B:11:0x0023, B:13:0x0040, B:14:0x004c, B:21:0x0028, B:23:0x0032, B:25:0x0038), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d7() {
        /*
            r9 = this;
            java.lang.String r0 = "MicroMsg.HalfScreenChattingUIC"
            java.lang.String r1 = "getCurrentWindowHeight tmpWindowHeight:"
            r2 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            r4 = 0
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> L69
            r6 = 30
            if (r5 < r6) goto L28
            androidx.appcompat.app.AppCompatActivity r5 = r9.getActivity()     // Catch: java.lang.Exception -> L69
            android.view.WindowManager r5 = r5.getWindowManager()     // Catch: java.lang.Exception -> L69
            if (r5 == 0) goto L3d
            android.view.WindowMetrics r5 = r5.getCurrentWindowMetrics()     // Catch: java.lang.Exception -> L69
            if (r5 == 0) goto L3d
            android.graphics.Rect r5 = r5.getBounds()     // Catch: java.lang.Exception -> L69
            if (r5 == 0) goto L3d
            int r5 = r5.height()     // Catch: java.lang.Exception -> L69
            goto L3e
        L28:
            androidx.appcompat.app.AppCompatActivity r5 = r9.getActivity()     // Catch: java.lang.Exception -> L69
            android.view.WindowManager r5 = r5.getWindowManager()     // Catch: java.lang.Exception -> L69
            if (r5 == 0) goto L3d
            android.view.Display r5 = r5.getDefaultDisplay()     // Catch: java.lang.Exception -> L69
            if (r5 == 0) goto L3d
            int r5 = r5.getHeight()     // Catch: java.lang.Exception -> L69
            goto L3e
        L3d:
            r5 = r4
        L3e:
            if (r5 > 0) goto L4b
            android.app.Activity r6 = r9.getContext()     // Catch: java.lang.Exception -> L69
            android.graphics.Point r6 = com.tencent.mm.ui.bl.b(r6)     // Catch: java.lang.Exception -> L69
            int r6 = r6.y     // Catch: java.lang.Exception -> L69
            goto L4c
        L4b:
            r6 = r5
        L4c:
            double r7 = (double) r6     // Catch: java.lang.Exception -> L69
            double r7 = r7 * r2
            int r7 = (int) r7     // Catch: java.lang.Exception -> L69
            int r7 = r6 - r7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L69
            r8.<init>(r1)     // Catch: java.lang.Exception -> L69
            r8.append(r5)     // Catch: java.lang.Exception -> L69
            java.lang.String r1 = "  finalWindowHeight:"
            r8.append(r1)     // Catch: java.lang.Exception -> L69
            r8.append(r6)     // Catch: java.lang.Exception -> L69
            java.lang.String r1 = r8.toString()     // Catch: java.lang.Exception -> L69
            com.tencent.mars.xlog.Log.i(r0, r1)     // Catch: java.lang.Exception -> L69
            goto L80
        L69:
            r1 = move-exception
            java.lang.String r5 = "getCurrentWindowHeight"
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.tencent.mars.xlog.Log.printErrStackTrace(r0, r1, r5, r4)
            android.app.Activity r1 = r9.getContext()
            android.graphics.Point r1 = com.tencent.mm.ui.bl.b(r1)
            int r1 = r1.y
            double r4 = (double) r1
            double r4 = r4 * r2
            int r2 = (int) r4
            int r7 = r1 - r2
        L80:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getCurrentWindowHeight height:"
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)
            r9.p7(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "handleHeightChanged() called with: screenHeight = "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.tencent.mars.xlog.Log.i(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.ui.chatting.db.d7():void");
    }

    public int e7(int i17) {
        return 1;
    }

    public boolean f7(com.tencent.mm.ui.chatting.component.pe headerComponent, android.view.View.OnClickListener listener) {
        kotlin.jvm.internal.o.g(headerComponent, "headerComponent");
        kotlin.jvm.internal.o.g(listener, "listener");
        return false;
    }

    public boolean g7(com.tencent.mm.ui.chatting.component.pe headerComponent, yb5.d chattingContext) {
        kotlin.jvm.internal.o.g(headerComponent, "headerComponent");
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        headerComponent.f199695s = true;
        java.lang.String x17 = chattingContext.x();
        ((com.tencent.mm.storage.m4) c01.d9.b().r()).T(x17);
        com.tencent.mm.modelstat.e.f71505a.getClass();
        com.tencent.mm.modelsimple.g1.J(x17, 13);
        chattingContext.f460710e.P();
        java.lang.String string = getContext().getResources().getString(com.tencent.mm.R.string.b28);
        kotlin.jvm.internal.o.f(string, "getString(...)");
        android.app.Activity context = getContext();
        int i17 = com.tencent.mm.ui.widget.dialog.f4.f211790n;
        com.tencent.mm.ui.widget.dialog.e4 e4Var = new com.tencent.mm.ui.widget.dialog.e4(context);
        e4Var.f211776c = string;
        e4Var.b(com.tencent.mm.R.raw.icons_outlined_done);
        e4Var.c();
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.ui.chatting.ua uaVar = new com.tencent.mm.ui.chatting.ua(chattingContext);
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        t0Var.z(uaVar, 1000L, false);
        o7();
        return true;
    }

    public boolean h7(com.tencent.mm.ui.chatting.component.pe headerComponent, com.tencent.mm.ui.bc optionListener, yb5.d chattingContext) {
        kotlin.jvm.internal.o.g(headerComponent, "headerComponent");
        kotlin.jvm.internal.o.g(optionListener, "optionListener");
        kotlin.jvm.internal.o.g(chattingContext, "chattingContext");
        headerComponent.K0(0, com.tencent.mm.R.string.gqe, 0, optionListener);
        return true;
    }

    public boolean i7() {
        return !(this instanceof rc5.c0);
    }

    public final boolean k7(android.content.Context context, android.view.MotionEvent motionEvent) {
        int x17 = (int) motionEvent.getX();
        int y17 = (int) motionEvent.getY();
        android.view.View decorView = getActivity().getWindow().getDecorView();
        kotlin.jvm.internal.o.f(decorView, "getDecorView(...)");
        return x17 < 0 || y17 < 0 || x17 > decorView.getWidth() || y17 > decorView.getHeight();
    }

    public final boolean l7(android.view.View view, int i17, int i18) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i19 = iArr[0];
        int i27 = iArr[1];
        int measuredWidth = view.getMeasuredWidth() + i19;
        int measuredHeight = view.getMeasuredHeight() + i27;
        if (i19 <= i17 && i17 <= measuredWidth) {
            if (i27 <= i18 && i18 <= measuredHeight) {
                return true;
            }
        }
        return false;
    }

    public void m7() {
    }

    public final void n7(android.view.MotionEvent ev6) {
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (this.f200442y) {
            return;
        }
        int action = ev6.getAction();
        if (action == 0) {
            this.f200441x = k7(getActivity(), ev6);
            return;
        }
        if (action != 1) {
            return;
        }
        boolean k76 = k7(getActivity(), ev6);
        if (this.f200441x && k76) {
            this.f200442y = true;
            W6().f198152f.f460710e.Q();
            m7();
        }
    }

    public void o7() {
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateAfter(android.os.Bundle bundle) {
        super.onCreateAfter(bundle);
        p7(null);
        fq1.e eVar = fq1.e.f265507a;
        eVar.g(getActivity().getWindow().getDecorView(), i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12), true, false);
        getActivity().getWindow().getDecorView().setBackgroundColor(0);
        getActivity().getWindow().getDecorView().setPadding(0, 0, 0, 0);
        getActivity().setFinishOnTouchOutside(i7());
        int i17 = this.f200426f;
        com.tencent.mm.ui.chatting.l9 l9Var = new com.tencent.mm.ui.chatting.l9(getActivity(), new com.tencent.mm.ui.chatting.bb(this));
        this.f200427g = l9Var;
        l9Var.a(i17);
        com.tencent.mm.ui.chatting.l9 l9Var2 = this.f200427g;
        if (l9Var2 != null) {
            l9Var2.setDialogActivityPullDownCallback(this.f200439v);
        }
        eVar.g(this.f200427g, i65.a.b(com.tencent.mm.sdk.platformtools.x2.f193071a, 12), true, false);
        androidx.appcompat.app.AppCompatActivity activity = getActivity();
        com.tencent.mm.ui.MMFragmentActivity mMFragmentActivity = activity instanceof com.tencent.mm.ui.MMFragmentActivity ? (com.tencent.mm.ui.MMFragmentActivity) activity : null;
        if (mMFragmentActivity != null) {
            mMFragmentActivity.addDispatchedTouchListener(new com.tencent.mm.ui.chatting.wa(this));
        }
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onCreateBefore(android.os.Bundle bundle) {
        super.onCreateBefore(bundle);
        b7();
        getIntent().putExtra("finish_direct", true);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onDestroy() {
        ((jz5.n) this.f200434q).getValue();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onEnterAnimationComplete() {
        ((jz5.n) this.f200432o).getValue();
        super.onEnterAnimationComplete();
    }

    @Override // com.tencent.mm.ui.component.UIComponent
    public void onFinished() {
        ((jz5.n) this.f200433p).getValue();
        super.onFinished();
        c7();
        getIntent().putExtra(com.tencent.mm.ui.MMFragmentActivity.EXTRA_USE_SYSTEM_DEFAULT_ENTER_EXIT_ANIM, true);
    }

    @Override // com.tencent.mm.ui.component.UIComponent, pf5.g
    public void onResume() {
        getActivity().getWindow().getDecorView().post(new com.tencent.mm.ui.chatting.xa(this));
    }

    public final void p7(java.lang.Integer num) {
        this.f200426f = num != null ? num.intValue() : X6();
        android.view.WindowManager.LayoutParams attributes = getActivity().getWindow().getAttributes();
        attributes.width = -1;
        attributes.height = -1;
        attributes.gravity = 80;
        attributes.dimAmount = Y6();
        getActivity().getWindow().setAttributes(attributes);
        getActivity().getWindow().setLayout(-1, this.f200426f);
        getActivity().getWindow().addFlags(2);
        com.tencent.mm.ui.chatting.l9 l9Var = this.f200427g;
        if (l9Var != null) {
            int i17 = this.f200426f;
            l9Var.f201929m = i17;
            l9Var.f201928i = i17 * 0.3f;
        }
    }
}
