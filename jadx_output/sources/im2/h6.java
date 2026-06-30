package im2;

/* loaded from: classes3.dex */
public final class h6 extends com.tencent.mm.plugin.finder.live.plugin.no0 implements com.tencent.mm.plugin.finder.live.plugin.oo0 {
    public final com.tencent.mm.plugin.finder.live.widget.h4 A;
    public final com.tencent.mm.plugin.finder.live.widget.ut B;
    public final com.tencent.mm.plugin.finder.live.widget.b4 C;
    public final com.tencent.mm.plugin.finder.live.widget.q4 D;
    public r45.l71 E;
    public final android.view.ViewGroup F;
    public final android.widget.ProgressBar G;
    public boolean H;
    public java.lang.String I;

    /* renamed from: J, reason: collision with root package name */
    public boolean f292360J;
    public boolean K;
    public boolean L;
    public final com.tencent.mm.sdk.event.IListener M;
    public com.tencent.mm.ui.widget.dialog.k0 N;
    public boolean P;
    public final int Q;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.sdk.coroutines.LifecycleScope f292361e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.ui.base.RequestDisallowScrollView f292362f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f292363g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f292364h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.ImageView f292365i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f292366m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View f292367n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f292368o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.ViewGroup f292369p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.Button f292370q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.RelativeLayout f292371r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.LinearLayout f292372s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f292373t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f292374u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.ImageView f292375v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View f292376w;

    /* renamed from: x, reason: collision with root package name */
    public final android.widget.ImageView f292377x;

    /* renamed from: y, reason: collision with root package name */
    public final com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView f292378y;

    /* renamed from: z, reason: collision with root package name */
    public final android.view.View f292379z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h6(androidx.appcompat.app.AppCompatActivity activity, android.view.View root) {
        super(root);
        kotlin.jvm.internal.o.g(activity, "activity");
        kotlin.jvm.internal.o.g(root, "root");
        this.f292361e = new com.tencent.mm.sdk.coroutines.LifecycleScope("FinderLiveVisitorAfterPagePlugin", activity, 0, 4, null);
        android.view.View findViewById = root.findViewById(com.tencent.mm.R.id.j8n);
        kotlin.jvm.internal.o.f(findViewById, "findViewById(...)");
        this.f292362f = (com.tencent.mm.ui.base.RequestDisallowScrollView) findViewById;
        android.view.View findViewById2 = root.findViewById(com.tencent.mm.R.id.j8j);
        kotlin.jvm.internal.o.f(findViewById2, "findViewById(...)");
        android.view.View findViewById3 = root.findViewById(com.tencent.mm.R.id.obc);
        kotlin.jvm.internal.o.f(findViewById3, "findViewById(...)");
        android.widget.TextView textView = (android.widget.TextView) findViewById3;
        this.f292363g = textView;
        android.view.View findViewById4 = root.findViewById(com.tencent.mm.R.id.f484050cu2);
        kotlin.jvm.internal.o.f(findViewById4, "findViewById(...)");
        this.f292364h = (android.widget.TextView) findViewById4;
        android.view.View findViewById5 = root.findViewById(com.tencent.mm.R.id.f482986tm);
        kotlin.jvm.internal.o.f(findViewById5, "findViewById(...)");
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById5;
        this.f292365i = imageView;
        android.view.View findViewById6 = root.findViewById(com.tencent.mm.R.id.f483021ui);
        kotlin.jvm.internal.o.f(findViewById6, "findViewById(...)");
        android.widget.TextView textView2 = (android.widget.TextView) findViewById6;
        this.f292366m = textView2;
        android.view.View findViewById7 = root.findViewById(com.tencent.mm.R.id.p3r);
        kotlin.jvm.internal.o.f(findViewById7, "findViewById(...)");
        this.f292367n = findViewById7;
        android.view.View findViewById8 = root.findViewById(com.tencent.mm.R.id.p3t);
        kotlin.jvm.internal.o.f(findViewById8, "findViewById(...)");
        android.widget.TextView textView3 = (android.widget.TextView) findViewById8;
        this.f292368o = textView3;
        this.f292369p = (android.view.ViewGroup) root.findViewById(com.tencent.mm.R.id.sd6);
        this.f292370q = (android.widget.Button) root.findViewById(com.tencent.mm.R.id.tib);
        android.view.View findViewById9 = root.findViewById(com.tencent.mm.R.id.i66);
        kotlin.jvm.internal.o.f(findViewById9, "findViewById(...)");
        android.widget.RelativeLayout relativeLayout = (android.widget.RelativeLayout) findViewById9;
        this.f292371r = relativeLayout;
        android.view.View findViewById10 = root.findViewById(com.tencent.mm.R.id.f483001ty);
        kotlin.jvm.internal.o.f(findViewById10, "findViewById(...)");
        this.f292372s = (android.widget.LinearLayout) findViewById10;
        android.view.View findViewById11 = root.findViewById(com.tencent.mm.R.id.f482999tw);
        kotlin.jvm.internal.o.f(findViewById11, "findViewById(...)");
        this.f292373t = (android.widget.TextView) findViewById11;
        android.view.View findViewById12 = root.findViewById(com.tencent.mm.R.id.f483000tx);
        kotlin.jvm.internal.o.f(findViewById12, "findViewById(...)");
        this.f292374u = (android.widget.TextView) findViewById12;
        android.view.View findViewById13 = root.findViewById(com.tencent.mm.R.id.f482985tl);
        kotlin.jvm.internal.o.f(findViewById13, "findViewById(...)");
        this.f292375v = (android.widget.ImageView) findViewById13;
        android.view.View findViewById14 = root.findViewById(com.tencent.mm.R.id.aac);
        kotlin.jvm.internal.o.f(findViewById14, "findViewById(...)");
        android.view.View findViewById15 = root.findViewById(com.tencent.mm.R.id.aaa);
        kotlin.jvm.internal.o.f(findViewById15, "findViewById(...)");
        this.f292376w = findViewById15;
        android.view.View findViewById16 = root.findViewById(com.tencent.mm.R.id.fus);
        kotlin.jvm.internal.o.f(findViewById16, "findViewById(...)");
        android.view.View findViewById17 = root.findViewById(com.tencent.mm.R.id.f485570i64);
        kotlin.jvm.internal.o.f(findViewById17, "findViewById(...)");
        this.f292377x = (android.widget.ImageView) findViewById17;
        android.view.View findViewById18 = root.findViewById(com.tencent.mm.R.id.mww);
        kotlin.jvm.internal.o.f(findViewById18, "findViewById(...)");
        this.f292378y = (com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView) findViewById18;
        android.view.View findViewById19 = root.findViewById(com.tencent.mm.R.id.f486561lo5);
        kotlin.jvm.internal.o.f(findViewById19, "findViewById(...)");
        android.view.View findViewById20 = root.findViewById(com.tencent.mm.R.id.loc);
        kotlin.jvm.internal.o.f(findViewById20, "findViewById(...)");
        android.view.View findViewById21 = root.findViewById(com.tencent.mm.R.id.exw);
        kotlin.jvm.internal.o.f(findViewById21, "findViewById(...)");
        this.f292379z = findViewById21;
        this.A = new com.tencent.mm.plugin.finder.live.widget.h4((android.view.ViewGroup) findViewById19, this);
        this.B = new com.tencent.mm.plugin.finder.live.widget.ut((com.tencent.mm.plugin.finder.live.view.FinderLiveAfterRecommendPanelView) findViewById20, this);
        this.C = new com.tencent.mm.plugin.finder.live.widget.b4((android.view.ViewGroup) findViewById16, this);
        this.D = new com.tencent.mm.plugin.finder.live.widget.q4(findViewById21, this);
        android.view.View findViewById22 = root.findViewById(com.tencent.mm.R.id.auu);
        kotlin.jvm.internal.o.f(findViewById22, "findViewById(...)");
        this.F = (android.view.ViewGroup) findViewById22;
        android.view.View findViewById23 = root.findViewById(com.tencent.mm.R.id.ilt);
        kotlin.jvm.internal.o.f(findViewById23, "findViewById(...)");
        android.widget.ProgressBar progressBar = (android.widget.ProgressBar) findViewById23;
        this.G = progressBar;
        textView3.setOnClickListener(new im2.x4(this));
        imageView.setOnClickListener(new im2.y4(this));
        imageView.setContentDescription(root.getContext().getString(com.tencent.mm.R.string.ka9));
        com.tencent.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        com.tencent.mm.ui.bk.r0(textView2.getPaint(), 0.8f);
        relativeLayout.setVisibility(8);
        progressBar.setVisibility(8);
        ((android.widget.ImageView) findViewById14).setImageDrawable(com.tencent.mm.ui.uk.e(root.getContext(), com.tencent.mm.R.raw.icons_filled_back, -1));
        findViewById15.setOnClickListener(new im2.z4(root));
        final com.tencent.mm.app.a0 a0Var = com.tencent.mm.app.a0.f53288d;
        this.M = new com.tencent.mm.sdk.event.IListener<com.tencent.mm.autogen.events.FollowUserEvent>(a0Var) { // from class: com.tencent.mm.plugin.finder.live.viewmodel.component.FinderLiveVisitorAfterPagePlugin$4
            {
                this.__eventId = 398763182;
            }

            @Override // com.tencent.mm.sdk.event.IListener
            public boolean callback(com.tencent.mm.autogen.events.FollowUserEvent followUserEvent) {
                com.tencent.mm.autogen.events.FollowUserEvent event = followUserEvent;
                kotlin.jvm.internal.o.g(event, "event");
                im2.h6 h6Var = im2.h6.this;
                java.lang.String str = h6Var.I;
                if (!(str == null || str.length() == 0)) {
                    am.zd zdVar = event.f54346g;
                    if (kotlin.jvm.internal.o.b(zdVar != null ? zdVar.f8551a : null, h6Var.I)) {
                        pm0.v.X(new im2.a5(event, h6Var));
                    }
                }
                return false;
            }
        };
        root.setTranslationX(com.tencent.mm.ui.bl.b(root.getContext()).x);
        this.Q = 30000;
    }

    public static final void f(im2.h6 h6Var, boolean z17, com.tencent.mm.protocal.protobuf.FinderContact finderContact, boolean z18) {
        h6Var.getClass();
        int i17 = z17 ? 1 : z18 ? 3 : 2;
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorAfterPagePlugin", "#followAnchor nickName:" + finderContact.getNickname() + ", isPrivateAccount:" + z18 + ", opType:" + i17);
        i95.m c17 = i95.n0.c(c61.yb.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        c61.yb ybVar = (c61.yb) c17;
        android.content.Context context = h6Var.f113668d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) ((zy2.ra) zVar.a((androidx.appcompat.app.AppCompatActivity) context).c(zy2.ra.class))).V6();
        java.lang.String username = finderContact.getUsername();
        if (username == null) {
            username = "";
        }
        c61.yb.ea(ybVar, V6, username, i17, h6Var.Y().f410648c, z18, null, null, 26, 0, 62, new im2.j5(h6Var, finderContact, i17), com.tencent.mm.plugin.appbrand.jsapi.nfc.r.CTRL_INDEX, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object g(im2.h6 r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.h6.g(im2.h6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object h(im2.h6 r17, kotlin.coroutines.Continuation r18) {
        /*
            Method dump skipped, instructions count: 495
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.h6.h(im2.h6, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.oo0
    public kotlinx.coroutines.f1 H(oz5.l context, kotlinx.coroutines.a1 start, yz5.p block) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        return kotlinx.coroutines.l.a(this.f292361e, context, start, block);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.oo0
    public so2.v2 Y() {
        android.content.Context context = this.f113668d.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (context instanceof androidx.appcompat.app.AppCompatActivity) {
            return ((im2.i6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(im2.i6.class)).f292393e;
        }
        throw new java.lang.IllegalStateException("Check failed.".toString());
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.no0
    public void a() {
        android.view.View decorView;
        kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
        com.tencent.mm.plugin.finder.live.plugin.oo0.Z(this, kotlinx.coroutines.internal.b0.f310484a, null, new im2.n5(this, null), 2, null);
        boolean isTeenMode = ((com.tencent.mm.plugin.finder.storage.mj0) ((zy2.qb) i95.n0.c(zy2.qb.class))).isTeenMode();
        k(0);
        android.view.View view = this.f113668d;
        android.content.Context context = view.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        if (((im2.o6) zVar.a((androidx.appcompat.app.AppCompatActivity) context).a(im2.o6.class)).f292476o) {
            view.animate().translationX(0.0f).setDuration(200L).withStartAction(new im2.u5(this));
        } else {
            view.setTranslationX(0.0f);
            k(0);
        }
        android.content.Context context2 = view.getContext();
        kotlin.jvm.internal.o.e(context2, "null cannot be cast to non-null type android.app.Activity");
        android.view.Window window = ((android.app.Activity) context2).getWindow();
        if (window != null && (decorView = window.getDecorView()) != null) {
            decorView.setBackgroundColor(-16777216);
        }
        java.lang.System.currentTimeMillis();
        ((ml2.r0) i95.n0.c(ml2.r0.class)).pk(Y().f410654i ? Y().f410655j : Y().f410646a);
        if (isTeenMode) {
            this.F.setVisibility(8);
            android.view.View view2 = this.f292367n;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(8);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveVisitorAfterPagePlugin", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveVisitorAfterPagePlugin", "show", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        this.f292378y.a();
        this.f292362f.setOnScrollChangeListener(new im2.o5(this));
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.no0
    public void c() {
        c50.m0 m0Var = this.f292378y.f115795u;
        if (m0Var != null) {
            com.tencent.mm.plugin.finder.live.view.u0 u0Var = com.tencent.mm.plugin.finder.live.view.u0.f116703d;
            gp2.l0 l0Var = (gp2.l0) m0Var;
            l0Var.m();
            l0Var.M(u0Var);
        }
        com.tencent.mm.plugin.finder.live.widget.b4 b4Var = this.C;
        c50.m0 m0Var2 = b4Var.f117826g;
        if (m0Var2 != null) {
            com.tencent.mm.plugin.finder.live.widget.n3 n3Var = new com.tencent.mm.plugin.finder.live.widget.n3(b4Var);
            gp2.l0 l0Var2 = (gp2.l0) m0Var2;
            l0Var2.m();
            l0Var2.M(n3Var);
        }
        this.D.d();
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:25:? A[RETURN, SYNTHETIC] */
    @Override // com.tencent.mm.plugin.finder.live.plugin.no0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void d() {
        /*
            r9 = this;
            android.view.View r0 = r9.f113668d
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L39
            com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView r0 = r9.f292378y
            r0.getClass()
            com.tencent.mm.plugin.finder.live.view.v0 r1 = new com.tencent.mm.plugin.finder.live.view.v0
            r1.<init>(r0)
            r0.post(r1)
            com.tencent.mm.plugin.finder.live.widget.b4 r0 = r9.C
            android.view.View r1 = r0.f117824e
            boolean r2 = r1.isShown()
            if (r2 == 0) goto L34
            r2 = 2131315539(0x7f094b53, float:1.8249534E38)
            android.view.View r1 = r1.findViewById(r2)
            com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView r1 = (com.tencent.mm.plugin.finder.live.view.EasySimpleLivingCardView) r1
            if (r1 == 0) goto L34
            com.tencent.mm.protocal.protobuf.FinderObject r2 = r0.f117827h
            com.tencent.mm.plugin.finder.live.widget.q3 r3 = new com.tencent.mm.plugin.finder.live.widget.q3
            r3.<init>(r2, r1, r0)
            r1.post(r3)
        L34:
            com.tencent.mm.plugin.finder.live.widget.q4 r0 = r9.D
            r0.g()
        L39:
            boolean r0 = r9.L
            r1 = 1
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L54
            r9.L = r3
            r45.l71 r0 = r9.E
            if (r0 == 0) goto L4f
            r4 = 37
            com.tencent.mm.protobuf.f r0 = r0.getCustom(r4)
            r45.fl1 r0 = (r45.fl1) r0
            goto L50
        L4f:
            r0 = r2
        L50:
            if (r0 == 0) goto L54
            r0 = r1
            goto L55
        L54:
            r0 = r3
        L55:
            if (r0 == 0) goto L75
            android.widget.Button r0 = r9.f292370q
            if (r0 == 0) goto L62
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L62
            goto L63
        L62:
            r1 = r3
        L63:
            r9.H = r1
            kotlinx.coroutines.p0 r0 = kotlinx.coroutines.q1.f310568a
            kotlinx.coroutines.g3 r4 = kotlinx.coroutines.internal.b0.f310484a
            r5 = 0
            im2.t5 r6 = new im2.t5
            r6.<init>(r9, r2)
            r7 = 2
            r8 = 0
            r3 = r9
            com.tencent.mm.plugin.finder.live.plugin.oo0.Z(r3, r4, r5, r6, r7, r8)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.h6.d():void");
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.oo0
    public kotlinx.coroutines.r2 d0(oz5.l context, kotlinx.coroutines.a1 start, yz5.p block) {
        kotlin.jvm.internal.o.g(context, "context");
        kotlin.jvm.internal.o.g(start, "start");
        kotlin.jvm.internal.o.g(block, "block");
        return this.f292361e.a(start, block);
    }

    @Override // com.tencent.mm.plugin.finder.live.plugin.no0
    public void e() {
        com.tencent.mars.xlog.Log.i("FinderLiveVisitorAfterPagePlugin", "unmount");
        com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView = this.f292378y;
        c50.m0 m0Var = finderLiveAfterPluginRecommendLiveView.f115795u;
        if (m0Var != null) {
            ((gp2.l0) m0Var).o();
        }
        finderLiveAfterPluginRecommendLiveView.f115795u = null;
        com.tencent.mm.plugin.finder.live.widget.q4 q4Var = this.D;
        q4Var.f();
        q4Var.f119493j = null;
        com.tencent.mm.sdk.event.IListener iListener = this.M;
        if (iListener != null) {
            iListener.dead();
        }
    }

    public final void i(java.lang.String str, int i17, com.tencent.mm.protocal.protobuf.FinderAuthInfo finderAuthInfo) {
        boolean z17 = Y().f410654i;
        android.widget.TextView textView = this.f292368o;
        android.view.View view = this.f113668d;
        if (z17) {
            textView.setText(view.getContext().getString(com.tencent.mm.R.string.e2a, Y().f410656k));
        } else {
            textView.setText(view.getContext().getString(com.tencent.mm.R.string.ehi));
        }
        boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
        android.widget.LinearLayout linearLayout = this.f292372s;
        if ((!K0 || i17 > 0) && !Y().f410654i) {
            com.tencent.mars.xlog.Log.i("FinderLiveVisitorAfterPagePlugin", "authProfession:" + str + ", friendFollowCount:" + i17);
            linearLayout.setVisibility(0);
            boolean K02 = com.tencent.mm.sdk.platformtools.t8.K0(str);
            android.widget.TextView textView2 = this.f292373t;
            if (K02) {
                textView2.setVisibility(8);
            } else {
                java.lang.String string = view.getContext().getResources().getString(com.tencent.mm.R.string.cq9, str);
                kotlin.jvm.internal.o.f(string, "getString(...)");
                textView2.setText(string);
                textView2.setVisibility(0);
            }
            android.widget.TextView textView3 = this.f292374u;
            if (i17 > 0) {
                java.lang.String string2 = view.getContext().getResources().getString(com.tencent.mm.R.string.f491394cy4, com.tencent.mm.plugin.finder.assist.w2.o(i17, false));
                kotlin.jvm.internal.o.f(string2, "getString(...)");
                textView3.setText(string2);
                textView3.setVisibility(0);
            } else {
                textView3.setVisibility(8);
            }
        } else {
            linearLayout.setVisibility(8);
        }
        if (finderAuthInfo != null) {
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.m1.f460511a.c(this.f292375v, finderAuthInfo, 0);
        }
    }

    public final void j(r45.fa2 fa2Var, float f17) {
        com.tencent.mm.plugin.finder.live.view.FinderLiveAfterPluginRecommendLiveView finderLiveAfterPluginRecommendLiveView = this.f292378y;
        if (finderLiveAfterPluginRecommendLiveView.getVisibility() == 0) {
            return;
        }
        finderLiveAfterPluginRecommendLiveView.setReportObj(Y().f410664s);
        if (fa2Var == null) {
            finderLiveAfterPluginRecommendLiveView.setVisibility(8);
        } else {
            finderLiveAfterPluginRecommendLiveView.setVisibility(0);
            finderLiveAfterPluginRecommendLiveView.b(fa2Var, Y(), f17);
        }
    }

    public final void k(int i17) {
        android.view.View view = this.f113668d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveVisitorAfterPagePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/finder/live/viewmodel/component/FinderLiveVisitorAfterPagePlugin", "setVisible", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final java.lang.Object l(kotlin.coroutines.Continuation continuation) {
        com.tencent.mm.plugin.finder.live.plugin.oo0.Z(this, null, null, new im2.b6(this, null), 3, null);
        return jz5.f0.f302826a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
    
        if (r0 == null) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00c9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m(java.lang.String r16, java.lang.String r17, ya2.b2 r18, kotlin.coroutines.Continuation r19) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: im2.h6.m(java.lang.String, java.lang.String, ya2.b2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void n(boolean z17) {
        android.widget.Button button = this.f292370q;
        android.view.ViewGroup viewGroup = this.f292369p;
        if (z17) {
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
            if (button == null) {
                return;
            }
            button.setVisibility(0);
            return;
        }
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        if (button == null) {
            return;
        }
        button.setVisibility(8);
    }

    public final void o() {
        java.lang.String str;
        boolean z17 = Y().f410654i;
        android.view.View view = this.f113668d;
        if (z17) {
            str = Y().f410655j;
            zl2.q4 q4Var = zl2.q4.f473933a;
            java.lang.String str2 = Y().f410646a;
            android.content.Context context = view.getContext();
            kotlin.jvm.internal.o.f(context, "getContext(...)");
            q4Var.G(str, str2, context, Y().f410658m, java.lang.String.valueOf(Y().f410659n.getLong(0)), 3);
        } else {
            str = Y().f410646a;
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("finder_username", str);
            intent.putExtra("key_enter_profile_type", 11);
            android.content.Context context2 = view.getContext();
            kotlin.jvm.internal.o.f(context2, "getContext(...)");
            pf5.z zVar = pf5.z.f353948a;
            if (!(context2 instanceof androidx.appcompat.app.AppCompatActivity)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.tencent.mm.plugin.finder.live.viewmodel.aa) ((zy2.v9) zVar.a((androidx.appcompat.app.AppCompatActivity) context2).c(zy2.v9.class))).R6(intent);
            ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
            ya2.e1 e1Var = ya2.e1.f460472a;
            android.content.Context context3 = view.getContext();
            kotlin.jvm.internal.o.f(context3, "getContext(...)");
            e1Var.w(context3, intent);
        }
        ((ml2.r0) i95.n0.c(ml2.r0.class)).ok(str);
        this.L = true;
    }
}
